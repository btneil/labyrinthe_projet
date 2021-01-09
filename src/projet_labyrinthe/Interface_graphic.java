/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_labyrinthe;

/**
 *
 * @author maldo
 */
public class Interface_graphic extends javax.swing.JFrame {
    GrilleJeu grilleDeJeu = new GrilleJeu();

    /**
     * Creates new form Interface_graphic
     */
    public Interface_graphic() {
        initComponents();
        panneau_Info_joueur_courant.setVisible(false);
        Info_partie.setVisible(false);
        Carte_en_trop.setVisible(false);
        
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                Case_graphique Kazeu = new Case_graphique(grilleDeJeu.plateau[i][j],"/images/tuile1.png");
                Grille_de_jeu.add(Kazeu);
            }
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

        jLabel3 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        Panneau_début_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bouton_ajouter_J = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bouton_débuter_partie = new javax.swing.JToggleButton();
        Pseudo_J4 = new javax.swing.JTextField();
        Pseudo_J1 = new javax.swing.JTextField();
        Pseudo_J2 = new javax.swing.JTextField();
        Pseudo_J3 = new javax.swing.JTextField();
        panneau_Info_joueur_courant = new javax.swing.JPanel();
        Carte_en_trop = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Info_partie = new javax.swing.JPanel();
        Table_de_jeu = new javax.swing.JPanel();
        Grille_de_jeu = new javax.swing.JPanel();
        jButton50 = new javax.swing.JButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();

        jLabel3.setText("jLabel3");

        jToggleButton3.setText("jToggleButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panneau_début_partie.setBackground(new java.awt.Color(0, 0, 255));
        Panneau_début_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 1:");
        Panneau_début_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setText("Nom Joueur 2:");
        Panneau_début_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        Bouton_ajouter_J.setText("Ajouter un joueur");
        Bouton_ajouter_J.setActionCommand("Ajouter un joueur");
        Bouton_ajouter_J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_ajouter_JActionPerformed(evt);
            }
        });
        Panneau_début_partie.add(Bouton_ajouter_J, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, -1));

        jLabel4.setText("Nom Joueur 3:");
        Panneau_début_partie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel5.setText("Nom Joueur 4:");
        Panneau_début_partie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        Bouton_débuter_partie.setText("Débuter Partie");
        Bouton_débuter_partie.setToolTipText("");
        Bouton_débuter_partie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_débuter_partieActionPerformed(evt);
            }
        });
        Panneau_début_partie.add(Bouton_débuter_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        Pseudo_J4.setText("Pseudo");
        Panneau_début_partie.add(Pseudo_J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, -1));

        Pseudo_J1.setText("Pseudo");
        Pseudo_J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pseudo_J1ActionPerformed(evt);
            }
        });
        Panneau_début_partie.add(Pseudo_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 150, -1));

        Pseudo_J2.setText("Pseudo");
        Panneau_début_partie.add(Pseudo_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 150, -1));

        Pseudo_J3.setText("Pseudo");
        Panneau_début_partie.add(Pseudo_J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, -1));

        panneau_Info_joueur_courant.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panneau_Info_joueur_courantLayout = new javax.swing.GroupLayout(panneau_Info_joueur_courant);
        panneau_Info_joueur_courant.setLayout(panneau_Info_joueur_courantLayout);
        panneau_Info_joueur_courantLayout.setHorizontalGroup(
            panneau_Info_joueur_courantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        panneau_Info_joueur_courantLayout.setVerticalGroup(
            panneau_Info_joueur_courantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        Carte_en_trop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("carte en trop");
        Carte_en_trop.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        Info_partie.setBackground(new java.awt.Color(102, 0, 204));

        javax.swing.GroupLayout Info_partieLayout = new javax.swing.GroupLayout(Info_partie);
        Info_partie.setLayout(Info_partieLayout);
        Info_partieLayout.setHorizontalGroup(
            Info_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        Info_partieLayout.setVerticalGroup(
            Info_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Grille_de_jeu.setBackground(new java.awt.Color(255, 0, 153));
        Grille_de_jeu.setLayout(new java.awt.GridLayout(7, 7));

        jButton50.setText("jButton50");
        jButton50.setMaximumSize(new java.awt.Dimension(23, 23));
        jButton50.setMinimumSize(new java.awt.Dimension(23, 23));

        jToggleButton4.setText("jToggleButton4");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("jToggleButton5");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("jToggleButton6");

        jToggleButton7.setText("jToggleButton7");

        jToggleButton8.setText("jToggleButton8");

        jToggleButton9.setText("jToggleButton9");

        jToggleButton10.setText("jToggleButton10");

        jToggleButton11.setText("jToggleButton11");

        jToggleButton14.setText("jToggleButton14");

        jToggleButton13.setText("jToggleButton13");

        jToggleButton12.setText("jToggleButton12");

        javax.swing.GroupLayout Table_de_jeuLayout = new javax.swing.GroupLayout(Table_de_jeu);
        Table_de_jeu.setLayout(Table_de_jeuLayout);
        Table_de_jeuLayout.setHorizontalGroup(
            Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Table_de_jeuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(Table_de_jeuLayout.createSequentialGroup()
                .addGroup(Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Table_de_jeuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Table_de_jeuLayout.createSequentialGroup()
                                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Table_de_jeuLayout.createSequentialGroup()
                                .addGroup(Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))
                        .addComponent(Grille_de_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Table_de_jeuLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Table_de_jeuLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Table_de_jeuLayout.setVerticalGroup(
            Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Table_de_jeuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jToggleButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Table_de_jeuLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jToggleButton6)
                        .addGap(70, 70, 70)
                        .addComponent(jToggleButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton8)
                        .addGap(72, 72, 72))
                    .addGroup(Table_de_jeuLayout.createSequentialGroup()
                        .addComponent(Grille_de_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton14)
                            .addComponent(jToggleButton13)
                            .addComponent(jToggleButton12))
                        .addContainerGap())
                    .addGroup(Table_de_jeuLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jToggleButton9)
                        .addGap(71, 71, 71)
                        .addComponent(jToggleButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton11)
                        .addGap(71, 71, 71))))
            .addGroup(Table_de_jeuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Table_de_jeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton4)
                    .addComponent(jButton50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Carte_en_trop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Info_partie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panneau_Info_joueur_courant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panneau_début_partie, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(Table_de_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Table_de_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panneau_début_partie, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panneau_Info_joueur_courant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Carte_en_trop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Info_partie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_ajouter_JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_ajouter_JActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bouton_ajouter_JActionPerformed

    private void Bouton_débuter_partieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_débuter_partieActionPerformed
        // TODO add your handling code here:
        panneau_Info_joueur_courant.setVisible(true);
        Info_partie.setVisible(true);
        Carte_en_trop.setVisible(true);
    }//GEN-LAST:event_Bouton_débuter_partieActionPerformed

    private void Pseudo_J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pseudo_J1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pseudo_J1ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_graphic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Bouton_ajouter_J;
    private javax.swing.JToggleButton Bouton_débuter_partie;
    private javax.swing.JPanel Carte_en_trop;
    private javax.swing.JPanel Grille_de_jeu;
    private javax.swing.JPanel Info_partie;
    private javax.swing.JPanel Panneau_début_partie;
    private javax.swing.JTextField Pseudo_J1;
    private javax.swing.JTextField Pseudo_J2;
    private javax.swing.JTextField Pseudo_J3;
    private javax.swing.JTextField Pseudo_J4;
    private javax.swing.JPanel Table_de_jeu;
    private javax.swing.JButton jButton50;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JPanel panneau_Info_joueur_courant;
    // End of variables declaration//GEN-END:variables
}
