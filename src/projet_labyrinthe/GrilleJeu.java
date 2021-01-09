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
    public boolean deplacerPion(int i,int j, int m, int n){
        if (deplacement_h(i,j,m,n)==true && i==m+1){
            plateau[m][n].pionCourant=plateau[i][j].pionCourant;
            plateau[i][j].pionCourant=null;
        }
        if(deplacement_b(i,j,m,n)==true && i==m-1){
            plateau[m][n].pionCourant=plateau[i][j].pionCourant;
            plateau[i][j].pionCourant=null;
        }
        if(deplacement_g(i,j,m,n)==true && j==n+1){
            plateau[m][n].pionCourant=plateau[i][j].pionCourant;
            plateau[i][j].pionCourant=null;
        }
        if(deplacement_d(i,j,m,n)==true && j==n-1){
            plateau[m][n].pionCourant=plateau[i][j].pionCourant;
            plateau[i][j].pionCourant=null;
        }
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
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                plateau[i][j]=new Cellule();
            }
        }
        
        
       //répartion des 4 agles en "L"
       plateau[0][0].d_droite=true;
       plateau[0][0].d_bas=true;
       plateau[0][0].image="/images/departB.png";
       
       plateau[0][6].d_gauche=true;
       plateau[0][6].d_bas=true;
       plateau[0][6].image="/images/departV.png";
       
       plateau[6][6].d_gauche=true;
       plateau[6][6].d_haut=true;
       plateau[6][6].image="/images/departR.png";
       
       plateau[6][0].d_haut=true;
       plateau[6][0].d_droite=true;
       plateau[6][0].image="/images/departJ.png";
       
       //initialisation carte qui bougent pas
       
       plateau[0][2].image="/images/heaume.png";
       plateau[0][2].tresorCourant=1;
       plateau[0][4].image="/images/chandelier.png";
       plateau[0][4].tresorCourant=2;
       plateau[2][0].image="/images/epee.png";
       plateau[2][0].tresorCourant=3;
       plateau[2][2].image="/images/saphir.png";
       plateau[2][2].tresorCourant=4;
       plateau[2][4].image="/images/tresor.png";
       plateau[2][4].tresorCourant=5;
       plateau[2][6].image="/images/bague.png";
       plateau[2][6].tresorCourant=6;
       plateau[4][0].image="/images/crane.png";
       plateau[4][0].tresorCourant=7;
       plateau[4][2].image="/images/cle.png";
       plateau[4][2].tresorCourant=8;
       plateau[4][4].image="/images/couronne.png";
       plateau[4][4].tresorCourant=9;
       plateau[4][6].image="/images/carteTresor.png";
       plateau[4][6].tresorCourant=10;
       plateau[6][2].image="/images/bourse.png";
       plateau[6][2].tresorCourant=11;
       plateau[6][4].image="/images/livre.png";
       plateau[6][4].tresorCourant=12;
       
       
       //création aléatoire des 12 autres trésors
        int i=13;
        while (i<25){
            int col=(int) (Math.random()*7 - 0.00001);
            int lig=(int) (Math.random()*7 - 0.00001);
            if (plateau[lig][col].tresorCourant==0 && ((lig!=0 && col!=0) && (lig!=0 && col!=6) && (lig!=6 && col!=0) && (lig!=6 && col!=6))){
                plateau[lig][col].tresorCourant=i;
                i++;
            }  
        }
        
        for (i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if(plateau[i][j].tresorCourant==13){
                    plateau[i][j].image="/images/araignee.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                }
                if(plateau[i][j].tresorCourant==14){
                    plateau[i][j].image="/images/scarabee.png";
                    plateau[i][j].d_haut=true;
                    plateau[i][j].d_droite=true;
                }
                if(plateau[i][j].tresorCourant==15){
                    plateau[i][j].image="/images/chauvesouris.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                    plateau[i][j].d_droite=true;
                }
                if(plateau[i][j].tresorCourant==16){
                    plateau[i][j].image="/images/rat.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_bas=true;
                }
                if(plateau[i][j].tresorCourant==17){
                    plateau[i][j].image="/images/chouette.png";
                    plateau[i][j].d_droite=true;
                    plateau[i][j].d_bas=true;
                }
                if(plateau[i][j].tresorCourant==18){
                    plateau[i][j].image="/images/dragon.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                    plateau[i][j].d_droite=true;
                }
                if(plateau[i][j].tresorCourant==19){
                    plateau[i][j].image="/images/fantome.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                    plateau[i][j].d_droite=true;
                }
                if(plateau[i][j].tresorCourant==20){
                    plateau[i][j].image="/images/fee.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                    plateau[i][j].d_droite=true;
                }
                if(plateau[i][j].tresorCourant==21){
                    plateau[i][j].image="/images/genie.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                    plateau[i][j].d_droite=true;
                }
                if(plateau[i][j].tresorCourant==22){
                    plateau[i][j].image="/images/gobelin.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                    plateau[i][j].d_droite=true;
                }
                if(plateau[i][j].tresorCourant==23){
                    plateau[i][j].image="/images/lezard.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                }
                if(plateau[i][j].tresorCourant==24){
                    plateau[i][j].image="/images/papillon.png";
                    plateau[i][j].d_gauche=true;
                    plateau[i][j].d_haut=true;
                }
            }
        }
        int compteur_I = 13;
        int compteur_L=8; //penser à creer carte supp en L
        for (i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if(plateau[i][j].tresorCourant==0 && ((i!=0 && j!=0) && (i!=0 && j!=6) && (i!=6 && j!=0) && (i!=6 && j!=6))){
                    int choix=(int) (Math.random()*2 - 0.00001);
                    if (choix==0 && compteur_I>0){
                        plateau[i][j].image="/images/tuile1.png";
                        plateau[i][j].d_haut=true;
                        plateau[i][j].d_bas=true;
                        
                        compteur_I--;
                    }
                    if(choix==1 && compteur_L>0){
                        plateau[i][j].image="/images/tuile2.png";
                        plateau[i][j].d_droite=true;
                        plateau[i][j].d_bas=true;                        
                        compteur_L--;
                    }
            }
        }
            }

        
    }
   // public boolean recupererCellule(){   
       // return false;
  //  }
    
    boolean deplacement_h(int i,int j,int m,int n){
        if(plateau[i][j].d_haut==true && plateau[m][n].d_bas==true){
            return true;
        }
        else{
            return false;
        }
    }
     
    boolean deplacement_b(int i,int j,int m,int n){
        if(plateau[i][j].d_bas==true && plateau[m][n].d_haut==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean deplacement_g(int i,int j,int m,int n){
        if(plateau[i][j].d_gauche==true && plateau[m][n].d_droite==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean deplacement_d(int i,int j,int m,int n){
        if(plateau[i][j].d_droite==true && plateau[m][n].d_gauche==true){
            return true;
        }
        else{
            return false;
        }
    }
}