package projet_labyrinthe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Cellule {
    Pion pionCourant;
    boolean d_haut,d_bas,d_droite,d_gauche ;
    String tresorCourant;
    
    public Cellule(){
        pionCourant=null;
        d_haut=false;
        d_bas=false;
        d_droite=false;
        d_gauche=false;
    }

    public boolean presenceTresor(){
        if(tresorCourant!=null){
            return true;
        }
        else{
            return false;
        }
    }       

    public Pion presencePion(){
        if(pionCourant!=null){
            return pionCourant;
        
        }
        else{
            return null;
        }
    }
        
   public void retournerCellule(String orientation){
        boolean d_haut_nouv=false;
        boolean d_bas_nouv=false;   
        boolean d_droite_nouv=false;  
        boolean d_gauche_nouv=false; 
        if (orientation == "droite"){
            if (d_haut==true){
                d_droite_nouv=true;
            }
            if (d_droite==true){
                d_bas_nouv=true;
            }
            if (d_bas==true){
                d_gauche_nouv=true;
            }
            if (d_gauche==true){
                d_haut_nouv=true;
            }
            d_haut=d_haut_nouv;
            d_bas=d_bas_nouv;
            d_droite=d_droite_nouv;
            d_gauche=d_gauche_nouv;
            
        if (orientation=="gauche"){
            if (d_haut==true){
                d_gauche_nouv=true;
            }
            if (d_droite==true){
                d_haut_nouv=true;
            }
            if (d_bas==true){
                d_droite_nouv=true;
            }
            if (d_gauche==true){
                d_bas_nouv=true;
            }
            d_haut=d_haut_nouv;
            d_bas=d_bas_nouv;
            d_droite=d_droite_nouv;
            d_gauche=d_gauche_nouv;
                 
               
            }
        }
        
    }
   
           
}