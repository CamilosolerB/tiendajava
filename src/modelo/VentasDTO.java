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
public class VentasDTO {
    private long cedula;
    private String nombre;
    private long codigot;
    private long codigo1;
    private long codigo2;
    private long codigo3;
    private double valortotal;
    private double valorventa;
    private double iva;
    private double valortotal1;
    private double valorventa1;
    private double iva1;
    private double valortotal2;
    private double valorventa2;
    private double iva2;
    private double valortotal3;
    private double valorventa3;
    private double iva3;
    private int cantidad1;
    private int cantidad2;
    private int cantidad3;

    public VentasDTO(long cedula, String nombre, long codigot, long codigo1, long codigo2, long codigo3, double valortotal, double valorventa, double iva, double valortotal1, double valorventa1, double iva1, double valortotal2, double valorventa2, double iva2, double valortotal3, double valorventa3, double iva3, int cantidad1, int cantidad2, int cantidad3) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigot = codigot;
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
        this.codigo3 = codigo3;
        this.valortotal = valortotal;
        this.valorventa = valorventa;
        this.iva = iva;
        this.valortotal1 = valortotal1;
        this.valorventa1 = valorventa1;
        this.iva1 = iva1;
        this.valortotal2 = valortotal2;
        this.valorventa2 = valorventa2;
        this.iva2 = iva2;
        this.valortotal3 = valortotal3;
        this.valorventa3 = valorventa3;
        this.iva3 = iva3;
        this.cantidad1 = cantidad1;
        this.cantidad2 = cantidad2;
        this.cantidad3 = cantidad3;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCodigot() {
        return codigot;
    }

    public void setCodigot(long codigot) {
        this.codigot = codigot;
    }

    public long getCodigo1() {
        return codigo1;
    }

    public void setCodigo1(long codigo1) {
        this.codigo1 = codigo1;
    }

    public long getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(long codigo2) {
        this.codigo2 = codigo2;
    }

    public long getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(long codigo3) {
        this.codigo3 = codigo3;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public double getValorventa() {
        return valorventa;
    }

    public void setValorventa(double valorventa) {
        this.valorventa = valorventa;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getValortotal1() {
        return valortotal1;
    }

    public void setValortotal1(double valortotal1) {
        this.valortotal1 = valortotal1;
    }

    public double getValorventa1() {
        return valorventa1;
    }

    public void setValorventa1(double valorventa1) {
        this.valorventa1 = valorventa1;
    }

    public double getIva1() {
        return iva1;
    }

    public void setIva1(double iva1) {
        this.iva1 = iva1;
    }

    public double getValortotal2() {
        return valortotal2;
    }

    public void setValortotal2(double valortotal2) {
        this.valortotal2 = valortotal2;
    }

    public double getValorventa2() {
        return valorventa2;
    }

    public void setValorventa2(double valorventa2) {
        this.valorventa2 = valorventa2;
    }

    public double getIva2() {
        return iva2;
    }

    public void setIva2(double iva2) {
        this.iva2 = iva2;
    }

    public double getValortotal3() {
        return valortotal3;
    }

    public void setValortotal3(double valortotal3) {
        this.valortotal3 = valortotal3;
    }

    public double getValorventa3() {
        return valorventa3;
    }

    public void setValorventa3(double valorventa3) {
        this.valorventa3 = valorventa3;
    }

    public double getIva3() {
        return iva3;
    }

    public void setIva3(double iva3) {
        this.iva3 = iva3;
    }

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public int getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }



}
