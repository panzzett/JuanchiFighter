/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.util;

import gameobjects.Enemigo1;
import gameobjects.Enemigo2;
import gameobjects.Enemigo3;
import gameobjects.PersonajeI;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author dam
 */
public class MiMouseListener implements MouseListener {
    private static int contador = 0;
    @Override
    public void mouseClicked(MouseEvent e) {
        PersonajeI enemigo;
        try {
            if (contador==0) {
                enemigo = new Enemigo1("MaloJavi/MaloJaviDerE.png", e.getX(), e.getY());
            }else if(contador==1){
                enemigo = new Enemigo2("MaloCarlos/MaloCarlosDerE.png", e.getX(), e.getY());
            }else{
                enemigo = new Enemigo3("MaloNoe/Der1.png", e.getX(), e.getY());
                contador=-1;
            }
            JPGameScreen.vectorEnemy.add(enemigo);
            contador++;
            new Thread((Runnable) enemigo).start();

        } catch (IOException ex) {
            Logger.getLogger(MiMouseListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
