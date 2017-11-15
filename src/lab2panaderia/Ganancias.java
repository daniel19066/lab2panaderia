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
public class Ganancias {
    private double ingresos;
    private double egresos;

    public Ganancias(double ingresos, double egresos) {
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }
    
    public double ganancias(){
        return ingresos-egresos;
    }
}
