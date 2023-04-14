
import java.util.Scanner;

/*
 Crear un programa que dado un número determine si es par o impar.
 */

public class Guia3Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
              int num1 = sc.nextInt();
              
        if (num1 % 2 == 0) {
            System.out.println("Su numero es Par");
        } else {
            System.out.println("Su numero es Impar");
        }    
    
    
    }    
    
    
}
