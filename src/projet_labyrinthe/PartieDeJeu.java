/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_labyrinthe;

import java.util.Scanner;

/**
 *
 * @author neilb
 */
public class PartieDeJeu {

    Joueur joueurCourant;
    Grille GrilleDeJeu;
    int NombreJoueurs;

    public PartieDeJeu(NombreJoueurs) {
        Joueur[] = new ListeJoueurs[NombreJoueurs];
    }


    public void attribuerCouleursAuxPions() {
        int couleur = rand.nextInt(NombreJoueurs)+1; // tirage aléatoire du nombre de couleurs à répartir
        
    }
    
    public void attribuerPionsAuxJoueurs(){
        
    }

    public void distribuerCarte(Pioche unePioche) {
        joueurCourant.obj_courant = unePioche.renvoyerCarte();
    }

    public void initialiserPartie() {

    }

    public void debuterPartie() {

    }
}
