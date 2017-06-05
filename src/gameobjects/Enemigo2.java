/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author Carlos
 */
public class Enemigo2 extends Personaje{
    private int estado=1;
    public Enemigo2(String direccionImagen, int xPosicion, int yPosicion) throws IOException {
        super(direccionImagen, xPosicion, yPosicion);
    }

    @Override
    public void recibirImpacto() {

    }

    @Override
    public void run() {
        
        while(true){
            try {
                sleep(25);
                if(estado==1){
                    xPosicion = xPosicion + 3;
                    if (xPosicion < 0) {
                        estado = 2;
                        //this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/MaloNoe/Der1.png"));
                    }
                }else if(estado==2){
                    xPosicion = xPosicion - 3;
                    if (xPosicion < 0) {
                        estado = 1;
                        //this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/MaloNoe/Der1.png"));
                    }
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}