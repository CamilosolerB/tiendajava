/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PC
 */
public class productosDTO {
    private long codigo;
    private String nombre;
    private long nit;
    private double precioc;
    private double iva;
    private double preciov;

    
    public productosDTO(long codigo){
        this.codigo = codigo;
    }

    public productosDTO(long codigo,double iva , long nit, String nombre,double precioc, double preciov) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nit = nit;
        this.precioc = precioc;
        this.iva = iva;
        this.preciov = preciov;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public double getPrecioc() {
        return precioc;
    }

    public void setPrecioc(double precioc) {
        this.precioc = precioc;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPreciov() {
        return preciov;
    }

    public void setPreciov(double preciov) {
        this.preciov = preciov;
    }
}
