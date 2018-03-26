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
 * @author AC.CF
 */
@WebServlet(name = "JurosSimples", urlPatterns = {"/juros-simples"})
public class JurosSimples extends HttpServlet {
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
            out.println("<title>Juros Simples</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<style type=text/css>body{background-color:#FFDEAD}"+"</style>");
            out.println("<a href='/Crefisa/'>Home/</a>Juros Simples");
            out.println("<h1>Cálculo de Juros Simples</h1>");
            out.println("<form>");
            out.println("Valor Inicial: <input type'text' name='v'/>");
            out.println("Porcentagem: <input type'text' name='p'/>");
            out.println("Periodo: <input type'text' name='t'/>");
            out.println("<input type='submit' value='Calcular'/>");
            out.println("</form>");
            out.println("<hr>");
            double v=0,p=0,t=0;
            try
            {
                t = Double.parseDouble(request.getParameter("t"));
                v = Double.parseDouble(request.getParameter("v"));
                p = Double.parseDouble(request.getParameter("p"));
            }
            catch(Exception ex){ /*out.println("Erro ao usar o parametro<hr>");*/ }
            out.println("<table border='1'>");
            out.println("<tr><th>Valor Inicial</th><th>Juros</th><th>Montante</th>");

                double j = (p/100)*t*v;
                double montante = j+v;
                out.println("<tr><td>"+v+"</td><td>" + j +"</td><td>" + montante +"</td>");          
            out.println("</tr>");
            out.println("</table>");
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
