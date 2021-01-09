/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_labyrinthe;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author quent
 */
public class Case_graphique extends JButton{
    Cellule carte_associe;
    ImageIcon Tuile;
    
    public Case_graphique(Cellule uneCarte,String nom_image){
        carte_associe = uneCarte;
        Tuile = new javax.swing.ImageIcon(getClass().getResource("nom_image"));
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        setIcon(Tuile);
    }
}
