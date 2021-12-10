/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import vista.productos;
import modelo.productosDTO;
import modelo.UsuarioDAO;

/**
 *
 * @author PC
 */
public class Product {
    productos produ;

    public Product(productos produ) {
        this.produ = produ;
    }
    
    
    
    public void insertar(){
        long cod,nit;
        double iva,precioc,preciov;
        String nombre;
        boolean check;
        
        cod=Long.parseLong(produ.getCodigo().getText());
        nombre=produ.getNombre().getText();
        nit=Long.parseLong(produ.getjComboBox1());
        System.out.println(nit);
        precioc=Double.parseDouble(produ.getPrecioc().getText());
        iva=Double.parseDouble(produ.getIva().getText());
        preciov=Double.parseDouble(produ.getPreciov().getText());
        productosDTO dto = new productosDTO(cod,iva,nit,nombre,precioc,preciov);
        UsuarioDAO udao = new UsuarioDAO();
        check=udao.insertarproducto(dto);
        if(check){
            JOptionPane.showMessageDialog(null, "Producto creado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error en la insersion");
        }
    }
}
