package gameobjects;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 * Primer enemigo
 *
 * @author Noelia
 */
public class Enemigo3 extends Personaje {

    private int state = 0;
    private int vel = 3;

    public Enemigo3(String direccionImagen, int xPosicion, int yPosicion) throws IOException {
        super(direccionImagen, xPosicion, yPosicion);
    }

    @Override
    public void recibirImpacto() {

    }

    @Override
    public void run() {
        while (true) {
            try {
                if (state == 0) {
                    //->
                    this.xPosicion -= vel;
                    if (this.xPosicion < 0) {
                        state = 1;
                        this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/MaloNoe/MaloNoeDer.png"));
                    }

                } else if (state == 1) {//<-
                    this.xPosicion += vel;
                    if (this.xPosicion > width - 25) {
                        state = 0;
                        this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/MaloNoe/MaloNoeIzI.png"));
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Enemigo3.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                sleep(16);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
