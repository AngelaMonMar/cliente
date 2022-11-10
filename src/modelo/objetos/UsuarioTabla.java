/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.objetos;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sinNombre
 */
public class UsuarioTabla {
    

    public void resetUsuario(TextField jtext_id, TextField jtext_name, TextField jtext_nick, TextField jtext_email) {
          jtext_id.setText("");
          jtext_name.setText("");
          jtext_nick.setText("");
          jtext_email.setText("");
    }
    
                // establecer los datos       
    public void setDatosUsuarios(DefaultTableModel defaultTableModel, JTable jTable , List<modelo.objetos.Usuario> list_usuarios){
       // llenarLista();
        Object [] datos=new Object[defaultTableModel.getColumnCount()];
        int i=1;
        for(modelo.objetos.Usuario s:list_usuarios ){
                datos[0]=s.getCod_usuario();
                datos[1]=s.getNombre_usuario();
                datos[2]=s.getEmail();
                datos[3]=s.getNick();
                  i++;
            defaultTableModel.addRow(datos);
        }
        jTable.setModel(defaultTableModel);
    }
    
    public List<modelo.objetos.Usuario> rellenarUsarios(String mensaje) {
           modelo.objetos.Usuario u=null;
           List<modelo.objetos.Usuario>list_usuarios=new ArrayList<>();
           int dosPuntos=mensaje.indexOf(":");
           String msg=mensaje.substring(dosPuntos+4);
           // System.out.println(msg);
           String cod, email, nick, nombre;
           String[]vstr=msg.split(";");
           for(String s : vstr){
                  String[]splitDatos=s.split(":");
                  cod=splitDatos[0];
                  email=splitDatos[1];
                  nick=splitDatos[2];
                  nombre=splitDatos[3];
                  u=new modelo.objetos.Usuario(cod, nombre, email, nick);
                  list_usuarios.add(u);
            }
            return list_usuarios;
        }
    
    //----FIN USUARIOs
}
