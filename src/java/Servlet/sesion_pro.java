/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Sql.Consultas;
import java.io.IOException;
import static java.lang.System.out;
import java.net.InetAddress;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prac-enei5
 */
public class sesion_pro extends HttpServlet {

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
        
         String dnipro=request.getParameter("dnipro");
        String reloj2 = request.getParameter("reloj2");
        String reloj3 = request.getParameter("reloj3");
        InetAddress addr = InetAddress.getLocalHost();
        String hostname = addr.getHostName();
        String ip = addr.getHostAddress();
        request.getParameter("hostname");
        request.getParameter("ip");
        //String reloj = request.getParameter("reloj");

        Consultas co = new Consultas();
        if(co.autenticacionPRO(dnipro)){
           HttpSession session=request.getSession(); 
           session.setAttribute("dnipro",dnipro); 
           session.setAttribute("hostname",hostname);
           session.setAttribute("ip",ip);  
           //session.setAttribute("reloj",reloj);
           session.setAttribute("reloj2",reloj2);
           session.setAttribute("reloj3",reloj3);
           response.sendRedirect("index_pro.jsp");
        }  
        else{  
            response.sendRedirect("index_pro.jsp");
        }  
        out.close();
        
        
        
        
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
