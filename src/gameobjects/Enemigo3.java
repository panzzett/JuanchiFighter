package gameobjects;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Primer enemigo
 *
 * @author Noelia
 */
public class Enemigo3 extends Personaje {

    public Enemigo3(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(direccionImagen, xPosicion, yPosicion, velocidad, vidas);
    }

    @Override
    public void recibirImpacto() {
        this.vidas--;
    }

    @Override
    public void run() {
        while (true) {
            this.xPosicion++;
            try {
                sleep(16);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
