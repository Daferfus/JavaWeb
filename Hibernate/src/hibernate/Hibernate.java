/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import Entidad.Profesor;
import Utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author fernandez163
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Session s = HibernateUtil.getSessionFactory().openSession();
    
    Profesor profesor = new Profesor("pepe","gomez","garcia");
    
    s.beginTransaction();
    s.save(profesor);
    s.getTransaction().commit();
    
    Profesor profesor2 = (Profesor) s.get(Profesor.class, 1);
    System.out.println("Profesor: "+ profesor2.toString());
    s.close();
    
    
    }
    
    
}
