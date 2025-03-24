import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RetrieveRecords extends javax.swing.JFrame {
    Connection cn;
    ResultSet rs;
    PreparedStatement pdst;
    public RetrieveRecords() {
        initComponents();
        myconnection();
        id_TF.setEditable(false);
        search_TF.setText("Search by Name or Category");
        search_TF.setForeground(Color.GRAY); // Make placeholder text gray

        // Add focus listener to handle clearing/restoring placeholder
        search_TF.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (search_TF.getText().equals("Search by Name or Category")) {
                    search_TF.setText("");  // Clear placeholder when user starts typing
                    search_TF.setForeground(Color.BLACK); // Change text color to black
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (search_TF.getText().isEmpty()) {
                    search_TF.setText("Search by Name or Category"); // Restore placeholder
                    search_TF.setForeground(Color.GRAY); // Make text gray again
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search_TF = new javax.swing.JTextField();
        search_BT = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        id_TF = new javax.swing.JTextField();
        name_TF = new javax.swing.JTextField();
        category_TF = new javax.swing.JTextField();
        quantity_TF = new javax.swing.JTextField();
        price_TF = new javax.swing.JTextField();
        update_BT = new javax.swing.JButton();
        delete_BT = new javax.swing.JButton();
        records_BT = new javax.swing.JButton();
        print_BT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stocktable = new javax.swing.JTable();
        back_BT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STOCK RECORDS");

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        search_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_TFActionPerformed(evt);
            }
        });

        search_BT.setBackground(new java.awt.Color(102, 255, 0));
        search_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        search_BT.setText("SEARCH");
        search_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_BTActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        id.setText("PRODUCT ID:");

        name.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        name.setText("PRODUCT NAME:");

        category.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        category.setText("PRODUCT CATEGORY:");

        quantity.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        quantity.setText("PRODUCT QUANTITY:");

        price.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        price.setText("PRODUCT PRICE:");

        id_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_TFActionPerformed(evt);
            }
        });

        update_BT.setBackground(new java.awt.Color(102, 255, 102));
        update_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        update_BT.setText("UPDATE");
        update_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_BTActionPerformed(evt);
            }
        });

        delete_BT.setBackground(new java.awt.Color(255, 51, 0));
        delete_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        delete_BT.setText("DELETE");
        delete_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_BTActionPerformed(evt);
            }
        });

        records_BT.setBackground(new java.awt.Color(51, 204, 255));
        records_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        records_BT.setText("SHOW RECORDS");
        records_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                records_BTActionPerformed(evt);
            }
        });

        print_BT.setBackground(new java.awt.Color(51, 204, 255));
        print_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        print_BT.setText("PRINT RECORDS");
        print_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_BTActionPerformed(evt);
            }
        });

        stocktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CATEGORY", "QUANTITY", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stocktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocktableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stocktable);

        back_BT.setBackground(new java.awt.Color(255, 51, 0));
        back_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        back_BT.setText("BACK");
        back_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id)
                    .addComponent(name)
                    .addComponent(category)
                    .addComponent(quantity)
                    .addComponent(price)
                    .addComponent(update_BT)
                    .addComponent(records_BT)
                    .addComponent(search_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_BT)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(print_BT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_BT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_TF)
                        .addComponent(name_TF)
                        .addComponent(category_TF)
                        .addComponent(quantity_TF)
                        .addComponent(price_TF)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(back_BT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(search_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_BT))
                                .addGap(26, 26, 26)
                                .addComponent(id))
                            .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category)
                            .addComponent(category_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity)
                            .addComponent(quantity_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price)
                            .addComponent(price_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_BT)
                            .addComponent(delete_BT))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(records_BT)
                            .addComponent(print_BT)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(back_BT)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_BTActionPerformed
        search();
    }//GEN-LAST:event_search_BTActionPerformed

    private void records_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_records_BTActionPerformed
        records();
    }//GEN-LAST:event_records_BTActionPerformed

    private void print_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_BTActionPerformed
        printrecords();
    }//GEN-LAST:event_print_BTActionPerformed

    private void stocktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocktableMouseClicked
        getrecords();
    }//GEN-LAST:event_stocktableMouseClicked

    private void update_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_BTActionPerformed
        update();
    }//GEN-LAST:event_update_BTActionPerformed

    private void id_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_TFActionPerformed
        
    }//GEN-LAST:event_id_TFActionPerformed

    private void delete_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_BTActionPerformed
        delete();
    }//GEN-LAST:event_delete_BTActionPerformed

    private void search_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_TFActionPerformed
        
    }//GEN-LAST:event_search_TFActionPerformed

    private void back_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BTActionPerformed
        new InventoryApp().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_BTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RetrieveRecords().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_BT;
    private javax.swing.JLabel category;
    private javax.swing.JTextField category_TF;
    private javax.swing.JButton delete_BT;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_TF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_TF;
    private javax.swing.JLabel price;
    private javax.swing.JTextField price_TF;
    private javax.swing.JButton print_BT;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantity_TF;
    private javax.swing.JButton records_BT;
    private javax.swing.JButton search_BT;
    private javax.swing.JTextField search_TF;
    private javax.swing.JTable stocktable;
    private javax.swing.JButton update_BT;
    // End of variables declaration//GEN-END:variables

    private void myconnection() {
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/stockinventorydb", "root", "");
            rs=cn.prepareStatement("SELECT * FROM stockinventorytb", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed" +ex.getMessage());
        }
    }

    private void records() {
            try {
            myconnection();
            DefaultTableModel model= (DefaultTableModel)stocktable.getModel();
            model.setRowCount(0);
            while(rs.next()){
                String mydata[]={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)                    
                };
                model.addRow(mydata);
            }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error retrieving records" +ex.getMessage());
            }
    }
    
    private void getrecords(){
        DefaultTableModel model = (DefaultTableModel)stocktable.getModel();
        int nrow = stocktable.getSelectedRow();
        id_TF.setText((String)model.getValueAt(nrow, 0));
        name_TF.setText((String)model.getValueAt(nrow, 1));
        category_TF.setText((String)model.getValueAt(nrow, 2));
        quantity_TF.setText((String)model.getValueAt(nrow, 3));
        price_TF.setText((String)model.getValueAt(nrow, 4));
        
        id_TF.setEditable(false);
        
    }

    private void printrecords() {
        try {
            records();
            stocktable.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Error printing records" +ex.getMessage());
        }
    }

    private void update() {
        int confirmmessage = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record", "This action cannot be undone", JOptionPane.YES_NO_OPTION);
        if(confirmmessage == JOptionPane.YES_OPTION){
            try {
                String id = id_TF.getText();
                String name = name_TF.getText();
                String category = category_TF.getText();
                String quantity = quantity_TF.getText();
                String price = price_TF.getText();

                pdst=cn.prepareStatement("UPDATE stockinventorytb SET NAME=?, CATEGORY=?, QUANTITY=?, PRICE=? WHERE ID=?");
                pdst.setString(1, name);
                pdst.setString(2, category);
                pdst.setString(3, quantity);
                pdst.setString(4, price);
                pdst.setString(5, id);

                int updatedrow = pdst.executeUpdate();
                if(updatedrow>0){
                    JOptionPane.showMessageDialog(null, "Records Updated Successfully");
                }else{
                    JOptionPane.showMessageDialog(null, "Error updating records");
                }


            } catch (SQLException ex) {
                Logger.getLogger(RetrieveRecords.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Update cancelled");
        } 
    }

    private void delete() {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record", "This action cannot be undone", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            try {
                String id = id_TF.getText();
                pdst=cn.prepareStatement("DELETE FROM stockinventorytb WHERE ID=?");
                pdst.setString(1, id);
                int deletedrow = pdst.executeUpdate();
                
                if(deletedrow>0){
                    JOptionPane.showMessageDialog(null, "Records Deleted Successfully");
                    // Clear input fields after deletion
                    id_TF.setText("");
                    name_TF.setText("");
                    category_TF.setText("");
                    quantity_TF.setText("");
                    price_TF.setText("");
                }else {
                JOptionPane.showMessageDialog(null, "No record found with the given ID!");
                }           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error deleting records" + ex.getMessage());
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Deletion cancelled");
        }       
    }

    private void search() {
        String searchQuery = search_TF.getText(); 
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a name or category to search!");
            return;
        }

        try {
            pdst = cn.prepareStatement("SELECT * FROM stockinventorytb WHERE NAME LIKE ? OR CATEGORY LIKE ? OR ID LIKE?");
            pdst.setString(1, "%" + searchQuery + "%");  // Search for partial matches
            pdst.setString(2, "%" + searchQuery + "%");
            pdst.setString(3, "%" + searchQuery + "%");

            rs = pdst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) stocktable.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] myrow = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                };
                model.addRow(myrow);
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No matching records found! Enter a valid ID, Name or Category!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Search error: " + ex.getMessage());
        }
    }
}
