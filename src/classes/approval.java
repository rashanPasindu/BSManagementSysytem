/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import bsmanagementsystem.Approval;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashan
 */
public class approval {
    
    Approval app1 = new Approval();
    Connection con = null;
    PreparedStatement pst=null;
    ResultSet rs = null;
    
    
    String category;
    private String comb,combi1;
    private final String btwn = " - ";
    private final String space = " ";
    String cat1;
    String start1;
    String end1;    
    
    
    public approval(){
    
     //con=DBconnect.connect();
   }
    
public String concat(String Sdate,String Edate,String m,String m4){
    
        //Approval app11 = new Approval();
        
        String m1,m2,m3;
        String last;
        String cfinal;
        String Smonth;
        
        comb = Sdate; 
        combi1 = Edate;
        
        m1 = comb.concat(space);
        Smonth = m1.concat(m);
        last = Smonth.concat(btwn);
        m2 = last.concat(Edate);
        m3 = m2.concat(space);
        cfinal = m3.concat(m4);

        
        System.out.println(Sdate);
        System.out.println(Edate);
        System.out.println(comb);
        
        return cfinal;
}
  
   /*
  public void getapprovals(String cat,String ID,String start,String end){
       Connection con1 = null;
       PreparedStatement pst1=null;
       con1 = DBconnect.connect();
       
       if ("Administration Expenses".equals(cat)){
        try
        {
            String s = "SELECT ExpenseID,Category,Approval FROM adminexpenses WHERE BETWEEN Date = '"+start+"' & Date = '"+end+"';";
            pst1 = con1.prepareStatement(s);
            pst1.execute();
            JOptionPane.showMessageDialog(null,"Entry Successfull");
            
        }
        
    catch(SQLException e)
                {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null,"Entry UN-Successfull");
                }
        
       }
       else if(cat == "Maintenance Expenses"){
             try
        {
            String s = "SELECT ExpenseID,Category,Approval FROM maintainexp WHERE BETWEEN Date = '"+start+"' & Date = '"+end+"';";
            pst1 = con1.prepareStatement(s);
            pst1.execute();
            JOptionPane.showMessageDialog(null,"Entry Successfull");
            
        }
        
    catch(SQLException e)
                {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null,"Entry UN-Successfull");
                }
       }
       
       else if (cat == "PettyCash Expenses"){
               try
        {
            String s = "SELECT ExpenseID,Category,Approval FROM pettycashexp WHERE BETWEEN Date = '"+start+"' & Date = '"+end+"';";
            pst1 = con1.prepareStatement(s);
            pst1.execute();
            JOptionPane.showMessageDialog(null,"Entry Successfull");
            
        }
        
    catch(SQLException e)
                {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null,"Entry UN-Successfull");
                }
       }
       
       else if (cat == "Other Expenses"){
               try
        {
            String s = "SELECT ExpenseID,Category,Approval FROM otherexp WHERE BETWEEN Date = '"+start+"' & Date = '"+end+"';";
            pst1 = con1.prepareStatement(s);
            pst1.execute();
            JOptionPane.showMessageDialog(null,"Entry Successfull");
            
        }
        
    catch(SQLException e)
                {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null,"Entry UN-Successfull");
                }
       }
       else{
           JOptionPane.showMessageDialog(null,"UN-Successfull - Invalid Category");
       }
       
   }
   */
      public String approvals1(String cat,String start,String end){
          
       cat1 = cat;
       start1 = start;
       end1 = end;   
       String s;
       
       if (null == cat1){
           JOptionPane.showMessageDialog(null,"UN-Successfull - Invalid Category");
           return null;
       }
       else switch (cat1) {
            case "Administration Expenses":
                s = "SELECT ExpenseID,Category,Approval FROM adminexpenses WHERE Date >= '"+start1+"' and Date < '"+end1+"';";
                
                return s;
            case "Maintenance Expenses":
                s = "SELECT ExpenseID,Category,Approval FROM maintainexp WHERE Date BETWEEN '"+start1+"' & '"+end1+"';";
                
                return s;
            case "PettyCash Expenses":
                s = "SELECT ExpenseID,Category,Approval FROM pettycashexp WHERE Date BETWEEN '"+start1+"' & '"+end1+"';";
                return s;
            case "Other Expenses":
                s = "SELECT ExpenseID,Category,Approval FROM otherexp WHERE Date BETWEEN '"+start1+"' & '"+end1+"';";
                return s;
            default:
                JOptionPane.showMessageDialog(null,"UN-Successfull - Invalid Category");
                return null;
        }
       
   }
 /*  
 public int chkDate(String cat,String Date){
     
     if (cat == "Administration Expenses"){
         
         
         String sql;
            sql = "SELECT Date FROM adminexpenses WHERE Category = '"+cat+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
         return 1;
     }
     else if (cat == "Maintenance Expenses"){
         
         return 1;
     }
     else if (cat == "PettyCash Expenses"){
         return 1;
     }
     else if (cat == "Other Expenses"){
         return 1;
     }
     else{
         return 0;
     }
 }*/
 
}
