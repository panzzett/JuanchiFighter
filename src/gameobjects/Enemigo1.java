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
 * @author SabotenSama
 */
public class Enemigo1 extends Personaje {

    public Enemigo1(String direccionImagen, int xPosicion, int yPosicion) throws IOException {
        super(direccionImagen, xPosicion, yPosicion);
    }

    @Override
    public void recibirImpacto() {

    }

    @Override
    public void run() {
        int estado = 1;
        while (true) {
            try {
                sleep(16);
                if (estado == 1) {
                    xPosicion = xPosicion + 3;
                    if (xPosicion > width-25) {
                        this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/MaloJavi/MaloJaviIzLado.png"));                        
                        estado = 2;
                    }
                } else if (estado == 2) {
                    xPosicion = xPosicion - 3;
                    if (xPosicion < 0) {
                        this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/MaloJavi/MaloJaviDerE.png"));
                        estado = 1;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
