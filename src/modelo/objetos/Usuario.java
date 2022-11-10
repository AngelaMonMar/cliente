/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.objetos;

/**
 *
 * @author sinNombre
 * 
 */
public class Usuario {
  private String cod_usuario;
  private String nombre_usuario;
   private String email;
    private String password;
     private String nick;

     // constructor SIN PW
    public Usuario(String cod_usuario, String nombre_usuario, String email, String nick) {
        this.cod_usuario = cod_usuario;
        this.nombre_usuario = nombre_usuario;
        this.email = email;
        this.nick = nick;
    }

    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
     
     
    
}
