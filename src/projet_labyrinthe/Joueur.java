/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_labyrinthe;

/**
 *
 * @author neilb
 */
public class Joueur {
    String nom;
    Pion pion;
    Carte obj_courant;
    int nombreTresors; 
    Cellule CellActuelle;
    
    public Joueur(String Nom, Pion pion_attribue){
        nom=Nom;
        pion=pion_attribue;
        nombreTresors=0;
        
}
    
    public void affecterCarte(Carte carte){
        obj_courant=carte;
    }
    
    public void tirerCarte(Pioche unePioche) {
        obj_courant=unePioche.renvoyerCarte();
    }
    
}
