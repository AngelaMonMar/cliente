/*
 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 

 */
package principal;

import controlador.ControladorCliente;
import modelo.ModeloCliente;
import vista.IVista;
import vista.VistaJFrame_IP;
import vista.VistaJFrame_PrincipalLogin;


/**
 *
 * @author sinNombre

 */
public class Main_cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CAMBIO 1
        
        IVista vista = new VistaJFrame_IP();// pantalla principal login
        ModeloCliente modelo = new ModeloCliente(vista);// thread
        
        ControladorCliente controlador = new ControladorCliente(vista, modelo);//compartida
        
        vista.setControlador(controlador);
        modelo.setControlador(controlador);
        
        controlador.arrancar();
    }
    
}
