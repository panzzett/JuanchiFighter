package gameobjects;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 * Personajes
 * @author SabotenSama
 */
public class Personaje implements Runnable{
    private static final int STOP=-1;
    private static final int UP=0;
    private static final int DOWN=1;
    private static final int RIGHT=2;
    private static final int LEFT=3;
    
    private int direccion=STOP;
    
    private BufferedImage sprite;//Imagen del personaje
    private int xPosicion;//Posición x del personaje
    private int yPosicion;//Posición y del personaje
    private int velocidad;//Velocidad del personaje
    private int vidas;//Vidas del personaje
    
    /**
     * Constructor del personaje
     * 
     * @param direccionImagen Dirección en la que está el sprite del personaje
     * @param xPosicion Posición x del personaje
     * @param yPosicion Posición y del personaje
     * @param velocidad Velocidad del personaje
     * @param vidas Vidas del personaje
     */
    public Personaje(String direccionImagen, int xPosicion, int yPosicion, int velocidad, int vidas) throws IOException {
        this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream(direccionImagen));
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.velocidad = velocidad;
        this.vidas = vidas;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public int getxPosicion() {
        return xPosicion;
    }

    public int getyPosicion() {
        return yPosicion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVidas() {
        return vidas;
    }

    public void moveUp(){
        direccion=UP;
    }
    public void moveDown(){
        direccion=DOWN;
    }
    public void moveRight(){
        direccion=RIGHT;
    }
    public void moveLeft(){
        direccion=LEFT;
    }
    
    public void stop(){
        direccion=STOP;
    }

    @Override
    public void run() {
        while (true){
            switch(direccion){
                case UP:
                    yPosicion--;
                    break;
                case DOWN:
                    yPosicion++;
                    break;
                case RIGHT:
                    xPosicion++;
                    break;
                case LEFT:
                    xPosicion--;
                    break;
            }
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                //Irrelevante, no hacemos nada
            }
        }
    }
}
