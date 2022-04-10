
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author fiZZy
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    
    // Default red border
    Border redBorder = BorderFactory.createMatteBorder(0, 6, 0, 0, Color.red);
    // Disable border
    Border disableBorder = BorderFactory.createEmptyBorder();
    
    Color dark_grey = new Color(46, 49, 49);
    // Create an array of jlabels
    JLabel[] menuLabels = new JLabel[4];
    
    // Create an array of JPanels
    JPanel[] panels = new JPanel[4];
    
    public MainMenu() {
        initComponents();
        
        // Center this form
        this.setLocationRelativeTo(null);
        
        // Populate the menuLabels array
        menuLabels[0] = homeLabel;
        menuLabels[1] = messagesLabel;
        menuLabels[2] = profileLabel;
        menuLabels[3] = settingsLabel;
        
        // Populate the panels array
        panels[0] = dashboardPanel;
        panels[1] = messagesPanel;
        panels[2] = profilePanel;
        panels[3] = settingsPanel;
        
        addActionToMenuLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContainer = new javax.swing.JPanel();
        optionsPanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        homeLabel = new javax.swing.JLabel();
        messagesLabel = new javax.swing.JLabel();
        profileLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        iconLogoLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        messagesPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        panelContainer.setAlignmentX(0.0F);
        panelContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelContainer.setLayout(null);

        optionsPanel.setBackground(new java.awt.Color(0, 0, 0));
        optionsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiZZy\\Documents\\NetBeansProjects\\Tinder\\src\\main\\java\\IMAGES\\logout.png")); // NOI18N
        logOutButton.setText("Wyloguj się");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        homeLabel.setBackground(new java.awt.Color(0, 0, 0));
        homeLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiZZy\\Documents\\NetBeansProjects\\Tinder\\src\\main\\java\\IMAGES\\home.png")); // NOI18N
        homeLabel.setText("Strona Główna");
        homeLabel.setToolTipText("");
        homeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLabel.setDisabledIcon(null);
        homeLabel.setMaximumSize(new java.awt.Dimension(102, 40));
        homeLabel.setMinimumSize(new java.awt.Dimension(40, 40));
        homeLabel.setName(""); // NOI18N
        homeLabel.setOpaque(true);
        homeLabel.setPreferredSize(new java.awt.Dimension(102, 40));

        messagesLabel.setBackground(new java.awt.Color(0, 0, 0));
        messagesLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        messagesLabel.setForeground(new java.awt.Color(255, 255, 255));
        messagesLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiZZy\\Documents\\NetBeansProjects\\Tinder\\src\\main\\java\\IMAGES\\messages.png")); // NOI18N
        messagesLabel.setText("Wiadomości");
        messagesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        messagesLabel.setMaximumSize(new java.awt.Dimension(102, 40));
        messagesLabel.setMinimumSize(new java.awt.Dimension(60, 40));
        messagesLabel.setOpaque(true);
        messagesLabel.setPreferredSize(new java.awt.Dimension(102, 40));

        profileLabel.setBackground(new java.awt.Color(0, 0, 0));
        profileLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiZZy\\Documents\\NetBeansProjects\\Tinder\\src\\main\\java\\IMAGES\\profile.png")); // NOI18N
        profileLabel.setText("Profil");
        profileLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileLabel.setMaximumSize(new java.awt.Dimension(102, 40));
        profileLabel.setMinimumSize(new java.awt.Dimension(60, 40));
        profileLabel.setOpaque(true);
        profileLabel.setPreferredSize(new java.awt.Dimension(102, 40));

        settingsLabel.setBackground(new java.awt.Color(0, 0, 0));
        settingsLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        settingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        settingsLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiZZy\\Documents\\NetBeansProjects\\Tinder\\src\\main\\java\\IMAGES\\settings.png")); // NOI18N
        settingsLabel.setText("Ustawienia");
        settingsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsLabel.setMaximumSize(new java.awt.Dimension(102, 40));
        settingsLabel.setMinimumSize(new java.awt.Dimension(60, 40));
        settingsLabel.setOpaque(true);
        settingsLabel.setPreferredSize(new java.awt.Dimension(102, 40));

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messagesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addComponent(logOutButton)
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messagesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addContainerGap())
        );

        panelContainer.add(optionsPanel);
        optionsPanel.setBounds(0, 140, 290, 580);

        logoPanel.setBackground(new java.awt.Color(0, 0, 0));

        iconLogoLabel.setBackground(new java.awt.Color(0, 0, 0));
        iconLogoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\fiZZy\\Documents\\NetBeansProjects\\Tinder\\src\\main\\java\\IMAGES\\logo red.png")); // NOI18N
        iconLogoLabel.setOpaque(true);

        logoLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 0, 0));
        logoLabel.setText("tinder");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconLogoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoLabel)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelContainer.add(logoPanel);
        logoPanel.setBounds(0, 0, 290, 144);

        dashboardPanel.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Strona główna");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );

        panelContainer.add(dashboardPanel);
        dashboardPanel.setBounds(290, 0, 990, 720);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Message Panel");

        javax.swing.GroupLayout messagesPanelLayout = new javax.swing.GroupLayout(messagesPanel);
        messagesPanel.setLayout(messagesPanelLayout);
        messagesPanelLayout.setHorizontalGroup(
            messagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagesPanelLayout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        messagesPanelLayout.setVerticalGroup(
            messagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagesPanelLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        panelContainer.add(messagesPanel);
        messagesPanel.setBounds(290, 0, 990, 720);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("Profile Panel");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        panelContainer.add(profilePanel);
        profilePanel.setBounds(290, 0, 990, 720);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Settings Panel");

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        panelContainer.add(settingsPanel);
        settingsPanel.setBounds(290, 0, 990, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // Back to IntroMenu
        this.dispose();
        IntroMenu introMenu = new IntroMenu();
        introMenu.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed
    
    public void setLabelBackground(JLabel label){
        for(JLabel menuItem : menuLabels){
            // Change the JLabel background to 
            menuItem.setBackground(Color.black);
            // Change the JLabel foreground to 
            menuItem.setForeground(Color.white);
        }
        
        label.setBackground(dark_grey);
    }
    
    // Create a function to show selected panel
    public void showPanel(JPanel panel){
        // Hide panels
        for(JPanel pn1 : panels){
            pn1.setVisible(false);
        }
        
        // Show only this panel
        panel.setVisible(true);
    }
    
    public void setDefaultOptions(){
        logoPanel.setBounds(logoPanel.getX(), logoPanel.getY(), logoPanel.getWidth() + 230, logoPanel.getHeight());
        logoLabel.setVisible(true);
        optionsPanel.setBounds(optionsPanel.getX(), optionsPanel.getY(), optionsPanel.getWidth() + 230, optionsPanel.getHeight());
        
        homeLabel.setBounds(homeLabel.getX(), homeLabel.getY(), homeLabel.getWidth() + 42, homeLabel.getHeight());
        homeLabel.setText("Strona Główna");
        
        messagesLabel.setBounds(messagesLabel.getX(), messagesLabel.getY(), messagesLabel.getWidth() + 42, messagesLabel.getHeight());
        messagesLabel.setText("Wiadomości");
        
        profileLabel.setBounds(profileLabel.getX(), profileLabel.getY(), profileLabel.getWidth() + 42, profileLabel.getHeight());
        profileLabel.setText("Profil");
        
        settingsLabel.setBounds(settingsLabel.getX(), settingsLabel.getY(), settingsLabel.getWidth() + 42, settingsLabel.getHeight());
        settingsLabel.setText("Ustawienia");
    }
    
    public void setMinimalOtions(){
        logoPanel.setBounds(logoPanel.getX(), logoPanel.getY(), logoPanel.getWidth() - 230, logoPanel.getHeight());
        logoLabel.setVisible(false);
        optionsPanel.setBounds(optionsPanel.getX(), optionsPanel.getY(), optionsPanel.getWidth() - 230, optionsPanel.getHeight());
        
        // Set home label
        homeLabel.setBounds(homeLabel.getX(), homeLabel.getY(), homeLabel.getWidth() - 42, homeLabel.getHeight());
        homeLabel.setText("");
        
        // Set profile label
        profileLabel.setBounds(profileLabel.getX(), profileLabel.getY(), profileLabel.getWidth() - 42, profileLabel.getHeight());
        profileLabel.setText("");
        
        // Set messages label
        messagesLabel.setBounds(messagesLabel.getX(), messagesLabel.getY(), messagesLabel.getWidth() - 42, messagesLabel.getHeight());
        messagesLabel.setText("");
        
        // Set settings label
        settingsLabel.setBounds(settingsLabel.getX(), settingsLabel.getY(), settingsLabel.getWidth() - 42, settingsLabel.getHeight());
        settingsLabel.setText("");
    }
    
    public void addActionToMenuLabels(){
        Component[] components = optionsPanel.getComponents();
        
        for(Component component : components){
            if(component instanceof JLabel){
                JLabel label = (JLabel) component;
                
                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        setLabelBackground(label);
                        
                        // Display the selected panel
                        switch(label.getText().trim()){
                            case "Strona Główna":
                                showPanel(dashboardPanel);
                                break;
                            case "Wiadomości":
                                showPanel(messagesPanel);
                                setMinimalOtions();
                                break;
                            case "Profil":
                                showPanel(profilePanel);
                                break;
                            case "Ustawienia":
                                showPanel(settingsPanel);
                                break;
                            default:
                                setDefaultOptions();
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        label.setBorder(redBorder);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        label.setBorder(disableBorder);
                    }
                });
            }
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel iconLogoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel messagesLabel;
    private javax.swing.JPanel messagesPanel;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JPanel settingsPanel;
    // End of variables declaration//GEN-END:variables
}