/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.List;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author User
 */
public class Kathigitis extends javax.swing.JFrame {

    //private Model.Kathigitis kathigitis = null;
    public Kathigitis() {
        initComponents();
        Stoixeia_Kathigiti sk = new Stoixeia_Kathigiti();
        jDesktopPane1.add(sk).setVisible(true);
    }

    public Kathigitis(Model.Kathigitis kathigitis) {
        initComponents();
        //this.kathigitis = kathigitis;
        jDesktopPane1.removeAll();
        Stoixeia_Kathigiti sk = new Stoixeia_Kathigiti();
        jDesktopPane1.add(sk).setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Up = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Left = new javax.swing.JPanel();
        Stoixeia = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Stoixeia_K = new javax.swing.JLabel();
        Mathimata = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Mathimata_K = new javax.swing.JLabel();
        Diorthotikes = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Diorthotikes_Vathmologies_Κ1 = new javax.swing.JLabel();
        Log_out1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Up.setBackground(new java.awt.Color(60, 63, 65));
        jPanel_Up.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_UpMouseDragged(evt);
            }
        });
        jPanel_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_UpMousePressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Untitled-1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel_UpLayout = new javax.swing.GroupLayout(jPanel_Up);
        jPanel_Up.setLayout(jPanel_UpLayout);
        jPanel_UpLayout.setHorizontalGroup(
            jPanel_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_UpLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 793, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
        );
        jPanel_UpLayout.setVerticalGroup(
            jPanel_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jPanel_Left.setBackground(new java.awt.Color(204, 204, 204));

        Stoixeia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stoixeia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoixeiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        Stoixeia_K.setText("Στοιχεία Καθηγητή");

        javax.swing.GroupLayout StoixeiaLayout = new javax.swing.GroupLayout(Stoixeia);
        Stoixeia.setLayout(StoixeiaLayout);
        StoixeiaLayout.setHorizontalGroup(
            StoixeiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoixeiaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stoixeia_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StoixeiaLayout.setVerticalGroup(
            StoixeiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Stoixeia_K, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Mathimata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mathimata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MathimataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        Mathimata_K.setText("Μαθήματα");

        javax.swing.GroupLayout MathimataLayout = new javax.swing.GroupLayout(Mathimata);
        Mathimata.setLayout(MathimataLayout);
        MathimataLayout.setHorizontalGroup(
            MathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MathimataLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mathimata_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MathimataLayout.setVerticalGroup(
            MathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Mathimata_K, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Diorthotikes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Diorthotikes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiorthotikesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        Diorthotikes_Vathmologies_Κ1.setText("Διόρθωση Βαθμολογίας");

        javax.swing.GroupLayout DiorthotikesLayout = new javax.swing.GroupLayout(Diorthotikes);
        Diorthotikes.setLayout(DiorthotikesLayout);
        DiorthotikesLayout.setHorizontalGroup(
            DiorthotikesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiorthotikesLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Diorthotikes_Vathmologies_Κ1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DiorthotikesLayout.setVerticalGroup(
            DiorthotikesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Diorthotikes_Vathmologies_Κ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Log_out1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Αποσύνδεση");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Log_out1Layout = new javax.swing.GroupLayout(Log_out1);
        Log_out1.setLayout(Log_out1Layout);
        Log_out1Layout.setHorizontalGroup(
            Log_out1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Log_out1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        Log_out1Layout.setVerticalGroup(
            Log_out1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_LeftLayout = new javax.swing.GroupLayout(jPanel_Left);
        jPanel_Left.setLayout(jPanel_LeftLayout);
        jPanel_LeftLayout.setHorizontalGroup(
            jPanel_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stoixeia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Mathimata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Log_out1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_LeftLayout.createSequentialGroup()
                    .addComponent(Diorthotikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel_LeftLayout.setVerticalGroup(
            jPanel_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stoixeia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mathimata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(Log_out1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_LeftLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(Diorthotikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(368, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel_Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 490));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 710, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked
    int x,y;
    private void jPanel_UpMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_UpMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel_UpMouseDragged

    private void jPanel_UpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_UpMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel_UpMousePressed

    private void StoixeiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoixeiaMouseClicked
        jDesktopPane1.removeAll();
        Stoixeia_Kathigiti sk = new Stoixeia_Kathigiti();
        jDesktopPane1.add(sk).setVisible(true);
    }//GEN-LAST:event_StoixeiaMouseClicked

    private void MathimataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MathimataMouseClicked
        jDesktopPane1.removeAll();
        Mathima d = new Mathima();
        jDesktopPane1.add(d).setVisible(true);
    }//GEN-LAST:event_MathimataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //systemExit();
        //Login_Form l = new Login_Form();
        //l.setVisible(true);
        this.toBack();
        setVisible(false);
        new Login_Form().toFront();
        new Login_Form().setState(java.awt.Frame.NORMAL);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void DiorthotikesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiorthotikesMouseClicked
        jDesktopPane1.removeAll();
        Diorthosi_Vathmologias dv = new Diorthosi_Vathmologias();
        jDesktopPane1.add(dv).setVisible(true);
    }//GEN-LAST:event_DiorthotikesMouseClicked

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
            java.util.logging.Logger.getLogger(Kathigitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kathigitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kathigitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kathigitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kathigitis().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Diorthotikes;
    private javax.swing.JLabel Diorthotikes_Vathmologies_Κ1;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Log_out1;
    private javax.swing.JPanel Mathimata;
    private javax.swing.JLabel Mathimata_K;
    private javax.swing.JPanel Stoixeia;
    private javax.swing.JLabel Stoixeia_K;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel_Left;
    private javax.swing.JPanel jPanel_Up;
    // End of variables declaration//GEN-END:variables
}
