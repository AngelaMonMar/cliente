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
public class ComentarioTabla {
    
        public void resetComentario(TextField jtext_idComment, TextField jtext_nick_comment, 
                  TextField jtext_comment_comment, TextField jtext_comment) {
            jtext_idComment.setText("");
            jtext_nick_comment.setText("");
            jtext_comment_comment.setText("");
            jtext_comment.setText("");
    }

          // Comentarios

    public void setComments(DefaultTableModel defaultTableModel, JTable jTable, List<modelo.objetos.Comentario> list_comments){
        Object [] datos=new Object[defaultTableModel.getColumnCount()];
        int i=1;
           for(modelo.objetos.Comentario c:list_comments ){
                datos[0]=c.getId();
                 datos[1]=c.getNick();
                 datos[2]=c.getComentario();
                  i++;
            defaultTableModel.addRow(datos);
        }
        jTable.setModel(defaultTableModel);
    }
 
    public List<modelo.objetos.Comentario> rellenarComments(String mensaje) {
         modelo.objetos.Comentario e=null;
         List<modelo.objetos.Comentario>list_comments=new ArrayList<>();
         int dosPuntos=mensaje.indexOf(":");
         String msg=mensaje.substring(dosPuntos+4);
            
         String comentario, id, nick;
         String[]vstr=msg.split(";");
         for(String s : vstr){
                String[]splitDatos=s.split(":");
                id=splitDatos[0];
                nick=splitDatos[1];
                comentario=splitDatos[2];
                e=new modelo.objetos.Comentario(id, comentario, nick);
                list_comments.add(e);
            }  
            System.out.println("lit "+list_comments.toString());
            return list_comments;
     }         
    //---FIN comments


}
