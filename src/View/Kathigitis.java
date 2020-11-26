/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Color;
import javax.swing.JPanel;



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
    static boolean maximized = true;
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

        jPanel_Left = new javax.swing.JPanel();
        Stoixeia = new javax.swing.JPanel();
        Stoixeia_K = new javax.swing.JLabel();
        Mathimata = new javax.swing.JPanel();
        Mathimata_K = new javax.swing.JLabel();
        Diorthotikes = new javax.swing.JPanel();
        Diorthotikes_Vathmologies_Κ1 = new javax.swing.JLabel();
        Log_out1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        MovePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MovePanel1 = new javax.swing.JPanel();
        ButtonExit = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        ButtonMinimize = new javax.swing.JPanel();
        Minimize1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Left.setBackground(new java.awt.Color(204, 204, 204));

        Stoixeia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stoixeia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoixeiaMouseClicked(evt);
            }
        });

        Stoixeia_K.setText("Στοιχεία Καθηγητή");

        javax.swing.GroupLayout StoixeiaLayout = new javax.swing.GroupLayout(Stoixeia);
        Stoixeia.setLayout(StoixeiaLayout);
        StoixeiaLayout.setHorizontalGroup(
            StoixeiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoixeiaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Stoixeia_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StoixeiaLayout.setVerticalGroup(
            StoixeiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StoixeiaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Stoixeia_K, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Mathimata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mathimata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MathimataMouseClicked(evt);
            }
        });

        Mathimata_K.setText("Μαθήματα");

        javax.swing.GroupLayout MathimataLayout = new javax.swing.GroupLayout(Mathimata);
        Mathimata.setLayout(MathimataLayout);
        MathimataLayout.setHorizontalGroup(
            MathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MathimataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Mathimata_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MathimataLayout.setVerticalGroup(
            MathimataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MathimataLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Mathimata_K, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Diorthotikes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Diorthotikes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiorthotikesMouseClicked(evt);
            }
        });

        Diorthotikes_Vathmologies_Κ1.setText("Διόρθωση Βαθμολογίας");

        javax.swing.GroupLayout DiorthotikesLayout = new javax.swing.GroupLayout(Diorthotikes);
        Diorthotikes.setLayout(DiorthotikesLayout);
        DiorthotikesLayout.setHorizontalGroup(
            DiorthotikesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiorthotikesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Diorthotikes_Vathmologies_Κ1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DiorthotikesLayout.setVerticalGroup(
            DiorthotikesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiorthotikesLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Diorthotikes_Vathmologies_Κ1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(Diorthotikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_LeftLayout.setVerticalGroup(
            jPanel_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LeftLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Stoixeia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mathimata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Diorthotikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(Log_out1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        MovePanel.setBackground(new java.awt.Color(60, 63, 65));
        MovePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovePanelMouseDragged(evt);
            }
        });
        MovePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovePanelMousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Untitled-1.jpg"))); // NOI18N

        MovePanel1.setBackground(new java.awt.Color(60, 63, 65));
        MovePanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovePanel1MouseDragged(evt);
            }
        });
        MovePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovePanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout MovePanel1Layout = new javax.swing.GroupLayout(MovePanel1);
        MovePanel1.setLayout(MovePanel1Layout);
        MovePanel1Layout.setHorizontalGroup(
            MovePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        MovePanel1Layout.setVerticalGroup(
            MovePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        ButtonExit.setBackground(new java.awt.Color(60, 63, 65));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_window_50px.png"))); // NOI18N
        Exit.setMaximumSize(new java.awt.Dimension(20, 20));
        Exit.setMinimumSize(new java.awt.Dimension(20, 20));
        Exit.setPreferredSize(new java.awt.Dimension(20, 20));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonExitLayout = new javax.swing.GroupLayout(ButtonExit);
        ButtonExit.setLayout(ButtonExitLayout);
        ButtonExitLayout.setHorizontalGroup(
            ButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ButtonExitLayout.setVerticalGroup(
            ButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ButtonMinimize.setBackground(new java.awt.Color(60, 63, 65));
        ButtonMinimize.setForeground(new java.awt.Color(255, 51, 102));

        Minimize1.setBackground(new java.awt.Color(255, 255, 255));
        Minimize1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Minimize1.setForeground(new java.awt.Color(255, 255, 255));
        Minimize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize_window_50px.png"))); // NOI18N
        Minimize1.setMaximumSize(new java.awt.Dimension(20, 20));
        Minimize1.setMinimumSize(new java.awt.Dimension(20, 20));
        Minimize1.setPreferredSize(new java.awt.Dimension(30, 30));
        Minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimize1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Minimize1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Minimize1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonMinimizeLayout = new javax.swing.GroupLayout(ButtonMinimize);
        ButtonMinimize.setLayout(ButtonMinimizeLayout);
        ButtonMinimizeLayout.setHorizontalGroup(
            ButtonMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Minimize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ButtonMinimizeLayout.setVerticalGroup(
            ButtonMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Minimize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout MovePanelLayout = new javax.swing.GroupLayout(MovePanel);
        MovePanel.setLayout(MovePanelLayout);
        MovePanelLayout.setHorizontalGroup(
            MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MovePanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 756, Short.MAX_VALUE)
                .addComponent(ButtonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MovePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MovePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MovePanelLayout.setVerticalGroup(
            MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MovePanelLayout.createSequentialGroup()
                .addGroup(MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MovePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MovePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(MovePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int x,y;
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
    private int xMouse, yMouse;
    private void MovePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MovePanelMouseDragged

    private void MovePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanelMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MovePanelMousePressed

    private void Minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimize1MouseClicked
        this.setState(1);
    }//GEN-LAST:event_Minimize1MouseClicked

    private void Minimize1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimize1MouseEntered
        changecolor(ButtonMinimize, new Color(25, 29, 74));
    }//GEN-LAST:event_Minimize1MouseEntered

    private void Minimize1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimize1MouseExited
        changecolor(ButtonMinimize, new Color(60,63,65));
    }//GEN-LAST:event_Minimize1MouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        changecolor(ButtonExit, new Color(25, 29, 74));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        changecolor(ButtonExit, new Color(60,63,65));
    }//GEN-LAST:event_ExitMouseExited

    private void MovePanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MovePanel1MouseDragged

    private void MovePanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanel1MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MovePanel1MousePressed

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
    private javax.swing.JPanel ButtonExit;
    private javax.swing.JPanel ButtonMinimize;
    private javax.swing.JPanel Diorthotikes;
    private javax.swing.JLabel Diorthotikes_Vathmologies_Κ1;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Log_out1;
    private javax.swing.JPanel Mathimata;
    private javax.swing.JLabel Mathimata_K;
    private javax.swing.JLabel Minimize1;
    private javax.swing.JPanel MovePanel;
    private javax.swing.JPanel MovePanel1;
    private javax.swing.JPanel Stoixeia;
    private javax.swing.JLabel Stoixeia_K;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_Left;
    // End of variables declaration//GEN-END:variables
}
