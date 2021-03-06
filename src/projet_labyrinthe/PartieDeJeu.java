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
    GrilleJeu GrilleDeJeu;
    int NombreJoueurs;
    Joueur[] ListeJoueurs = new Joueur[4];

    public PartieDeJeu(int nb_joueurs) {
        NombreJoueurs=nb_joueurs;
        GrilleDeJeu = new GrilleJeu();
    }


    public void attribuerCouleursAuxPions() {
        String couleur[] = new String[]{"R","V","B","O"};
        for ( int i=0;i<NombreJoueurs;i++){
            ListeJoueurs[i].pion.Couleur=couleur[i];
        }
    }

    public void distribuerCarte(Pioche unePioche) {
        joueurCourant.obj_courant = unePioche.renvoyerCarte();
    }
    
    public boolean etre_gagnant(){
        if(joueurCourant.nombreTresors>=24/NombreJoueurs){
            return true;
        }
        else{
            return false;
        }
    }

    public void initialiserPartie() {
        GrilleDeJeu.remplirGrille();
        
    }

    public void debuterPartie() {
        
    }
}
