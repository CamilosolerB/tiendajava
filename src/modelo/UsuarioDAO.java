/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author caans
 */
public class UsuarioDAO {


    conexion con = new conexion();
    Connection cnn = con.connectdb();
    PreparedStatement ps;
    ResultSet rs;
    UsuarioDTO uss;
    productosDTO prod;
    ClienteDTO ctus;
    VentasDTO vnto;
    ProveedorDTO pros;

    //CRUD de usuarios
    public boolean insertarusuario(UsuarioDTO dto){
        
        boolean dat=false;
        try {
            ps=cnn.prepareStatement("INSERT INTO usuarios VALUES(?,?,?,?,?)");
        ps.setLong(1, dto.getCedula());
        ps.setString(2, dto.getEmail());
        ps.setString(3, dto.getNombre());
        ps.setString(4, dto.getPassword());
        ps.setString(5, dto.getUsuario());
        if(ps.executeUpdate()>0){
            dat=true;
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en la insersion "+ex);
        }
        return dat;
    }


        public boolean actualizarusu(UsuarioDTO udto){
    
        boolean y=false;
        
        try {
            ps=cnn.prepareStatement("UPDATE usuarios SET email_usuario=?,nombre_usuario=?,"
                    + "password=?,usuario=? WHERE cedula_usuarios=?");
                    ps.setString(1, udto.getEmail());
                    ps.setString(2, udto.getNombre());
                    ps.setString(3, udto.getPassword());
                    ps.setString(4, udto.getUsuario());
                    ps.setLong(5, udto.getCedula());
                    
                if(ps.executeUpdate()>0){
                    y=true;
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la insersion "+ex);
            
        }
        
        return y;
    
    }
    public boolean deleteusu (UsuarioDTO udto) {
        
        boolean x=false;
        
                try {
            ps=cnn.prepareStatement("DELETE FROM usuarios WHERE cedula_usuarios=?");
                    ps.setLong(1, udto.getCedula());
                    
                if(ps.executeUpdate()>0){
                    x=true;
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la eliminacion: "+ex);
            
        }
        
        return x;
    }
    
    public UsuarioDTO consultausuario ( UsuarioDTO udto){
        try {
            ps=cnn.prepareStatement("SELECT * FROM usuarios WHERE cedula_usuarios=?");
            ps.setLong(1, udto.getCedula());
            rs=ps.executeQuery();
            
            if(rs.next()){
                uss= new UsuarioDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error"+ e);
        }
        
        System.out.println("dtro       "+uss);
        return uss;
    }
    
    public ArrayList <UsuarioDTO> consultagenusu () {
    ArrayList <UsuarioDTO> lista = new ArrayList();
    try{
        ps=cnn.prepareStatement("Select * from usuarios");
        rs=ps.executeQuery();
        if(rs.next()){
            uss= new UsuarioDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        lista.add(uss);  
        }
  
    }
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Error en la consulta "+ex);
    }
    return lista;
}

    //fin del CRUD de usuarios
    
    
    
    //inicio del CRUD de clientes
    public boolean insertarcliente(ClienteDTO cto){
        
        boolean req=false;
        
        try {
            ps=cnn.prepareStatement("INSERT INTO clientes VALUES(?,?,?,?,?)");
            ps.setLong(1, cto.getCedula());
            ps.setString(2, cto.getDireccion());
            ps.setString(3, cto.getEmail());
            ps.setString(4, cto.getNombre());
            ps.setString(5, cto.getTelefono());
            if(ps.executeUpdate()>0){
                req=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la insersion : "+ex);
        }
     return req;
    }
    
    public boolean actualizarcli(ClienteDTO cto){
    
        boolean y=false;
        
        try {
            ps=cnn.prepareStatement("UPDATE clientes SET direccion_cliente=?,email_cliente=?,"
                    + "nombre_cliente=?,telefono_cliente=? WHERE cedula_clientes=?");
                    ps.setString(1, cto.getDireccion());
                    ps.setString(2, cto.getEmail());
                    ps.setString(3, cto.getNombre());
                    ps.setString(4, cto.getTelefono());
                    ps.setLong(5, cto.getCedula());
                    
                if(ps.executeUpdate()>0){
                    y=true;
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la insersion "+ex);
            
        }
        
        return y;
    
    }

        public boolean deletecli (ClienteDTO cto) {
        
        boolean x=false;
        
                try {
            ps=cnn.prepareStatement("DELETE FROM clientes WHERE cedula_clientes=?");
                    ps.setLong(1, cto.getCedula());
                    
                if(ps.executeUpdate()>0){
                    x=true;
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la eliminacion: "+ex);
            
        }
        
        return x;
    }
    
        public ClienteDTO consultacliente (ClienteDTO cto){
        try {
            ps=cnn.prepareStatement("SELECT * FROM clientes WHERE cedula_clientes=?");
            ps.setLong(1, cto.getCedula());
            rs=ps.executeQuery();
            
            if(rs.next()){
                ctus= new ClienteDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error"+ e);
        }
        
        return ctus;
    }
    //fin del CRUD de clientes    
        
        
    //inicio del CRUD de proveedor
    public boolean insertarproveedor(ProveedorDTO pdto){
    
    boolean res=false;
    
        try {
            ps=cnn.prepareStatement("INSERT INTO proveedores VALUES(?,?,?,?,?)");
            ps.setLong(1, pdto.getNit());
            ps.setString(2, pdto.getCiudad());
            ps.setString(3, pdto.getDireccion());
            ps.setString(4, pdto.getNombre());
            ps.setString(5, pdto.getTelefono());
            
            if(ps.executeUpdate()>0){
                res=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la insersion :"+ex);
        }
    
    
    return res;
        
    }
    
        public boolean actualizarpro(ProveedorDTO pto){
    
        boolean y=false;
        
        try {
            ps=cnn.prepareStatement("UPDATE proveedores SET ciudad_proveedor=?,direccion_proveedor=?,"
                    + "nombre_proveedor=?,telefono_proveedor=? WHERE nitproveedor=?");
                    ps.setString(1, pto.getCiudad());
                    ps.setString(2, pto.getDireccion());
                    ps.setString(3, pto.getNombre());
                    ps.setString(4, pto.getTelefono());
                    ps.setLong(5, pto.getNit());
                    
                if(ps.executeUpdate()>0){
                    y=true;
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la insersion "+ex);
            
        }
        
        return y;
    
    }
        
    public boolean deletepro (ProveedorDTO pto) {
        
        boolean x=false;
        
                try {
            ps=cnn.prepareStatement("DELETE FROM proveedores WHERE nitproveedor=?");
                    ps.setLong(1, pto.getNit());
                    
                if(ps.executeUpdate()>0){
                    x=true;
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la eliminacion: "+ex);
            
        }
        
        return x;
    }
    
    public ProveedorDTO consultaproveedor (ProveedorDTO pto){
        try {
            ps=cnn.prepareStatement("SELECT * FROM clientes WHERE nitproveedor=?");
            ps.setLong(1, pto.getNit());
            rs=ps.executeQuery();
            
            if(rs.next()){
                pros= new ProveedorDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error"+ e);
        }
        
        return pros;
    }
    
    //fin del CRUD de proveedores
    
    
    
    //consulta para el nit proveedor en la tabla de productos
    
    public ArrayList<String> consultanit(){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps=cnn.prepareStatement("Select nitproveedor from proveedores");
            rs=ps.executeQuery();
            
            while(rs.next()){
                lista.add(rs.getString("nitproveedor"));
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return lista;
    }
 
    
    //insertar un producto
    public boolean insertarproducto(productosDTO pto){
            
        boolean dat=false;
        try {
            ps=cnn.prepareStatement("INSERT INTO productos VALUES(?,?,?,?,?,?)");
        ps.setLong(1, pto.getCodigo());
        ps.setDouble(2, pto.getIva());
        ps.setLong(3, pto.getNit());
        ps.setString(4, pto.getNombre());
        ps.setDouble(5, pto.getPrecioc());
        ps.setDouble(6, pto.getPreciov());
        if(ps.executeUpdate()>0){
            dat=true;
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en la insersion "+ex);
        }
        return dat;
    }
    
    public productosDTO consultaproductos( productosDTO pto){
        
        try {
            ps=cnn.prepareStatement("Select * from productos WHERE codigo_producto=?");
            ps.setLong(1, pto.getCodigo());
            rs=ps.executeQuery();
            if(rs.next()){
            prod = new productosDTO(rs.getLong(1), rs.getDouble(2), rs.getLong(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return prod;
    }
    public boolean insertarventa( VentasDTO vent){
    
    boolean sipasa=false;
    
        try {
            ps=cnn.prepareStatement("Insert into ventas VALUES(?,?,?,?,?,?)");
            ps.setLong(1, vent.getCodigot());
            ps.setLong(2, vent.getCedula());
            ps.setLong(3, vent.getCedula());
            ps.setDouble(4, vent.getIva());
            ps.setDouble(5, vent.getValortotal());
            ps.setDouble(6, vent.getValorventa());
            
            if(ps.executeUpdate()>0){
                //primer valor
                try {
                ps=cnn.prepareStatement("Insert into detalle_venta (cantidad_producto,codigo_producto_det,codigo_venta,valor_total,valor_venta, valoriva)"
                        + " VALUES (?,?,?,?,?,?),(?,?,?,?,?,?),(?,?,?,?,?,?)");
                ps.setInt(1, vent.getCantidad1());   
                ps.setLong(2, vent.getCodigo1());
                ps.setLong(3, vent.getCodigot());
                ps.setDouble(4, vent.getValortotal1());
                ps.setDouble(5, vent.getValorventa1());
                ps.setDouble(6, vent.getIva1());
                
                //segundo registro
                
                ps.setInt(7, vent.getCantidad2());   
                ps.setLong(8, vent.getCodigo2());
                ps.setLong(9, vent.getCodigot());
                ps.setDouble(10, vent.getValortotal2());
                ps.setDouble(11, vent.getValorventa2());
                ps.setDouble(12, vent.getIva2());
                
                //tercer registro
                ps.setInt(13, vent.getCantidad3());   
                ps.setLong(14, vent.getCodigo3());
                ps.setLong(15, vent.getCodigot());
                ps.setDouble(16, vent.getValortotal3());
                ps.setDouble(17, vent.getValorventa3());
                ps.setDouble(18, vent.getIva3());
                
                    if(ps.executeUpdate()>0){
                    sipasa=true;
                    JOptionPane.showMessageDialog(null, "Todos los datos han sido insertados correctamente");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    return sipasa;

}
}

//insersion de una venta con sus detalles


