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
@Table(name="autor")
public class Autor implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_autor")
    private Long idAutor;
    
//    @ManyToOne(cascade =CascadeType.REMOVE)
//    @JoinColumn(name="id_musica")    
//    private Musica musica;
    
    @Column(name="nombre",length=30)
    private String nombre;
    
    @Column(name="apellido",length=30)
    private String apellido;
    
    @Column(name="ocupacion",length=30)
    private String ocupacion;
   
    @Column(name="años_de_experiencia",length=30)
    private String experiencia;

    public Autor(Long idAutor, String nombre, String apellido, String ocupacion, String experiencia) {
        this.idAutor = idAutor;
//        this.musica = musica;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.experiencia = experiencia;
    }
    
    
    
    
    public Autor() {
        this.idAutor=0L;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

//    public Musica getMusica() {
//        return musica;
//    }
//
//    public void setMusica(Musica musica) {
//        this.musica = musica;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

   
    
    
    
}
