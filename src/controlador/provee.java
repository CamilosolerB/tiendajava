/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.ProveedorDTO;
import modelo.UsuarioDAO;
import vista.proveedores;

/**
 *
 * @author caans
 */
public class provee {

    proveedores getpro;
    long nit;
    ProveedorDTO us;
    UsuarioDAO usdao;
    ProveedorDTO ust;
    
    public provee (proveedores getpro){
        this.getpro = getpro;
    }
    
    
public void proveedore (){

    boolean res;
    long nit;
    String nomb,dir,ciu,tel;
    
    nit=Long.parseLong(getpro.getNit().getText());
    ciu=getpro.getCity().getText();
    dir=getpro.getDireccion().getText();
    nomb=getpro.getNombre().getText();
    tel=getpro.getTelefono().getText();
    
    
    ProveedorDTO pdto = new ProveedorDTO(nit, ciu, dir, nomb, tel);
    UsuarioDAO udao = new UsuarioDAO();
    res= udao.insertarproveedor(pdto);
    
    if(res){
        JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
    }
    else{
        JOptionPane.showMessageDialog(null, "Error en la insercion");
    }
    
    

}


    public void actualizar(){
        long nit;
    boolean verify;
    String city,nom,tel,dir;
    nit=Long.parseLong(getpro.getNit().getText());
    city=getpro.getCity().getText();
    dir=getpro.getDireccion().getText();
    nom=getpro.getNombre().getText();
    tel=getpro.getTelefono().getText();
    
    
    ProveedorDTO pto = new ProveedorDTO(nit, city, dir, nom, tel);
    UsuarioDAO usudao = new UsuarioDAO();
    verify= usudao.actualizarpro(pto);
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
        ce=Long.parseLong(getpro.getNit().getText());
        
        ProveedorDTO utdo = new ProveedorDTO(ce);
        UsuarioDAO udao = new UsuarioDAO();
        check = udao.deletepro(utdo);
        
        if(check){
            JOptionPane.showMessageDialog(null, "DDato eliminado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al intentar borrar el archivo");
        }
    }
            
    public void consultar(){
        String nomb,dir,ciu,tel;
        nit=Long.parseLong(getpro.getNit().getText());
        us= new ProveedorDTO(nit);
        usdao= new UsuarioDAO();
        ust=usdao.consultaproveedor(us);
        dir = ust.getDireccion();
        ciu=ust.getCiudad();
        nomb=ust.getNombre();
        tel = ust.getTelefono();
        getpro.getCity().setText(String.valueOf(ciu));
        getpro.getDireccion().setText(String.valueOf(dir));
        getpro.getTelefono().setText(String.valueOf(tel));
        getpro.getNombre().setText(String.valueOf(nomb));
        
    }
}
