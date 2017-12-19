package DAO;

import Entidad.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ParticipanteDAO {

    public void elimina(Connection con, Participante participante) throws SQLException {
        PreparedStatement stmt = null;
        try {
            String sql = "DELETE FROM participantes WHERE Dorsal = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, participante.getDorsal());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            };
        }
    }

    public void actualizar(Connection con, Participante participante) throws SQLException {
        PreparedStatement stmt = null;
        try {
            String sql = "UPDATE participantes SET Nombre=?, Apellidos=?, Poblacion=?, CLUB =? WHERE Dorsal = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, participante.getNombre());
            stmt.setString(2, participante.getApellidos());
            stmt.setString(3, participante.getPoblacion());
            stmt.setString(4, participante.getClub());
            stmt.setInt(5, participante.getDorsal());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            };
        }
    }

    public void inserta(Connection con, Participante participante) throws SQLException {
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO participantes (Dorsal, Nombre, Apellidos, Poblacion, CLUB)"
                    + " VALUES (?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, participante.getDorsal());
            stmt.setString(2, participante.getNombre());
            stmt.setString(3, participante.getApellidos());
            stmt.setString(4, participante.getPoblacion());
            stmt.setString(5, participante.getClub());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            };
        }
    }

    public Participante BuscarPorDorsal(Connection con, Participante participante) {
        Participante _participante = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM participantes WHERE Dorsal  = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,participante.getDorsal());
            rs = stmt.executeQuery();
            while (rs.next()) {
                _participante = new Participante(
                    rs.getInt("Dorsal"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Poblacion"),
                    rs.getString("CLUB")
                );
                /*
                _participante = new Participante();
                _participante.setDorsal(rs.getInt("Dorsal"));
                _participante.setNombre(rs.getString("Nombre"));
                _participante.setApellidos(rs.getString("Apellidos"));
                _participante.setPoblacion(rs.getString("Poblacion"));
                _participante.setClub(rs.getString("CLUB"));
                */
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
        return _participante;
    }
    
    public ArrayList<Participante> buscarPorPoblacion (Connection con, Participante participante) {
        ArrayList<Participante> listaParticipantes = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM participantes WHERE Poblacion  = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,participante.getDorsal());
            rs = stmt.executeQuery();
            Participante _participante = null;
            while (rs.next()) {
                _participante = new Participante(
                    rs.getInt("Dorsal"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Poblacion"),
                    rs.getString("CLUB")
                ); 
                listaParticipantes.add(_participante);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
        return listaParticipantes;
    }
}