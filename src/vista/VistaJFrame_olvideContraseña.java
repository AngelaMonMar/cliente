/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import controlador.Controlador_datosRecibidos;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Toolkit;
import static modelo.ModeloProtocoloCliente.*;

/**
 *
 * @author sinNombre
 */
public class VistaJFrame_olvideContraseña extends javax.swing.JFrame implements IVista {
    ControladorCliente controlador;

    /**
     * Creates new form VistaJFrame
     */
    public VistaJFrame_olvideContraseña() {
        initComponents();
        centreWindow();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel_icon = new javax.swing.JLabel();
        label_signIn = new javax.swing.JLabel();
        jText_email = new javax.swing.JTextField();
        jPanel_botones1 = new javax.swing.JPanel();
        jButton_recuperar_pw = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-usuario-de-genero-neutro-50.png"))); // NOI18N

        label_signIn.setBackground(new java.awt.Color(229, 229, 229));
        label_signIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_signIn.setText("Olvido la contraseña");
        label_signIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jText_email.setForeground(new java.awt.Color(153, 153, 153));
        jText_email.setText("Correo electrónico");
        jText_email.setToolTipText("");
        jText_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jText_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_emailMouseClicked(evt);
            }
        });

        jButton_recuperar_pw.setBackground(new java.awt.Color(0, 153, 255));
        jButton_recuperar_pw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_recuperar_pw.setForeground(new java.awt.Color(255, 255, 255));
        jButton_recuperar_pw.setText("RECUPERAR CONTRASEÑA");
        jButton_recuperar_pw.setActionCommand("RECUPERAR_PW");
        jButton_recuperar_pw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_recuperar_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_recuperar_pwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_botones1Layout = new javax.swing.GroupLayout(jPanel_botones1);
        jPanel_botones1.setLayout(jPanel_botones1Layout);
        jPanel_botones1Layout.setHorizontalGroup(
            jPanel_botones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
            .addGroup(jPanel_botones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_botones1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jButton_recuperar_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );
        jPanel_botones1Layout.setVerticalGroup(
            jPanel_botones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
            .addGroup(jPanel_botones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_botones1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jButton_recuperar_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Volver a iniciar sesión");
        jButton1.setActionCommand("VOLVER_VISTA_LOGIN");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel_icon)
                        .addGap(18, 18, 18)
                        .addComponent(label_signIn, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                    .addComponent(jText_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jPanel_botones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_signIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(jPanel_botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_emailMouseClicked
        jText_email.setText("");
          jText_email.setForeground(Color.black);
    }//GEN-LAST:event_jText_emailMouseClicked

    private void jButton_recuperar_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_recuperar_pwActionPerformed
        // TODO add your handling code here:
        jButton_recuperar_pw.setActionCommand(RECUPERAR_PW);
    }//GEN-LAST:event_jButton_recuperar_pwActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_recuperar_pw;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel_botones1;
    private javax.swing.JTextField jText_email;
    private javax.swing.JLabel label_signIn;
    // End of variables declaration//GEN-END:variables



    @Override
    public void mostrarRespuesta(String mensaje) { ;
        System.out.println("mostrarRespuesta "+mensaje);
        
    }

    @Override
    public void resetLogin() {
        jText_email.setText("");  
         jText_email.setForeground(Color.GRAY);
    }

    @Override
    public void setControlador(ControladorCliente controlador) {
        this.controlador = controlador;
    }

    @Override
    public void hacerVisible() {
        setVisible(true);      
    }
    
    @Override
    public void inicializar(){
      jButton_recuperar_pw.addActionListener(controlador);
      jButton1.addActionListener(controlador);
    }

   
    // falta comprobar q sea un email valido
    @Override
    public String getMensajeAEnviar() {
     return jText_email.getText()+SEPARADOR+"OK";
    }

    @Override
    public void cerrar() {
         this.dispose();
    }

    @Override
    public void centreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }


}
