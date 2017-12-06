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
@Table(name="cancion")
public class Cancion implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_cancion")
    private Long idCancion;
    
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_musica")    
    private Musica musica;
     
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_autor")    
    private Autor autor;
    
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_disquera")    
    private Disquera disquera;
    
      @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_genero")    
    private Genero genero;
    @Column(name="nombre_cancion", length=10)
    private String nombre;
    @Column(name="titulo",length=40)
    private String titulo;
    @Column(name="nivel",length=40)
    private String nivel;

    public Cancion(Long idCancion, Musica musica, Autor autor, Disquera disquera, Genero genero, String nombre, String titulo, String nivel) {
        this.idCancion = idCancion;
        this.musica = musica;
        this.autor = autor;
        this.disquera = disquera;
        this.genero = genero;
        this.nombre = nombre;
        this.titulo = titulo;
        this.nivel = nivel;
    }
    
    
    public Cancion() {
        this.idCancion=0L;
    }

    public Long getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Long idCancion) {
        this.idCancion = idCancion;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
   
   
    
}
