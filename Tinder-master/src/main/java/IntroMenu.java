

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fiZZy
 */
public class IntroMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public IntroMenu() {
        initComponents();
        //center this form
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        SignInButton = new javax.swing.JButton();
        logoIconLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JButton();
        middleTxtLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        mainPanel.setLayout(null);

        SignInButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SignInButton.setForeground(new java.awt.Color(255, 0, 0));
        SignInButton.setText("Zaloguj się");
        SignInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        mainPanel.add(SignInButton);
        SignInButton.setBounds(1100, 10, 160, 40);
        mainPanel.add(logoIconLabel);
        logoIconLabel.setBounds(10, 10, 40, 40);

        logoLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setText("tinder");
        mainPanel.add(logoLabel);
        logoLabel.setBounds(60, 10, 120, 40);

        SignUpButton.setBackground(new java.awt.Color(255, 0, 0));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Zarejestruj się");
        SignUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        mainPanel.add(SignUpButton);
        SignUpButton.setBounds(550, 330, 190, 40);

        middleTxtLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        middleTxtLabel.setForeground(new java.awt.Color(255, 255, 255));
        middleTxtLabel.setText("Przesuń w prawo");
        mainPanel.add(middleTxtLabel);
        middleTxtLabel.setBounds(440, 240, 400, 60);
        mainPanel.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // go to login screen
        SignIn loginScreen = new SignIn();
        this.dispose();
        loginScreen.setVisible(true);
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // go to register screen
        SignUp registerScreen = new SignUp();
        this.dispose();
        registerScreen.setVisible(true);
    }//GEN-LAST:event_SignUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IntroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel logoIconLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel middleTxtLabel;
    // End of variables declaration//GEN-END:variables
}
