package gameobjects;

import java.io.IOException;

/**
 * Primer enemigo
 * @author Noelia
 */
public class Enemigo3 extends Personaje{
    
    public Enemigo3(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(direccionImagen, xPosicion, yPosicion, velocidad, vidas);
    }

    @Override
    public void recibirImpacto() {
        this.vidas--;
    }
    
}