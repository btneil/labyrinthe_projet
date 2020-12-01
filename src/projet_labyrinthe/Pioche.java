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
        
    }
}
