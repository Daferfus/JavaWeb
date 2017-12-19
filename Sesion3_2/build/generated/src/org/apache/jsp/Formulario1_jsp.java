package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulario1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      Entidades.AlquilerBean clientes = null;
      synchronized (request) {
        clientes = (Entidades.AlquilerBean) _jspx_page_context.getAttribute("clientes", PageContext.REQUEST_SCOPE);
        if (clientes == null){
          clientes = new Entidades.AlquilerBean();
          _jspx_page_context.setAttribute("clientes", clientes, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            ul {\n");
      out.write("                width: 45%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            ul li {\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline;\n");
      out.write("                margin: 60px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            ul li a{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./MostrarHora.jsp\">Mostrar Hora</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./TablaAuto.jsp\">Tabla</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./Formulario1.jsp\">Formulario</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>VIDEOCLUB ON-LINE</h1>\n");
      out.write("        ");
 if (request.getParameter("nombre") == null
                    && request.getParameter("dias") == null
                    && request.getParameter("edad") == null
                    && request.getParameter("pago") == null
                    && request.getParameter("especificaciones") == null) { 
      out.write("\n");
      out.write("        Complete este formulario\n");
      out.write("        <form method=\"POST\">\n");
      out.write("            Nombre Pelicula: <input type=\"text\" name=\"nombre\" value=\"\" /><br>\n");
      out.write("            Numero Dias Alquiler:  <input type=\"number\" name=\"dias\" value=\"\" /><br><br>\n");
      out.write("            Edad Cliente: <br> Menor de 7 Años: <input type=\"radio\" name=\"edad\" value=\"Menor de 7 Años\" checked=\"checked\" /><br>\n");
      out.write("            Menor de 14 Años: <input type=\"radio\" name=\"edad\" value=\"Menor de 14 Años\" /><br>\n");
      out.write("            Menor de 18 Años: <input type=\"radio\" name=\"edad\" value=\"Menor de 18 Años\" /><br>\n");
      out.write("            Mayor de 18 Años: <input type=\"radio\" name=\"edad\" value=\"Mayor de 18 Años\" /><br><br>\n");
      out.write("            Forma pago: <br> <select name=\"pago\">\n");
      out.write("                <option>VISA</option>\n");
      out.write("                <option>Contado</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            Especificaciones Extras: <br> <textarea name=\"especificaciones\" rows=\"4\" cols=\"20\">\n");
      out.write("            </textarea>\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" />\n");
      out.write("        </form>\n");
      out.write("        ");
 } else { 
      out.write(' ');
      out.write("\n");
      out.write("        ");
 String nombre, dias, edad, pago, especificaciones; 
      out.write("\n");
      out.write("        ");
 nombre = request.getParameter("nombre");
            dias = request.getParameter("dias");
            edad = request.getParameter("edad");
            pago = request.getParameter("pago");
            especificaciones = request.getParameter("especificaciones");
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("clientes"), "nombre",
nombre);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("clientes"), "dias",
dias);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("clientes"), "edad",
edad);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("clientes"), "pago",
pago);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("clientes"), "especificaciones",
especificaciones);
      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("/Formulario2.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
