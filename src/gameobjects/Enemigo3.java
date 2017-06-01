package gameobjects;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 * Primer enemigo
 *
 * @author Noelia
 */
public class Enemigo3 extends Personaje {

    public Enemigo3(String direccionImagen, int xPosicion, int yPosicion) throws IOException {
        super(direccionImagen, xPosicion, yPosicion);
    }

    @Override
    public void recibirImpacto() {

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
