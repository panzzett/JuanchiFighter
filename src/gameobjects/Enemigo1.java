package gameobjects;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Primer enemigo
 *
 * @author SabotenSama
 */
public class Enemigo1 extends Personaje {

    public Enemigo1(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(direccionImagen, xPosicion, yPosicion, velocidad, vidas);
    }

    @Override
    public void recibirImpacto() {
        this.vidas--;
    }

    @Override
    public void run() {
        int estado = 1;
        while (true) {
            try {
                sleep(16);
                if (estado == 1) {
                    xPosicion = xPosicion + 3;
                    if (xPosicion > 200) {
                        estado = 2;
                    }
                } else if (estado == 2) {
                    xPosicion = xPosicion - 3;
                    if (xPosicion < 0) {
                        estado = 1;
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
