/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import Controller.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Diorthosi_Vathmologias extends javax.swing.JInternalFrame {
    //Controller of User Story
    private Controller_US_06 con6;
    //Dynamically inserting items to the list
    private DefaultListModel<String> model;
    private DefaultListModel<String> model_math;
    private DefaultListModel<String> model_eks;
    //Instance of logged-In kathigitis
    //private Model.Kathigitis kathigitis=null;
    
    String mathimata_titles[]=null;
    String eksetastikes_mathimatos[]=null;
    ArrayList<Model.Mathima> vathm = new ArrayList<>();
    
    
    public Diorthosi_Vathmologias() {
        initComponents();
        con6= new Controller_US_06();
        model= new DefaultListModel<String>();
        model_math = new DefaultListModel<>();
        model_eks = new DefaultListModel<>();
        //this.kathigitis=kathigitis;
        mathimata_titles=con6.getMathimataOfKathigitis();   
        //Δυναμικό γέμισμα των μαθημάτων
        for (int i = 0; i < mathimata_titles.length; i++) {       
            model.addElement(mathimata_titles[i]);
        }
        jList1.setModel(model);
        jList1.setSelectedIndex(-1);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
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
        jList1 = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        eksetastikes = new javax.swing.JList();
        AM_txt = new javax.swing.JTextField();
        next_btn = new javax.swing.JButton();
        vath = new javax.swing.JLabel();
        ins_vath = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        Message = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Τα μαθήματά μου :");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        eksetastikes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        eksetastikes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eksetastikesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eksetastikes);

        next_btn.setText("ΕΠΟΜΕΝΟ");
        next_btn.setEnabled(false);
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });

        vath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ins_vath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ins_vath.setEnabled(false);

        save.setText("ΥΠΟΒΟΛΗ");
        save.setEnabled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Εισάγετε ΑΜ Φοιτητή (itXXXXXX):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Εξεταστικές:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(AM_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(next_btn))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(vath, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ins_vath, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AM_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next_btn)))
                .addGap(54, 54, 54)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(save)
                        .addComponent(ins_vath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        model_math.clear();
        if (jList1.getSelectedValue()!= null) {
            eksetastikes.setVisible(true);
            System.out.println(jList1.getSelectedValue());    
            eksetastikes_mathimatos = con6.getEksetastikesOfMathima(jList1.getSelectedValue().toString());
            System.out.println("Bghka");
            for (int i = 0; i<eksetastikes_mathimatos.length ; i++) {
                model_math.addElement(eksetastikes_mathimatos[i]);
            }
            eksetastikes.setModel(model_math);
            eksetastikes.setSelectedIndex(-1);
        }

    }//GEN-LAST:event_jList1MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        
    }//GEN-LAST:event_jList1ValueChanged

    private void eksetastikesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eksetastikesMouseClicked
        model_eks.clear();
        if (eksetastikes.getSelectedIndex() != -1) {
            AM_txt.setVisible(true);
            next_btn.setVisible(true);
            next_btn.setEnabled(true);
        }
    }//GEN-LAST:event_eksetastikesMouseClicked

    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
       try { 
            if(con6.getVathmologia(AM_txt.getText(),jList1.getSelectedValue().toString(),eksetastikes.getSelectedValue().toString()) == -1)
            {
                vath.setText("ΔΕΝ ΕΧΕΙ ΚΑΤΑΧΩΡΗΘΕΙ ΒΑΘΜΟΛΟΓΙΑ.");
            }
            else {
                vath.setText(""+con6.getVathmologia(AM_txt.getText(),jList1.getSelectedValue().toString(),eksetastikes.getSelectedValue().toString()));
                ins_vath.setEnabled(true);
                save.setEnabled(true);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Diorthosi_Vathmologias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_next_btnActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        double inserted= Double.parseDouble(ins_vath.getText());
        if(inserted >=0.0 && inserted <=10.0)
        {
            try 
            {
                con6.EisagogiDiorthosisVathmologias(jList1.getSelectedValue().toString(), eksetastikes.getSelectedValue().toString(),AM_txt.getText(),Double.parseDouble(vath.getText()), inserted);
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(Diorthosi_Vathmologias.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (con6.SaveVathmologia()) {
                Message.setText("Η ΒΑΘΜΟΛΟΓΙΑ ΣΑΣ ΣΤΑΛΘΗΚΕ ΠΡΟΣ ΕΠΙΚΥΡΩΣΗ ΕΠΙΤΥΧΩΣ!");
                AM_txt.setText(" ");
                vath.setText(" ");
                ins_vath.setText(" ");
                save.setEnabled(false);
            }
            else {
                Message.setText("ΑΠΟΤΥΧΙΑ ΑΠΟΣΤΟΛΗΣ.");
                AM_txt.setText(" ");
                vath.setText(" ");
                ins_vath.setText(" ");
                save.setEnabled(false);
            }
        }
        else
        {
            Message.setText("ΕΠΙΤΡΕΠΤΕΣ ΤΙΜΕΣ ΜΕΤΑΞΥ 0.0 ~ 10.0");
        }
        
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AM_txt;
    private javax.swing.JLabel Message;
    private javax.swing.JList eksetastikes;
    private javax.swing.JTextField ins_vath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton next_btn;
    private javax.swing.JButton save;
    private javax.swing.JLabel vath;
    // End of variables declaration//GEN-END:variables
}
