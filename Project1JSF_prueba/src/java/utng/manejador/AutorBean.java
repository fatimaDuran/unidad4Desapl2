package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.AutorDAO;
import utng.datos.MusicaDAO;
import utng.modelo.Autor;
import utng.modelo.Musica;

@ManagedBean
@SessionScoped
public class AutorBean implements Serializable {
    private List<Autor>autores;
    private Autor autor;
    private List<Musica> musicas;
    public AutorBean(){
        autor = new Autor();
//        autor.setMusica(new Musica());
    }

//    public List<Musica> getMusicas(){
//        return musicas;
//    }
//    
//    public void setMusicas(List<Musica> musicas){
//        this.musicas = musicas;
//    }
    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    public String listar(){
        AutorDAO dao = new AutorDAO();
        try {
            autores=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Autores";
        
    }
    
    public String eliminar(){
         AutorDAO dao = new AutorDAO();
        try {
            dao.delete(autor);
            autores=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        autor= new Autor();
///     autor.setMusica(new Musica());
//        try{
//            musicas = new MusicaDAO().getAll();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        return "Iniciar";
    }
    
    public String guardar(){
        AutorDAO dao = new AutorDAO();
        try {
            if(autor.getIdAutor()!= 0){
                dao.update(autor);
            }else {
                dao.insert(autor);
            }
            autores=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Autor autor){
        this.autor=autor;
//        try{
//            musicas = new MusicaDAO().getAll();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        return "Editar";
    }
        
}
