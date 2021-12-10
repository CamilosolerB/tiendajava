/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ClienteDTO;
import modelo.UsuarioDAO;
import modelo.productosDTO;
import vista.Ventas;
import modelo.VentasDTO;
import vista.viscli;





public class ventas {
    Ventas vent;
    long nit,ce;
    VentasDTO us;
    UsuarioDAO usdao;
    VentasDTO ust;
    ClienteDTO cli;
    ClienteDTO clio;
    productosDTO pto;
    productosDTO ptoo;
    
    public ventas (Ventas vent){
        this.vent = vent;
    }
    
    public void consultar(){
        String dir,ema,nom,tel;
        ce=Long.parseLong(vent.getCedula1().getText());
        cli= new ClienteDTO(ce);
        usdao= new UsuarioDAO();
        clio=usdao.consultacliente(cli);
        nom=clio.getNombre();
        vent.getNombre().setText(String.valueOf(nom));
       
    
}
    public void consultaproducto1(){
        String nomb;
        double val,iva;
        long cod1;
        cod1=Long.parseLong(vent.getCodigo1().getText());
        pto= new productosDTO(cod1);
        usdao = new UsuarioDAO();
        ptoo=usdao.consultaproductos(pto);
        nomb=ptoo.getNombre();
        val=ptoo.getPreciov();
        iva=ptoo.getIva();
        vent.getIva1().setText(String.valueOf(iva));
        vent.getNombre1().setText(String.valueOf(nomb));
        vent.getTotal4().setText(String.valueOf(val));
         
    }
    
    public void consultaproducto2(){
        String nomb;
        double val,iva;
        long cod1;
        cod1=Long.parseLong(vent.getCodigo2().getText());
        pto= new productosDTO(cod1);
        usdao = new UsuarioDAO();
        ptoo=usdao.consultaproductos(pto);
        nomb=ptoo.getNombre();
        val=ptoo.getPreciov();
        iva=ptoo.getIva();
        vent.getIva2().setText(String.valueOf(iva));
        vent.getNombre2().setText(String.valueOf(nomb));
        vent.getTotal2().setText(String.valueOf(val));
         
    }
    public void consultaproducto3(){
        String nomb;
        double val,iva;
        long cod1;
        cod1=Long.parseLong(vent.getCodigo3().getText());
        pto= new productosDTO(cod1);
        usdao = new UsuarioDAO();
        ptoo=usdao.consultaproductos(pto);
        nomb=ptoo.getNombre();
        val=ptoo.getPreciov();
        iva=ptoo.getIva();
        vent.getIva3().setText(String.valueOf(iva));
        vent.getNombre3().setText(String.valueOf(nomb));
        vent.getTotal1().setText(String.valueOf(val));
         
    }
    
    public void insertarventa(){
        
        boolean check;
        long codigo,cedula,codpro1,codpro2,codpro3;
        double ivat,tovt,valvt,iva1,tov1,valv1,iva2,tov2,valv2,iva3,tov3,valv3;
        int cant1,cant2,cant3;
        String nombre;
        cedula=Long.parseLong(vent.getCedula1().getText());
        nombre=vent.getNombre().getText();
        codigo=Long.parseLong(vent.getCodigo().getText());
        codpro1=Long.parseLong(vent.getCodigo1().getText());
        codpro2=Long.parseLong(vent.getCodigo2().getText());
        codpro3=Long.parseLong(vent.getCodigo3().getText());
        tovt=Double.parseDouble(vent.getTotalvent().getText());
        valvt=Double.parseDouble(vent.getTotalfinal().getText());
        ivat=Double.parseDouble(vent.getToliva().getText());
        tov1=Double.parseDouble(vent.getTotal4().getText());
        valv1=Double.parseDouble(vent.getTotal4().getText());
        iva1=Double.parseDouble(vent.getIva1().getText());
        
        tov2=Double.parseDouble(vent.getTotal2().getText());
        valv2=Double.parseDouble(vent.getTotal2().getText());
        iva2=Double.parseDouble(vent.getIva2().getText());
        
        tov3=Double.parseDouble(vent.getTotal1().getText());
        valv3=Double.parseDouble(vent.getTotal1().getText());
        iva3=Double.parseDouble(vent.getIva3().getText());
        
        cant1=Integer.parseInt(vent.getCantidad1().getText());
        cant2=Integer.parseInt(vent.getCantidad2().getText());
        cant3=Integer.parseInt(vent.getCantidad3().getText());
        
        VentasDTO vto = new VentasDTO(cedula, nombre, codigo, codpro1, codpro2, codpro3, tovt, valvt, ivat, tov1, valv1, iva1, tov2, valv2, iva2, tov3, valv3, iva3, cant1, cant2, cant3);
        UsuarioDAO usdao = new UsuarioDAO();
    check=usdao.insertarventa(vto);
            if(check){
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Dato no insertado");
        }
    }
            
}
