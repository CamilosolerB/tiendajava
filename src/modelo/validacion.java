/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.insertusu;
import vista.login;

public class validacion {
    conexion con = new conexion();
    Connection cnn = con.connectdb();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean login(Capturalogin cap){
        boolean check=false;
        try {
            ps=cnn.prepareStatement("Select * from usuarios WHERE usuario=? AND password=?");
            ps.setString(1, cap.getUsuario());
            ps.setString(2, cap.getPassword());
            rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                check=true;
            login logi = new login();
            logi.setVisible(false);
            }
        } catch (SQLException ex) {
            System.out.println("Sucedio el error: "+ex);
        }
    return check;
    }
}
