/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDealerSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Angela
 */
public class AdminProducts extends javax.swing.JInternalFrame {
    Connection con;
    /**
     * Creates new form AdminProducts
     */
    public AdminProducts() {
        initComponents();
       String url = "jdbc:mysql://localhost:3306/car_dealers";
        String user = "root";
        String pass = "";
        try{
            con= DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Error:" + ex.getMessage());
        }
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //no space
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        tblproducts.getTableHeader().setFont(new Font ("Segoe UI", Font.PLAIN,16));
        tblproducts.getTableHeader().setOpaque(false);
        tblproducts.getTableHeader().setForeground(new Color(204,0,0));
        tblproducts.setRowHeight(25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproducts = new javax.swing.JTable();
        ViewProducts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtproductid = new javax.swing.JTextField();
        jtxtname = new javax.swing.JTextField();
        jtxtprice = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jtxtsearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtquantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1002, 500));
        setPreferredSize(new java.awt.Dimension(1002, 500));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1002, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1002, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ProductID", "ProductName", "ProductQuantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblproducts.setFocusable(false);
        tblproducts.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblproducts.setRowHeight(25);
        tblproducts.getTableHeader().setReorderingAllowed(false);
        tblproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblproductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblproducts);
        if (tblproducts.getColumnModel().getColumnCount() > 0) {
            tblproducts.getColumnModel().getColumn(0).setResizable(false);
            tblproducts.getColumnModel().getColumn(1).setResizable(false);
            tblproducts.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 960, 210));

        ViewProducts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ViewProducts.setText("View Products");
        ViewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductsActionPerformed(evt);
            }
        });
        jPanel1.add(ViewProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ProductID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ProductName ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 60, -1));

        jtxtproductid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jtxtproductid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 190, 30));

        jtxtname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jtxtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 190, 30));

        jtxtprice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jtxtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 190, 30));

        Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Add.setText("Add");
        Add.setMaximumSize(new java.awt.Dimension(57, 28));
        Add.setMinimumSize(new java.awt.Dimension(57, 28));
        Add.setPreferredSize(new java.awt.Dimension(57, 28));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 90, 30));

        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.setMaximumSize(new java.awt.Dimension(57, 28));
        Delete.setMinimumSize(new java.awt.Dimension(57, 28));
        Delete.setPreferredSize(new java.awt.Dimension(57, 28));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 90, 30));

        Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Update.setText("Update");
        Update.setMaximumSize(new java.awt.Dimension(57, 28));
        Update.setMinimumSize(new java.awt.Dimension(57, 28));
        Update.setPreferredSize(new java.awt.Dimension(57, 28));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 90, 30));

        jtxtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(jtxtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, 30));
        jPanel1.add(jtxtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductsActionPerformed
        // TODO add your handling code here:
        String sql = "select * from Products";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblproducts.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        }catch(Exception ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }//GEN-LAST:event_ViewProductsActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String sql ="insert into Products"
        + "(ProductID, ProductName,ProductQuantity, Price)"
        +"VALUES (?,?,?,?)";
       
        try{
            PreparedStatement pst  = con.prepareStatement(sql);
            DefaultTableModel model = (DefaultTableModel) tblproducts.getModel();

            pst.setString(1,jtxtproductid.getText());
            pst.setString(2,jtxtname.getText());
            pst.setString(3,jtxtquantity.getText());
            pst.setString(4,jtxtprice.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }  
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM Products WHERE ProductID =?";
        try{

            PreparedStatement pst  = con.prepareStatement(sql);
            DefaultTableModel model = (DefaultTableModel) tblproducts.getModel();

            pst.setString(1,jtxtproductid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String sql = "UPDATE Products SET ProductName=?, ProductQuantity=?, Price=? WHERE ProductID = ?";
        try{

            PreparedStatement pst  = con.prepareStatement(sql);

             DefaultTableModel model = (DefaultTableModel) tblproducts.getModel();

            pst.setString(4,jtxtproductid.getText());
            pst.setString(1,jtxtname.getText());
            pst.setString(2,jtxtquantity.getText());
             pst.setString(3,jtxtprice.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jtxtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblproducts.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(model);
        tblproducts.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jtxtsearch.getText()));  
    }//GEN-LAST:event_jtxtsearchKeyReleased

    private void tblproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblproductsMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblproducts.getModel();
        
        String tblProductID = model.getValueAt(tblproducts.getSelectedRow(),0).toString();
        String tblProductName= model.getValueAt(tblproducts.getSelectedRow(),1).toString();
        String tblProductQuantity= model.getValueAt(tblproducts.getSelectedRow(),2).toString();
        String tblPrice = model.getValueAt(tblproducts.getSelectedRow(),3).toString();
                      
       jtxtproductid.setText(tblProductID);
       jtxtname.setText(tblProductName);
       jtxtquantity.setText(tblProductQuantity);
       jtxtprice.setText(tblPrice);
    }//GEN-LAST:event_tblproductsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JButton ViewProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtprice;
    private javax.swing.JTextField jtxtproductid;
    private javax.swing.JTextField jtxtquantity;
    private javax.swing.JTextField jtxtsearch;
    private javax.swing.JTable tblproducts;
    // End of variables declaration//GEN-END:variables
}