package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 * Personajes
 * @author SabotenSama
 */
public abstract class Personaje implements Runnable{
    private static final int STOP=-1;
    private static final int UP=0;
    private static final int DOWN=1;
    private static final int RIGHT=2;
    private static final int LEFT=3;
    
    private int direccion=STOP;
    
    protected BufferedImage sprite;//Imagen del personaje
    protected int xPosicion;//Posición x del personaje
    protected int yPosicion;//Posición y del personaje
    protected int width;
    protected int height;
    
    /**
     * Constructor del personaje
     * 
     * @param direccionImagen Dirección en la que está el sprite del personaje
     * @param xPosicion Posición x del personaje
     * @param yPosicion Posición y del personaje
     */
    public Personaje(String direccionImagen, int xPosicion, int yPosicion) throws IOException {
        this.sprite = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/" + direccionImagen));
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.width = JPGameScreen.getRectangulo().width;
        this.height = JPGameScreen.getRectangulo().height;
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
    
    public void dibujar(Graphics2D g2d){
        g2d.drawImage(sprite, xPosicion, yPosicion, null);
    }
    
    public abstract void recibirImpacto();

    @Override
    public abstract void run();
    
}
