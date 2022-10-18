/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorCliente;
import controlador.Controlador_datosRecibidos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;

import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.IVista;

import vista.VistaJFrame_PrincipalLogin;
import static modelo.ModeloProtocoloCliente.*;
import vista.VistaJFrame_IP;

import vista.VistaJFrame_olvideContraseña;
import vista.VistaJFrame_menu;
import vista.VistaJFrame_formularioRegistro;

/**
 *
 * @author sinNombre
 Modelo el encargado de enviar y recibir los msg del servidor
 * depende de la respuesta entra en el switch/gbf<a434**
 * 
 * 
 */
public class ModeloCliente extends Thread {
    private ControladorCliente controlador;
    private Controlador_datosRecibidos controladorDatos; // class donde se comprueba / guardan
    private final int PUERTO = 19999;
    public  String HOST = "";
  // private final String HOST ="192.168.1.137" /192.168.1.138;
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;
  
    
    private VistaJFrame_PrincipalLogin vista_login;
   // private VistaJFrame_formularioRegistro vista_register;
    VistaJFrame_formularioRegistro vista_register;
    private VistaJFrame_olvideContraseña vista_olvidePw;
    private VistaJFrame_menu vistaMenu;
    private VistaJFrame_IP vistaIp;
    
    // constructor , getter & Setter
    public ModeloCliente(IVista vista) {
        this.vistaIp =  (VistaJFrame_IP) vista; 
        
    }

      // Metodos de la clase   
    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
     
    
    
    public void setControlador(ControladorCliente controlador){
        this.controlador = controlador;
    }
    
    public boolean conectarConElServidor(){
        boolean esconectado=false;
        try {
            socket = new Socket(HOST, PUERTO);
       
            esconectado=true;
            System.out.println("conecto HOST-> "+HOST);
    
        } catch (IOException ex) {
          //  Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return esconectado;
        
    }
    
    public void crearFlujos(){
        try {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
        } catch (IOException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void enviarMensaje_alServidor(String mensaje){
        try {
            bw.write(mensaje);
            bw.newLine();
            bw.flush();
            System.out.println("MC---> enviarMensaje_alServidor("+mensaje+") :");
        } catch (IOException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String recibirMensaje_delServidor(){
        try {
            String mensaje = br.readLine();
            return mensaje;
        } catch (IOException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
  

    // recibe la respuesta del servidor- depende de la primera palabra= el protocolo determina
    // donde/ el frame q se muestra
    public void run(){
        while(true){
            
            String mensaje = recibirMensaje_delServidor();
       
                String [] vStr=mensaje.split(SEPARADOR);
                String protocolo=vStr[0];// recibido x servidor
                String respuesta_servidor="";
                 String str="";
                if(vStr.length>2)
                     respuesta_servidor=vStr[2]; // lo q me ha enviado el servidor
               
                System.out.println("MC <---:run-- recibirMensaje_delServidor("+mensaje+")");
                
            switch(protocolo){
                
                case IP:
                    vistaIp.setVisible(false);
                    String ip=vStr[1];
                    estableceHost(ip);

                    break;
                // cases de vista_login
//                       case ESTADO_CHECKBOX:// entra al ejecutar el prg- comprueba si anteriormente select. la casilla checkbox
//                            System.out.println("MC :: stoy estado checkbox "+vStr[1]);
//                           if(vStr[1].equals(CHECKBOX_REGISTRO_TRUE)){
//                               // controlador.vista_muestra_msg(vStr[1]);
//                                vista_login.cerrar();// cierre del actual   
//                                // crea vista menu
//                                vistaMenu=new VistaJFrame_menu();
//                                vistaMenu.setControlador(controlador);
//                                vistaMenu.inicializar();
//                                vistaMenu.hacerVisible();
//                                vistaMenu.mostrarRespuesta(CHECKBOX_REGISTRO_TRUE+SEPARADOR+vStr[2]);// el nombre del cliente
//                           // fin  menu-T
//                           }else{// la primera vez entra aqui- abre el formulario login
//                                vista_login.hacerVisible();
//                           }
//                          
                         //  break;
                       case LOGIN_OK:   // crea new Jframe y lo abre                        
                           controlador.vista_muestra_msg(LOGIN_OK+SEPARADOR+"LOGINSSS OK");
                           vista_login.cerrar();// cierro del actual   
                           // crea vista menu
                           vistaMenu=new VistaJFrame_menu();
                           vistaMenu.setControlador(controlador);
                           vistaMenu.inicializar();
                           vistaMenu.hacerVisible();
                           vistaMenu.mostrarRespuesta(mensaje);
                           // fin prueba menu-T                             
                          break;
                          
                       case LOGIN_NOT_OK:
                           controlador.vista_muestra_msg(mensaje);
                          break;
                          
                       case RECORDAR_DATOS_LOGIN:
                           //controlador.vista_muestra_msg(vStr[1]);
                           vista_olvidePw=new VistaJFrame_olvideContraseña();
                           vista_login.cerrar();
                           vista_olvidePw.setControlador(controlador);
                           vista_olvidePw.inicializar();
                           vista_olvidePw.hacerVisible();
                           vista_olvidePw.mostrarRespuesta(mensaje);
                           break; 
                    
                           //VistaRegister
                       case VOLVER:// Habilita los botones del frame logi
                           vista_login =getVista_login();
                           vista_login.inhabilitarBotones(true);
                           break;

                       case REGISTER: //ha pulsado el boton registrar. se crea y abre ventana registro
                           controlador.vista_muestra_msg(mensaje);
                           vista_login =getVista_login();
                           vista_login.inhabilitarBotones(false);

                           vista_register=new  VistaJFrame_formularioRegistro ();
                           vista_register.setControlador(controlador);
                           vista_register.inicializar();
                           vista_register.hacerVisible();
                          break;
                          
                         case REGISTER_FORM_OK:      
                            vista_register.cerrar();
                            vista_login.mostrarRespuesta(REGISTER+SEPARADOR+"Introduce nuevamente los datos");
                            break; 

                        case REGISTER_FORM_NOT_OK:// ha enviado campos vacio/ erroneos
                            // vista_login.setVisible(true);           
                            vista_register.mostrarRespuesta(mensaje);
                            vista_login.inhabilitarBotones(false);
                            break;

                        case REGISTER_FORM: // datos son validados y correctos, se  cierra la ventana con formulario , se abre ventana login
                           //vista_register.mostrarRespuesta(respuesta_servidor);
                           vista_register.mostrarRespuesta(mensaje);
                           vista_register.cerrar();
                           vista_login.setVisible(true);
                           vista_login.resetLogin();
                           vista_login.mostrarRespuesta(REGISTER_FORM+SEPARADOR+"Introduce nuevamente los datos ");
                           //controlador.vista_muestra_msg(respuesta_servidor); //NO
                          break;
                    
                          
                           // Vista_olvideContraseña 
                        case RECUPERAR_PW:

                          break; 
                        case VOLVER_VISTA_LOGIN: // cerrar el actual , abrir el login
                            vista_olvidePw.cerrar();
                            vista_login.setVisible(true);
                            vista_login.mostrarRespuesta(mensaje);//nick usuario VOLVER_VISTA_LOGIN+SEPARADOR+"NOK"+SEPARADOR+"NO estan registrado"
                          break;  
                          
                          
                        //VistaMenu
                        case ACTION1:
                             str=vStr[1];// ACTION2 + SEPARADOR+OK+SEPARADOR + estafas
                             //System.out.println("----ACTION1----"+str);
                             if(str.equals(OK))
                                vistaMenu.mostrarRespuesta(mensaje);
                             else
                                 JOptionPane.showMessageDialog(null, "No hay ningun usuario.","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                            break;
                        case ACTION2:
                              str=vStr[1];// ACTION2 + SEPARADOR+OK+SEPARADOR + estafadores
                             // System.out.println("--------"+str);
                             if(str.equals(OK))
                                vistaMenu.mostrarRespuesta(mensaje);
                             else
                                 JOptionPane.showMessageDialog(null, "No hay ningun estafador.","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                            break;
                        case ACTION3:
                              str=vStr[1];// ACTION3 + SEPARADOR +OK+ comentario_estafas
                              System.out.println("--------"+str);
                             if(str.equals(OK))
                                vistaMenu.mostrarRespuesta(mensaje);
                             else
                                 JOptionPane.showMessageDialog(null, "No hay ningun comentario_estafas.","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                            break;
                        case ACTION4:
                              str=vStr[1];// ACTION4 + SEPARADOR+OK + etiketas
                             if(str.equals(OK))
                                vistaMenu.mostrarRespuesta(mensaje);
                             else
                                 JOptionPane.showMessageDialog(null, "No hay ningun etiketas.","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                            break;
                        case ACTION5:
                              vistaMenu.mostrarRespuesta(mensaje);
                            break; 
                        case DELETE:
                              vistaMenu.mostrarRespuesta(mensaje);
                            break; 
                        case UPDATE:
                                vistaMenu.mostrarRespuesta(mensaje);
                            break; 
                            
                        case INSERT:
                                vistaMenu.mostrarRespuesta(mensaje);
                            break; 
                        case ADDTAG:
                                vistaMenu.mostrarRespuesta(mensaje);
                            break;    
                default:
                          controlador.vista_muestra_msg("algo salio mal"); 
                        break;
                       }      
        
        }
    }

    
    // M son llamados desde controladorCliente para acceder a un M en su vista
    public VistaJFrame_formularioRegistro getVista_register() {
        return vista_register;
    }
      public VistaJFrame_olvideContraseña getVista_recuperarPw() {
        return vista_olvidePw;
    }

    public VistaJFrame_PrincipalLogin getVista_login() {
        return vista_login;
    }
    public VistaJFrame_menu getVista_Menu() {
        return vistaMenu;
    }


    public void estableceHost(String host_ip) {
        this.HOST=host_ip;
        conectarConElServidor();
           vistaIp.cerrar();
                    vista_login=new VistaJFrame_PrincipalLogin();
                    vista_login.setControlador(controlador);
                    vista_login.inicializar();
                    vista_login.hacerVisible();
                   
          System.out.println("MC stoy estableceHost "+this.HOST);    
       
    }
}
