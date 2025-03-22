import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;
public class SignUp extends javax.swing.JFrame {
    Connection cn;
    public SignUp() {
        initComponents();
        myconnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idnumber = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirm_password = new javax.swing.JLabel();
        signup_BT = new javax.swing.JButton();
        cancel_BT = new javax.swing.JButton();
        idnumber_TF = new javax.swing.JTextField();
        username_TF = new javax.swing.JTextField();
        password_PF = new javax.swing.JPasswordField();
        confirm_password_PF = new javax.swing.JPasswordField();
        role = new javax.swing.JLabel();
        role_TF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SIGN UP PORTAL");

        idnumber.setText("ID NUMBER: ");

        username.setText("USERNAME:");

        password.setText("PASSWORD:");

        confirm_password.setText("CONFIRM PASSWORD:");

        signup_BT.setText("SIGN UP");
        signup_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_BTActionPerformed(evt);
            }
        });

        cancel_BT.setText("CANCEL");
        cancel_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_BTActionPerformed(evt);
            }
        });

        role.setText("ROLE:");

        role_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_TFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idnumber)
                            .addComponent(username)
                            .addComponent(password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(signup_BT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(role))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(confirm_password)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancel_BT)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(confirm_password_PF)
                    .addComponent(password_PF)
                    .addComponent(role_TF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username_TF)
                    .addComponent(idnumber_TF))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnumber)
                    .addComponent(idnumber_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role)
                    .addComponent(role_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_BT)
                    .addComponent(signup_BT))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void cancel_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_BTActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancel_BTActionPerformed

    private void signup_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_BTActionPerformed
        submit();
        clear();
    }//GEN-LAST:event_signup_BTActionPerformed

    private void role_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_role_TFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_BT;
    private javax.swing.JLabel confirm_password;
    private javax.swing.JPasswordField confirm_password_PF;
    private javax.swing.JLabel idnumber;
    private javax.swing.JTextField idnumber_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_PF;
    private javax.swing.JLabel role;
    private javax.swing.JTextField role_TF;
    private javax.swing.JButton signup_BT;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_TF;
    // End of variables declaration//GEN-END:variables

    private void myconnection() {
        try{
            cn=DriverManager.getConnection("jdbc:mysql://localhost/stockinventorydb", "root", null);
            //JOptionPane.showMessageDialog(null, "Connection Success!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Connection Failed" + ex.getMessage());
        }
    }

    private void submit() {
        //get the text in string format and remove all white spaces
       String idNumber = idnumber_TF.getText().trim();
       String Username = username_TF.getText().trim();
       String Role = role_TF.getText().trim();
       String Password = new String(password_PF.getPassword()).trim();
       String Confirm_password = new String(confirm_password_PF.getPassword()).trim();
       
       //check if any field is empty
       if(idNumber.isEmpty()||Username.isEmpty()||Password.isEmpty()||Confirm_password.isEmpty()){
           JOptionPane.showMessageDialog(this, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
           return;          
       }
       
       //check if passwords match
       if(!Password.equals(Confirm_password)){
           JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
           return;
       }
       
       //store data in mysql
       try{
           String hashPassword = Passwords.hashPassword(Password);
           PreparedStatement pdst = cn.prepareStatement("INSERT INTO employeestb VALUES(?, ?, ?, ?)");
           pdst.setString(1, idNumber);
           pdst.setString(2, Username);
           pdst.setString(3, Role);
           pdst.setString(4, hashPassword);
           
           pdst.executeUpdate();
           pdst.close();
           dispose();
           JOptionPane.showMessageDialog(null, "You have successfully signup! ");
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "An Error Occurred when signing up! " + ex.getMessage());
       }   
    }
    
    private void clear(){
        idnumber_TF.setText("");
        username_TF.setText("");
        password_PF.setText("");
        confirm_password_PF.setText("");
    }
    
    //hash the passwords stored in the database
    private static class Passwords {

        public Passwords() {
        }
        public static String hashPassword(String password) {
        try {
            //select SHA hashing algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());//converts passwords tp bytes

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                //convert bytes to hexadecimal for storing
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
  }
}
