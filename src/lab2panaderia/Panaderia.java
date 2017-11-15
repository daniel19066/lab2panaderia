/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2panaderia;

import java.util.*;

/**
 *
 * @author jorge enrique
 */
public class Panaderia {
    private String nombre;
    private int nit;
    private String telefono;
    private String horario;
    private ArrayList<Proveedor> proveedores;
    private Ganancias ganancia_panaderia;
    private ArrayList<Producto> productos;

    public Panaderia(String nombre, int nit,String telefono, String horario) {
        this.nombre = nombre;
        this.nit = nit;
        this.proveedores = new ArrayList<>();
        this.ganancia_panaderia = new Ganancias(0.0 ,0.0);
        this.productos = new ArrayList<>();
        this.telefono=telefono;
        this.horario=horario;
    }
      
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNit() {
        return nit;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public Ganancias getGanancia() {
        return ganancia_panaderia;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
 
    public void setInventario_tienda(Ganancias ganancia_p) {
        this.ganancia_panaderia= ganancia_p;
    }
    
// hasta aqui van los get y set
    public void addProveedor(String nombre, double deuda, Producto producto) {
        Proveedor p=new Proveedor(nombre, deuda, producto);
        this.proveedores.add(p);//añade el proveedor
    }
    
    public void deleteProveedor(String nombre){
        for (int i=0;i<this.proveedores.size();i++){
            if(this.proveedores.get(i).getNombre().equals(nombre)){
                this.proveedores.remove(i);// elimina un proveedor
            }
        }
    }


    public void addProductos(String nombre, double precio, int cantidad) {
        Producto p=new Producto(nombre, precio, cantidad);
        this.productos.add(p);
    }
    
    public void deleteProducto(String nombre){
        for (int i=0; i< this.productos.size();i++){
            if(this.productos.get(i).getNombre().equals(nombre)){
                this.productos.remove(i);
            }
        }
    }
  
    public boolean venta(String nombre, int cantidad){
        boolean ac=false;
        for (int i=0; i<this.productos.size();i++){
            if(this.productos.get(i).getNombre().equals(nombre)){
                this.productos.get(i).setCantidad(this.productos.get(i).getCantidad()-cantidad);
                this.ganancia_panaderia.setIngresos((this.ganancia_panaderia.getIngresos()) + (this.productos.get(i).getPrecio()*cantidad));
                this.productos.get(i).setCantidad_vendida(this.productos.get(i).getCantidad_vendida()+ cantidad);
                ac=true;
                break;
            }
        }
        return ac;//realiza una venta y la quita del inventario y se guardan los ingresos
    }
    public boolean pedidido(String nombre_prov,int cantidad, double cobro){
        boolean ac=false;
        for (int i=0; i<this.proveedores.size();i++){
            if(this.proveedores.get(i).getNombre().equals(nombre)){
                this.proveedores.get(i).setDeuda(this.proveedores.get(i).getDeuda()+ cobro);
                this.ganancia_panaderia.setEgresos(this.ganancia_panaderia.getEgresos()+ cobro);
                this.proveedores.get(i).getProducto().setCantidad(this.proveedores.get(i).getProducto().getCantidad() + cantidad);
                ac=true;
                break;
            }
        }
        return ac;//pide a un proveedor agregando al inventario y a los egresos
    }

        public void mostrar_iventario(){
        ArrayList<Producto> productos1=this.getProductos();
        for(int i=0;i<this.productos.size();i++){
            System.out.println("nombre: " +productos1.get(i).getNombre());
            System.out.println("cantidad: " +productos1.get(i).getCantidad());
            System.out.println("precio: " +productos1.get(i).getPrecio());
            System.out.println("cantidad vendidos:" +productos1.get(i).getCantidad_vendida());
            //muestra todod los productos
        }
    }
        public void ver_ganacia(){
        Ganancias i1=this.getGanancia();
        
        System.out.println("egresos: " +i1.getEgresos());
        System.out.println("ingresos: " +i1.getIngresos());
        System.out.println("ganancia total"+i1.ganancias());
        //muestra la ganancia , egresos, ingresos y el total
    }
        public void cambiar_precio_p(String nombre, double p){
            for(int i=0;i<this.productos.size();i++){
                if(this.productos.get(i).getNombre().equals(nombre)){
                    this.productos.get(i).setPrecio(p);
                }
            }
        }
        public void info_contacto(){
            System.out.println("telefono"+this.telefono);
            System.out.println("horario"+ this.horario);
            //muestra la informacion de contacto
        }

}
