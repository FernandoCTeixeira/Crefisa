/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.crefisa;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AC.CF
 */
@WebServlet(name = "JurosComposto", urlPatterns = {"/juros-composto"})
public class JurosComposto extends HttpServlet {

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
            out.println("<title>Juros Composto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<style type=text/css>body{background-color:#FFDEAD}"+"</style>");
            out.println("<div align='center'><img src='img/crefisa-logo.png'/></div>"
                        +"<div align='center'>");
            out.println("<a href='/Crefisa/'>Home  / </a><a href='/Crefisa/juros-simples'>Juros Simples</a>   " );
            out.println("<h1>Cálculo de Juros Compostos</h1>");
            DecimalFormat df = new DecimalFormat("###,##0.00");
            out.println("<center><form><table style='text-align:right;'>"
                    + "<tr><td>Taxa de Juros:</td><td> <input type'text' name='j'/></td></tr>"
                    + "<tr><td>Valor:</td><td> <input type='text' name='v'/></td></tr>"
                    + "<tr><td>Periodo:</td><td> <input type='text' name='p'/></td></tr>"
                    + "<tr><td colspan='2'><center><input type='submit' value='Calcular'/><center></td></tr>"
                    + "</form></table></center><hr>");
            out.println("<center><table width='100%' style='text-align:left;'>");
            out.println("<tr>"
                    + "<th>Valor do Juros</th>"
                    + "<th>Valor total com juros</th>"
                    + "<th>Mês</th>"
                    + "</tr>");
            double j = 100, cj = 0;
            double v = 0;
            int p = 0;
            try
            {
                j = Double.parseDouble(request.getParameter("j"));
                v = Double.parseDouble(request.getParameter("v"));
                p = Integer.parseInt(request.getParameter("p"));
            }
            catch(Exception ex)
            {
                
            }
            cj = v;
            j = j/100;
            for(int i = 0; i < p; i++)
            {
                v = cj;
                cj = (j * cj) + cj;
                v = cj - v;
                out.println("<tr>"
                    + "<td>R$"+ df.format(v) +"</td>"
                    + "<td> R$" + df.format(cj) + "</td>"
                    + "<td>" + (i+1) + "</td>"
                    + "</tr>");
            
            }
            out.println("</table></center>");
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
