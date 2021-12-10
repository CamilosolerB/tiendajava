/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;

import modelo.ClienteDTO;
import modelo.UsuarioDAO;
import vista.viscli;

/**
 *
 * @author caans
 */
public class Clientes {
    
    viscli vistacli;
    long ce;
    ClienteDTO us;
    UsuarioDAO usdao;
    ClienteDTO ust;
    
    public Clientes(viscli vistacli){
        this.vistacli = vistacli;
    }
    
    public void cliente (){
        long ced;
        String nom,ema,tel,dir;
        boolean result;
        
        ced=Long.parseLong(vistacli.getCedula().getText());
        dir=vistacli.getDireccion().getText();
        ema=vistacli.getEmail().getText();
        nom=vistacli.getNombre().getText();
        tel=vistacli.getCelular().getText();
        
        
        ClienteDTO cto = new ClienteDTO(ced, dir, ema, nom, tel);
        UsuarioDAO udao = new UsuarioDAO();
        
        result=udao.insertarcliente(cto);
        if(result){
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Dato no insertado");
        }
        }
    
    public void actualizar(){
        long ce;
    boolean verify;
    String nom,ema,tel,dir;
    ce=Long.parseLong(vistacli.getCedula().getText());
    dir=vistacli.getDireccion().getText();
    ema=vistacli.getEmail().getText();
    nom=vistacli.getNombre().getText();
    tel=vistacli.getCelular().getText();
    
    
    
    ClienteDTO usudto= new ClienteDTO(ce, dir, ema, nom, nom);
    UsuarioDAO usudao = new UsuarioDAO();
    verify= usudao.actualizarcli(usudto);
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
        ce=Long.parseLong(vistacli.getCedula().getText());
        
        ClienteDTO utdo = new ClienteDTO(ce);
        UsuarioDAO udao = new UsuarioDAO();
        check = udao.deletecli(utdo);
        
        if(check){
            JOptionPane.showMessageDialog(null, "DDato eliminado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al intentar borrar el archivo");
        }
    }
        
            public void consultar(){
        String dir,ema,nom,tel;
        ce=Long.parseLong(vistacli.getCedula().getText());
        us= new ClienteDTO(ce);
        usdao= new UsuarioDAO();
        ust=usdao.consultacliente(us);
        dir = ust.getDireccion();
        ema=ust.getEmail();
        nom=ust.getNombre();
        tel = ust.getTelefono();
        vistacli.getEmail().setText(String.valueOf(ema));
        vistacli.getDireccion().setText(String.valueOf(dir));
        vistacli.getCelular().setText(String.valueOf(tel));
        vistacli.getNombre().setText(String.valueOf(nom));
        
    }
    }

