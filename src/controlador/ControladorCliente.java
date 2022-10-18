 /*

 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import javax.swing.JOptionPane;
import modelo.ModeloCliente;
import vista.IVista;
import static modelo.ModeloProtocoloCliente.*;

/**
 *
 * @author sinNombre
 * 
 */
public class ControladorCliente implements ActionListener {
    IVista vista;
    ModeloCliente modelo;

    public ControladorCliente(IVista vista, ModeloCliente modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    // arranca el la vista login , conecta el server y crea los flujos
    public void arrancar(){
        vista.hacerVisible();
        vista.inicializar(); 
             
        if( modelo.conectarConElServidor()){ // si ha conectado con server
            modelo.crearFlujos();// crea los flujos
            modelo.start();// arranco el hilo del cliente
            
            //cambios para poder intro IP
            // la primera vez entra aqui-le envio el remoteIp para comprobar si previemente activo el checkbox cuando se registro 
          //  InetAddress inetAddr = modelo.getSocket().getInetAddress();
          //  String remoteIp = inetAddr.getHostAddress();
        //    modelo.enviarMensaje_alServidor(ESTADO_CHECKBOX+SEPARADOR+remoteIp+SEPARADOR+CHECKBOX_REGISTRO_FALSE);
            
       }else{
            JOptionPane.showMessageDialog(null, "imposible conectar ");
            vista.cerrar();
        }
      
    }

    // cliente pulsa uno de los botones- 
    // depende de la palabra-protocolo entra en witch
    // envia el msg al hiloDelCliente en el servidor
    // el hiloDelCliente lo procesa y envia la respuesta al modeloCliente
    //modeloCliente lo procesa/filtra y muestra la respuesta del servidor en la vista
    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje=e.getActionCommand();
        System.out.println("\nCC e.getActionCommand() "+mensaje);

        switch(mensaje){
            case IP:
                mensaje=vista.getMensajeAEnviar();
                String [] vstr=mensaje.split(SEPARADOR);
                System.out.println("CC IP "+vstr[1]);
                modelo.estableceHost(vstr[1]);

                //modelo.enviarMensaje_alServidor(mensaje);
                break;
            
            case LOGIN:
                 mensaje=LOGIN+SEPARADOR+modelo.getVista_login().getMensajeAEnviar();// LOGIN:email:pw:checkbox
                 modelo.enviarMensaje_alServidor(mensaje);// a:a
                break;
            case RECORDAR_DATOS_LOGIN:// activo casilla checkbox
                 mensaje=RECORDAR_DATOS_LOGIN+SEPARADOR;//+vista.getMensajeAEnviar();
                 System.out.println("switch CC RECORDAR_DATOS_LOGIN  "+mensaje);
                 modelo.enviarMensaje_alServidor(mensaje);
                break;    
    
            case REGISTER:
                 mensaje=REGISTER+SEPARADOR;
                 modelo.enviarMensaje_alServidor(mensaje);
                 break;
             case REGISTER_FORM:// nombre:apellidos:nick:email:pw
                 mensaje=REGISTER_FORM+SEPARADOR + modelo.getVista_register().getMensajeAEnviar();// lo que ha intro el cl en el formulario
                 modelo.enviarMensaje_alServidor(mensaje);//nom:apellidos:nick:email:pw OR SIN_DATOS
                 break;
                 
             case VOLVER:
                 mensaje=VOLVER;
                 modelo.enviarMensaje_alServidor(mensaje);//nom:apellidos:nick:email:pw
                 break;
                
                  // VistaJFrame_olvideContraseña 
             case RECUPERAR_PW:
                 mensaje=RECUPERAR_PW+SEPARADOR+ modelo.getVista_recuperarPw().getMensajeAEnviar();
                 System.out.println("switch CC  recuperar PW "+mensaje);
                 modelo.enviarMensaje_alServidor(mensaje);
                 break; 
             case VOLVER_VISTA_LOGIN:
                 mensaje=VOLVER_VISTA_LOGIN;
                 System.out.println("switch CC  VOLVER_VISTA_LOGIN "+mensaje);
                 modelo.enviarMensaje_alServidor(mensaje);
                 break;   
                 
                 //MENU
            case ACTION1:
                 modelo.enviarMensaje_alServidor(mensaje);//
                 break; 
              case ACTION2:
                 modelo.enviarMensaje_alServidor(mensaje);//
                 break;  
               case ACTION3:
                 modelo.enviarMensaje_alServidor(mensaje);//
                 break; 
              case ACTION4:
                 modelo.enviarMensaje_alServidor(mensaje);//
                 break;  
                 
               case ACTION5:
                     modelo.getVista_register().getMensajeAEnviar();
                 break; 
                 
               case DELETE:
                   mensaje=modelo.getVista_Menu().getMensajeAEnviar();
                   modelo.enviarMensaje_alServidor(DELETE+SEPARADOR+mensaje);//
                   break; 
                   
                  case UPDATE:
                   mensaje=modelo.getVista_Menu().getMensajeAEnviar();
                   modelo.enviarMensaje_alServidor(UPDATE+SEPARADOR+mensaje);//
                   break;  
                   
                 case INSERT:
                   mensaje=modelo.getVista_Menu().getMensajeAEnviar();
                   modelo.enviarMensaje_alServidor(UPDATE+SEPARADOR+mensaje);//
                   break; 
                
                case ADDTAG:
                   mensaje=modelo.getVista_Menu().getMensajeAEnviar();
                   modelo.enviarMensaje_alServidor(ADDTAG+SEPARADOR+mensaje);//
                   break;
                   
                case SIN_DATOS:
                     JOptionPane.showMessageDialog(null, "Deben introducir IP valida");
                    break;
                   
                default:
                     System.out.println(" CC Surgio error "+mensaje);
                    modelo.enviarMensaje_alServidor(SIN_DATOS+SEPARADOR+SIN_DATOS);//
                    break;
        }
    }
    
    public void vista_muestra_msg(String mensaje){
        vista.mostrarRespuesta(mensaje);
    }
}
