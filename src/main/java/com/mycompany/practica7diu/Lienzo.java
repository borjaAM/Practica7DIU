package com.mycompany.practica7diu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 * @author Grupo06
 */
public class Lienzo extends JPanel{
    private BufferedImage imagen = null;

    public Lienzo() {
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        repaint();
    }
    
    public void setImagen(BufferedImage imagen){
        this.imagen = imagen;
        this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
        repaint();
    }
}
