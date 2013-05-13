/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sig.registrousuario;

import com.facturas.vista.editar.ImageFileView;
import com.facturas.vista.editar.ImageFilter;
import com.facturas.vista.editar.ImagePreview;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.openide.util.NbPreferences;
import org.sig.registrousuario.utils.Constantes;

final class DatosFacturaPanel extends javax.swing.JPanel {

    private static int SCALE_WIDTH = 115;
    private static int SCALE_HEIGHT = 115;
    private final DatosFacturaOptionsPanelController controller;
    private byte[] imagen;

    DatosFacturaPanel(DatosFacturaOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfFolioInicial = new javax.swing.JFormattedTextField();
        jfFolioFinal = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jfNoAprobacion = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jLabel2.text")); // NOI18N

        jfFolioInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jfFolioInicial.setText(org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jfFolioInicial.text")); // NOI18N
        jfFolioInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jfFolioFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jfFolioFinal.setText(org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jfFolioFinal.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jLabel3.text")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sig/registrousuario/none.jpg"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jLabel4.text")); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jLabel5.text")); // NOI18N

        jfNoAprobacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jfNoAprobacion.setText(org.openide.util.NbBundle.getMessage(DatosFacturaPanel.class, "DatosFacturaPanel.jfNoAprobacion.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jfNoAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jfFolioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jfFolioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfFolioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jfFolioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jfNoAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        File fImagen;
        FileInputStream fisImagen;

        System.out.println("ClickCount::" + evt.getClickCount() + " " + NbPreferences.forModule(DatosFacturaPanel.class).absolutePath());
        if (evt.getClickCount() == 2) {
            System.out.println("ClickCount::" + evt.getClickCount());
            if (jFileChooser1 == null) {
                jFileChooser1 = new JFileChooser();
                jFileChooser1.addChoosableFileFilter(new ImageFilter());
                jFileChooser1.setAcceptAllFileFilterUsed(false);
                jFileChooser1.setFileView(new ImageFileView());
                jFileChooser1.setAccessory(new ImagePreview(jFileChooser1));
            }
            int returnVal = jFileChooser1.showOpenDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fImagen = new File(jFileChooser1.getSelectedFile().getAbsolutePath());
                if (fImagen.exists()) {
                    try {
                        fisImagen = new FileInputStream(fImagen);
                        imagen = new byte[fisImagen.available()];
                        fisImagen.read(imagen);
                        fisImagen.close();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    ImageIcon icon = new ImageIcon(imagen);
                    Image image = icon.getImage().getScaledInstance(SCALE_WIDTH, SCALE_HEIGHT, Image.SCALE_SMOOTH);
                    jLabel4.setIcon(new javax.swing.ImageIcon(image));
                }
            } else {
                System.out.println("Open command cancelled by user.");
            }
            jFileChooser1.setSelectedFile(null);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    void load() {
        jfFolioInicial.setValue(Integer.valueOf(NbPreferences.forModule(DatosFacturaPanel.class).getInt(Constantes.FOLIO_INICIAL, 0)));
        jfFolioFinal.setValue(Integer.valueOf(NbPreferences.forModule(DatosFacturaPanel.class).getInt(Constantes.FOLIO_FINAL, 0)));
        jfNoAprobacion.setValue(Integer.valueOf(NbPreferences.forModule(DatosFacturaPanel.class).getInt(Constantes.NUMERO_APROBACION, 0)));

        imagen = NbPreferences.forModule(DatosFacturaPanel.class).getByteArray(Constantes.IMAGEN_CODIGO_BARRAS, null);
        if (imagen != null) {
            ImageIcon icon = new ImageIcon(imagen);
            Image image = icon.getImage().getScaledInstance(SCALE_WIDTH, SCALE_HEIGHT, Image.SCALE_SMOOTH);
            jLabel4.setIcon(new javax.swing.ImageIcon(image));
        }
    }

    void store() {
        NbPreferences.forModule(DatosFacturaPanel.class).putByteArray(Constantes.IMAGEN_CODIGO_BARRAS, imagen);
        NbPreferences.forModule(DatosFacturaPanel.class).put(Constantes.FOLIO_INICIAL, String.valueOf(jfFolioInicial.getValue()));
        NbPreferences.forModule(DatosFacturaPanel.class).put(Constantes.FOLIO_FINAL, String.valueOf(jfFolioFinal.getValue()));
        NbPreferences.forModule(DatosFacturaPanel.class).put(Constantes.NUMERO_APROBACION, String.valueOf(jfNoAprobacion.getValue()));
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField jfFolioFinal;
    private javax.swing.JFormattedTextField jfFolioInicial;
    private javax.swing.JFormattedTextField jfNoAprobacion;
    // End of variables declaration//GEN-END:variables
}
