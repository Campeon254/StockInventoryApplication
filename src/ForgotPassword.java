import java.sql.*;
import javax.swing.JOptionPane;
public class ForgotPassword extends javax.swing.JFrame {
    Connection cn;
    PreparedStatement pdst;
    ResultSet rs;
    public ForgotPassword() {
        myconnection();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idnumber = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JLabel();
        changepassword_BT = new javax.swing.JButton();
        exit_BT = new javax.swing.JButton();
        idnumber_Tf = new javax.swing.JTextField();
        password_PF = new javax.swing.JPasswordField();
        confirmpassword_PF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHANGE PASSWORD");

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        idnumber.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        idnumber.setText("ID NUMBER: ");

        password.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        password.setText("PASSWORD");

        confirmpassword.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        confirmpassword.setText("CONFIRM PASSWORD: ");

        changepassword_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        changepassword_BT.setForeground(new java.awt.Color(102, 255, 0));
        changepassword_BT.setText("CHANGE PASSWORD");
        changepassword_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassword_BTActionPerformed(evt);
            }
        });

        exit_BT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        exit_BT.setForeground(new java.awt.Color(255, 51, 51));
        exit_BT.setText("BACK");
        exit_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_BTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(changepassword_BT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(exit_BT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idnumber)
                            .addComponent(password)
                            .addComponent(confirmpassword))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idnumber_Tf, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(password_PF)
                            .addComponent(confirmpassword_PF))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnumber)
                    .addComponent(idnumber_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmpassword)
                    .addComponent(confirmpassword_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changepassword_BT)
                    .addComponent(exit_BT))
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void changepassword_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassword_BTActionPerformed
        changepassword();
    }//GEN-LAST:event_changepassword_BTActionPerformed

    private void exit_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_BTActionPerformed
        new Login().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_exit_BTActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ForgotPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changepassword_BT;
    private javax.swing.JLabel confirmpassword;
    private javax.swing.JPasswordField confirmpassword_PF;
    private javax.swing.JButton exit_BT;
    private javax.swing.JLabel idnumber;
    private javax.swing.JTextField idnumber_Tf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_PF;
    // End of variables declaration//GEN-END:variables

    private void myconnection() {
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/stockinventorydb", "root", null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed" + ex.getMessage());
        }        
    }

    private void changepassword() {
        String IDNumber = idnumber_Tf.getText().trim();
        String Password = new String(password_PF.getPassword()).trim();
        String ConfirmPassword = new String(confirmpassword_PF.getPassword()).trim();
        
        //check if any field is empty
        if(IDNumber.isEmpty()||Password.isEmpty()||ConfirmPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all the fields!");
            return;
        }
        
        //check if the two passwords match
        if(!Password.equals(ConfirmPassword)){
            JOptionPane.showMessageDialog(null, "Passwords do not Match! ");
            return;
        }
        
        try{
            pdst=cn.prepareStatement("SELECT * FROM employeestb WHERE ID = ?");
            pdst.setString(1, IDNumber);
            rs=pdst.executeQuery();
            
            if(rs.next()){
                //hash password
                String hashpassword = Passwords.hashPassword(Password);
                pdst=cn.prepareStatement("UPDATE employeestb SET PASSWORD = ? WHERE ID = ?");
                pdst.setString(1, IDNumber);
                pdst.setString(2, hashpassword);
                pdst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Password reset successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Close the forgot password window
            }else {
                JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error occurred when changing passwords" + ex.getMessage());
        }
    }
}
