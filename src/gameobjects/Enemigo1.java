package gameobjects;

import java.io.IOException;

/**
 * Primer enemigo
 * @author SabotenSama
 */
public class Enemigo1 extends Personaje{
    
    public Enemigo1(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(direccionImagen, 35, 35, 2, 3);
    }
    
}
