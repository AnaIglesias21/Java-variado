package tarea7;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author AnaIglesias
 */
public class FondoPantalla extends JPanel{
    
   //sobreescribimos el método paint para poder poner la imagen de fondo
   @Override 
   public void paint(Graphics g){
        //cargamos nuestra imagen de fondo indicandole la ruta de acceso y el nombre del fichero
        imagenFondo = new ImageIcon(getClass().getResource("../imagenes/FondoAzul.png")).getImage();
        
        g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(),
                        this);
        
        //para que el fondo sea transparente y se muestre la imagen debemos poner el setOpaque a false
        setOpaque(false);
        //para obligar a que siga dibujando los demás componetes 
        super.paint(g);
    }
    
    private Image imagenFondo;
    
}
