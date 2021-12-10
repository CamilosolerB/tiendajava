/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.UsuarioDAO;
import modelo.UsuarioDTO;
import vista.insertusu;
/**
 *
 * @author caans
 */
public class Usuarios {
    
    long ce;
    UsuarioDTO us;
    insertusu vistusu;
    UsuarioDAO usdao;
    UsuarioDTO ust;
    
public Usuarios (insertusu vistusu){
    this.vistusu = vistusu;
}
    
    public void usuario(){
    long ce;
    boolean verify;
    String em,nom, pass, usu;
    ce=Long.parseLong(vistusu.getCedula().getText());
    em=vistusu.getEmail().getText();
    nom=vistusu.getNombre().getText();
    pass=vistusu.getPassword().getText();
    usu=vistusu.getUsu().getText();
    
    
    
    UsuarioDTO usudto= new UsuarioDTO(ce, em, nom, pass, usu);
    UsuarioDAO usudao = new UsuarioDAO();
    verify= usudao.insertarusuario(usudto);
    if(verify){
        JOptionPane.showMessageDialog(null, "Dato insertado");
    }
    else{
        JOptionPane.showMessageDialog(null, "datos no ingresado");
    }
    }
    
    public void actualizar(){
    long ce;
    boolean verify;
    String em,nom, pass, usu;
    ce=Long.parseLong(vistusu.getCedula().getText());
    em=vistusu.getEmail().getText();
    nom=vistusu.getNombre().getText();
    pass=vistusu.getPassword().getText();
    usu=vistusu.getUsu().getText();
    
    
    
    UsuarioDTO usudto= new UsuarioDTO(ce, em, nom, pass, usu);
    UsuarioDAO usudao = new UsuarioDAO();
    verify= usudao.actualizarusu(usudto);
    if(verify){
        JOptionPane.showMessageDialog(null, "Usuario Actualizado");
    }
    else{
        JOptionPane.showMessageDialog(null, "Usuario no actualizado");
    } 
    
    }
    public void eliminar(){
        long ce;
        boolean check;
        ce=Long.parseLong(vistusu.getCedula().getText());
        
        UsuarioDTO utdo = new UsuarioDTO(ce);
        UsuarioDAO udao = new UsuarioDAO();
        check = udao.deleteusu(utdo);
        
        if(check){
            JOptionPane.showMessageDialog(null, "DDato eliminado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al intentar borrar el archivo");
        }
    }
    
    public void consultar(){
        String e,user,pass,nom;
        ce=Long.parseLong(vistusu.getCedula().getText());
        us= new UsuarioDTO(ce);
        usdao= new UsuarioDAO();
        ust=usdao.consultausuario(us);
        user=ust.getUsuario();
        pass=ust.getPassword();
        nom=ust.getNombre();
        e=ust.getEmail();
        vistusu.getEmail().setText(String.valueOf(e));
        vistusu.getUsu().setText(String.valueOf(user));
        vistusu.getPassword().setText(String.valueOf(pass));
        vistusu.getNombre().setText(String.valueOf(nom));
        
    }
}
