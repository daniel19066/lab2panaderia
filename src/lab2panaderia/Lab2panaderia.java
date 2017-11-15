/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2panaderia;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Lab2panaderia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int y=0;
        while(y!=11){
        Panaderia el_triunfo= new Panaderia("el Triunfo", 0, "12345", "de lunes a viernes de 6 a 8");
        System.out.println("¿que desea hacer?");
        System.out.println("1.agregar producto");
        System.out.println("2.eliminar producto");
        System.out.println("3. realizar una venta");
        System.out.println("4. realizar un pedido");
        System.out.println("5. agregar un proveedor");
        System.out.println("6.eliminar un proveedor");
        System.out.println("7. ver ganancias");
        System.out.println("8. cambiar de precio un producto");
        System.out.println("9. mostrar inventario");
        System.out.println("10. mostrar informacion de contacto");
        System.out.println("11. salir del programa");
        y=x.nextInt();
        switch(y){
            case 1:
                String ll;
                double m;
                int a;
                System.out.println("ingrese el nombre:");
                ll=x.next();
                System.out.println("ingrese el precio:");
                m=x.nextDouble();
                System.out.println("ingrese el cantidad comprada:");
                a=x.nextInt();
                el_triunfo.addProductos(ll, m, a);
                break;
            case 2:
                String l;
                System.out.println("ingrese el nombre:");
                l=x.next();
                el_triunfo.deleteProveedor(l);
                break;
            case 3:
                String po;
                int n;
                System.out.println("ingrese el nombre:");
                po=x.next();
                System.out.println("ingrese la cantidad vendida:");
                n=x.nextInt();
                el_triunfo.venta(po, n);
                
                break;
            case 4:
                String np;
                int c;
                double pr;
                System.out.println("ingrese el nombre del proveedor:");
                np=x.next();
                System.out.println("ingrese la cantidad comprada:");
                c=x.nextInt();
                System.out.println("ingrese el costo:");
                pr=x.nextDouble();
                el_triunfo.pedidido(np, c, pr);
                
                break;
            case 5:
                String nom;
                double deuda;
                String nomp;
                System.out.println("ingrese el nombre del proveedor:");
                nom=x.next();
                System.out.println("ingrese la deuda:");
                deuda=x.nextInt();
                System.out.println("ingrese el nombre del producto:");
                nomp=x.next();
                double mm;
                int aa;
                System.out.println("ingrese el precio:");
                mm=x.nextDouble();
                System.out.println("ingrese el cantidad comprada:");
                aa=x.nextInt();
                Producto lol=new Producto(nomp, mm, aa);
                el_triunfo.addProveedor(nomp, deuda, lol);
                
                break;
            case 6:
                String npr;
                System.out.println("ingrese el nombre del proveedor:");                
                npr=x.next();
                el_triunfo.deleteProveedor(npr);
                
                break;
            case 7:
                el_triunfo.ver_ganacia();
                
                break;
            case 8:
                double n_pre;
                String prod;
                System.out.println("ingrese el nuevo precio del producto:"); 
                n_pre=x.nextDouble();
                System.out.println("ingrese el nombre del producto:");
                prod=x.next();
                el_triunfo.cambiar_precio_p(prod,n_pre);
                
                break;
            case 9:
                el_triunfo.mostrar_iventario();
                
                break;
            case 10:
                el_triunfo.info_contacto();
                break;
            case 11:
                x.close();
                break;
        }       
        }
        
    }
    
}
