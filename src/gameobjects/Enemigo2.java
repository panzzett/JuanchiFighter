/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.io.IOException;

/**
 *
 * @author Carlos
 */
public class Enemigo2 extends Personaje{
    
    private static final String DIRECCION_IMAGEN = "XXX";
    private static final int X_POSICION = 80;
    private static final int Y_POSICION = 45;
    private static final int VELOCIDAD = 10;
    private static final int VIDAS = 1;
    
    public Enemigo2(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        super(direccionImagen, xPosicion, yPosicion, velocidad, vidas);
    }

    @Override
    public void recibirImpacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
