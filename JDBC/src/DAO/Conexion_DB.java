package DAO;

import java.sql.Connection;
//import com.mysql.jdbc.Driver;

public class Conexion_DB {
    public Connection abrirConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Cargamos el driver
            String urlOdbc = "jdbc:mysql://localhost:3306/carreras";
            con = java.sql.DriverManager.getConnection(urlOdbc, "root","Machete1@");
        } catch (Exception e)  {
            e.printStackTrace();
        }
        return con;        
    }
    public void cerrarConexion(Connection con) {
        try {
            if (con!=null) {
                con.close();
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}