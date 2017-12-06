package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Cancion;


public class CancionDAO extends DAO<Cancion> {
     public CancionDAO() {
        super(new Cancion());
    }

    
    public Cancion getOneById(Cancion cancion) throws HibernateException {
        return super.getOneById(cancion.getIdCancion()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
