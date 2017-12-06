package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.AutorDAO;
import utng.datos.CancionDAO;
import utng.datos.DisqueraDAO;
import utng.datos.GeneroDAO;
import utng.datos.MusicaDAO;
import utng.modelo.Autor;
import utng.modelo.Disquera;
import utng.modelo.Cancion;
import utng.modelo.Genero;
import utng.modelo.Musica;

@ManagedBean
@SessionScoped
public class CancionBean implements Serializable {

    private List<Cancion> canciones;
    private Cancion cancion;
    private List<Musica> musicas;
    private List<Autor> autores;
    private List<Disquera> disqueras;
    private List<Genero> generos;

    public CancionBean() {
        cancion = new Cancion();
        cancion.setMusica(new Musica());
        cancion.setAutor(new Autor());
        cancion.setDisquera(new Disquera());
        cancion.setGenero(new Genero());

    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
      public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
      public List<Disquera> getDisqueras() {
        return disqueras;
    }

    public void setDisqueras(List<Disquera> disqueras) {
        this.disqueras = disqueras;
    }

  public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }


    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public String listar() {
        CancionDAO dao = new CancionDAO();
        try {
            canciones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Cancion";
    }

    public String eliminar() {
        CancionDAO dao = new CancionDAO();
        try {
            dao.delete(cancion);
            canciones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        cancion = new Cancion();
        cancion.setMusica(new Musica());
        cancion.setAutor(new Autor());
        cancion.setDisquera(new  Disquera());
        cancion.setGenero(new Genero());
        try {
            musicas= new MusicaDAO().getAll();
            autores=new AutorDAO().getAll();
            disqueras=new DisqueraDAO().getAll();
            generos=new GeneroDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        CancionDAO dao = new CancionDAO();
        try {
            if (cancion.getIdCancion() != 0) {
                dao.update(cancion);
            } else {
                dao.insert(cancion);
            }
            canciones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Cancion cancion) {
        this.cancion = cancion;
        try {
            musicas = new MusicaDAO().getAll();
            autores=new AutorDAO().getAll();
            disqueras=new DisqueraDAO().getAll();
            generos=new GeneroDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }

}
