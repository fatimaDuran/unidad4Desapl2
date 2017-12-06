package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.MusicaDAO;
import utng.modelo.Musica;

@ManagedBean
@SessionScoped
public class MusicaBean implements Serializable {
    private List<Musica>musicas;
    private Musica musica;
    public MusicaBean(){}

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
    
    public String listar(){
        MusicaDAO dao = new MusicaDAO();
        try {
            musicas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Musicas";
    }
    
    public String eliminar(){
         MusicaDAO dao = new MusicaDAO();
        try {
            dao.delete(musica);
            musicas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        musica= new Musica();
        return "Iniciar";
    }
    
    public String guardar(){
        MusicaDAO dao = new MusicaDAO();
        try {
            if(musica.getIdMusica()!= 0){
                dao.update(musica);
            }else {
                dao.insert(musica);
            }
            musicas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Musica musica){
        this.musica=musica;
        return "Editar";
    }
        
}
