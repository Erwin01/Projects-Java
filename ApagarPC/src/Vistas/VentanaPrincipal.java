package Vistas;

import ApagarEquipo.Apagar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ERWIN
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Apagar shutdown = new Apagar();

    public VentanaPrincipal() {

        initComponents();
        //Centra el panel en la pantalla
        this.setLocationRelativeTo(null);
        //Asigno el tiempo por defecto
        this.txtTiempoSegundo.setText("60");
        //Nombre a las etiquetas
        this.JMenuArchivo.setToolTipText("Archivo");
        this.JMenuHerramientas.setToolTipText("Herramientas");
        this.BtnApagarEquipo.setToolTipText("Apagar Equipo");
        this.BtnCancelarApagado.setToolTipText("Cancelar Apagado");
        //this.lblEscritorio.setToolTipText("Escritorio");
        //this.lblPortatil.setToolTipText("Portatil");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        lblTiempoSegundo = new org.edisoncor.gui.label.LabelMetric();
        lblTiempoEstablecido = new org.edisoncor.gui.label.LabelMetric();
        txtTiempoSegundo = new org.edisoncor.gui.textField.TextField();
        jComboBoxSeleccionarHoras = new javax.swing.JComboBox<>();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        lblEscritorio = new javax.swing.JLabel();
        lblPortatil = new javax.swing.JLabel();
        BtnCancelarApagado = new javax.swing.JButton();
        BtnApagarEquipo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuArchivo = new javax.swing.JMenu();
        JMenuItemSalir = new javax.swing.JMenuItem();
        JMenuHerramientas = new javax.swing.JMenu();
        JMenuItemConvertirHora = new javax.swing.JMenuItem();
        JMenuItemConvertirMinuto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apagar v1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Apagar Pc.png")).getImage());
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panel1.setColorPrimario(new java.awt.Color(0, 255, 0));
        panel1.setColorSecundario(new java.awt.Color(204, 51, 0));

        lblTiempoSegundo.setText("Tiempo (Segundos):");
        lblTiempoSegundo.setToolTipText("");
        lblTiempoSegundo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        lblTiempoEstablecido.setText("Tiempo Establecido:");
        lblTiempoEstablecido.setToolTipText("");
        lblTiempoEstablecido.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        txtTiempoSegundo.setForeground(new java.awt.Color(153, 0, 0));
        txtTiempoSegundo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempoSegundo.setToolTipText("");
        txtTiempoSegundo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jComboBoxSeleccionarHoras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxSeleccionarHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "1 Hora", "2 Horas", "3 Horas", "4 Horas", "5 Horas" }));
        jComboBoxSeleccionarHoras.setFocusable(false);
        jComboBoxSeleccionarHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSeleccionarHorasActionPerformed(evt);
            }
        });

        lblEscritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escritorio.png"))); // NOI18N

        lblPortatil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Portatil.png"))); // NOI18N

        BtnCancelarApagado.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtnCancelarApagado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar Apagado.png"))); // NOI18N
        BtnCancelarApagado.setText("Cancelar Apagado");
        BtnCancelarApagado.setToolTipText("");
        BtnCancelarApagado.setBorderPainted(false);
        BtnCancelarApagado.setContentAreaFilled(false);
        BtnCancelarApagado.setFocusPainted(false);
        BtnCancelarApagado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCancelarApagado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnCancelarApagado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCancelarApagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarApagadoActionPerformed(evt);
            }
        });

        BtnApagarEquipo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BtnApagarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apagar.png"))); // NOI18N
        BtnApagarEquipo.setText("Apagar Equipo");
        BtnApagarEquipo.setToolTipText("");
        BtnApagarEquipo.setBorderPainted(false);
        BtnApagarEquipo.setContentAreaFilled(false);
        BtnApagarEquipo.setFocusPainted(false);
        BtnApagarEquipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnApagarEquipo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnApagarEquipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnApagarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnApagarEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEscritorio)
                .addGap(18, 18, 18)
                .addComponent(lblPortatil)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelarApagado)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiempoSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoEstablecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTiempoSegundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSeleccionarHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiempoSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiempoSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiempoEstablecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSeleccionarHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnApagarEquipo)
                            .addComponent(BtnCancelarApagado))
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPortatil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        JMenuArchivo.setText("Archivo");

        JMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItemSalir.setText("Salir");
        JMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSalirActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMenuItemSalir);

        jMenuBar1.add(JMenuArchivo);

        JMenuHerramientas.setText("Herramientas");

        JMenuItemConvertirHora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItemConvertirHora.setText("Convertir Hora(s) en Segundo(s)");
        JMenuItemConvertirHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemConvertirHoraActionPerformed(evt);
            }
        });
        JMenuHerramientas.add(JMenuItemConvertirHora);

        JMenuItemConvertirMinuto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItemConvertirMinuto.setText("Convertir Minuto(s) en Hora(s)");
        JMenuItemConvertirMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemConvertirMinutoActionPerformed(evt);
            }
        });
        JMenuHerramientas.add(JMenuItemConvertirMinuto);

        jMenuBar1.add(JMenuHerramientas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemConvertirMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemConvertirMinutoActionPerformed

        ConvertirMinuto convM = new ConvertirMinuto(this, false);
        convM.setVisible(true);
    }//GEN-LAST:event_JMenuItemConvertirMinutoActionPerformed

    private void BtnApagarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarEquipoActionPerformed

        try {

            int tiempo = Integer.parseInt(txtTiempoSegundo.getText());
            shutdown.Ejecutar("shutdown -s -t " + tiempo);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor digite un número.", ".:Error:.", JOptionPane.ERROR_MESSAGE);
            txtTiempoSegundo.requestFocus();
        }
    }//GEN-LAST:event_BtnApagarEquipoActionPerformed

    private void BtnCancelarApagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarApagadoActionPerformed

        shutdown.Ejecutar("shutdown -a");
    }//GEN-LAST:event_BtnCancelarApagadoActionPerformed

    private void JMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_JMenuItemSalirActionPerformed

    private void JMenuItemConvertirHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemConvertirHoraActionPerformed

        ConvertirHora convH = new ConvertirHora(this, false);
        convH.setVisible(true);

    }//GEN-LAST:event_JMenuItemConvertirHoraActionPerformed

    private void jComboBoxSeleccionarHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSeleccionarHorasActionPerformed

        if (jComboBoxSeleccionarHoras.getSelectedIndex() == 0) {
            txtTiempoSegundo.setText("60");
        }
        if (jComboBoxSeleccionarHoras.getSelectedIndex() == 1) {
            txtTiempoSegundo.setText("3600");
        }
        if (jComboBoxSeleccionarHoras.getSelectedIndex() == 2) {
            txtTiempoSegundo.setText("7200");
        }
        if (jComboBoxSeleccionarHoras.getSelectedIndex() == 3) {
            txtTiempoSegundo.setText("10800");
        }
        if (jComboBoxSeleccionarHoras.getSelectedIndex() == 4) {
            txtTiempoSegundo.setText("14400");
        }
        if (jComboBoxSeleccionarHoras.getSelectedIndex() == 5) {
            txtTiempoSegundo.setText("18000");
        }
    }//GEN-LAST:event_jComboBoxSeleccionarHorasActionPerformed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagarEquipo;
    private javax.swing.JButton BtnCancelarApagado;
    private javax.swing.JMenu JMenuArchivo;
    private javax.swing.JMenu JMenuHerramientas;
    private javax.swing.JMenuItem JMenuItemConvertirHora;
    private javax.swing.JMenuItem JMenuItemConvertirMinuto;
    private javax.swing.JMenuItem JMenuItemSalir;
    private javax.swing.JComboBox<String> jComboBoxSeleccionarHoras;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblEscritorio;
    private javax.swing.JLabel lblPortatil;
    private org.edisoncor.gui.label.LabelMetric lblTiempoEstablecido;
    private org.edisoncor.gui.label.LabelMetric lblTiempoSegundo;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.textField.TextField txtTiempoSegundo;
    // End of variables declaration//GEN-END:variables
}
