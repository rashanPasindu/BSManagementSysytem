/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfa;

import bsmanagementsystem.MainPage;

/**
 *
 * @author Rashan
 */
public class RESource1 extends javax.swing.JFrame {

    /**
     * Creates new form RESource1
     */
    public RESource1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addre = new javax.swing.JButton();
        manre = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        addre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addre.setText("Add Resources");
        addre.setMaximumSize(new java.awt.Dimension(216, 54));
        addre.setMinimumSize(new java.awt.Dimension(216, 54));
        addre.setPreferredSize(new java.awt.Dimension(216, 54));
        addre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addreActionPerformed(evt);
            }
        });
        getContentPane().add(addre);
        addre.setBounds(300, 350, 250, 61);

        manre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manre.setText("Manage Resources");
        manre.setMaximumSize(new java.awt.Dimension(216, 54));
        manre.setMinimumSize(new java.awt.Dimension(216, 54));
        manre.setPreferredSize(new java.awt.Dimension(216, 54));
        manre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manreActionPerformed(evt);
            }
        });
        getContentPane().add(manre);
        manre.setBounds(790, 350, 250, 61);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Back");
        jButton8.setMaximumSize(new java.awt.Dimension(188, 54));
        jButton8.setMinimumSize(new java.awt.Dimension(188, 54));
        jButton8.setPreferredSize(new java.awt.Dimension(188, 54));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1180, 130, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -2, 1370, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addreActionPerformed
        
        
        AddResource add = new AddResource();

        add.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_addreActionPerformed

    private void manreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manreActionPerformed
        Resource_Management manag = new Resource_Management();

        manag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manreActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new MainPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(RESource1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESource1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESource1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESource1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESource1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addre;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manre;
    // End of variables declaration//GEN-END:variables
}
