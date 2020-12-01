/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_labyrinthe;

/**
 *
 * @author Quentin
 */
public class Pioche {
    Carte[] ListeCartes = new Carte[24];
    int nbr_cartes;
    
    public Pioche(){
        nbr_cartes = 24;
        for(int i =0;i<24;i++){
            ListeCartes[i]=new Carte( String.valueOf(i));
        }
    }
    
    public boolean melangerCartes(){
        int nb_melange = (int) Math.random()*1000;//on tire aleatoirement le nb de mélange
        while(nb_melange>0){//On effectue nb_melange de carte
            
            int carte_1 = (int) (Math.random()*25 - 0.00001);
            int carte_2 = (int) (Math.random()*25 - 0.00001);
            while(carte_1==carte_2){
                carte_2 = (int) (Math.random()*25 - 0.00001);
            }
            Carte carte_1_echange = ListeCartes[carte_1];
            Carte carte_2_echange = ListeCartes[carte_2]; //on récupère les 2 cartes à echanger
            
            ListeCartes[carte_1] = carte_2_echange;
            ListeCartes[carte_2] = carte_1_echange;//on les échanges
            
            nb_melange--;
        }
        return true;
    }
}
