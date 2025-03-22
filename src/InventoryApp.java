import java.sql.*;
import javax.swing.JOptionPane;
public class InventoryApp extends javax.swing.JFrame {
    Connection cn;
    public InventoryApp() {
        initComponents();
        myconnection();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
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
        submit_BT = new javax.swing.JButton();
        clear_BT = new javax.swing.JButton();
        exit_BT = new javax.swing.JButton();
        retrieverecords_BT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        title.setText("STOCK INVENTORY APPLICATION");

        id.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        id.setText("PRODUCT ID:");

        name.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        name.setText("PRODUCT NAME:");

        category.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        category.setText("PRODUCT CATEGORY:");

        quantity.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        quantity.setText("PRODUCT QUANTITY:");

        price.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        price.setText("PRODUCT PRICE:");

        submit_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        submit_BT.setForeground(new java.awt.Color(102, 255, 102));
        submit_BT.setText("SUBMIT");
        submit_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_BTActionPerformed(evt);
            }
        });

        clear_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        clear_BT.setForeground(new java.awt.Color(153, 255, 255));
        clear_BT.setText("CLEAR");
        clear_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_BTActionPerformed(evt);
            }
        });

        exit_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        exit_BT.setForeground(new java.awt.Color(255, 51, 51));
        exit_BT.setText("LOG OUT");
        exit_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_BTActionPerformed(evt);
            }
        });

        retrieverecords_BT.setText("RETRIEVE RECORDS");
        retrieverecords_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieverecords_BTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(category, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(price)
                                .addComponent(quantity)
                                .addComponent(submit_BT)
                                .addComponent(exit_BT)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(clear_BT)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(name_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(category_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(quantity_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(price_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(retrieverecords_BT))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(submit_BT)
                    .addComponent(clear_BT))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_BT)
                    .addComponent(retrieverecords_BT))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_BTActionPerformed
        try {
            submit();
            JOptionPane.showMessageDialog(null, "Data Stored Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_submit_BTActionPerformed

    private void clear_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_BTActionPerformed
        clear();
    }//GEN-LAST:event_clear_BTActionPerformed

    private void exit_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_BTActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_exit_BTActionPerformed

    private void retrieverecords_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieverecords_BTActionPerformed
        new RetrieveRecords().setVisible(true);
        dispose();
    }//GEN-LAST:event_retrieverecords_BTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InventoryApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel category;
    private javax.swing.JTextField category_TF;
    private javax.swing.JButton clear_BT;
    private javax.swing.JButton exit_BT;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_TF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_TF;
    private javax.swing.JLabel price;
    private javax.swing.JTextField price_TF;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantity_TF;
    private javax.swing.JButton retrieverecords_BT;
    private javax.swing.JButton submit_BT;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void myconnection() {
        try{
        cn=DriverManager.getConnection("jdbc:mysql://localhost/stockinventorydb", "root", null);
        //JOptionPane.showMessageDialog(null, "Connection Successfull!");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void submit() throws SQLException {
        // prepared statement
        PreparedStatement pst = cn.prepareStatement("INSERT INTO stockinventorytb VALUES(?, ?, ?, ?, ?)");
        pst.setString(1, id_TF.getText());
        pst.setString(2, name_TF.getText());
        pst.setString(3, category_TF.getText());
        pst.setInt(4, Integer.parseInt(quantity_TF.getText()));
        pst.setDouble(5, Double.parseDouble(price_TF.getText())); 
        
        pst.execute();        
        clear();
    }

    private void clear() {
        id_TF.setText(null);
        name_TF.setText(null);
        category_TF.setText(null);
        quantity_TF.setText(null);
        price_TF.setText(null);        
    }
}

