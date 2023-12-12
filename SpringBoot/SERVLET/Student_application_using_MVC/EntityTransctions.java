/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class EntityTransctions {
   private String user_id; 
   private Date tran_date;
   private int amount ;
   private String tran_type;
   private String u_name;
   private String credit;
   private String Debit;

    public EntityTransctions() {
    }

   
   

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getTran_date() {
        return tran_date;
    }

    public void setTran_date(Date tran_date) {
        this.tran_date = tran_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type ;
    }

    public EntityTransctions(String user_id, Date tran_date, int amount, String tran_type, String u_name, String credit, String Debit) {
        this.user_id = user_id;
        this.tran_date = tran_date;
        this.amount = amount;
        this.tran_type = tran_type;
        this.u_name = u_name;
        this.credit = credit;
        this.Debit = Debit;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDebit() {
        return Debit;
    }

    public void setDebit(String Debit) {
        this.Debit = Debit;
    }
    
   
   
   
    
}
