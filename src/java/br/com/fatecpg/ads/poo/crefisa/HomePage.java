/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.crefisa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Plops013
 */
@WebServlet(name = "HomePage", urlPatterns = {"/home.html"})
public class HomePage extends HttpServlet {

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
            out.println("<title>WebCalc"
                    + "</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<style type=text/css>body{background-color:#FFDEAD}"+"</style>");
            out.println("<div align='center'><img src='img/crefisa-logo.png'/></div>"
                        +"<div align='center'>"
                        +"<h2 align='center'>Funções</h2>"
                        +"<a href='/Crefisa/juros-simples'>Juros Simples</a>   "
                        +"<a href='/Crefisa/juros-composto'>Juros Composto</a>"
                        +"</div>"
                        +"<h2 align='center'>Equipe</h2>"
                        +"<table border='1'align='center'>"
                        +"<tr><td></td><th>Fernando</th> <th>Fabio</th> <th>Nilson</th> <th>Paulo</th></tr>"
                        +"<tr><th>Contribuição</th><td>Juros Simples</td> <td>Home Page</td> <td>Pagina De Estilos</td> <td>Juros Composto</td> "
                        +"</table>"
                        );
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
