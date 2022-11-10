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

/**
 *
 * @author sinNombre
 */
public class CategoriaTabla extends DefaultTableModel {
    
       public void modeloTabla(DefaultTableModel defaultTableModel, JTable jTable, List<Categoria>list_tags){
        Object [] datos=new Object[defaultTableModel.getColumnCount()];
           for(Categoria c:list_tags ){
                datos[0]=c.getId();
                 datos[1]=c.getValor();
            defaultTableModel.addRow(datos);
            }
        jTable.setModel(defaultTableModel);
    }
 
     //ACTION4:OK:1:piramidal;2:delito;
    public List<Categoria> rellenarTabla(String mensaje) {
            Categoria c=null;
            List<Categoria>list_categorias=new ArrayList<>();
            int dosPuntos=mensaje.indexOf(":");
            String msg=mensaje.substring(dosPuntos+4);
            String  id, valor;
            String[]vstr=msg.split(";");
            for(String s : vstr){
                  String[]splitDatos=s.split(":");
                  id=splitDatos[0];
                  valor=splitDatos[1];
                  c= new Categoria(id, valor);
                  list_categorias.add(c);
            }  

       return list_categorias;
     }

       public void resetCategoria(TextField jtext_idCategory, JTextField jtext_valor_category) {
        jtext_idCategory.setText("");
        jtext_valor_category.setText("");
    }
}
