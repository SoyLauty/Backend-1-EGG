
import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple 
y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
public class Guia2Ejercicio5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       
        System.out.println("Ingrese un numero entero");
                  int num1 = sc.nextInt();
                  
                  int x2 = num1 * num1;
                  int x3 = num1 * num1 * num1;
                  double div = Math.sqrt(num1);
                  
           System.out.println("El doble de su numero es: " + x2);
           System.out.println("El triple de su numero es: " + x3);
           System.out.println("La raiz cuadrada de su numero es: " + div);
    }
    
}