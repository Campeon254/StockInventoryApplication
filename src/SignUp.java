import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;
public class SignUp extends javax.swing.JFrame {
    Connection cn;
    Object txtrole;
    String txtgender = " ";
    public SignUp() {
        initComponents();
        myconnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        idnumber = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirm_password = new javax.swing.JLabel();
        signup_BT = new javax.swing.JButton();
        idnumber_TF = new javax.swing.JTextField();
        username_TF = new javax.swing.JTextField();
        password_PF = new javax.swing.JPasswordField();
        confirm_password_PF = new javax.swing.JPasswordField();
        role = new javax.swing.JLabel();
        role_CB = new javax.swing.JComboBox<>();
        GENDER = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        back = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        idnumber.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        idnumber.setText("ID NUMBER: ");

        username.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        username.setText("USERNAME:");

        password.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        password.setText("PASSWORD:");

        confirm_password.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        confirm_password.setText("CONFIRM PASSWORD:");

        signup_BT.setBackground(new java.awt.Color(102, 255, 0));
        signup_BT.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        signup_BT.setText("SIGN UP");
        signup_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_BTActionPerformed(evt);
            }
        });

        role.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        role.setText("ROLE:");

        role_CB.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        role_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Accountant", "Auditor", "Sales Manager", "Human Resource", "Administrator", " " }));
        role_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_CBActionPerformed(evt);
            }
        });

        GENDER.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        GENDER.setText("GENDER:");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(role)
                        .addGap(178, 178, 178)
                        .addComponent(role_CB, 0, 140, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idnumber)
                            .addComponent(username)
                            .addComponent(GENDER))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_TF)
                            .addComponent(idnumber_TF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(female)
                                    .addComponent(male))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signup_BT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirm_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirm_password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnumber)
                    .addComponent(idnumber_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GENDER)
                    .addComponent(male))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(female)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role)
                    .addComponent(role_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_password)
                    .addComponent(confirm_password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(signup_BT)
                .addContainerGap())
        );

        jMenu1.setText("OPTIONS");

        back.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jMenu1.add(back);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jMenuItem1.setText("EXIT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_BTActionPerformed
        submit();
        clear();
        new Login().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_signup_BTActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void role_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_CBActionPerformed
        txtrole = role_CB.getSelectedItem();
    }//GEN-LAST:event_role_CBActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        if(male.isSelected()){
            txtgender = male.getText();
        }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        if(female.isSelected()){
            txtgender=female.getText();
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GENDER;
    private javax.swing.JMenuItem back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel confirm_password;
    private javax.swing.JPasswordField confirm_password_PF;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel idnumber;
    private javax.swing.JTextField idnumber_TF;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_PF;
    private javax.swing.JLabel role;
    private javax.swing.JComboBox<String> role_CB;
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
       //String Role = role_TF.getText().trim();
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
           PreparedStatement pdst = cn.prepareStatement("INSERT INTO employeestb VALUES(?, ?, ?, ?, ?)");
           pdst.setString(1, idNumber);
           pdst.setString(2, Username);
           pdst.setString(3, txtgender);
           pdst.setString(4, String.valueOf(txtrole));
           pdst.setString(5, hashPassword);
           
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
        txtgender = "";
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
