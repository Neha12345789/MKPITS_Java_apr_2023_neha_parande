/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ACER
 */
public class ServletStatement extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession httpsession = request.getSession(true);
            String u_id = (String) httpsession.getAttribute("User_id");
            Date Tran_Date = new java.sql.Date(httpsession.getCreationTime());
            String Amt = request.getParameter("Amount");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
//            out.println("Driver Loaded");
             
            Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "neha@123");
//             out.println("Connection Established");
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2 align = center>Bank Statement</h2>");
             PreparedStatement preparedStatement = connection.prepareStatement("select Transction_date, Amount, Transction_type from Transctions where User_id = ? ");
             preparedStatement.setString(1, u_id); 
             ResultSet resultSet = preparedStatement.executeQuery();
             
            out.println(" <table align=center border=1 cellspacing=5>"
                    + "<tr>"
                    +"<th>Transaction Date</th>"
                    +"<th>Amount</th>"
                    +"<th>Transaction Mode</th>"
                     +"</tr>"); 
            while(resultSet.next()){
                
             out.println("<tr>"
                   
                    +"<td>"+resultSet.getDate(1)+"</td>"    
                    +"<td>"+resultSet.getDouble(2)+"</td>"    
                    +"<td>"+resultSet.getString(3)+"</td>"    
                    + "</tr>");
              }
           
            out.println("</body>");
            out.println("</html>");
            
           preparedStatement = connection.prepareStatement("select Balance from Account_details where User_id = ?");
           preparedStatement.setString(1, u_id);
           
         resultSet =  preparedStatement.executeQuery();
           if(resultSet.next()){
                  out.println("<h2><center>Balance : "+resultSet.getString(1)+"</center></h2>");
             }else{
                 
                 out.println("Unknown");
             }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
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
