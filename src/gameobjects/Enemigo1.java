package gameobjects;

import java.io.IOException;

/**
 * Primer enemigo
 * @author SabotenSama
 */
public class Enemigo1 extends Personaje{
    
    private static final String DIRECCION_IMAGEN = "XXX";
    private static final int X_POSICION = 35;
    private static final int Y_POSICION = 35;
    private static final int VELOCIDAD = 2;
    private static final int VIDAS = 3;
    
    public Enemigo1(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(DIRECCION_IMAGEN, X_POSICION, Y_POSICION, VELOCIDAD, VIDAS);
    }
    
}
