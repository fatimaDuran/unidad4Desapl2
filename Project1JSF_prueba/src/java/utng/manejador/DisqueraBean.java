package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.DisqueraDAO;
import utng.modelo.Disquera;

@ManagedBean
@SessionScoped
public class DisqueraBean implements Serializable {
    private List<Disquera>disqueras;
    private Disquera disquera;
    public DisqueraBean(){}

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public List<Disquera> getDisqueras() {
        return disqueras;
    }

    public void setDisqueras(List<Disquera> disqueras) {
        this.disqueras = disqueras;
    }
    
    public String listar(){
        DisqueraDAO dao = new DisqueraDAO();
        try {
            disqueras=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Disquera";
    }
    
    public String eliminar(){
         DisqueraDAO dao = new DisqueraDAO();
        try {
            dao.delete(disquera);
            disqueras=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        disquera= new Disquera();
        return "Iniciar";
    }
    
    public String guardar(){
        DisqueraDAO dao = new DisqueraDAO();
        try {
            if(disquera.getIdDisquera()!= 0){
                dao.update(disquera);
            }else {
                dao.insert(disquera);
            }
            disqueras=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Disquera disquera){
        this.disquera=disquera;
        return "Editar";
    }
        
}
