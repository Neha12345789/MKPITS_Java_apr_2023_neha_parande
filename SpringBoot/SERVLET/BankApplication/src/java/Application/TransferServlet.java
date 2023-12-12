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
public class TransferServlet extends HttpServlet {

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
            
            String userName = request.getParameter("username");
            String Amt = request.getParameter("Amount");
            
            String credit = "Credit";
            String debit = "Debit";
            HttpSession httpsession = request.getSession(true);
            String u_id = (String) httpsession.getAttribute("User_id");
            Date Tran_Date = new java.sql.Date(httpsession.getCreationTime());
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","neha@123");
            out.println("connection established");
            
            PreparedStatement prepareStatementDebit = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            prepareStatementDebit.setString(1, u_id);
            prepareStatementDebit.setDate(3,Tran_Date);
            prepareStatementDebit.setString(2, Amt);
            prepareStatementDebit.setString(4, debit);
            
            int resultSet = prepareStatementDebit.executeUpdate();
            if(resultSet != 0){
                out.println("<h2>Amount debited successfully</h2>");
            }else{
                out.println("Unable to debit amount");
            }
            
            PreparedStatement prepareStatementCredit = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            prepareStatementCredit.setString(1, u_id);
            prepareStatementCredit.setDate(2,Tran_Date);
            prepareStatementCredit.setString(3, Amt);
            prepareStatementCredit.setString(4, credit);
            
            int resultSetcredit = prepareStatementCredit.executeUpdate();
            if(resultSetcredit != 0){
                out.println("<h2>Amount credited successfully</h2>");
            }else{
                out.println("Unable to credit amount");
            }
            PreparedStatement preparedUpdateBalanceOfloginUser=connection.prepareStatement("update Account_details set Balance = Balance - ? where User_id = ? ");
            preparedUpdateBalanceOfloginUser.setString(1,u_id);
            preparedUpdateBalanceOfloginUser.setString(2, Amt);
        
             int updateBalanceOfLoginUser = preparedUpdateBalanceOfloginUser.executeUpdate();
            if(updateBalanceOfLoginUser != 0){
                out.println("<h2>Balance updated of login user by credit amount</h2>");
            }else{
                out.println("<h2>Unable to update balance of login user account</h2>");
            }
            
            
            PreparedStatement preparedUpdateBalance =connection.prepareStatement("update Account_details set Balance = Balance + ? where User_id = ? ");
            preparedUpdateBalance .setString(1,u_id);
            preparedUpdateBalance .setString(2, Amt);
            
            int updateBalance = preparedUpdateBalance.executeUpdate();
            if(updateBalance != 0){
                out.println("<h2>Balance updated of login user by credit amount</h2>");
            }else{
                out.println("<h2>Unable to update balance of login user account</h2>");
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
            Logger.getLogger(TransferServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TransferServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferServlet.class.getName()).log(Level.SEVERE, null, ex);
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
