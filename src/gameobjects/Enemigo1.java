package gameobjects;

import java.io.IOException;

/**
 * Primer enemigo
 * @author SabotenSama
 */
public class Enemigo1 extends Personaje{
    
    public Enemigo1(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(direccionImagen, xPosicion, yPosicion, velocidad, vidas);
    }

    @Override
    public void recibirImpacto() {
        this.vidas--;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
