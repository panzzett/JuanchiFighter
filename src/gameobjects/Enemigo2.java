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

/**
 *
 * @author Carlos
 */
public class Enemigo2 extends Personaje{
    
    public Enemigo2(String direccionImagen, int xPosicion, int yPosicion) throws IOException {
        super(direccionImagen, xPosicion, yPosicion);
    }

    @Override
    public void recibirImpacto() {

    }

    @Override
    public void run() {
        int estado=1;
        while(true){
            try {
                sleep(25);
                if(estado==1){
                    xPosicion = xPosicion + 3;
                    if (xPosicion > height) {
                        estado = 2;
                    }
                }else if(estado==2){
                    xPosicion = xPosicion - 3;
                    if (xPosicion < 0) {
                        estado = 1;
                    }
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}