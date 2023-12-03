/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDealerSystem;

import java.awt.Color;

/**
 *
 * @author Angela
 */
public class AdminPortal extends javax.swing.JFrame {
    
    Color defaultcolor,clickcolor;
    /**
     * Creates new form AdminPortal
     */
    public AdminPortal() {
        initComponents();
        
        defaultcolor= new Color(204,0,0);
        clickcolor = new Color (0,0,0);
        OverView.setBackground(defaultcolor);
        Inventory.setBackground(defaultcolor);
        Accounting.setBackground(defaultcolor);
        OverView.setBackground(defaultcolor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admindesktop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        OverView = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Collaborative = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Inventory = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Accounting = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admindesktop.setBackground(new java.awt.Color(51, 51, 51));
        admindesktop.setMaximumSize(new java.awt.Dimension(1099, 768));
        admindesktop.setMinimumSize(new java.awt.Dimension(1099, 768));
        admindesktop.setPreferredSize(new java.awt.Dimension(1099, 768));
        admindesktop.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarDealerSystem/car1099.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        admindesktop.add(jLabel1);
        jLabel1.setBounds(0, 0, 1050, 770);

        getContentPane().add(admindesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Matti K. Uno");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(130, 30, 150, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ADMIN");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(130, 65, 55, 30);

        LogOut.setText("LOGOUT");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel3.add(LogOut);
        LogOut.setBounds(180, 70, 80, 23);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\icon.png")); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(30, 20, 90, 90);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, 385, 190));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(null);

        OverView.setBackground(new java.awt.Color(153, 0, 153));
        OverView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OverViewMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OverViewMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OVERVIEW");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\overview logo2.png")); // NOI18N

        javax.swing.GroupLayout OverViewLayout = new javax.swing.GroupLayout(OverView);
        OverView.setLayout(OverViewLayout);
        OverViewLayout.setHorizontalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverViewLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        OverViewLayout.setVerticalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
        );

        jPanel2.add(OverView);
        OverView.setBounds(0, 130, 330, 80);

        Collaborative.setBackground(new java.awt.Color(204, 0, 0));
        Collaborative.setForeground(new java.awt.Color(255, 255, 255));
        Collaborative.setMinimumSize(new java.awt.Dimension(330, 80));
        Collaborative.setPreferredSize(new java.awt.Dimension(330, 80));
        Collaborative.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CollaborativeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CollaborativeMousePressed(evt);
            }
        });
        Collaborative.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COLLABORATIVE");
        Collaborative.add(jLabel3);
        jLabel3.setBounds(90, 10, 200, 60);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\collaboratelogo2.png")); // NOI18N
        Collaborative.add(jLabel6);
        jLabel6.setBounds(40, 20, 38, 46);

        jPanel2.add(Collaborative);
        Collaborative.setBounds(0, 210, 330, 80);

        Inventory.setBackground(new java.awt.Color(0, 102, 204));
        Inventory.setMinimumSize(new java.awt.Dimension(330, 80));
        Inventory.setPreferredSize(new java.awt.Dimension(330, 80));
        Inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InventoryMousePressed(evt);
            }
        });
        Inventory.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INVENTORY");
        Inventory.add(jLabel4);
        jLabel4.setBounds(90, 30, 131, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\inventorylogo2.png")); // NOI18N
        Inventory.add(jLabel8);
        jLabel8.setBounds(40, 20, 38, 48);

        jPanel2.add(Inventory);
        Inventory.setBounds(0, 290, 330, 80);

        Accounting.setBackground(new java.awt.Color(255, 153, 153));
        Accounting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountingMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AccountingMousePressed(evt);
            }
        });
        Accounting.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ACCOUNTING");
        Accounting.add(jLabel5);
        jLabel5.setBounds(90, 10, 156, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\accounting logo.png")); // NOI18N
        Accounting.add(jLabel9);
        jLabel9.setBounds(40, 10, 50, 60);

        jPanel2.add(Accounting);
        Accounting.setBounds(0, 370, 330, 80);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\logowhite200.png")); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 10, 240, 100);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 385, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OverViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OverViewMouseClicked
        // TODO add your handling code here:
        AdminOverview pn1 = new AdminOverview(); 
        admindesktop.removeAll();
        admindesktop.add(pn1).setVisible(true); 
    }//GEN-LAST:event_OverViewMouseClicked

    private void CollaborativeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CollaborativeMouseClicked
        // TODO add your handling code here:
        AdminCollaborative pn1 = new AdminCollaborative(); 
        admindesktop.removeAll();
        admindesktop.add(pn1).setVisible(true);  
    }//GEN-LAST:event_CollaborativeMouseClicked

    private void InventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseClicked
        AdminInventory pn1 = new AdminInventory(); 
        admindesktop.removeAll();
        admindesktop.add(pn1).setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_InventoryMouseClicked

    private void AccountingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountingMouseClicked
        AdminAccounting pn1 = new AdminAccounting(); 
        admindesktop.removeAll();
        admindesktop.add(pn1).setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_AccountingMouseClicked

    private void OverViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OverViewMousePressed
        // TODO add your handling code here:
        Collaborative.setBackground(defaultcolor);
        Inventory.setBackground(defaultcolor);
        Accounting.setBackground(defaultcolor);
        OverView.setBackground(clickcolor);
    }//GEN-LAST:event_OverViewMousePressed

    private void CollaborativeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CollaborativeMousePressed
        // TODO add your handling code here:
        Collaborative.setBackground(clickcolor);
        Inventory.setBackground(defaultcolor);
        Accounting.setBackground(defaultcolor);
        OverView.setBackground(defaultcolor);
    }//GEN-LAST:event_CollaborativeMousePressed

    private void InventoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMousePressed
        // TODO add your handling code here:
        Collaborative.setBackground(defaultcolor);
        Inventory.setBackground(clickcolor);
        Accounting.setBackground(defaultcolor);
        OverView.setBackground(defaultcolor);
    }//GEN-LAST:event_InventoryMousePressed

    private void AccountingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountingMousePressed
        // TODO add your handling code here:
        Collaborative.setBackground(defaultcolor);
        Inventory.setBackground(defaultcolor);
        Accounting.setBackground(clickcolor);
        OverView.setBackground(defaultcolor);
    }//GEN-LAST:event_AccountingMousePressed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    LoginForm loginForm = new LoginForm();
    loginForm.setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Accounting;
    private javax.swing.JPanel Collaborative;
    private javax.swing.JPanel Inventory;
    private javax.swing.JButton LogOut;
    private javax.swing.JPanel OverView;
    private javax.swing.JPanel admindesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
