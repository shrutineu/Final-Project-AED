/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.main;

import DB04.DB4OUtil;
import EmergencySystem.ConfigureASystem;
import EmergencySystem.EmergencySystem;
import EmergencySystem.Enterprise.Enterprise;
import EmergencySystem.Network.Network;
import Hospital.Hospital;
import Hospital.Organisation.Organisation;
import Hospital.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Msanskruti
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    private EmergencySystem emergencySystemObject;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public LoginPage() {
        initComponents();
        

        emergencySystemObject= ConfigureASystem.configure();
        emergencySystemObject = dB4OUtil.retrieveSystem();
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setForeground(Color.GRAY);
        
        logoutBtn.setBackground(Color.BLACK);
        logoutBtn.setForeground(Color.GRAY);
        logoutBtn.setEnabled(false);
        
  
   
    
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        imagePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        passwordTitle = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        passwordTF = new javax.swing.JPasswordField();
        passwordTitle1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        usrnameError = new javax.swing.JLabel();
        passwordError = new javax.swing.JLabel();
        commonErrorLabel = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jSplitPane2.setDividerSize(0);

        loginPanel.setBackground(new java.awt.Color(243, 242, 242));
        loginPanel.setForeground(new java.awt.Color(153, 153, 153));

        loginTitle.setBackground(new java.awt.Color(0, 0, 0));
        loginTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        loginTitle.setText("LOGIN TO YOUR ACCOUNT");

        userNameTF.setForeground(new java.awt.Color(153, 153, 153));
        userNameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameTFFocusLost(evt);
            }
        });
        userNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTFActionPerformed(evt);
            }
        });

        passwordTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        passwordTitle.setText(" PASSWORD:");

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        passwordTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTFFocusLost(evt);
            }
        });

        passwordTitle1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        passwordTitle1.setText("USERNAME:");

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        usrnameError.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        usrnameError.setForeground(new java.awt.Color(102, 102, 102));

        passwordError.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        passwordError.setForeground(new java.awt.Color(102, 102, 102));
        passwordError.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordErrorFocusLost(evt);
            }
        });

        commonErrorLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        commonErrorLabel.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordTitle1)
                                        .addComponent(passwordTitle))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usrnameError, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordError, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(commonErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrnameError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(passwordTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(commonErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(imagePanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());

        panel.setForeground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Rescue Management System");

        jLabel2.setAutoscrolls(true);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(702, Short.MAX_VALUE))
        );

        userProcessContainer.add(panel, "card2");

        jSplitPane2.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTFActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String userName = userNameTF.getText();
        char[] passwordCharArray = passwordTF.getPassword();
        String password = String.valueOf(passwordCharArray); 
     
        if(userName.equals(""))
        {
            usrnameError.setText("Enter the user name");
        }
        
        if(password.equals(""))
        {
            passwordError.setText("Enter the password");
        }
        
        Enterprise inEnterprise = null;
        Organisation inOrganisation = null;
        Network choosenNetwork=null;
        UserAccount userAccount = emergencySystemObject.getUserAccountDirectory().authenticateUser(userName, password);
        if (userAccount == null)
        {
            //Step2: Go inside each network to check each enterprise
            for (Network network : emergencySystemObject.getNetworkList())
            {
                //System.out.println("I am in network"+network);
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEntDirObj().getEnterpriseList()) 
                {
                    // System.out.println("I am in enterprise"+enterprise);
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null)
                    {
                        //Step3: Check against each organization inside that enterprise
                        
                        for (Organisation organisation : enterprise.getOrganizationDirectory().getOrganisationList())
                        {
                           // System.out.println("I am in organisation"+organisation);
                            userAccount = organisation.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) 
                            {
                               // System.out.println("the user account is found");
                                inEnterprise = enterprise;
                                inOrganisation = organisation;
                                choosenNetwork=network;
                                break;
                            }
                        }
                    } 
                    else
                    {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganisation != null) 
                    {
                        break;
                    }
                }
                if (inEnterprise != null) 
                {
                    break;
                }
                
                if(userAccount==null)
                {
                    for(Hospital h:network.getHospitalList())
                    {
                        userAccount=h.getUserAccountDirectory().authenticateUser(userName, password);
                        if(userAccount!=null)
                        {
                        inEnterprise=h;
                        break;
                        }
                    }
                    
                
                    if(userAccount==null)
                    
                    {
                        for(Hospital h:network.getHospitalList())
                        {
                            for(Organisation org:h.getOrganizationDirectory().getOrganisationList())
                            {
                                userAccount=org.getUserAccountDirectory().authenticateUser(userName, password);
                                if(userAccount!=null)
                                {
                                    
                                    inEnterprise=h;
                                    break;
                                }
                            }
                            if(userAccount!=null)
                            {
                                break;
                            }
                        }
      
                    }
                    
                }
               if(userAccount!=null)
               {
                    
                    choosenNetwork=network;
                    break;
                    
               }
            }
        }

        if (userAccount == null)
        {
            commonErrorLabel.setText ("Invalid Credentials!");
            return;
        } 
        else 
        {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("workArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, emergencySystemObject,choosenNetwork,inEnterprise));
            layout.next(userProcessContainer);
            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
            commonErrorLabel.setText("");
            userNameTF.setEditable(false);
            passwordTF.setEditable(false);
            
        }
    
    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
       
        userNameTF.setEnabled(true);
        passwordTF.setEnabled(true);
        loginBtn.setEnabled(true);
        logoutBtn.setEnabled(false);
        userNameTF.setEditable(true);
        passwordTF.setEditable(true);

        userNameTF.setText("");
        passwordTF.setText("");

        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(emergencySystemObject);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void userNameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTFFocusLost
        // TODO add your handling code here:
        String username=userNameTF.getText().trim();
        if(username.equals(""))
        {
            usrnameError.setText("Enter the user name");
        }
        
        
    }//GEN-LAST:event_userNameTFFocusLost

    private void userNameTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTFFocusGained
        // TODO add your handling code here:
         usrnameError.setText("");
    }//GEN-LAST:event_userNameTFFocusGained

    private void passwordErrorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordErrorFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordErrorFocusLost

    private void passwordTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusGained
        // TODO add your handling code here:
        passwordError.setText("");
    }//GEN-LAST:event_passwordTFFocusGained

    private void passwordTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusLost
        // TODO add your handling code here:
         char[] passwordCharArray = passwordTF.getPassword();
        String password = String.valueOf(passwordCharArray);
        if(password.trim().equals(""))
        {
            passwordError.setText("Enter the password");
        }
    }//GEN-LAST:event_passwordTFFocusLost

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel commonErrorLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel passwordError;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel passwordTitle;
    private javax.swing.JLabel passwordTitle1;
    private javax.swing.JTextField userNameTF;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JLabel usrnameError;
    // End of variables declaration//GEN-END:variables
}
