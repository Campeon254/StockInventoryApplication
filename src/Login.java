import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    Connection cn;
    PreparedStatement pdst;
    ResultSet rs;
    public Login() {
        initComponents();
        myconnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        idnumber = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        idnumber_TF = new javax.swing.JTextField();
        login_BT = new javax.swing.JButton();
        signup_BT = new javax.swing.JButton();
        password_PF = new javax.swing.JPasswordField();
        exit_BT = new javax.swing.JButton();
        forgotpassword_BT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("LOG IN WINDOW");

        idnumber.setText("ID NUMBER:");

        password.setText("PASSWORD");

        login_BT.setText("LOGIN");
        login_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_BTActionPerformed(evt);
            }
        });

        signup_BT.setText("SIGN UP");
        signup_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_BTActionPerformed(evt);
            }
        });

        exit_BT.setText("EXIT");
        exit_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_BTActionPerformed(evt);
            }
        });

        forgotpassword_BT.setText("FORGOT PASSWORD?");
        forgotpassword_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpassword_BTActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(forgotpassword_BT)
                                    .addComponent(exit_BT))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(signup_BT)
                                    .addComponent(login_BT))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idnumber)
                            .addComponent(password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password_PF, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(idnumber_TF))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnumber)
                    .addComponent(idnumber_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_BT)
                    .addComponent(forgotpassword_BT))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_BT)
                    .addComponent(exit_BT))
                .addContainerGap(42, Short.MAX_VALUE))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_BTActionPerformed
        login();
    }//GEN-LAST:event_login_BTActionPerformed

    private void exit_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_BTActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_BTActionPerformed

    private void signup_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_BTActionPerformed
        SignUp signupwindow = new SignUp();
        signupwindow.setVisible(true);
    }//GEN-LAST:event_signup_BTActionPerformed

    private void forgotpassword_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpassword_BTActionPerformed
        forgotpassword();
    }//GEN-LAST:event_forgotpassword_BTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_BT;
    private javax.swing.JButton forgotpassword_BT;
    private javax.swing.JLabel idnumber;
    private javax.swing.JTextField idnumber_TF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_BT;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_PF;
    private javax.swing.JButton signup_BT;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    //establish connection with mysql
    private void myconnection() {
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost/stockinventorydb", "root", null);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Connection Failed"+ex.getMessage());
        }
    }

    private void login() {
        myconnection();
        String IDnumber = idnumber_TF.getText().trim();
        String Password = new String(password_PF.getPassword()).trim();//convert password to string format
        
        //check if any field is empty
        if(IDnumber.isEmpty()||Password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            pdst = cn.prepareStatement("SELECT PASSWORD, ROLE FROM employeestb WHERE ID = ?");
            pdst.setString(1, IDnumber);
            
            rs = pdst.executeQuery();
            
            if(rs.next()){
                String storedHashedPassword = rs.getString("Password");
                String userRole = rs.getString("ROLE");
                String enteredHashedPassword = Passwords.hashPassword(Password);
                //compare the two passwords
                if (enteredHashedPassword.equals(storedHashedPassword)) {
                    if(userRole.equalsIgnoreCase("Administrator")){
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        InventoryApp inventory = new InventoryApp();
                        inventory.setVisible(true);
                        dispose();
                    }else {
                    JOptionPane.showMessageDialog(null, "Access Denied! Only Admins can log in.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else {
                JOptionPane.showMessageDialog(null, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
            JOptionPane.showMessageDialog(null, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
        }
    }  

    private void forgotpassword() {
        ForgotPassword pass = new ForgotPassword();
        pass.setVisible(true);
        
    }
}
