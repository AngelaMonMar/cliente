/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author sinNombre
 */
public class ContruirTablas {

    public ContruirTablas() {
    }
    
    public void setModeloTabla(DefaultTableModel defaultTableModel, JTable jTable, String[] cabecera) {
     JTableHeader th;
     th = jTable.getTableHeader();
     Font fuente = new Font("Verdana", Font.BOLD, 10);
     th.setFont(fuente);
     th.setBackground(Color.BLUE);
     jTable.getTableHeader().setForeground(Color.white);
     defaultTableModel.setColumnIdentifiers(cabecera);        
     jTable.setModel(defaultTableModel);
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
    
    // estafador
    public void setEstafdor(DefaultTableModel defaultTableModel, JTable jTable, List<modelo.objetos.Estafador> list_estafadores){
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
    
    public  List<modelo.objetos.Estafador> rellenarEstafador(String mensaje) {
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
      // Comentarios

    public void setComments(DefaultTableModel defaultTableModel, JTable jTable, List<modelo.objetos.Comentario> list_comments){
        Object [] datos=new Object[defaultTableModel.getColumnCount()];
        int i=1;
           for(modelo.objetos.Comentario c:list_comments ){
                datos[0]=c.getId();
                 datos[1]=c.getComentario();
                 datos[2]=c.getNick();
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
            
         String datos, id, nick;
         String[]vstr=msg.split(";");
         for(String s : vstr){
                String[]splitDatos=s.split(":");
                datos=splitDatos[0];
                id=splitDatos[1];
                nick=splitDatos[2];
                e=new modelo.objetos.Comentario(id, datos, nick);
                list_comments.add(e);
            }  
            System.out.println("lit "+list_comments.toString());
            return list_comments;
     }         
    //---FIN comments
    //TAGS

    public void mostrarEtiketas(DefaultTableModel defaultTableModel, JTable jTable, List<modelo.objetos.Etiketa>list_tags){
        Object [] datos=new Object[defaultTableModel.getColumnCount()];
           for(modelo.objetos.Etiketa c:list_tags ){
                datos[0]=c.getId();
                 datos[1]=c.getValor();
            defaultTableModel.addRow(datos);
            }
        jTable.setModel(defaultTableModel);
    }
 
     //ACTION4:OK:1:piramidal;2:delito;
    public List<modelo.objetos.Etiketa> rellenarTags(String mensaje) {
            modelo.objetos.Etiketa e=null;
            List<modelo.objetos.Etiketa>list_tags=new ArrayList<>();
            int dosPuntos=mensaje.indexOf(":");
            String msg=mensaje.substring(dosPuntos+4);
            String  id, valor;
            String[]vstr=msg.split(";");
            for(String s : vstr){
                  String[]splitDatos=s.split(":");
                  id=splitDatos[0];
                  valor=splitDatos[1];
                  e=new modelo.objetos.Etiketa(id, valor);
                  list_tags.add(e);
            }  

       return list_tags;
     }
 }
