import java.sql.*;
import javax.swing.JOptionPane;
public class InventoryApp extends javax.swing.JFrame {
    Connection cn;
    Object txtcategory;
    public InventoryApp() {
        initComponents();
        myconnection();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        id_TF = new javax.swing.JTextField();
        name_TF = new javax.swing.JTextField();
        quantity_TF = new javax.swing.JTextField();
        price_TF = new javax.swing.JTextField();
        submit_BT = new javax.swing.JButton();
        clear_BT = new javax.swing.JButton();
        category_CB = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        records = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STOCK INVENTORY");

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        id.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        id.setText("PRODUCT ID:");

        name.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        name.setText("PRODUCT CATEGORY:");

        category.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        category.setText("PRODUCT NAME:");

        quantity.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        quantity.setText("PRODUCT QUANTITY:");

        price.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        price.setText("PRODUCT PRICE:");

        submit_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        submit_BT.setForeground(new java.awt.Color(102, 255, 51));
        submit_BT.setText("SUBMIT");
        submit_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_BTActionPerformed(evt);
            }
        });

        clear_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        clear_BT.setForeground(new java.awt.Color(255, 51, 51));
        clear_BT.setText("CLEAR");
        clear_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_BTActionPerformed(evt);
            }
        });

        category_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "Food&Beverage", "Phones&Tablets", "TV's&Audio", "Appliances", "Health&Beauty", "Home&Office", "Fashion", "Computing&Gaming", " " }));
        category_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_CBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity)
                    .addComponent(price)
                    .addComponent(submit_BT)
                    .addComponent(name)
                    .addComponent(category)
                    .addComponent(id))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_TF)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(quantity_TF)
                        .addComponent(price_TF)
                        .addComponent(clear_BT, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(name_TF)
                        .addComponent(category_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(category))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(category_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(price_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_BT)
                    .addComponent(clear_BT))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jMenu1.setText("EXIT");

        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("RECORDS");

        records.setText("RETRIEVE RECORDS");
        records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordsActionPerformed(evt);
            }
        });
        jMenu2.add(records);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_BTActionPerformed
        clear();
    }//GEN-LAST:event_clear_BTActionPerformed

    private void submit_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_BTActionPerformed
        try {
            submit();
            JOptionPane.showMessageDialog(null, "Data Stored Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_submit_BTActionPerformed

    private void category_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_CBActionPerformed
        txtcategory=category_CB.getSelectedItem();
    }//GEN-LAST:event_category_CBActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordsActionPerformed
        new RetrieveRecords().setVisible(true);
        dispose();
    }//GEN-LAST:event_recordsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InventoryApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel category;
    private javax.swing.JComboBox<String> category_CB;
    private javax.swing.JButton clear_BT;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_TF;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_TF;
    private javax.swing.JLabel price;
    private javax.swing.JTextField price_TF;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantity_TF;
    private javax.swing.JMenuItem records;
    private javax.swing.JButton submit_BT;
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
        pst.setString(3, String.valueOf(txtcategory));
        pst.setInt(4, Integer.parseInt(quantity_TF.getText()));
        pst.setDouble(5, Double.parseDouble(price_TF.getText())); 
        
        pst.execute();        
        clear();
    }

    private void clear() {
        id_TF.setText(null);
        name_TF.setText(null);
        category_CB.setSelectedIndex(0);
        quantity_TF.setText(null);
        price_TF.setText(null);        
    }
}

