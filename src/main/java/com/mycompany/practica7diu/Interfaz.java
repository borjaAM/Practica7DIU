package com.mycompany.practica7diu;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class Interfaz extends javax.swing.JFrame {

    private final JScrollBar barraV, barraH;
    private final JFileChooser fc = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes (*.jpg, *.png)", "jpg", "png");
    private File file;
    private Mat imagenOriginal;
    private BufferedImage img;
    private EstadisticasImagen estadistica;
    
    class MiListener implements AdjustmentListener{

        @Override
        public void adjustmentValueChanged(AdjustmentEvent ae) {
            if(img != null){
                Dimension dimension = new Dimension(img.getWidth(), img.getHeight());
                updateTextRGB(imagenOriginal, panelDeslizable1.getViewport().getViewPosition(),
                    calculateViewImagenSize(dimension,panelDeslizable1.getViewport().getExtentSize()));
            }
        }
    }

    public Interfaz() {
        initComponents();
        fc.addChoosableFileFilter(filter);
        estadistica = new EstadisticasImagen();
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        barraV = panelDeslizable1.getVerticalScrollBar();
        barraH = panelDeslizable1.getHorizontalScrollBar();
        
        panelDeslizable1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panelDeslizable1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraV.addAdjustmentListener(new MiListener());
        barraH.addAdjustmentListener(new MiListener());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        maxR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        maxG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maxB = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        minR = new javax.swing.JTextField();
        minG = new javax.swing.JTextField();
        minB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        promB = new javax.swing.JTextField();
        promG = new javax.swing.JTextField();
        promR = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        panelDeslizable1 = new javax.swing.JScrollPane();
        lienzo1 = new com.mycompany.practica7diu.Lienzo();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIabrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIcerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo componentes RGB de una imagen");
        setBackground(new java.awt.Color(230, 247, 240));

        jPanel1.setBackground(new java.awt.Color(95, 182, 182));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Componentes RGB de la imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Máximo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(169, 174));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel4.setText("Rojo");

        maxR.setEditable(false);
        maxR.setBackground(new java.awt.Color(255, 216, 210));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel5.setText("Verde");

        maxG.setEditable(false);
        maxG.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel6.setText("Azul");

        maxB.setEditable(false);
        maxB.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(maxG, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maxR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maxB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maxR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maxG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(maxB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Mínimo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(169, 174));

        minR.setEditable(false);
        minR.setBackground(new java.awt.Color(255, 216, 210));

        minG.setEditable(false);
        minG.setBackground(new java.awt.Color(204, 255, 204));

        minB.setEditable(false);
        minB.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel7.setText("Rojo");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel8.setText("Verde");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel9.setText("Azul");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(minG, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(minG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(minB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Promedio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(169, 174));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel10.setText("Rojo");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel11.setText("Verde");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel12.setText("Azul");

        promB.setEditable(false);
        promB.setBackground(new java.awt.Color(204, 255, 255));

        promG.setEditable(false);
        promG.setBackground(new java.awt.Color(204, 255, 204));

        promR.setEditable(false);
        promR.setBackground(new java.awt.Color(255, 216, 210));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(promB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(promR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(promG, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(promR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(promG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(promB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(95, 182, 182));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12))); // NOI18N

        panelDeslizable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3840, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2160, Short.MAX_VALUE)
        );

        panelDeslizable1.setViewportView(lienzo1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeslizable1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(panelDeslizable1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(234, 230, 246));

        jMenu1.setMnemonic('f');
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        jMIabrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIabrir.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jMIabrir.setText("Abrir imagen");
        jMIabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIabrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMIabrir);
        jMenu1.add(jSeparator1);

        jMIcerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIcerrar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jMIcerrar.setText("Cerrar");
        jMIcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIcerrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMIcerrar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIabrirActionPerformed
        int option = fc.showOpenDialog(this);
        file = fc.getSelectedFile();
        updateScrollPanel();
        
        if(option == JFileChooser.APPROVE_OPTION){
            if(comprobarExtension(file)){
                imagenOriginal = Imgcodecs.imread(file.getPath());
                img = (BufferedImage) HighGui.toBufferedImage(imagenOriginal);
                lienzo1.setImagen(img);
                updateTextRGB(imagenOriginal, panelDeslizable1.getViewport().getViewPosition(),
                       calculateViewImagenSize(
                           new Dimension(img.getWidth(),img.getHeight()),panelDeslizable1.getViewport().getExtentSize()));
            } else {
                JOptionPane.showMessageDialog(this, "Solo se pueden abrir archivos con extensión .jpg o .png.");
            }
        }
    }//GEN-LAST:event_jMIabrirActionPerformed

    private void jMIcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIcerrarActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "¿Quiere cerrar la aplcación?", "Salir", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_jMIcerrarActionPerformed

    private boolean comprobarExtension(File file){
        return file.getName().endsWith(".jpg") || file.getName().endsWith(".png");
    }
    
    private void updateTextRGB(Mat imagen, Point esquinaSI, Dimension dimension) {
       estadistica.calculaEstadisticas(imagen, esquinaSI, dimension);
       int[] rgbMax = estadistica.getMaximo();
       int[] rgbMin = estadistica.getMinimo();
       int[] rgbProm = estadistica.getPromedio();
       
       maxR.setText(""+ rgbMax[estadistica.ROJO]);
       minR.setText(""+ rgbMin[estadistica.ROJO]);
       promR.setText(""+ rgbProm[estadistica.ROJO]);
       
       maxG.setText(""+ rgbMax[estadistica.VERDE]);
       minG.setText(""+ rgbMin[estadistica.VERDE]);
       promG.setText(""+ rgbProm[estadistica.VERDE]);
       
       maxB.setText(""+ rgbMax[estadistica.AZUL]);
       minB.setText(""+ rgbMin[estadistica.AZUL]);
       promB.setText(""+ rgbProm[estadistica.AZUL]);
       
    }
    
    private void updateScrollPanel() {
       barraV.setValue(0);
       barraH.setValue(0);
       panelDeslizable1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
       panelDeslizable1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       panelDeslizable1.repaint();
    }
    
    private Dimension calculateViewImagenSize(Dimension imagenSize, Dimension scrollSize) {
        if(imagenSize.width< scrollSize.width){
            if(imagenSize.height < scrollSize.height){
                return imagenSize;
            }else{
                return new Dimension(imagenSize.width, scrollSize.height);
            }
        }else if(imagenSize.height < scrollSize.height){
            return new Dimension(scrollSize.width, imagenSize.height);
        }
        return scrollSize;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMIabrir;
    private javax.swing.JMenuItem jMIcerrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private com.mycompany.practica7diu.Lienzo lienzo1;
    private javax.swing.JTextField maxB;
    private javax.swing.JTextField maxG;
    private javax.swing.JTextField maxR;
    private javax.swing.JTextField minB;
    private javax.swing.JTextField minG;
    private javax.swing.JTextField minR;
    private javax.swing.JScrollPane panelDeslizable1;
    private javax.swing.JTextField promB;
    private javax.swing.JTextField promG;
    private javax.swing.JTextField promR;
    // End of variables declaration//GEN-END:variables
}
