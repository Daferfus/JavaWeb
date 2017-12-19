/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Entidad.InfoAlumno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernandez163
 */
@WebServlet(name = "RecogeDatos", urlPatterns = {"/RecogeDatos"})
public class RecogeDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre,apellido1,apellido2;
        //Instanciar el Java Bean
        InfoAlumno _datosAlumno = new InfoAlumno();
        //Recogemos los parametros del Formulario
        nombre = request.getParameter("nombre");
        apellido1 = request.getParameter("apellido1");
        apellido2 = request.getParameter("apellido2");
        
        //Establecemos datos del JAVA BEAN
        _datosAlumno.setNombre(nombre);
        _datosAlumno.setPrimerApellido(apellido1);
        _datosAlumno.setPrimerApellido(apellido2);
        
        //Establecer ambito del JavaBean
        request.setAttribute("alumno", _datosAlumno);
        
        //Llamar al jsp
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/mostrarDatos.jsp");
            rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
