
package CarDealerSystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class OwnerPortal extends javax.swing.JFrame {

        Timer t;
    SimpleDateFormat st;
    public void Calendar(){


        t = new Timer (0,new ActionListener(){
               @Override
               public void actionPerformed (ActionEvent e){
                   //throw new UnsopportedOperationException("Not supported yet.")
               
                   Date dt = new Date();
                   st = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
                   
                   String tt = st.format(dt);
                    jtxtclock.setText(tt);
        }
    });
       t.start(); 
    }
    
    public OwnerPortal() {
        initComponents();
        Calendar();
        
        Addexp.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        Addexp.setContentAreaFilled(false); 
        
        addinc.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        addinc.setContentAreaFilled(false); 
        
        addother.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        addother.setContentAreaFilled(false); 
        
        LOGOUT.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        LOGOUT.setContentAreaFilled(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Addexp = new javax.swing.JButton();
        addinc = new javax.swing.JButton();
        addother = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtxtclock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelbackground = new javax.swing.JPanel();
        ownerdesktop = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1386, 792));

        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Addexp.setBackground(new java.awt.Color(204, 0, 0));
        Addexp.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        Addexp.setForeground(new java.awt.Color(255, 255, 255));
        Addexp.setText("Add ExpenseS");
        Addexp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddexpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddexpMousePressed(evt);
            }
        });
        jPanel2.add(Addexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 199, 40));

        addinc.setBackground(new java.awt.Color(204, 0, 0));
        addinc.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        addinc.setForeground(new java.awt.Color(255, 255, 255));
        addinc.setText("Add Income");
        addinc.setPreferredSize(new java.awt.Dimension(181, 33));
        addinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addincMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addincMousePressed(evt);
            }
        });
        jPanel2.add(addinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 199, 40));

        addother.setBackground(new java.awt.Color(204, 0, 0));
        addother.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        addother.setForeground(new java.awt.Color(255, 255, 255));
        addother.setText("Add Other Expenses");
        addother.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addotherMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addotherMousePressed(evt);
            }
        });
        jPanel2.add(addother, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 299, 40));

        LOGOUT.setBackground(new java.awt.Color(204, 0, 0));
        LOGOUT.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT.setText("LOGOUT");
        LOGOUT.setPreferredSize(new java.awt.Dimension(123, 35));
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOGOUTMouseExited(evt);
            }
        });
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });
        jPanel2.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 180, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CLOCK ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 380, 40));

        jtxtclock.setBackground(new java.awt.Color(255, 255, 255));
        jtxtclock.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jtxtclock.setForeground(new java.awt.Color(255, 255, 255));
        jtxtclock.setText("A");
        jPanel2.add(jtxtclock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 600, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\haluh.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, -30, 368, 210));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 180));

        panelbackground.setMinimumSize(new java.awt.Dimension(1370, 996));
        panelbackground.setPreferredSize(new java.awt.Dimension(1370, 996));
        panelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ownerdesktop.setBackground(new java.awt.Color(204, 0, 0));
        ownerdesktop.setPreferredSize(new java.awt.Dimension(1270, 450));

        javax.swing.GroupLayout ownerdesktopLayout = new javax.swing.GroupLayout(ownerdesktop);
        ownerdesktop.setLayout(ownerdesktopLayout);
        ownerdesktopLayout.setHorizontalGroup(
            ownerdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        ownerdesktopLayout.setVerticalGroup(
            ownerdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        panelbackground.add(ownerdesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 1270, 450));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarDealerSystem/car_rev.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        panelbackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jPanel1.add(panelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 176, 1400, 1010));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        LoginForm newLoginForm = new LoginForm();
        newLoginForm.setVisible(true);
        newLoginForm.toFront();
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void AddexpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddexpMousePressed
        // TODO add your handling code here:
        LOGOUT.setContentAreaFilled(false);
        addinc.setContentAreaFilled(false);
        addother.setContentAreaFilled(false);
        
        Addexp.setContentAreaFilled(true);
        Addexp.setBackground(new Color(148, 1, 1));
        Addexp.setOpaque(true);
        
        
        OwnerExpense owner = new OwnerExpense();
        ownerdesktop.removeAll();
        ownerdesktop.add(owner).setVisible(true);
    }//GEN-LAST:event_AddexpMousePressed

    private void AddexpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddexpMouseExited
        // TODO add your handling code here:
                Addexp.setContentAreaFilled(true);
    }//GEN-LAST:event_AddexpMouseExited

    private void addincMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addincMousePressed
        // TODO add your handling code here:
        LOGOUT.setContentAreaFilled(false);
        Addexp.setContentAreaFilled(false);
        addother.setContentAreaFilled(false);
        
        addinc.setContentAreaFilled(true);
        addinc.setBackground(new Color(148, 1, 1));
        addinc.setOpaque(true);
        
        OwnerIncome owner = new OwnerIncome();
        ownerdesktop.removeAll();
        ownerdesktop.add(owner).setVisible(true);
    }//GEN-LAST:event_addincMousePressed

    private void addincMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addincMouseExited
        // TODO add your handling code here:
        addinc.setContentAreaFilled(true);
    }//GEN-LAST:event_addincMouseExited

    private void addotherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addotherMousePressed
        // TODO add your handling code here:
        LOGOUT.setContentAreaFilled(false);
        addinc.setContentAreaFilled(false);
        Addexp.setContentAreaFilled(false);
        
        addother.setContentAreaFilled(true);
        addother.setBackground(new Color(148, 1, 1));
        addother.setOpaque(true);
        
        
        OwnerOtherExpenses owner = new OwnerOtherExpenses();
        ownerdesktop.removeAll();
        ownerdesktop.add(owner).setVisible(true);
    }//GEN-LAST:event_addotherMousePressed

    private void addotherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addotherMouseExited
        // TODO add your handling code here:
        addother.setContentAreaFilled(true);
    }//GEN-LAST:event_addotherMouseExited

    private void LOGOUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseExited
        // TODO add your handling code here:
        LOGOUT.setContentAreaFilled(true);
        
    }//GEN-LAST:event_LOGOUTMouseExited

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
            java.util.logging.Logger.getLogger(OwnerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addexp;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton addinc;
    private javax.swing.JButton addother;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jtxtclock;
    private javax.swing.JPanel ownerdesktop;
    private javax.swing.JPanel panelbackground;
    // End of variables declaration//GEN-END:variables
}
