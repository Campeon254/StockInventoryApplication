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
        jScrollPane1 = new javax.swing.JScrollPane();
        stocktable = new javax.swing.JTable();
        refresh_BT = new javax.swing.JButton();
        back = new javax.swing.JMenuBar();
        exit = new javax.swing.JMenu();
        backmenu = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        showrecords = new javax.swing.JMenuItem();
        printrecords = new javax.swing.JMenuItem();

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
        update_BT.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        update_BT.setText("UPDATE");
        update_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_BTActionPerformed(evt);
            }
        });

        delete_BT.setBackground(new java.awt.Color(255, 51, 0));
        delete_BT.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        delete_BT.setText("DELETE");
        delete_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_BTActionPerformed(evt);
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

        refresh_BT.setBackground(new java.awt.Color(153, 255, 255));
        refresh_BT.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        refresh_BT.setText("REFRESH");
        refresh_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_BTActionPerformed(evt);
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
                    .addComponent(search_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(delete_BT, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(id_TF)
                        .addComponent(name_TF)
                        .addComponent(category_TF)
                        .addComponent(quantity_TF)
                        .addComponent(price_TF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search_BT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refresh_BT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_BT)
                            .addComponent(refresh_BT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(delete_BT)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        exit.setText("OPTIONS");

        backmenu.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        backmenu.setText("BACK");
        backmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backmenuActionPerformed(evt);
            }
        });
        exit.add(backmenu);

        logout.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        exit.add(logout);

        back.add(exit);

        jMenu1.setText("RECORDS");

        showrecords.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        showrecords.setText("SHOW ALL RECORDS");
        showrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showrecordsActionPerformed(evt);
            }
        });
        jMenu1.add(showrecords);

        printrecords.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        printrecords.setText("PRINT RECORDS");
        printrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printrecordsActionPerformed(evt);
            }
        });
        jMenu1.add(printrecords);

        back.add(jMenu1);

        setJMenuBar(back);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_BTActionPerformed
        search();
    }//GEN-LAST:event_search_BTActionPerformed

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

    private void backmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backmenuActionPerformed
        new InventoryApp().setVisible(true);
        dispose();
    }//GEN-LAST:event_backmenuActionPerformed

    private void printrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printrecordsActionPerformed
        printrecords();
    }//GEN-LAST:event_printrecordsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(null, "Successully Logged Out");
    }//GEN-LAST:event_logoutActionPerformed

    private void showrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showrecordsActionPerformed
        records();
    }//GEN-LAST:event_showrecordsActionPerformed

    private void refresh_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_BTActionPerformed
        myconnection();
        records();
    }//GEN-LAST:event_refresh_BTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RetrieveRecords().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar back;
    private javax.swing.JMenuItem backmenu;
    private javax.swing.JLabel category;
    private javax.swing.JTextField category_TF;
    private javax.swing.JButton delete_BT;
    private javax.swing.JMenu exit;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_TF;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_TF;
    private javax.swing.JLabel price;
    private javax.swing.JTextField price_TF;
    private javax.swing.JMenuItem printrecords;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantity_TF;
    private javax.swing.JButton refresh_BT;
    private javax.swing.JButton search_BT;
    private javax.swing.JTextField search_TF;
    private javax.swing.JMenuItem showrecords;
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
        name_TF.setEditable(false);
        category_TF.setEditable(false);
        
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
