
import java.util.Scanner;

/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

public class Guia2Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String cadena1;
        
        System.out.println("Ingrese una frase");
       cadena1 = leer.next();
       
        System.out.println( cadena1.toLowerCase() );
        System.out.println( cadena1.toUpperCase() );
    }
    
}
