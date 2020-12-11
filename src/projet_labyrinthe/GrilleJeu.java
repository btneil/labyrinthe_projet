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
    }
    public boolean deplacerPion(Cellule depart,Cellule arrivee){
        arrivee.pionCourant=depart.pionCourant;
        depart.pionCourant=null;
        return true;
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
        if (plateau[i][j].tresorCourant!=0){
            return true;
        }
        else{
            return false;
        }
            
    }
    public void remplirGrille(){
        
        //création aléatoire des 24 trésors
        String[] TableauTrésor = new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21"};
        int i=0;
        while (i<24){
            int col=(int) (Math.random()*25 - 0.00001);
            int lig=(int) (Math.random()*25 - 0.00001);
            if (plateau[lig][col].tresorCourant==0 && ((lig!=0 && col!=0) || (lig!=0 && col!=6) || (lig!=6 && col!=0) || (lig!=6 && col!=6))){
                plateau[lig][col].tresorCourant=i;
                i++;
            }  
        }
        
       //répartion des 4 agles en "L"
       plateau[0][0].d_droite=true;
       plateau[0][0].d_bas=true;
       
       plateau[0][6].d_gauche=true;
       plateau[0][6].d_bas=true;
       
       plateau[6][6].d_gauche=true;
       plateau[6][6].d_haut=true;
       
       plateau[6][0].d_haut=true;
       plateau[6][0].d_droite=true;
        
    }
   // public boolean recupererCellule(){   
       // return false;
  //  }
}