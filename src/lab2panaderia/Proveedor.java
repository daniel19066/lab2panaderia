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
public class Proveedor {
    private String nombre;
    private double deuda;
    private Producto producto;

    public Proveedor(String nombre, double deuda, Producto producto) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
