/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDealerSystem;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Angela
 */
public class AdminOverview extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdminOverview
     */
    public AdminOverview() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //no space
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        overview.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        overview.setContentAreaFilled(false); 
        
        AboutUs.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        AboutUs.setContentAreaFilled(false); 
        
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
        overview.setContentAreaFilled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelborder = new javax.swing.JPanel();
        overview = new javax.swing.JButton();
        AboutUs = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        overview_deskt = new javax.swing.JPanel();
        blck = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1099, 768));
        setMinimumSize(new java.awt.Dimension(1099, 768));
        setPreferredSize(new java.awt.Dimension(1099, 768));
        getContentPane().setLayout(null);

        panelborder.setBackground(new java.awt.Color(204, 0, 0));
        panelborder.setMinimumSize(new java.awt.Dimension(1050, 100));

        overview.setBackground(new java.awt.Color(204, 0, 0));
        overview.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        overview.setForeground(new java.awt.Color(255, 255, 255));
        overview.setText("Overview");
        overview.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(141, 1, 1), 2, true));
        overview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                overviewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                overviewMousePressed(evt);
            }
        });

        AboutUs.setBackground(new java.awt.Color(204, 0, 0));
        AboutUs.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        AboutUs.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs.setText("about us");
        AboutUs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(141, 1, 1), 2, true));
        AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AboutUsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelborderLayout = new javax.swing.GroupLayout(panelborder);
        panelborder.setLayout(panelborderLayout);
        panelborderLayout.setHorizontalGroup(
            panelborderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelborderLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(overview, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(648, Short.MAX_VALUE))
        );
        panelborderLayout.setVerticalGroup(
            panelborderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelborderLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(panelborderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overview, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelborder);
        panelborder.setBounds(0, 0, 1050, 110);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1102, 700));

        overview_deskt.setBackground(new java.awt.Color(255, 255, 255));
        overview_deskt.setPreferredSize(new java.awt.Dimension(1099, 868));
        overview_deskt.setLayout(null);

        blck.setBackground(new java.awt.Color(0, 0, 0));
        blck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTACT INFORMATION");
        blck.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 24, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email: contact@prestigewheels.com");
        blck.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address: Sabang, Lipa City");
        blck.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone: 09189498400");
        blck.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        overview_deskt.add(blck);
        blck.setBounds(0, 470, 1090, 210);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("PRESTIGE WHEELS");
        overview_deskt.add(jLabel7);
        jLabel7.setBounds(40, 30, 420, 60);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel6.setText("President, Member of the Board of Directors (Representative Director)");
        overview_deskt.add(jLabel6);
        jLabel6.setBounds(40, 110, 810, 28);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 22)); // NOI18N
        jLabel1.setText("Prestige Wheels");
        overview_deskt.add(jLabel1);
        jLabel1.setBounds(40, 140, 220, 50);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel9.setText("Date Founded");
        overview_deskt.add(jLabel9);
        jLabel9.setBounds(40, 200, 200, 28);

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 22)); // NOI18N
        jLabel10.setText("October 2021");
        overview_deskt.add(jLabel10);
        jLabel10.setBounds(40, 230, 220, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel11.setText("Business Activities");
        overview_deskt.add(jLabel11);
        jLabel11.setBounds(40, 290, 250, 28);

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 22)); // NOI18N
        jLabel12.setText("Car Merchandise");
        overview_deskt.add(jLabel12);
        jLabel12.setBounds(40, 320, 390, 50);

        jScrollPane1.setViewportView(overview_deskt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 1070, 993);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void overviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewMouseExited
        // TODO add your handling code here:
        overview.setContentAreaFilled(true);
    }//GEN-LAST:event_overviewMouseExited

    private void overviewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewMousePressed
        // TODO add your handling code here:
        AboutUs.setContentAreaFilled(false);


        overview.setContentAreaFilled(true);
        overview.setBackground(new Color(148, 1, 1));
        overview.setOpaque(true);

        AdminOver emp = new AdminOver();
        overview_deskt.removeAll();
        overview_deskt.add(emp).setVisible(true);
    }//GEN-LAST:event_overviewMousePressed

    private void AboutUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseExited
        // TODO add your handling code here:
        AboutUs.setContentAreaFilled(true);
        
    }//GEN-LAST:event_AboutUsMouseExited

    private void AboutUsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMousePressed
        // TODO add your handling code here:
        overview.setContentAreaFilled(false);


        AboutUs.setContentAreaFilled(true);
        AboutUs.setBackground(new Color(148, 1, 1));
        AboutUs.setOpaque(true);

        adminabout emp = new adminabout();
        overview_deskt.removeAll();
        overview_deskt.add(emp).setVisible(true);
    }//GEN-LAST:event_AboutUsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JPanel blck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton overview;
    private javax.swing.JPanel overview_deskt;
    private javax.swing.JPanel panelborder;
    // End of variables declaration//GEN-END:variables
}
