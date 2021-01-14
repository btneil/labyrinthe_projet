/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_labyrinthe;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author quent
 */
public class Case_graphique extends JButton{
    Cellule carte_associe;
    ImageIcon img_araignee = new javax.swing.ImageIcon(getClass().getResource("/images/araignee.png"));
    ImageIcon img_bague = new javax.swing.ImageIcon(getClass().getResource("/images/bague.png"));
    ImageIcon img_bourse = new javax.swing.ImageIcon(getClass().getResource("/images/bourse.png"));
    ImageIcon img_carteTresor = new javax.swing.ImageIcon(getClass().getResource("/images/carteTresor.png"));
    ImageIcon img_chandelier = new javax.swing.ImageIcon(getClass().getResource("/images/chandelier.png"));
    ImageIcon img_chauvesouris = new javax.swing.ImageIcon(getClass().getResource("/images/chauvesouris.png"));
    ImageIcon img_chouette = new javax.swing.ImageIcon(getClass().getResource("/images/chouette.png"));
    ImageIcon img_cle = new javax.swing.ImageIcon(getClass().getResource("/images/cle.png"));
    ImageIcon img_couronne = new javax.swing.ImageIcon(getClass().getResource("/images/couronne.png"));
    ImageIcon img_crane = new javax.swing.ImageIcon(getClass().getResource("/images/crane.png"));
    ImageIcon img_departB = new javax.swing.ImageIcon(getClass().getResource("/images/departB.png"));
    ImageIcon img_departJ = new javax.swing.ImageIcon(getClass().getResource("/images/departJ.png"));
    ImageIcon img_departR = new javax.swing.ImageIcon(getClass().getResource("/images/departR.png"));
    ImageIcon img_departV = new javax.swing.ImageIcon(getClass().getResource("/images/departV.png"));
    ImageIcon img_dragon = new javax.swing.ImageIcon(getClass().getResource("/images/dragon.png"));
    ImageIcon img_epee = new javax.swing.ImageIcon(getClass().getResource("/images/epee.png"));
    ImageIcon img_fantome = new javax.swing.ImageIcon(getClass().getResource("/images/fantome.png"));
    ImageIcon img_fee = new javax.swing.ImageIcon(getClass().getResource("/images/fee.png"));
    ImageIcon img_genie = new javax.swing.ImageIcon(getClass().getResource("/images/genie.png"));
    ImageIcon img_gobelin = new javax.swing.ImageIcon(getClass().getResource("/images/gobelin.png"));
    ImageIcon img_heaume = new javax.swing.ImageIcon(getClass().getResource("/images/heaume.png"));
    ImageIcon img_lezard = new javax.swing.ImageIcon(getClass().getResource("/images/lezard.png"));
    ImageIcon img_livre = new javax.swing.ImageIcon(getClass().getResource("/images/livre.png"));
    ImageIcon img_papillon = new javax.swing.ImageIcon(getClass().getResource("/images/papillon.png"));
    ImageIcon img_rat = new javax.swing.ImageIcon(getClass().getResource("/images/rat.png"));
    ImageIcon img_saphir = new javax.swing.ImageIcon(getClass().getResource("/images/saphir.png"));
    ImageIcon img_scarabee = new javax.swing.ImageIcon(getClass().getResource("/images/scarabee.png"));
    ImageIcon img_tresor = new javax.swing.ImageIcon(getClass().getResource("/images/tresor.png"));
    ImageIcon img_tuile1 = new javax.swing.ImageIcon(getClass().getResource("/images/tuile1.png"));
    ImageIcon img_tuile2 = new javax.swing.ImageIcon(getClass().getResource("/images/tuile2.png"));
    ImageIcon img_I_bleu = new javax.swing.ImageIcon(getClass().getResource("/images/I_bleu.png"));
    ImageIcon img_I_rouge = new javax.swing.ImageIcon(getClass().getResource("/images/I_rouge.png"));
    ImageIcon img_I_vert = new javax.swing.ImageIcon(getClass().getResource("/images/I_vert.png"));
    ImageIcon img_I_jaune = new javax.swing.ImageIcon(getClass().getResource("/images/I_jaune.png"));
    ImageIcon img_T_bleu = new javax.swing.ImageIcon(getClass().getResource("/images/T_bleu.png"));
    ImageIcon img_T_rouge = new javax.swing.ImageIcon(getClass().getResource("/images/T_Rouge.png"));
    ImageIcon img_T_vert = new javax.swing.ImageIcon(getClass().getResource("/images/T_vert.png"));
    ImageIcon img_T_jaune = new javax.swing.ImageIcon(getClass().getResource("/images/T_jaune.png"));
    
    public Case_graphique(Cellule uneCarte){
        carte_associe = uneCarte;
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if(carte_associe!=null){
            if(carte_associe.pionCourant==null){
                if(carte_associe.tresorCourant==1){
                    setIcon(img_heaume);
                }
                if(carte_associe.tresorCourant==2){
                    setIcon(img_chandelier);
                }
                if(carte_associe.tresorCourant==3){
                    setIcon(img_epee);
                }
                if(carte_associe.tresorCourant==4){
                    setIcon(img_saphir);
                }
                if(carte_associe.tresorCourant==5){
                    setIcon(img_tresor);
                }
                if(carte_associe.tresorCourant==6){
                    setIcon(img_bague);
                }
                if(carte_associe.tresorCourant==7){
                    setIcon(img_crane);
                }
                if(carte_associe.tresorCourant==8){
                    setIcon(img_cle);
                }
                if(carte_associe.tresorCourant==9){
                    setIcon(img_couronne);
                }
                if(carte_associe.tresorCourant==10){
                    setIcon(img_carteTresor);
                }
                if(carte_associe.tresorCourant==11){
                    setIcon(img_bourse);
                }
                if(carte_associe.tresorCourant==12){
                    setIcon(img_livre);
                }
                if(carte_associe.tresorCourant==13){
                    setIcon(img_araignee);
                }
                if(carte_associe.tresorCourant==14){
                    setIcon(img_scarabee);
                }
                if(carte_associe.tresorCourant==15){
                    setIcon(img_chauvesouris);
                }
                if(carte_associe.tresorCourant==16){
                    setIcon(img_rat);
                }
                if(carte_associe.tresorCourant==17){
                    setIcon(img_chouette);
                }
                if(carte_associe.tresorCourant==18){
                    setIcon(img_dragon);
                }
                if(carte_associe.tresorCourant==19){
                    setIcon(img_fantome);
                }
                if(carte_associe.tresorCourant==20){
                    setIcon(img_fee);
                }
                if(carte_associe.tresorCourant==21){
                    setIcon(img_genie);
                }
                if(carte_associe.tresorCourant==22){
                    setIcon(img_gobelin);
                }
                if(carte_associe.tresorCourant==23){
                    setIcon(img_lezard);
                }
                if(carte_associe.tresorCourant==24){
                    setIcon(img_papillon);
                }
                if(carte_associe.tresorCourant==25){
                    setIcon(img_tuile1);
                }
                if(carte_associe.tresorCourant==26){
                    setIcon(img_tuile2);
                }
                if(carte_associe.tresorCourant==27){
                    setIcon(img_departB);
                }
                if(carte_associe.tresorCourant==28){
                    setIcon(img_departR);
                }
                if(carte_associe.tresorCourant==29){
                    setIcon(img_departJ);
                }
                if(carte_associe.tresorCourant==30){
                    setIcon(img_departV);
                }
            }
            else{
                int T[]={1,2,3,4,5,6,7,8,9,10,11,12,15,18,19,20,21,22};
                int T2[]={13,14,16,17,23,24};
                if(carte_associe.pionCourant.Couleur=="R"){
                    if(carte_associe.tresorCourant==25){
                        setIcon(img_I_rouge);
                    }
                    if(carte_associe.tresorCourant==26){
                        setIcon(img_departR);
                    }
                    for (int i=0;i<17;i++){
                        if(carte_associe.tresorCourant==T[i]){
                            setIcon(img_T_rouge);
                        }
                    }
                    for(int i=0;i<5;i++){
                        if(carte_associe.tresorCourant==T2[i]){
                            setIcon(img_departR);
                        }
                    }
                    
                }
                if(carte_associe.pionCourant.Couleur=="V"){
                    if(carte_associe.tresorCourant==25){
                        setIcon(img_I_vert);
                    }
                    if(carte_associe.tresorCourant==26){
                        setIcon(img_departV);
                    }
                    for (int i=0;i<17;i++){
                        if(carte_associe.tresorCourant==T[i]){
                            setIcon(img_T_vert);
                        }
                    }
                    for(int i=0;i<5;i++){
                        if(carte_associe.tresorCourant==T2[i]){
                            setIcon(img_departV);
                        }
                    }
                }
                if(carte_associe.pionCourant.Couleur=="B"){
                    if(carte_associe.tresorCourant==25){
                        setIcon(img_I_bleu);
                    }
                    if(carte_associe.tresorCourant==26){
                        setIcon(img_departB);
                    }
                    for (int i=0;i<17;i++){
                        if(carte_associe.tresorCourant==T[i]){
                            setIcon(img_T_bleu);
                        }
                    }
                    for(int i=0;i<5;i++){
                        if(carte_associe.tresorCourant==T2[i]){
                            setIcon(img_departB);
                        }
                    }
                }
                if(carte_associe.pionCourant.Couleur=="J"){
                    if(carte_associe.tresorCourant==25){
                        setIcon(img_I_jaune);
                    }
                    if(carte_associe.tresorCourant==26){
                        setIcon(img_departJ);
                    }
                    for (int i=0;i<17;i++){
                        if(carte_associe.tresorCourant==T[i]){
                            setIcon(img_T_jaune);
                        }
                    }
                    for(int i=0;i<5;i++){
                        if(carte_associe.tresorCourant==T2[i]){
                            setIcon(img_departJ);
                        }
                    }
                }
            }
            
            
        }
    }
}
