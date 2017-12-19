/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_anotaciones;

import Entidad.Profesor;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtil;

/**
 *
 * @author fernandez163
 */
public class Hibernate_Anotaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session s = HibernateUtil.getSessionFactory().openSession();

        //Profesor profesor = new Profesor("juan","perez","banyuls");
        //s.beginTransaction();
        //s.save(profesor);
        //s.getTransaction().commit();
        //Profesor profesor2 = (Profesor) s.get(Profesor.class, 4);
        //System.out.println("Profesor: "+ profesor2.toString());
        //profesor2.setNombre("Vicente");
        //s.beginTransaction();
        //s.delete(profesor2);
        //s.getTransaction().commit();
        {
            System.out.println("----Simple Consulta con HQL-----");
            String hql = "SELECT p FROM Profesor p ";
            Query query = s.createQuery(hql);
            List<Profesor> profesores = query.list();
            for (Profesor profesor : profesores) {
                System.out.println(profesor.toString());

            }
        }

        {
            System.out.println("----Uso de AND y ORL-----");
            String hql = "SELECT p FROM Profesor p WHERE nombre='pepe' AND (ape1='gomez')";

            Query query = s.createQuery(hql);
            List<Profesor> profesores = query.list();
            for (Profesor profesor : profesores) {
                System.out.println(profesor.toString());

            }
        }

        {
            System.out.println("----Parametro Posicional-----");
            String nombre = "pepe";
            String apellido = "gomez";

            String hql = "SELECT p FROM Profesor p WHERE nombre=? AND (ape1=?)";

            Query query = s.createQuery(hql);
            query.setString(1, nombre);
            query.setString(2, apellido);
            List<Profesor> profesores = query.list();
            for (Profesor profesor : profesores) {
                System.out.println(profesor.toString());

            }
        }

        {
            System.out.println("----Parametro Con Nombre-----");
            String nombre = "pepe";
            String apellido = "gomez";

            String hql = "SELECT p FROM Profesor p WHERE nombre=:nombre AND (ape1=:ape1)";

            Query query = s.createQuery(hql);
            query.setParameter("nombre", nombre);
            query.setString("ape1", apellido);
            List<Profesor> profesores = query.list();
            for (Profesor profesor : profesores) {
                System.out.println(profesor.toString());

            }
        }

        {
            System.out.println("----Parametros Encadenados-----");
            String nombre = "pepe";
            String apellido = "gomez";

            String hql = "SELECT p FROM Profesor p WHERE nombre=:nombre AND (ape1=:ape1)";

            Query query = s.createQuery(hql).setParameter("nombre", nombre).setParameter("ape1", apellido);
            List<Profesor> profesores = query.list();
            for (Profesor profesor : profesores) {
                System.out.println(profesor.toString());

            }
        }
        s.close();
    }

}
