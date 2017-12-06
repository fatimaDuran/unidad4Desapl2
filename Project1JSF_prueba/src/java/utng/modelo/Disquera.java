package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="disquera")
public class Disquera implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_disquera")
    private Long idDisquera;
    
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_cancion")    
    private Cancion cancion;
    
    @Column(name="nombre",length=30)
    private String nombre;
    
    @Column(name="categoria",length=30)
    private String categoria;
    
    @Column(name="nivel",length=30)
    private String nivel;
   
    
    
    
    public Disquera(Long idDisquera, String nombre, String categoria,Cancion cancion, String nivel) {
        this.idDisquera = idDisquera;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cancion = cancion;
        this.nivel = nivel;
       
        
    }
    public Disquera() {
        this.idDisquera=0L;
    }

    public Long getIdDisquera() {
        return idDisquera;
    }

    public void setIdDisquera(Long idDisquera) {
        this.idDisquera = idDisquera;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

 
   

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

   
    
    
    
}
