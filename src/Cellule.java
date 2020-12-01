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

    }
        
   public void retournerCellule(){
       
   }
   
           
}
