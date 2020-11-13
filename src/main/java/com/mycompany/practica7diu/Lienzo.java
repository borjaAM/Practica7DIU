package com.mycompany.practica7diu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author Grupo06
 */
public class Lienzo extends JPanel{
    private BufferedImage imagen = null;

    public Lienzo() {
        try{
            imagen = ImageIO.read(new URL("https://i.imgur.com/sjvtlq0.jpg"));
        } catch(IOException ex){
            System.out.println("Excepcion" + ex);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        repaint();
    }
    
    public void setImagen(BufferedImage imagen){
        this.imagen = imagen;
        repaint();
    }
}
