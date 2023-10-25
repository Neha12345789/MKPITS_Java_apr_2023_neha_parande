/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstPackage;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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


/**
 *
 * @author ACER
 */
public class Servlet1 extends HttpServlet {

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
            String rollNo = request.getParameter("Roll_no");
            String name = request.getParameter("Student_name");
            String sub1 = request.getParameter("Physics");
            String sub2 = request.getParameter("Chemistry");
            String sub3 = request.getParameter("Maths");
            
            
            Connection connection ;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "neha@123");
                    PreparedStatement preparedStatement = connection.prepareStatement("insert into student_details values(?,?,?,?,?)");
                    preparedStatement.setInt(1, Integer.parseInt(rollNo));
                    preparedStatement.setString(2, name);
                    preparedStatement.setInt(3, Integer.parseInt(sub1));
                    preparedStatement.setInt(4, Integer.parseInt(sub2));
                    preparedStatement.setInt(5, Integer.parseInt(sub3));


        int returnvalue = preparedStatement.executeUpdate();
        if(returnvalue!=0){
            out.println("Record Inserted.");
        }else{
            out.println("Record not found");
        }
                } catch (Exception e) {
                    out.println(e);
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
