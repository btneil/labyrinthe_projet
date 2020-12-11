/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_labyrinthe;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author neilb
 */
public class PartieDeJeu {
    Random rand = new Random();

    Joueur joueurCourant;
    Grille GrilleDeJeu;
    int NombreJoueurs;
    Joueur[] ListeJoueurs = new Joueur[NombreJoueurs];

    public PartieDeJeu(int nb_joueurs) {
        NombreJoueurs=nb_joueurs;
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
