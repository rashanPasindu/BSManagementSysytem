/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hard1;

import DBConnect.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUL
 */
public class order_items extends javax.swing.JFrame {

   Connection con=null;
    ResultSet rs=null;
    PreparedStatement pts=null;
    
    
    
    public order_items() {
        initComponents();
        
        con = DBconnect.connect();
        loadSupppliers();
        combox_supplier.setSelectedIndex(0);
        
    }
    
    
    private void loadSupppliers(){
        combox_supplier.removeAllItems();
       try {
           pts=con.prepareStatement("SELECT * FROM `supplier`");
           rs=pts.executeQuery();
           
           while (rs.next()) {               
               combox_supplier.addItem(rs.getString(2));
           }
          setEmail();
       } catch (SQLException ex) {
           Logger.getLogger(order_items.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void setEmail(){
        
        
        try {
            String name=combox_supplier.getSelectedItem()+"";
           
           pts=con.prepareStatement("SELECT * FROM `supplier`where supplier_Name='"+name+"'");
           rs=pts.executeQuery();
           if(rs.next()){
             
               label_email1.setText(rs.getString("supplier_email"));
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(order_items.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        discription_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        discription = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        search_oID = new javax.swing.JTextField();
        search_oid_button = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        orderitems = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        items_label = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        label_email1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cat = new javax.swing.JTextField();
        payment = new javax.swing.JTextField();
        billnumber = new javax.swing.JTextField();
        recevied_date = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        remarks = new javax.swing.JTextPane();
        conform_order_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        add_suppliers_move = new javax.swing.JButton();
        re_orderlevel_button = new javax.swing.JButton();
        order_button = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        combox_paymenttype = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        supplier_update = new javax.swing.JLabel();
        combox_supplier = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORDERS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PENDING ORDERS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("EMAIL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SUPPLIER:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        discription_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier_images/Flag_of_county_Kildare_-_bordered.svg.png"))); // NOI18N
        getContentPane().add(discription_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 470, 60));

        jScrollPane1.setViewportView(discription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 230, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 860, 200));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("-----------------------------------");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 140, -1));

        jButton1.setText("REPORTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 230, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SUPPLIER:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 950, 270));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ORDER ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("BILL NUMBER:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        search_oID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_oIDActionPerformed(evt);
            }
        });
        getContentPane().add(search_oID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 50, 30));

        search_oid_button.setText("SEARCH");
        search_oid_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_oid_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(search_oid_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 80, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("ITEMS:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));
        getContentPane().add(orderitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 230, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("DISCRIPTION:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CONFORM PENDING ORDERS:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("ITEMS:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("DISCRIPTION:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        items_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier_images/Flag_of_county_Kildare_-_bordered.svg.png"))); // NOI18N
        getContentPane().add(items_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 390, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("PAYMENT:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("PAYMENT TYPE:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        label_email1.setText("df");
        getContentPane().add(label_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 230, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("PAY CAT:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("RECEIVED DATE:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });
        getContentPane().add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 170, 30));

        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 170, 30));

        billnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billnumberActionPerformed(evt);
            }
        });
        getContentPane().add(billnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 170, 30));

        recevied_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recevied_dateActionPerformed(evt);
            }
        });
        getContentPane().add(recevied_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 170, 30));

        jScrollPane4.setViewportView(remarks);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 170, 30));

        conform_order_button.setText("CONFORM PENDING ORDER");
        conform_order_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conform_order_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(conform_order_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 290, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ORDER ITEMS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("-----------------------------------");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 140, -1));

        add_suppliers_move.setText("ADD SUPPLIERS");
        add_suppliers_move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_suppliers_moveActionPerformed(evt);
            }
        });
        getContentPane().add(add_suppliers_move, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 230, -1));

        re_orderlevel_button.setText("RE-ORDER LEVEL");
        re_orderlevel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_orderlevel_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(re_orderlevel_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, -1));

        order_button.setText("ORDER THIS ITEM");
        order_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(order_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 230, -1));

        jLabel23.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("RECEIVED ORDERS");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("-----------------------------------");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 140, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("-----------------------------------");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 140, -1));

        jButton2.setText("BACK TO MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 230, -1));

        jButton3.setText("BACK TO HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 230, -1));

        combox_paymenttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combox_paymenttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 170, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("RE-MARKS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        supplier_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supplier_images/Flag_of_county_Kildare_-_bordered.svg.png"))); // NOI18N
        getContentPane().add(supplier_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 110, 20));

        combox_supplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combox_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combox_supplierMouseClicked(evt);
            }
        });
        combox_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(combox_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suppliers_images/subbg.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-29, -7, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_oIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_oIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_oIDActionPerformed

    private void search_oid_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_oid_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_oid_buttonActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentActionPerformed

    private void billnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billnumberActionPerformed

    private void recevied_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recevied_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recevied_dateActionPerformed

    private void conform_order_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conform_order_buttonActionPerformed
        
        String uorderid=search_oID.getText();
        String usullpier= supplier_update.getText();
        String urdate=recevied_date.getText();
        String udiscription=discription_label.getText();
        String uremarks=remarks.getText();
        String ubillnum= billnumber.getText();
        String upay=payment.getText();
        String upaytype=combox_paymenttype.getSelectedItem().toString();
        String uitems=items_label.getText();
        String upaycat=cat.getText();
        
        
        try {
       String q3="INSERT INTO (POrderID, suplier, rdate, Discription, rmarks, billnum, payment, payType, Item, pay_cat) values ('"+uorderid+"', '"+usullpier+"', '"+urdate+"', '"+udiscription+"', '"+uremarks+"', '"+ubillnum+"', '"+upay+"', '"+upaytype+"', '"+uitems+"', '"+upaycat+"')";
       PreparedStatement pst = con.prepareStatement(q3);
       pst.execute();
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_conform_order_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void re_orderlevel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_orderlevel_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_re_orderlevel_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        order_reports c2 = new order_reports();
        c2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void add_suppliers_moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_suppliers_moveActionPerformed
        suppliersx c1 = new suppliersx();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_suppliers_moveActionPerformed

    private void order_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_buttonActionPerformed
        String supplier = combox_supplier.getSelectedItem().toString();
        String oitems=orderitems.getText();
        String orderdiscription=discription.getText();
        
        try {
       String q2= "INSERT INTO pending orde (POrderID, Suplier, Item, Description) values('"+supplier+"', '"+oitems+"', '"+orderdiscription+"')";
       PreparedStatement pst = con.prepareStatement(q2);
       pst.execute();
            
        } catch (Exception e) {
        }
        
        
        
        
    }//GEN-LAST:event_order_buttonActionPerformed

    private void combox_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_supplierActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_combox_supplierActionPerformed

    private void combox_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combox_supplierMouseClicked
        // TODO add your handling code here:
        setEmail();
    }//GEN-LAST:event_combox_supplierMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(order_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order_items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_suppliers_move;
    private javax.swing.JTextField billnumber;
    private javax.swing.JTextField cat;
    private javax.swing.JComboBox combox_paymenttype;
    private javax.swing.JComboBox combox_supplier;
    private javax.swing.JButton conform_order_button;
    private javax.swing.JTextPane discription;
    private javax.swing.JLabel discription_label;
    private javax.swing.JLabel items_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel label_email1;
    private javax.swing.JButton order_button;
    private javax.swing.JTextField orderitems;
    private javax.swing.JTextField payment;
    private javax.swing.JButton re_orderlevel_button;
    private javax.swing.JTextField recevied_date;
    private javax.swing.JTextPane remarks;
    private javax.swing.JTextField search_oID;
    private javax.swing.JButton search_oid_button;
    private javax.swing.JLabel supplier_update;
    // End of variables declaration//GEN-END:variables
}