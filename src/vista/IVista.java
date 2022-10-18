/*
personalizar la barra de titulo
http://monillo007.blogspot.com/2011/07/personalizar-la-barra-de-titulo-de-una.html

Como habilitar/deshabilitar componentes de un Panel en Java
https://mundotelecomunicaciones1.blogspot.com/2014/10/como-habilitardeshabilitar-componentes.html

ejemplos diseño login
https://www.shutterstock.com/es/image-vector/login-register-form-blue-theme-desktop-1698560326

android curso 
https://www.youtube.com/watch?v=wxLK2yuivI0&list=PLraIUviMMM3c-V3_hfueY_hwd32prRvZU&index=20
 */
package vista;

import controlador.ControladorCliente;

/**
 *
 * @author sinNombre
 */
public interface IVista {
    
    public void mostrarRespuesta(String mensaje);
    public void resetLogin();
    public void setControlador(ControladorCliente controlador);
    public void hacerVisible();
    public void inicializar();
    public String getMensajeAEnviar();
    public void cerrar();
    public void centreWindow();
}
