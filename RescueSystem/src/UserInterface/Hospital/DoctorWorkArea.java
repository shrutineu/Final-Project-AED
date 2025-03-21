/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital;

import EmergencySystem.Emergency.Emergency;
import EmergencySystem.EmergencySystem;
import EmergencySystem.Enterprise.Enterprise;
import EmergencySystem.Network.Network;
import Hospital.UserAccount.UserAccount;
import Hospital.WorkQueue.Emergency911DepartmentWorkRequest;
import Hospital.WorkQueue.WorkRequest;
//import com.googlecode.javacv.CanvasFrame;
//import com.googlecode.javacv.cpp.opencv_core.IplImage;
//import com.googlecode.javacv.cpp.opencv_highgui;
//import com.googlecode.javacv.cpp.opencv_highgui.CvCapture;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Msanskruti
 */
public class DoctorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkArea
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EmergencySystem system;
    private Network network;
    private Enterprise enterprise;
    
    public DoctorWorkArea(JPanel userProcessContainer, UserAccount account, EmergencySystem system, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
        this.network=network;
        this.enterprise=enterprise;
        populateWorkQueue();
                
    }

    
    public void populateWorkQueue()
    {
        DefaultTableModel model = (DefaultTableModel) emergencyTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest workRequest:account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0]=  workRequest;
            row[1] = ((Emergency911DepartmentWorkRequest) workRequest).getEmergency();
            row[2] = ((Emergency911DepartmentWorkRequest) workRequest).getEmergency().getNatureOfEmergency();
            row[3] = ((Emergency911DepartmentWorkRequest) workRequest).getEmergency().getDescription();

            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emergencyTable = new javax.swing.JTable();
        connectToPatientBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 234, 234));

        header.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        header.setText("Doctor work area");

        emergencyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Location of emergency", "Nature of emergency", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emergencyTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(emergencyTable);
        emergencyTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (emergencyTable.getColumnModel().getColumnCount() > 0) {
            emergencyTable.getColumnModel().getColumn(1).setMinWidth(300);
            emergencyTable.getColumnModel().getColumn(1).setPreferredWidth(300);
            emergencyTable.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        connectToPatientBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        connectToPatientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Hospital/images/1449794157_video-camera.png"))); // NOI18N
        connectToPatientBtn.setText("Connect to the patient");
        connectToPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectToPatientBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(connectToPatientBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(header)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(header)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(connectToPatientBtn)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void connectToPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectToPatientBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
        this, // Reference to the parent component (use 'this' if it's part of a JFrame or JDialog)
        "You will be connected to the patient via webcam in the next 2 minutes 15 seconds.", // Message
        "Connecting...", // Title of the dialog
        JOptionPane.INFORMATION_MESSAGE // Type of message
    );
        
     
    }//GEN-LAST:event_connectToPatientBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectToPatientBtn;
    private javax.swing.JTable emergencyTable;
    private javax.swing.JLabel header;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
