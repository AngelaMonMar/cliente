/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.objetos;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author sinNombre
 */
public class TagTabla {

   public void modeloTabla(DefaultTableModel defaultTableModel, JTable jTable, List<modelo.objetos.Tag>list_tags){
        Object [] datos=new Object[defaultTableModel.getColumnCount()];
           for(modelo.objetos.Tag c:list_tags ){
                datos[0]=c.getId();
                 datos[1]=c.getValor();
            defaultTableModel.addRow(datos);
            }
//        TableColumnModel columnModel = jTable.getColumnModel();     
//        columnModel.getColumn(0).setPreferredWidth(50);
//        columnModel.getColumn(1).setPreferredWidth(150);
        jTable.setModel(defaultTableModel);
    }
 
     //MENU_TAG:OK:1:piramidal;2:delito;
    public List<modelo.objetos.Tag> rellenarTabla(String mensaje) {
            modelo.objetos.Tag e=null;
            List<modelo.objetos.Tag>list_tags=new ArrayList<>();
            int dosPuntos=mensaje.indexOf(":");
            String msg=mensaje.substring(dosPuntos+4);//:ok/notOk
            String  id, valor;
            String[]vstr=msg.split(";");
            for(String s : vstr){
                  String[]splitDatos=s.split(":");
                  id=splitDatos[0];
                  valor=splitDatos[1];
                  e=new modelo.objetos.Tag(id, valor);
                  list_tags.add(e);
            }  

       return list_tags;
     }

    public void resetTag(TextField jtext_idTag, JTextField jtext_valor_tag) {
        jtext_idTag.setText("");
        jtext_valor_tag.setText("");
    }

 
}
