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
public class AdminInventory extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdminInventory
     */
    public AdminInventory() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //no space
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        Products.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        Products.setContentAreaFilled(false); 
        

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
        Products = new javax.swing.JButton();
        admininventorydesktop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        car = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1099, 768));
        setMinimumSize(new java.awt.Dimension(1099, 768));
        setPreferredSize(new java.awt.Dimension(1099, 768));
        getContentPane().setLayout(null);

        panelborder.setBackground(new java.awt.Color(204, 0, 0));
        panelborder.setMinimumSize(new java.awt.Dimension(1050, 100));

        Products.setBackground(new java.awt.Color(204, 0, 0));
        Products.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        Products.setForeground(new java.awt.Color(255, 255, 255));
        Products.setText("Products ");
        Products.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(141, 1, 1), 2, true));
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProductsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelborderLayout = new javax.swing.GroupLayout(panelborder);
        panelborder.setLayout(panelborderLayout);
        panelborderLayout.setHorizontalGroup(
            panelborderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelborderLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        panelborderLayout.setVerticalGroup(
            panelborderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelborderLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(panelborder);
        panelborder.setBounds(0, 0, 1110, 100);

        admininventorydesktop.setBackground(new java.awt.Color(204, 0, 0));
        admininventorydesktop.setMaximumSize(new java.awt.Dimension(1002, 500));
        admininventorydesktop.setMinimumSize(new java.awt.Dimension(1002, 500));
        admininventorydesktop.setPreferredSize(new java.awt.Dimension(1002, 500));

        javax.swing.GroupLayout admininventorydesktopLayout = new javax.swing.GroupLayout(admininventorydesktop);
        admininventorydesktop.setLayout(admininventorydesktopLayout);
        admininventorydesktopLayout.setHorizontalGroup(
            admininventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        admininventorydesktopLayout.setVerticalGroup(
            admininventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(admininventorydesktop);
        admininventorydesktop.setBounds(20, 150, 1002, 500);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 800);

        car.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angela\\OneDrive\\Desktop\\Pictures For OOP_DB\\Pictures and Icons\\car1099.png")); // NOI18N
        getContentPane().add(car);
        car.setBounds(-20, 0, 1099, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMousePressed
        // TODO add your handling code here:
        Products.setContentAreaFilled(true);
        Products.setBackground(new Color(148, 1, 1));
        Products.setOpaque(true);
        
        AdminProducts emp = new AdminProducts();
        admininventorydesktop.removeAll();
        admininventorydesktop.add(emp).setVisible(true);
    }//GEN-LAST:event_ProductsMousePressed

    private void ProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseExited
        // TODO add your handling code here:
        Products.setContentAreaFilled(true);
    }//GEN-LAST:event_ProductsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Products;
    private javax.swing.JPanel admininventorydesktop;
    private javax.swing.JLabel car;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelborder;
    // End of variables declaration//GEN-END:variables
}
