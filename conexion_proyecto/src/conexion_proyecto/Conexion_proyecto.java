/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion_proyecto;

   import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion_proyecto {
    
    
    public static void main(String[] args) {
      
   String usuario = "root";     
   String contraseña = "";     
   String url = "jdbc:mysql://localhost:3306/yummis_food";
   String driver = "com.mysql.cj.jdbc.Driver";
   Connection conexion;
   Statement statement;
   ResultSet rs;
   
   
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        try {
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println(" CONEXION EXITOSA ");
             statement = conexion.createStatement();
           
             //para comprobar que la conexion fue exitosa se hace una consulta de la identificacion de los id administradores y el usuario registrados
             
              rs = statement.executeQuery("select * from administrador");
            while(rs.next()){
                
                System.out.println(rs.getString("id_adm")+" : "+ rs.getString("usuario"));
            }
            
           
          
           
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_proyecto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" NO SE PUDO CONECTAR CON LA BASE DE DATOS");
        }
        
        
    }
    
}
