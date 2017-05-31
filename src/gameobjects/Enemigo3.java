package gameobjects;

import java.io.IOException;

/**
 * Primer enemigo
 * @author Noelia
 */
public class Enemigo3 extends Personaje{
    
    private static final String DIRECCION_IMAGEN = "XXX";
    private static final int X_POSICION = 150;
    private static final int Y_POSICION = 25;
    private static final int VELOCIDAD = 9;
    private static final int VIDAS = 1;
    
    public Enemigo3(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(DIRECCION_IMAGEN, X_POSICION, Y_POSICION, VELOCIDAD, VIDAS);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
