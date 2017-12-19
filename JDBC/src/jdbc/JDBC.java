package jdbc;

import DAO.Conexion_DB;
import DAO.ParticipanteDAO;
import Entidad.Participante;
import java.sql.Connection;
import java.util.ArrayList;

public class JDBC {

    public static void main(String[] args) {
        try {
            Conexion_DB conexion_DB = new Conexion_DB();//Creamos una conexion
            System.out.println("Abrir conexion");
            Connection con = conexion_DB.abrirConexion();
            System.out.println("Conexion abierta");
            ParticipanteDAO _participanteDao = new ParticipanteDAO();
            Participante _participante = new Participante(9999, "Jollose", "Gomez Vallas", "Gandia", "sadasd");
            //_participanteDao.inserta(con, _participante);
            //System.out.println("Registro insertado");
            //System.out.println("Cerrando conexion");
            Participante participante2 = new Participante();
            participante2.setPoblacion("DENIA");
            //participante2.setDorsal(35);
            //participante2.setNombre("JAIME");
            //participante2.setPoblacion("GANDIA");
            //participante2.setClub("sdasd");
            //participante2.setApellidos("sdasd");
            //_participanteDao.actualizar(con, participante2);
            //_participanteDao.elimina(con, participante2);
            ArrayList<Participante> participantes = _participanteDao.buscarPorPoblacion(con, participante2);
            for(Participante participante:participantes) {
                System.out.println(participante.toString());
            }
            
            conexion_DB.cerrarConexion(con);
            System.out.println("Conexion cerrada");
        } catch (Exception e) {

        }
    }
}