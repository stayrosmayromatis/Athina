/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller_US_07;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.DefaultListModel;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author User
 */
public class Diorthosi_Vathmologias_G extends javax.swing.JInternalFrame {

    /**
     * Creates new form Diorthosi_Vathmologias_G
     */
    private Controller_US_07 con7;
    private DefaultListModel<String> model_dv;
    private String[] vathmologies = null;
    
    public Diorthosi_Vathmologias_G() throws FileNotFoundException {
        try
        {
             
            con7 = new Controller_US_07();
            model_dv = new DefaultListModel<String>();
            vathmologies = con7.getDiorthoseisVathmologias();
            for (int i = 0; i < vathmologies.length; i++) {
                model_dv.addElement(vathmologies[i]);  
            }
            initComponents(); 
            jList1.setModel(model_dv);
            jList1.setSelectedIndex(-1);
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);    
        }
        catch(FileNotFoundException fnf)
        {
            showMessageDialog(null, "File was not found", "Error", ERROR_MESSAGE);
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        isDig = new javax.swing.JLabel();
        approve = new javax.swing.JButton();
        message = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Διορθωτικές Βαθμολογίες-Αιτήσεις:");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        approve.setText("ΕΓΚΡΙΣΗ");
        approve.setEnabled(false);
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(approve))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(isDig)))))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isDig))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(approve)))
                .addGap(104, 104, 104)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        message.setText("");
        String selected = jList1.getSelectedValue(); 
        String parts[] = selected.split(" ");
        try {
            if (con7.checkDigSig(jList1.getSelectedIndex())) {
                isDig.setText("Ο καθηγητής : "+parts[0]+" κατέχει ψηφιακή υπογραφή.");
                approve.setEnabled(true);
            } 
            else {
                isDig.setText("Ο καθηγητής : "+parts[0]+" δεν κατέχει ψηφιακή υπογραφή.");
                approve.setEnabled(false);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Diorthosi_Vathmologias_G.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        if(con7.SaveDiorthosiVathmologias(jList1.getSelectedValue()))
        {
            message.setText("Η ΔΙΟΡΘΩΣΗ ΒΑΘΜΟΛΟΓΙΑΣ ΕΚΓΡΙΘΗΚΕ");
            model_dv.remove(jList1.getSelectedIndex());
            if(model_dv.isEmpty())
            {
                message.setText("Η ΔΙΟΡΘΩΣΗ ΒΑΘΜΟΛΟΓΙΑΣ ΕΚΓΡΙΘΗΚΕ");
                isDig.setText("");
                approve.setEnabled(false);
                con7.deleteAithmata();
            }
        }
        else
        {
            message.setText("Η ΔΙΟΡΘΩΣΗ ΔΕΝ ΜΠΟΡΕΣΕ ΝΑ ΕΓΚΡΙΘΕΙ");
        }
        
    }//GEN-LAST:event_approveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JLabel isDig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
