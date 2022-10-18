/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;

import static modelo.ModeloProtocoloCliente.*;


/*
 PENDIENTE

- pedir datos login olvidados
- COMPROBAR FORMATO email y min longitud PW

*/

/**
 *
 * @author sinNombre
 */
public class VistaJFrame_PrincipalLogin extends javax.swing.JFrame implements IVista {
    ControladorCliente controlador;
    /**
     * Creates new form VistaJFrame
     */
    public VistaJFrame_PrincipalLogin() {
        initComponents();
        centreWindow();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_icon = new javax.swing.JLabel();
        label_signIn = new javax.swing.JLabel();
        jText_nick = new javax.swing.JTextField();
        jPanel_respuesta_servidor = new javax.swing.JPanel();
        jLabel_login_error = new javax.swing.JLabel();
        jPanel_botones = new javax.swing.JPanel();
        jButton_login = new javax.swing.JButton();
        jButton_registro = new javax.swing.JButton();
        jCheckBox_recordarLogin = new javax.swing.JCheckBox();
        jButton_olvide_datos_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_pw = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-usuario-de-genero-neutro-50.png"))); // NOI18N

        label_signIn.setBackground(new java.awt.Color(229, 229, 229));
        label_signIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_signIn.setText("Sign in");
        label_signIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jText_nick.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jText_nick.setForeground(new java.awt.Color(153, 153, 153));
        jText_nick.setText("Nick");
        jText_nick.setToolTipText("");
        jText_nick.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jText_nick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_nickMouseClicked(evt);
            }
        });
        jText_nick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_nickActionPerformed(evt);
            }
        });

        jPanel_respuesta_servidor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_login_error.setForeground(new java.awt.Color(204, 0, 51));
        jLabel_login_error.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel_respuesta_servidorLayout = new javax.swing.GroupLayout(jPanel_respuesta_servidor);
        jPanel_respuesta_servidor.setLayout(jPanel_respuesta_servidorLayout);
        jPanel_respuesta_servidorLayout.setHorizontalGroup(
            jPanel_respuesta_servidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_respuesta_servidorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_login_error, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel_respuesta_servidorLayout.setVerticalGroup(
            jPanel_respuesta_servidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_login_error, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jButton_login.setBackground(new java.awt.Color(0, 153, 255));
        jButton_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("LOGIN");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jButton_registro.setBackground(new java.awt.Color(0, 153, 255));
        jButton_registro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_registro.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registro.setText("REGISTER");
        jButton_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_registroMouseClicked(evt);
            }
        });
        jButton_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_botonesLayout = new javax.swing.GroupLayout(jPanel_botones);
        jPanel_botones.setLayout(jPanel_botonesLayout);
        jPanel_botonesLayout.setHorizontalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_botonesLayout.setVerticalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBox_recordarLogin.setText("Recordar");
        jCheckBox_recordarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_recordarLoginActionPerformed(evt);
            }
        });

        jButton_olvide_datos_login.setBackground(new java.awt.Color(255, 255, 255));
        jButton_olvide_datos_login.setForeground(new java.awt.Color(255, 153, 153));
        jButton_olvide_datos_login.setText(" ¿Olvidaste la contraseña?");
        jButton_olvide_datos_login.setActionCommand("RECORDAR_DATOS_LOGIN");
        jButton_olvide_datos_login.setBorder(null);
        jButton_olvide_datos_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_olvide_datos_loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nick");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña ");

        jText_pw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jText_pw.setForeground(new java.awt.Color(153, 153, 153));
        jText_pw.setText("Contraseña");
        jText_pw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jText_pw.setCaretPosition(4);
        jText_pw.setPreferredSize(new java.awt.Dimension(32, 23));
        jText_pw.setScrollOffset(0);
        jText_pw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_pwMouseClicked(evt);
            }
        });
        jText_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_pwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_respuesta_servidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox_recordarLogin)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_olvide_datos_login))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jText_nick, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(jText_pw, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_signIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_nick, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jText_pw, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_recordarLogin)
                    .addComponent(jButton_olvide_datos_login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_respuesta_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        jButton_login.setActionCommand(LOGIN);
        jPanel_botones.setVisible(false);

    }//GEN-LAST:event_jButton_loginActionPerformed

    // M- para rsetear los campos al hacer click en ellos
    private void jText_nickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_nickMouseClicked
        jText_nick.setText("");
        jText_nick.setForeground(Color.black);
        jPanel_respuesta_servidor.setVisible(false);
        jPanel_botones.setVisible(true);
        jCheckBox_recordarLogin.setVisible(true);
    }//GEN-LAST:event_jText_nickMouseClicked

    private void jButton_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registroActionPerformed
        // TODO add your handling code here:
          jButton_registro.setActionCommand(REGISTER);
          jPanel_botones.setVisible(false);
          resetLogin();
    }//GEN-LAST:event_jButton_registroActionPerformed

    private void jText_nickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_nickActionPerformed

    private void jCheckBox_recordarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_recordarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_recordarLoginActionPerformed

    private void jButton_olvide_datos_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_olvide_datos_loginActionPerformed
       jButton_olvide_datos_login.setActionCommand(RECORDAR_DATOS_LOGIN);
       System.out.println("Pulso recuperarD "+jButton_olvide_datos_login.getActionCommand());
       resetLogin();
    }//GEN-LAST:event_jButton_olvide_datos_loginActionPerformed

    private void jButton_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registroMouseClicked
        // TODO add your handling code here:
        resetLogin();
    }//GEN-LAST:event_jButton_registroMouseClicked

    private void jText_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_pwActionPerformed

    private void jText_pwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_pwMouseClicked
        jText_pw.setText("");
        jText_pw.setForeground(Color.black);
        jPanel_respuesta_servidor.setVisible(false);
        jPanel_botones.setVisible(true);
        jCheckBox_recordarLogin.setVisible(true);
    }//GEN-LAST:event_jText_pwMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_olvide_datos_login;
    private javax.swing.JButton jButton_registro;
    private javax.swing.JCheckBox jCheckBox_recordarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JLabel jLabel_login_error;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_botones;
    private javax.swing.JPanel jPanel_respuesta_servidor;
    private javax.swing.JTextField jText_nick;
    private javax.swing.JTextField jText_pw;
    private javax.swing.JLabel label_signIn;
    // End of variables declaration//GEN-END:variables



    @Override
    public void mostrarRespuesta(String mensaje) {
        String[] str=mensaje.split(SEPARADOR);
        String protocolo=str[0];
        System.out.println("vistalogin -----"+mensaje);
        
        jPanel_respuesta_servidor.setVisible(true);
        jCheckBox_recordarLogin.setVisible(false);
        jPanel_botones.setVisible(false);
        
        switch (protocolo) {
              case LOGIN:
                 jLabel_login_error.setText("LOGIN OK");
                break; 
                case REGISTER:
                 jLabel_login_error.setText(str[1]);
                break;
                case LOGIN_OK:
                 jLabel_login_error.setText(str[1]+" LOGIN_OK");
                break;
                case LOGIN_NOT_OK:
                 jLabel_login_error.setText(str[1]);
                break;
            case VOLVER_VISTA_LOGIN: // cambiar se debe de abrir otro
                if(str[1].equals("OK")){// esta registrado
                    jText_nick.setText(str[2]);
                    jLabel_login_error.setText("Introduce la contraseña recibida");
                } else {// no esta registrado
                    jLabel_login_error.setText(str[2]);
                    jPanel_botones.setVisible(true);
                }
                break;
            case REGISTER_FORM:
                 jLabel_login_error.setText(str[1]);//Intro nuevamente los datos
                break;
            case REGISTER_FORM_NOT_OK:
                 jLabel_login_error.setText(str[1]+" REGISTER_FORM_NOT_OK");
                break;
            
            case REGISTER_FORM_OK:
                 jLabel_login_error.setText(str[1]+"Intro nuevamente los datos");
                break;
              
            
            default:
                throw new AssertionError();
        }
        
    }

    @Override
    public void resetLogin() {
        jText_nick.setText("Nick");
        jText_nick.setForeground(Color.GRAY);
        jText_pw.setText("****");
        jText_pw.setForeground(Color.GRAY);
        jCheckBox_recordarLogin.setVisible(true);
        jPanel_botones.setVisible(true);
    }

    @Override
    public void setControlador(ControladorCliente controlador) {
        this.controlador = controlador;
    }

    @Override
    public void hacerVisible() {
        setVisible(true);
        resetLogin();
        jPanel_respuesta_servidor.setVisible(false);
 
    }
    
    //los botones le paso el obj controlador
    public void inicializar(){
        jButton_login.addActionListener(controlador);
        jButton_registro.addActionListener(controlador);
        jButton_olvide_datos_login.addActionListener(controlador);
    }

    // si uno de los dos campos estan vacio / ambos o PENDIENTE COMPROBAR FORMATO email y min longitud PW
    @Override
    public String getMensajeAEnviar() {
        if(jText_nick.getText().isEmpty() || jText_pw.getText().isEmpty()){
            resetLogin();
            return SIN_DATOS; // devuelve str q no es correcto el login
        }else{   

          return jText_nick.getText()+SEPARADOR+jText_pw.getText()+
                  SEPARADOR+Boolean.toString(jCheckBox_recordarLogin.isSelected()); // checkbox devuelve boolean--> casting
    }  
    }
    
   


    @Override
    public void cerrar() {
         this.dispose();
    }


    //M para centrar la ventana
    @Override
    public void centreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    
    //--------------------probando
    
    public  void inhabilitarBotones(boolean boleano){
        jButton_login.setEnabled(boleano);
        jButton_olvide_datos_login.setEnabled(boleano);
        jButton_registro.setEnabled(boleano);
        jCheckBox_recordarLogin.setEnabled(boleano);
    }
    
  
    
    
    public JButton getjButton_login() {
        return jButton_login;
    }

    public JButton getjButton_olvide_datos_login() {
        return jButton_olvide_datos_login;
    }

    public JButton getjButton_registro() {
        return jButton_registro;
    }

  

}
