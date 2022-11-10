/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorCliente;
import controlador.Controlador_datosRecibidos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import static utils.ProtocoloCliente.*;

/**
 *
 * @author sinNombre
 */
public class VistaJFrame_formularioRegistro extends javax.swing.JFrame implements IVista{
    ControladorCliente controlador;
    Controlador_datosRecibidos controlador_dats_cliente;
   
    
    public VistaJFrame_formularioRegistro() {
        initComponents();
        centreWindow();
        controlador_dats_cliente=new Controlador_datosRecibidos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_nick = new javax.swing.JTextField();
        jTextField_pw = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel_botones = new javax.swing.JPanel();
        jButton_volver = new javax.swing.JButton();
        jButton_registro_form = new javax.swing.JButton();
        jTextField_error_register = new javax.swing.JTextField();
        jTextField_confirmar_pw = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(520, 620));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de registro");

        jTextField_nombre.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_nombre.setText("Nombre");
        jTextField_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_nombre.setPreferredSize(new java.awt.Dimension(58, 20));
        jTextField_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_nombreMouseClicked(evt);
            }
        });
        jTextField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreActionPerformed(evt);
            }
        });

        jTextField_nick.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_nick.setText("Nick");
        jTextField_nick.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_nick.setMinimumSize(new java.awt.Dimension(58, 20));
        jTextField_nick.setPreferredSize(new java.awt.Dimension(58, 20));
        jTextField_nick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_nickMouseClicked(evt);
            }
        });

        jTextField_pw.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_pw.setText("Contraseña");
        jTextField_pw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_pw.setMinimumSize(new java.awt.Dimension(58, 20));
        jTextField_pw.setName(""); // NOI18N
        jTextField_pw.setPreferredSize(new java.awt.Dimension(58, 20));
        jTextField_pw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_pwMouseClicked(evt);
            }
        });

        jTextField_email.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_email.setText("Correo electrónico");
        jTextField_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_email.setMinimumSize(new java.awt.Dimension(58, 20));
        jTextField_email.setPreferredSize(new java.awt.Dimension(58, 20));
        jTextField_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_emailMouseClicked(evt);
            }
        });
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-usuario-de-genero-neutro-50.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 50));

        jButton_volver.setBackground(new java.awt.Color(0, 153, 255));
        jButton_volver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_volver.setForeground(new java.awt.Color(255, 255, 255));
        jButton_volver.setText("VOLVER");
        jButton_volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_volverActionPerformed(evt);
            }
        });

        jButton_registro_form.setBackground(new java.awt.Color(0, 153, 255));
        jButton_registro_form.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_registro_form.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registro_form.setText("REGISTER");
        jButton_registro_form.setActionCommand("REGISTER_FORM");
        jButton_registro_form.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_registro_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registro_formActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_botonesLayout = new javax.swing.GroupLayout(jPanel_botones);
        jPanel_botones.setLayout(jPanel_botonesLayout);
        jPanel_botonesLayout.setHorizontalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_botonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton_registro_form, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel_botonesLayout.setVerticalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_registro_form, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_error_register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_error_register.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_error_register.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField_confirmar_pw.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_confirmar_pw.setText("Confirmar contraseña");
        jTextField_confirmar_pw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_confirmar_pw.setMinimumSize(new java.awt.Dimension(58, 20));
        jTextField_confirmar_pw.setName(""); // NOI18N
        jTextField_confirmar_pw.setPreferredSize(new java.awt.Dimension(58, 20));
        jTextField_confirmar_pw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_confirmar_pwMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_nick, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_pw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_confirmar_pw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_error_register)
                            .addComponent(jPanel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_nick, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_confirmar_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField_error_register, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jTextField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreActionPerformed

    private void jButton_registro_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registro_formActionPerformed
        // TODO add your handling code here:
          jButton_registro_form.setActionCommand(REGISTER_FORM);
    }//GEN-LAST:event_jButton_registro_formActionPerformed

    private void jButton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_volverActionPerformed
        // TODO add your handling code here:
        jButton_volver.setActionCommand(VOLVER);
        cerrar();
    }//GEN-LAST:event_jButton_volverActionPerformed

    private void jTextField_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_nombreMouseClicked
        // TODO add your handling code here:
        jTextField_nombre.setText("");
        jTextField_nombre.setForeground(Color.black);
    }//GEN-LAST:event_jTextField_nombreMouseClicked

    private void jTextField_nickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_nickMouseClicked
        // TODO add your handling code here:
         jTextField_nick.setText("");
           jTextField_nick.setForeground(Color.black);
    }//GEN-LAST:event_jTextField_nickMouseClicked

    private void jTextField_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_emailMouseClicked
        // TODO add your handling code here:
         jTextField_email.setText("");
           jTextField_email.setForeground(Color.black);
    }//GEN-LAST:event_jTextField_emailMouseClicked

    private void jTextField_pwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_pwMouseClicked
        // TODO add your handling code here:
         jTextField_pw.setText("");
           jTextField_pw.setForeground(Color.black);
    }//GEN-LAST:event_jTextField_pwMouseClicked

    private void jTextField_confirmar_pwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_confirmar_pwMouseClicked
        // TODO add your handling code here:
           jTextField_confirmar_pw.setText("");
           jTextField_confirmar_pw.setForeground(Color.black);
    }//GEN-LAST:event_jTextField_confirmar_pwMouseClicked

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
            java.util.logging.Logger.getLogger(VistaJFrame_formularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJFrame_formularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJFrame_formularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJFrame_formularioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJFrame_formularioRegistro().setVisible(true);
            }
        });
    }

    
    
    @Override
    public void mostrarRespuesta(String mensaje) {
        String[] str=mensaje.split(SEPARADOR);
        String protocolo=str[0];
        switch (protocolo) {
            case REGISTER_FORM_NOT_OK:
                jTextField_error_register.setText(str[1]);
                
                break;
//             case REGISTER_FORM_OK:
//               // jTextField_error_register.setText(str[1]);
//                this.cerrar();
//                break;    
            default:
                throw new AssertionError();
        }
        System.out.println("vistaRegister mostrarRespuesta -----"+mensaje);
    }

    @Override
    public void resetLogin() {
        jTextField_email.setText("Email");
        jTextField_email.setForeground(Color.GRAY);
        jTextField_nick.setText("Nick");
        jTextField_nick.setForeground(Color.GRAY);
        jTextField_nombre.setText("Nombre");
        jTextField_nombre.setForeground(Color.GRAY);
        jTextField_pw.setText("Contraseña");
        jTextField_pw.setForeground(Color.GRAY);
        jTextField_confirmar_pw.setText("Confirmar contraseña");
        jTextField_confirmar_pw.setForeground(Color.GRAY);
//        jTextField_apellidos.setText("Apellidos");
//        jTextField_apellidos.setForeground(Color.GRAY);

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
    public void inicializar() {
        jButton_registro_form.addActionListener(controlador);
        jButton_volver.addActionListener(controlador);// Probando
    }

    @Override
    public String getMensajeAEnviar() {
          if(jTextField_nombre.getText().isEmpty()||
                jTextField_nick.getText().isEmpty() || jTextField_email.getText().isEmpty()||
                   jTextField_pw.getText().isEmpty()|| jTextField_confirmar_pw.getText().isEmpty()){
            resetLogin();
            return SIN_DATOS;
        }else{ // se comprueba que los datos introducidos son validos- DE MOMENTO NO comprueba
              // nombre:apellidos:nick:email:pw
            if(controlador_dats_cliente.comprobarDatos(jTextField_nombre.getText(),
                    jTextField_nick.getText(),jTextField_email.getText(), jTextField_pw.getText())){// pendiente comprobar en cliente que los datos son correctos
                return jTextField_nombre.getText()+SEPARADOR+
                        jTextField_nick.getText()+SEPARADOR+jTextField_email.getText()+SEPARADOR+jTextField_pw.getText()+SEPARADOR+"ADMIN";
            }else{
                resetLogin();
                return SIN_DATOS;
            }
    }
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_registro_form;
    private javax.swing.JButton jButton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_botones;
    private javax.swing.JTextField jTextField_confirmar_pw;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_error_register;
    private javax.swing.JTextField jTextField_nick;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_pw;
    // End of variables declaration//GEN-END:variables
}
