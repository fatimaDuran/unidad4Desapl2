package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Genero;



public class GeneroDAO extends DAO<Genero> {
     public GeneroDAO() {
        super(new Genero());
    }

    
    public Genero getOneById(Genero genero) 
            throws HibernateException {
        return super.getOneById(
                genero.getIdGenero()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
