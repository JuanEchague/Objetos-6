
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Main {

    
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in).useDelimiter("\n");
     Cafetera cafetera =new Cafetera();
     cafetera.crearCafetera();
     cafetera.llenarCafetera();
     cafetera.servirTaza(read.nextInt());
     cafetera.vaciarCafetera();
     cafetera.agregarCafe(read.nextInt());
    }
    
}
