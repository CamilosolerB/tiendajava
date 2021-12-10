/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.cj.conf.PropertyKey;
import javax.swing.JOptionPane;
import modelo.Capturalogin;
import modelo.validacion;
import vista.insertusu;
import vista.login;


/**
 *
 * @author PC
 */
public class Inicio {
   
        login log;


    public Inicio(login log) {
        this.log = log;
    }
        
        
        public void consultalog(){
        String usu,pass;
        boolean check;
        usu=log.getUsuario().getText();
        pass=log.getPassword().getText();
        
        Capturalogin utdo = new Capturalogin(usu, pass);
        validacion udao = new validacion();
        check = udao.login(utdo);
        
        if(check){
            login logi = new login();
            logi.setVisible(false);
            insertusu ins = new insertusu();
            ins.setVisible(true);
            ins.setTitle("Aplicacion de tienda");
            ins.setLocationRelativeTo(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta");
        }
    }
}
