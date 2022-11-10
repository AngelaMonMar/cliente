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

import static utils.ProtocoloCliente.*;


/*
 PENDIENTE

- pedir datos login olvidados
- COMPROBAR FORMATO email y min longitud PW

*/

/**
 *
 * @author sinNombre
 */
public class VistaJFrame_IP extends javax.swing.JFrame implements IVista {
    ControladorCliente controlador;
    /**
     * Creates new form VistaJFrame
     */
    public VistaJFrame_IP() {
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
        jText_IP = new javax.swing.JTextField();
        jPanel_respuesta_servidor = new javax.swing.JPanel();
        jLabel_login_error = new javax.swing.JLabel();
        jPanel_botones = new javax.swing.JPanel();
        jButton_IP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-usuario-de-genero-neutro-50.png"))); // NOI18N

        label_signIn.setBackground(new java.awt.Color(229, 229, 229));
        label_signIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_signIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jText_IP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jText_IP.setForeground(new java.awt.Color(153, 153, 153));
        jText_IP.setText("IP");
        jText_IP.setToolTipText("");
        jText_IP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jText_IP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_IPMouseClicked(evt);
            }
        });
        jText_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_IPActionPerformed(evt);
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

        jButton_IP.setBackground(new java.awt.Color(0, 153, 255));
        jButton_IP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_IP.setForeground(new java.awt.Color(255, 255, 255));
        jButton_IP.setText("Enviar");
        jButton_IP.setActionCommand("IP");
        jButton_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_botonesLayout = new javax.swing.GroupLayout(jPanel_botones);
        jPanel_botones.setLayout(jPanel_botonesLayout);
        jPanel_botonesLayout.setHorizontalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonesLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jButton_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel_botonesLayout.setVerticalGroup(
            jPanel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Introduce HOST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_icon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel_respuesta_servidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(jText_IP)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_signIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jText_IP)
                .addGap(37, 37, 37)
                .addComponent(jPanel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_respuesta_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IPActionPerformed
        // TODO add your handling code here:
        jButton_IP.setActionCommand(LOGIN);
        
    }//GEN-LAST:event_jButton_IPActionPerformed

    // M- para rsetear los campos al hacer click en ellos
    private void jText_IPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_IPMouseClicked
        jText_IP.setText("");
        jText_IP.setForeground(Color.black);
        jPanel_respuesta_servidor.setVisible(false);
        jPanel_botones.setVisible(true);

    }//GEN-LAST:event_jText_IPMouseClicked

    private void jText_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_IPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_IPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_IP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JLabel jLabel_login_error;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_botones;
    private javax.swing.JPanel jPanel_respuesta_servidor;
    private javax.swing.JTextField jText_IP;
    private javax.swing.JLabel label_signIn;
    // End of variables declaration//GEN-END:variables



    @Override
    public void mostrarRespuesta(String mensaje) {
        
    }

    @Override
    public void resetLogin() {
        jText_IP.setText("IP");
        jText_IP.setForeground(Color.GRAY);

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
        jButton_IP.addActionListener(controlador);
    
    }

    // si uno de los dos campos estan vacio / ambos o PENDIENTE COMPROBAR FORMATO email y min longitud PW
    @Override
    public String getMensajeAEnviar() {
        if(jText_IP.equals(" ")){
            return SIN_DATOS+SEPARADOR+SIN_DATOS;
        }else{
             return IP+SEPARADOR+"192.168.1.137";//jText_IP.getText().toString();
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

  

}
