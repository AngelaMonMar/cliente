/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sinNombre
 */
public class ModeloProtocoloCliente {
   public final static String IP = "IP";
   public final static String SEPARADOR = ":";
   public final static String SIN_DATOS = "SIN_DATOS";
     public final static String OK = "OK";
       public final static String NOT_OK = "NOT_OK";
    
   // -- LOGIN FRAME
   public final static String ENVIAR = "ENVIAR";
   public final static String LOGIN = "LOGIN";
   public final static String REGISTER = "REGISTER";
    
   public final static String LOGIN_OK = "LOGIN_OK";
   public final static String LOGIN_NOT_OK = "LOGIN_NOT_OK";
   public final static String RECORDAR_DATOS_LOGIN = "RECORDAR_DATOS_LOGIN";
   
   public final static String ESTADO_CHECKBOX = "ESTADO_CHECKBOX";
   public final static String CHECKBOX_REGISTRO_FALSE = "CHECKBOX_REGISTRO_FALSE";
   public final static String CHECKBOX_REGISTRO_TRUE = "CHECKBOX_REGISTRO_TRUE";
   public final static String VOLVER="VOLVER";
   
   // VISTA RECUPERAR PW
   public final static String RECUPERAR_PW="RECUPERAR_PW";
   public final static String VOLVER_VISTA_LOGIN="VOLVER_VISTA_LOGIN";
   public  final static String PW_CAMBIADO_OK="PW_CAMBIADO_OK";//PW_CAMBIADO_OK:str
   public  final static String PW_CAMBIADO_NOTOK="PW_CAMBIADO_NOTOK";//PW_CAMBIADO_NOTOK:str

   public final static String REGISTER_FORM_NOT_OK = "REGISTER_FORM_NOT_OK";
   public static final String REGISTER_FORM_OK="REGISTER_FORM_OK";
   public final static String REGISTER_FORM="REGISTER_FORM";
    
    //protocolo menu
    public static final String ACTION1="ACTION1";
       public static final String ACTION2="ACTION2";
          public static final String ACTION3="ACTION3";
             public static final String ACTION4="ACTION4";
              public static final String ACTION5="ACTION5";
    
             //Usuario
    public static final String DELETE="DELETE";
    public static final String INSERT="INSERT";
    public static final String UPDATE="UPDATE";
    public static final String ADDTAG="ADDTAG";
   
   public static final String ROL_ADMIN="ROL_ADMIN"; 
   
   //Mensaje
    public static final String MENSAJE_INFORMACION="Mensaje de información"; 
}
