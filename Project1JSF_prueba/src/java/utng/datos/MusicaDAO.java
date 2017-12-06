/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Musica;

/**
 *
 * @author sarai
 */

public class MusicaDAO extends DAO<Musica> {
     public MusicaDAO() {
        super(new Musica());
    }

    
    public Musica getOneById(Musica musica) throws HibernateException {
        return super.getOneById(musica.getIdMusica()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
