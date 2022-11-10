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
public class EstafadorTabla {

    public void resetEstafador(TextField jtext_idEstafador, TextField jtext_datos_1estafador, 
                                TextField jtext_datos_2estafador, TextField jtext_datos_3estafador) {
            jtext_idEstafador.setText("");
            jtext_datos_1estafador.setText("");
            jtext_datos_2estafador.setText("");
            jtext_datos_3estafador.setText("");
    }
    
        // estafador
    public void modeloTabla(DefaultTableModel defaultTableModel, JTable jTable, List<modelo.objetos.Estafador> list_estafadores){
        Object [] datos=new Object[defaultTableModel.getColumnCount()];
        int i=1;
           for(modelo.objetos.Estafador s:list_estafadores ){
                datos[0]=s.getId();
                 datos[1]=s.getDatos();
                  i++;
            defaultTableModel.addRow(datos);
        }
        jTable.setModel(defaultTableModel);
    }
    
    public  List<modelo.objetos.Estafador> rellenarTabla(String mensaje) {
             modelo.objetos.Estafador e=null;
            List<modelo.objetos.Estafador>list_estafadores=new ArrayList<>();
            int dosPuntos=mensaje.indexOf(":");
            String msg=mensaje.substring(dosPuntos+4);
            
            String datos, id;
            String[]vstr=msg.split(";");
            for(String s : vstr){
                  String[]splitDatos=s.split(":");
                  datos=splitDatos[0];
                  id=splitDatos[1];
                  e=new modelo.objetos.Estafador(id, datos);
                 list_estafadores.add(e);
            } 
            return list_estafadores;
     }  
      
      // FIn estafadors
    
}
