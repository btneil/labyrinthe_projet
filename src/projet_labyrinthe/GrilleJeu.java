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
public class GrilleJeu {
    Cellule [][] plateau = new Cellule[7][7];
    Cellule cellSupp;


    public GrilleJeu(){
        cellSupp=null;
        cellJeu=null;
}
    public boolean deplacerPion(Cellule depart,Cellule arrivee){
        depart.pionCourant=null;
        
    }
    public boolean placerCellule_ligneD(int l){
        Cellule cellJeu = plateau[l][6];
        plateau[l][6]=null;
        for (int i=6;i>=1;i--){
            plateau[l][i]=plateau[l][i-1];
        }
        plateau[l][0]=cellSupp;
        return true;
        
    }
    public boolean placerCellule_ligneG(int l){
        Cellule cellJeu = plateau[l][0];
        plateau[l][0]=null;
        for (int i=1;i<=6;i++){
            plateau[l][i]=plateau[l][i+1];
        }
        plateau[l][6]=cellSupp;
        return true;
        
    }
    public boolean placerCellule_colonneH(int c){
        Cellule cellJeu = plateau[6][c];
        plateau[6][c]=null;
        for (int j=6;j>=1;j--){
            plateau[j][c]=plateau[j-1][c];
        }
        plateau[0][c]=cellSupp;
        return true;
        
    }
    public boolean placerCellule_colonneB(int c){
        Cellule cellJeu = plateau[0][c];
        plateau[0][c]=null;
        for (int j=1;j<=6;j--){
            plateau[j][c]=plateau[j+1][c];
        }
        plateau[6][c]=cellSupp;
        return true;
        
    }
    public boolean presenceTresor(int i, int j){
        if (plateau[i][j].tresorCourant!=""){
            return true;
        }
        else{
            return false;
        }
            
    }
    public void remplirGrille(){
        for (int i=0; i<7;i++){
            for(int j=0;j<7;j++){
                plateau[i][j]=new Cellule();
            }
        }
        
    }
    public boolean recupererCellule(){
        
        return false;
    }


}
