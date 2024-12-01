/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grantmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author gregm// Gregory coded functionality of this jframe
 */
public class LoginPageGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPageGUI() {
        initComponents();
        Administrator.createAdmins();
        Student.createStudent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPNL = new javax.swing.JPanel();
        passwordField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        TermsAndConditionsCheckBox = new javax.swing.JCheckBox();
        ContinueAsGuestBTN = new javax.swing.JButton();
        LoginHeadingLabel = new javax.swing.JLabel();
        LoginBTN = new javax.swing.JButton();
        LogoPNL = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPNL.setBackground(new java.awt.Color(255, 255, 255));

        passwordField.setPreferredSize(new java.awt.Dimension(64, 35));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        EmailLabel.setText("Email Address");

        PasswordLabel.setText("Password");

        emailField.setPreferredSize(new java.awt.Dimension(64, 35));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        TermsAndConditionsCheckBox.setText("Accept terms and conditions");

        ContinueAsGuestBTN.setText("Continue as guest");
        ContinueAsGuestBTN.setPreferredSize(new java.awt.Dimension(250, 30));
        ContinueAsGuestBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueAsGuestBTNActionPerformed(evt);
            }
        });

        LoginHeadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginHeadingLabel.setText("       LOGIN");

        LoginBTN.setText("Login");
        LoginBTN.setPreferredSize(new java.awt.Dimension(250, 30));
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPNLLayout = new javax.swing.GroupLayout(LoginPNL);
        LoginPNL.setLayout(LoginPNLLayout);
        LoginPNLLayout.setHorizontalGroup(
            LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPNLLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TermsAndConditionsCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ContinueAsGuestBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        LoginPNLLayout.setVerticalGroup(
            LoginPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPNLLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LoginHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(TermsAndConditionsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContinueAsGuestBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        LogoPNL.setBackground(new java.awt.Color(51, 204, 255));

        LogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ball.png"))); // NOI18N

        javax.swing.GroupLayout LogoPNLLayout = new javax.swing.GroupLayout(LogoPNL);
        LogoPNL.setLayout(LogoPNLLayout);
        LogoPNLLayout.setHorizontalGroup(
            LogoPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoPNLLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        LogoPNLLayout.setVerticalGroup(
            LogoPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void ContinueAsGuestBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueAsGuestBTNActionPerformed
        setVisible(false);

        // Open the HomePage
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }//GEN-LAST:event_ContinueAsGuestBTNActionPerformed

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        String email = emailField.getText();
        String enteredPassword = passwordField.getText().trim();

        // Check if the user is an admin or student
        if (Administrator.loginAdmin(email, enteredPassword)) {
            JOptionPane.showMessageDialog(null, "Welcome Admin!");
            setVisible(false);
            // Open the HomePage
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        } else if (Student.loginStudent(email, enteredPassword)) {
            JOptionPane.showMessageDialog(null, "Welcome Student!");
            setVisible(false);
            // Open the HomePage
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid email or password!");
        }

    }//GEN-LAST:event_LoginBTNActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueAsGuestBTN;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JLabel LoginHeadingLabel;
    private javax.swing.JPanel LoginPNL;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel LogoPNL;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JCheckBox TermsAndConditionsCheckBox;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField passwordField;
    // End of variables declaration//GEN-END:variables
}
