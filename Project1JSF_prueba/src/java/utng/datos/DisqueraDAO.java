/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Disquera;



public class DisqueraDAO extends DAO<Disquera> {
     public DisqueraDAO() {
        super(new Disquera());
    }

    
    public Disquera getOneById(Disquera disquera) throws HibernateException {
        return super.getOneById(disquera.getIdDisquera()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
