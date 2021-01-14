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

    /**
     * Creates new form Interface_graphic
     */
    Joueur joueurCourant;
    GrilleJeu GrilleDeJeu;
    int NombreJoueurs;
    Joueur[] ListeJoueurs = new Joueur[4];
    PartieDeJeu partie = new PartieDeJeu(4);
    Case_graphique Carte_en_t = new Case_graphique(new Cellule());
    public Interface_graphic() {
        initComponents();
        
        CarteEnTrop.setVisible(false);    
        partie.GrilleDeJeu.remplirGrille();
        GrilleDeJeu = partie.GrilleDeJeu;
        
        for (int i=0;i<7;i++){ //lire le tableau
            for (int j=0;j<7;j++){
                Case_graphique Kazeu = new Case_graphique(GrilleDeJeu.plateau[i][j]);
                Grille_de_jeu.add(Kazeu);

            }
        }
        Carte_en_t.carte_associe.tresorCourant=26;
        GrilleDeJeu.cellSupp=Carte_en_t.carte_associe;
        CarteEnTrop.add(Carte_en_t);
        Grille_de_jeu.repaint();
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bouton_débuter_partie = new javax.swing.JToggleButton();
        Pseudo_J4 = new javax.swing.JTextField();
        Pseudo_J1 = new javax.swing.JTextField();
        Pseudo_J2 = new javax.swing.JTextField();
        Pseudo_J3 = new javax.swing.JTextField();
        Table_de_jeu = new javax.swing.JPanel();
        Grille_de_jeu = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        B1 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton50 = new javax.swing.JButton();
        CarteEnTrop = new javax.swing.JPanel();
        Infos_partie = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jToggleButton3.setText("jToggleButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panneau_début_partie.setBackground(new java.awt.Color(0, 0, 255));
        Panneau_début_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 1:");
        Panneau_début_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setText("Nom Joueur 2:");
        Panneau_début_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

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
        Pseudo_J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pseudo_J3ActionPerformed(evt);
            }
        });
        Panneau_début_partie.add(Pseudo_J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, -1));

        Table_de_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Grille_de_jeu.setBackground(new java.awt.Color(255, 102, 0));
        Grille_de_jeu.setLayout(new java.awt.GridLayout(7, 7));
        Table_de_jeu.add(Grille_de_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 610, 610));

        jToggleButton5.setText("jToggleButton5");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 24, -1));

        jToggleButton6.setText("jToggleButton6");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 24, -1));

        jToggleButton7.setText("jToggleButton7");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 24, -1));

        jToggleButton9.setText("jToggleButton9");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 24, -1));

        B1.setText("jToggleButton10");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 24, -1));

        jToggleButton11.setText("jToggleButton11");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 24, -1));

        jToggleButton14.setText("jToggleButton14");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 24, -1));

        jToggleButton13.setText("jToggleButton13");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 24, -1));

        jToggleButton12.setText("jToggleButton12");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 24, -1));

        jToggleButton8.setText("jToggleButton8");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 770, 24, -1));

        jToggleButton4.setText("jToggleButton4");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 770, 24, -1));

        jButton50.setText("jButton50");
        jButton50.setMaximumSize(new java.awt.Dimension(23, 23));
        jButton50.setMinimumSize(new java.awt.Dimension(23, 23));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        Table_de_jeu.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 770, 24, -1));

        CarteEnTrop.setBackground(new java.awt.Color(255, 102, 0));
        CarteEnTrop.setLayout(new java.awt.GridLayout(1, 1));

        Infos_partie.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout Infos_partieLayout = new javax.swing.GroupLayout(Infos_partie);
        Infos_partie.setLayout(Infos_partieLayout);
        Infos_partieLayout.setHorizontalGroup(
            Infos_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        Infos_partieLayout.setVerticalGroup(
            Infos_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        jButton2.setText("↓");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("↑");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("←");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("→");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Table_de_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panneau_début_partie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CarteEnTrop, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Infos_partie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Table_de_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Panneau_début_partie, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(CarteEnTrop, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Infos_partie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(664, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_débuter_partieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_débuter_partieActionPerformed
        // TODO add your handling code here:
        
        

        int J=0;
        if(Pseudo_J1.getText()!=""){
            Pion pion_1 = new Pion("R");
            partie.ListeJoueurs[J]= new Joueur(Pseudo_J1.getText(),pion_1);
            J++;
        }
        if(Pseudo_J2.getText()!=""){
            Pion pion_2 = new Pion("V");
            partie.ListeJoueurs[J]= new Joueur(Pseudo_J1.getText(),pion_2);
            J++;
        }
        if(Pseudo_J3.getText()!=""){
            Pion pion_3 = new Pion("J");
            partie.ListeJoueurs[J]= new Joueur(Pseudo_J1.getText(),pion_3);
            J++;
        }
        if(Pseudo_J4.getText()!=""){
            Pion pion_4 = new Pion("B");
            partie.ListeJoueurs[J]= new Joueur(Pseudo_J1.getText(),pion_4);
            J++;
        }
        partie.joueurCourant=partie.ListeJoueurs[0];
                
        CarteEnTrop.setVisible(true);
        
        
        Grille_de_jeu.repaint();
        
    }//GEN-LAST:event_Bouton_débuter_partieActionPerformed

    private void Pseudo_J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pseudo_J1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pseudo_J1ActionPerformed

    private void Pseudo_J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pseudo_J3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pseudo_J3ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
    
    partie.GrilleDeJeu.placerCellule_ligneG(1);
    
    Grille_de_jeu.repaint();
    CarteEnTrop.repaint();
    
    //System.out.print("wakwakaeheh");
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        partie.GrilleDeJeu.placerCellule_colonneH(1);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_colonneB(3);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_ligneD(1);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_B1ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_colonneH(3);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_colonneH(5);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_ligneG(3);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_ligneG(5);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_ligneD(3);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_ligneD(5);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_colonneB(1);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        partie.GrilleDeJeu.placerCellule_colonneB(5);
        Grille_de_jeu.repaint();
        CarteEnTrop.repaint();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        for (int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(partie.GrilleDeJeu.plateau[i][j].pionCourant!=null){
                    if(partie.GrilleDeJeu.plateau[i][j].pionCourant==partie.joueurCourant.pion){
                        if(partie.GrilleDeJeu.deplacement_g(i, j, i, j-1)==true){
                            partie.GrilleDeJeu.deplacerPion(i,j,i,j-1);
                        }
                    }
                }
                    
            }
        }
        Grille_de_jeu.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        for (int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(partie.GrilleDeJeu.plateau[i][j].pionCourant!=null){
                    if(partie.GrilleDeJeu.plateau[i][j].pionCourant==partie.joueurCourant.pion){
                        if(partie.GrilleDeJeu.deplacement_d(i, j, i+1, j)==true){
                            partie.GrilleDeJeu.deplacerPion(i,j,i+1,j);
                        }
                    }
                }
                    
            }
        }
        Grille_de_jeu.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(partie.GrilleDeJeu.plateau[i][j].pionCourant!=null){
                    if(partie.GrilleDeJeu.plateau[i][j].pionCourant==partie.joueurCourant.pion){
                        if(partie.GrilleDeJeu.deplacement_b(i, j, i, j+1)==true){
                            partie.GrilleDeJeu.deplacerPion(i,j,i,j+1);
                        }
                    }
                }
                    
            }
        }
        Grille_de_jeu.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //int i=0;

        for (int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(partie.GrilleDeJeu.plateau[i][j].pionCourant!=null){
                    if(partie.GrilleDeJeu.plateau[i][j].pionCourant==partie.joueurCourant.pion){
                        if(partie.GrilleDeJeu.deplacement_h(i, j, i+1, j)==true){
                            partie.GrilleDeJeu.deplacerPion(i,j,i+1,j);
                        }
                    }
                }
                    
            }
        }
        Grille_de_jeu.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton Bouton_débuter_partie;
    private javax.swing.JPanel CarteEnTrop;
    private javax.swing.JPanel Grille_de_jeu;
    private javax.swing.JPanel Infos_partie;
    private javax.swing.JPanel Panneau_début_partie;
    private javax.swing.JTextField Pseudo_J1;
    private javax.swing.JTextField Pseudo_J2;
    private javax.swing.JTextField Pseudo_J3;
    private javax.swing.JTextField Pseudo_J4;
    private javax.swing.JPanel Table_de_jeu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    // End of variables declaration//GEN-END:variables
}
