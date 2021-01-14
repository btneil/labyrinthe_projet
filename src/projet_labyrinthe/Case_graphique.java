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
    
    public Case_graphique(Cellule uneCarte){
        carte_associe = uneCarte;
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if(carte_associe!=null){
            System.out.println(carte_associe.tresorCourant);
            /**switch (carte_associe.tresorCourant){
                
                case 1:setIcon(img_heaume);
                case 2:setIcon(img_chandelier);
                case 3:setIcon(img_epee);
                case 4:setIcon(img_saphir);
                case 5:setIcon(img_tresor);
                case 6:setIcon(img_bague);
                case 7:setIcon(img_crane);
                case 8:setIcon(img_cle);
                case 9:setIcon(img_couronne);
                case 10:setIcon(img_carteTresor);
                case 11:setIcon(img_bourse);
                case 12:setIcon(img_livre);
                case 13:setIcon(img_araignee);
                case 14:setIcon(img_scarabee);
                case 15:setIcon(img_chauvesouris);
                case 16:setIcon(img_rat);
                case 17:setIcon(img_chouette);
                case 18:setIcon(img_dragon);
                case 19:setIcon(img_fantome);
                case 20:setIcon(img_fee);
                case 21:setIcon(img_genie);
                case 22:setIcon(img_gobelin);
                case 23:setIcon(img_lezard);
                case 24:setIcon(img_papillon);
                case 25:setIcon(img_tuile1);
                case 26:setIcon(img_tuile2);
                case 27:setIcon(img_departB);
                case 28:setIcon(img_departR);
                case 29:setIcon(img_departJ);
                case 30:setIcon(img_departV);
            }**/
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
            if(carte_associe.tresorCourant==0){
                setIcon(img_departV);
            }
            
            
        }
    }
}
