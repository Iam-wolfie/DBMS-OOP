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
public class AdminSupplier extends javax.swing.JInternalFrame {
    
    Connection con;
    /** Creates new form AdminSupplier */
    public AdminSupplier() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); //no space
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        String url = "jdbc:mysql://localhost:3306/car_dealers";
        String user = "root";
        String pass = "";
        try{
            con= DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Error:" + ex.getMessage());
        }
        
        tblsupplier.getTableHeader().setFont(new Font ("Segoe UI", Font.PLAIN,16));
        tblsupplier.getTableHeader().setOpaque(false);
        tblsupplier.getTableHeader().setForeground(new Color(204,0,0));
        tblsupplier.setRowHeight(25);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminCollaborativedesktop = new javax.swing.JPanel();
        ViewSupplier = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxtcontact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtsupplierid = new javax.swing.JTextField();
        jtxtname = new javax.swing.JTextField();
        jtxtaddress = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jtxtsearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsupplier = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1002, 900));
        setPreferredSize(new java.awt.Dimension(1002, 900));

        AdminCollaborativedesktop.setBackground(new java.awt.Color(204, 0, 0));
        AdminCollaborativedesktop.setMinimumSize(new java.awt.Dimension(1002, 500));
        AdminCollaborativedesktop.setPreferredSize(new java.awt.Dimension(1002, 500));
        AdminCollaborativedesktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewSupplier.setBackground(new java.awt.Color(202, 202, 202));
        ViewSupplier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ViewSupplier.setText("View Supplier");
        ViewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSupplierActionPerformed(evt);
            }
        });
        AdminCollaborativedesktop.add(ViewSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SupplierID");
        AdminCollaborativedesktop.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jtxtcontact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcontactActionPerformed(evt);
            }
        });
        AdminCollaborativedesktop.add(jtxtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SupplierName");
        AdminCollaborativedesktop.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SupplierAddress");
        AdminCollaborativedesktop.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SupplierContact");
        AdminCollaborativedesktop.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 180, 30));

        jtxtsupplierid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtsupplierid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsupplieridActionPerformed(evt);
            }
        });
        AdminCollaborativedesktop.add(jtxtsupplierid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, 30));

        jtxtname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnameActionPerformed(evt);
            }
        });
        AdminCollaborativedesktop.add(jtxtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 220, 30));

        jtxtaddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtaddressActionPerformed(evt);
            }
        });
        AdminCollaborativedesktop.add(jtxtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 30));

        Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Add.setText("Add");
        Add.setMaximumSize(new java.awt.Dimension(57, 28));
        Add.setMinimumSize(new java.awt.Dimension(57, 28));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        AdminCollaborativedesktop.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 30));

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
        AdminCollaborativedesktop.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 100, 30));

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
        AdminCollaborativedesktop.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 100, 30));

        jtxtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearchActionPerformed(evt);
            }
        });
        jtxtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtsearchKeyReleased(evt);
            }
        });
        AdminCollaborativedesktop.add(jtxtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search");
        AdminCollaborativedesktop.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, 30));

        tblsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Supplier ID", "SupplierName", "Supplier Contact", "Supplier Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsupplierMouseClicked(evt);
            }
        });
        tblsupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblsupplierKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblsupplier);

        AdminCollaborativedesktop.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 950, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminCollaborativedesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminCollaborativedesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSupplierActionPerformed
        // TODO add your handling code here:
        String sql = "select * from Suppliers";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblsupplier.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)});
            }
        }catch(Exception ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }//GEN-LAST:event_ViewSupplierActionPerformed

    private void jtxtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcontactActionPerformed

    private void jtxtsupplieridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsupplieridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsupplieridActionPerformed

    private void jtxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnameActionPerformed

    private void jtxtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtaddressActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String sql ="insert into Suppliers"
        + "(SupplierID, SupplierName, SupplierContact, SupplierAddress)"
        +"VALUES (?,?,?,?)";
        try{

            PreparedStatement pst  = con.prepareStatement(sql);

            DefaultTableModel model = (DefaultTableModel) tblsupplier.getModel();

            pst.setString(1,jtxtsupplierid.getText());
            pst.setString(2,jtxtname.getText());
            pst.setString(3,jtxtcontact.getText());
            pst.setString(4,jtxtaddress.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM Suppliers WHERE SupplierID =?";
        try{

            PreparedStatement pst  = con.prepareStatement(sql);
            DefaultTableModel model = (DefaultTableModel) tblsupplier.getModel();

            pst.setString(1,jtxtsupplierid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String sql = "UPDATE Suppliers SET SupplierName=?, SupplierContact=?, SupplierAddress=? WHERE SupplierID = ?";
        try{

            PreparedStatement pst  = con.prepareStatement(sql);

             DefaultTableModel model = (DefaultTableModel) tblsupplier.getModel();

            pst.setString(4,jtxtsupplierid.getText());
            pst.setString(1,jtxtname.getText());
            pst.setString(2,jtxtcontact.getText());
            pst.setString(3,jtxtaddress.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jtxtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblsupplier.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(model);
        tblsupplier.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jtxtsearch.getText()));
    }//GEN-LAST:event_jtxtsearchKeyReleased

    private void jtxtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchActionPerformed

    private void tblsupplierKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblsupplierKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsupplierKeyReleased

    private void tblsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsupplierMouseClicked
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel) tblsupplier.getModel();
        
        String tblSupplierID = model.getValueAt(tblsupplier.getSelectedRow(),0).toString();
        String tblSupplierName= model.getValueAt(tblsupplier.getSelectedRow(),1).toString();
        String tblSupplierContact= model.getValueAt(tblsupplier.getSelectedRow(),2).toString();
        String tblAddress = model.getValueAt(tblsupplier.getSelectedRow(),3).toString();
                      
       jtxtsupplierid.setText(tblSupplierID);
       jtxtname.setText(tblSupplierName);
       jtxtcontact.setText(tblSupplierContact);
       jtxtaddress.setText(tblAddress);
    }//GEN-LAST:event_tblsupplierMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JPanel AdminCollaborativedesktop;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JButton ViewSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxtaddress;
    private javax.swing.JTextField jtxtcontact;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtsearch;
    private javax.swing.JTextField jtxtsupplierid;
    private javax.swing.JTable tblsupplier;
    // End of variables declaration//GEN-END:variables

}