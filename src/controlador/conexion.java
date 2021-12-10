
package controlador;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class conexion {
   Connection mysql;
   
   public Connection connectdb(){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           try {
               mysql = DriverManager.getConnection("jdbc:mysql://127.0.0.1/tienda","root","Camiloesbueno.");
               System.out.println("conexion exitosa");
                
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"El error es "+ ex);
           }
       } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Error en la conexion"+ex);
       }
   return mysql;
   }
   
    public static void main(String[] args) {
        conexion con = new conexion();
        con.connectdb();
    }
}
