/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2panaderia;

/**
 *
 * @author jorge enrique
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private int cantidad_vendida;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cantidad_vendida=0;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
