package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.GeneroDAO;
import utng.modelo.Genero;


@ManagedBean @SessionScoped
public class GeneroBean implements Serializable{
    private List<Genero>generos;
    private Genero genero;
    public GeneroBean(){
    }

    public GeneroBean(List<Genero> generos, Genero genero) {
        this.generos = generos;
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public String listar(){
        GeneroDAO dao = new GeneroDAO();
        try {
            generos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Generos";
    }
    
    public String eliminar(){
         GeneroDAO dao = new GeneroDAO();
        try {
            dao.delete(genero);
            generos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        genero= new Genero();
        return "Iniciar";
    }
    
    public String guardar(){
        GeneroDAO dao = new GeneroDAO();
        try {
            if(genero.getIdGenero()!= 0){
                dao.update(genero);
            }else {
                dao.insert(genero);
            }
            generos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Genero genero){
        this.genero=genero;
        return "Editar";
    }
    
}