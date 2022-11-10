/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author sinNombre
 */
public class ProtocoloCliente {
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
    public static final String MENU_USUARIO="MENU_USUARIO";
    public static final String MENU_ESTAFADOR="MENU_ESTAFADOR";
    public static final String MENU_COMENTARIO="MENU_COMENTARIO";
    public static final String MENU_TAG="MENU_TAG";
    public static final String MENU_CATEGORIA="MENU_CATEGORIA";
    
   //Usuario
    public static final String DELETE_USUARIO="DELETE_USUARIO";
    public static final String INSERT_USUARIO="INSERT_USUARIO";
    public static final String UPDATE_USUARIO="UPDATE_USUARIO";
    
    //ESTAFADOR
    public static final String DELETE_ESTAFADOR="DELETE_ESTAFADOR";
    public static final String INSERT_ESTAFADOR="INSERT_ESTAFADOR";
    public static final String UPDATE_ESTAFADOR="UPDATE_ESTAFADOR";
    
       //COMENTARIO
    public static final String DELETE_COMMENT="DELETE_COMMENT";
    public static final String INSERT_COMMENT="INSERT_COMMENT";
    public static final String UPDATE_COMMENT="UPDATE_COMMENT";
    
    // TAG
    public static final String INSERT_TAG="INSERT_TAG";
    public static final String DELETE_TAG="DELETE_TAG";
    public static final String UPDATE_TAG="UPDATE_TAG";
    // CATEGORIA
    public static final String INSERT_CATEGORIA="INSERT_CATEGORIA";
    public static final String DELETE_CATEGORIA="DELETE_CATEGORIA";
    public static final String UPDATE_CATEGORIA="UPDATE_CATEGORIA";
    
   
   public static final String ROL_ADMIN="ROL_ADMIN"; 
   
   //Mensaje
    public static final String MENSAJE_INFORMACION="Mensaje de información"; 

    // NOMBRE DE LA TABLA 
    public static final String TABLA_USUARIO="TABLA_USUARIO"; 
    public static final String TABLA_ESTAFADOR="TABLA_ESTAFADOR"; 
    public static final String TABLA_TAGS="TABLA_TAGS"; 
    public static final String TABLA_COMENTARIOS="TABLA_COMENTARIOS"; 
    public static final String TABLA_CATEGORIA="TABLA_CATEGORIA"; 
   // public static final String TABLA_ESTAFADOR="TABLA_ESTAFADOR"; 
  //  public static final String TABLA_TAGS="TABLA_TAGS"; 
   // public static final String TABLA_COMENTARIOS="TABLA_COMENTARIOS"; 
    
}
