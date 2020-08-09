/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author raul
 */
public class ConsultarAlumnos extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsultarAlumnos</title>");            
            out.println("<link rel=\"stylesheet\" href=\"estilos.css\">");
            out.println("</head>");
            out.println("<body class=\"parallax\" id=\"seccion4\">");
            out.println("<h1>Lista de todos los Alumnos</h1>");
            //lista de todos los alumnos
            List<Alumno> lista = Acciones_alumno.getAllAlumnos();
            out.println("<form method='post' name='formulario' >");
            out.println("<table border=1 >");
            out.println("<tr>"
                    + "<th>ID</th>"
                    + "<th>Nombre</th>"
                    + "<th>Password</th>"
                    + "<th>Email</th>"
                    + "<th>Pais</th>"
                    + "</tr>");
            //ahora necesito obtener todos los alumnos de la lista
            for(Alumno a : lista){
                out.println("<tr>"
                        + "<td>"+a.getId()+"</td>"
                        + "<td>"+a.getNombre()+"</td>"
                        + "<td>"+a.getPassword()+"</td>"
                        + "<td>"+a.getEmail()+"</td>"
                        + "<td>"+a.getPais()+"</td>"
                        + "<td><a href='Editaralumno?id="+a.getId()+"' >Editar Alumno</a></td>"
                        + "<td><a href='Borraralumno?id="+a.getId()+"' >Borrar Alumno</a></td>"
                        + "</tr>");
            
            }
            out.println("</table>");
            out.println("</form>");
            out.println("<a href='index.html' >Regresar al Menu</a>");
            out.println("</body>");
            out.println("</html>");
        }
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
