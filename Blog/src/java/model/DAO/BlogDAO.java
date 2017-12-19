/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.entidad.GnrPost;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Michael Soft
 */
public class BlogDAO {
   public static List<GnrPost> getAllPosts() {
        List<GnrPost> lista = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM GnrPost ORDER BY postDate DESC";
            Query query = session.createQuery(hql);
            lista = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
