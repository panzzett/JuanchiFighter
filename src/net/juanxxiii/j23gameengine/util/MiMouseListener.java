/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.util;

import gameobjects.Enemigo1;
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

    public static Graphics2D g2d;

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            Enemigo1 e1 = new Enemigo1("MaloJavi/MaloJaviDerE.png", e.getX(), e.getY());
            JPGameScreen.vectorEnemy.add(e1);

            new Thread(e1).start();
            e1.dibujar(g2d);

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
