
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Cafetera {
    ///////////////////////Atributes///////////////////////////////////////
    private double capacidadMaxima;
    private double cantidadActual;
    /////////////////////////Builders/////////////////////////////////////

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }
    /////////////////////////////Getters and Setters//////////////////////

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    ///////////////////////Methods/////////////////////////////////////
    public void crearCafetera(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la capacidad maxima de su cafetera: ");
        this.capacidadMaxima= read.nextDouble();
        this.cantidadActual = 0;
    }
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    public void servirTaza(int tamanio){
        if (this.cantidadActual<tamanio) {
            System.out.println("No hay suficiente cafe.");            
        }else{
        this.cantidadActual -= tamanio;     
        }
    }
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    public void agregarCafe(int cantidad){
        if (this.cantidadActual+ cantidad > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;            
        }else{
            this.cantidadActual += cantidad;
        }
    }
}
