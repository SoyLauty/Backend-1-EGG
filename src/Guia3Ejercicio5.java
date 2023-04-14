
import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */

public class Guia3Ejercicio5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Ingrese un valor limite positivo:");
        int limite = sc.nextInt();

        int suma = 0;
        int num;

        do {
            System.out.println("Ingrese un numero:");
            num = sc.nextInt();
            suma += num;
        } while (suma < limite);

        System.out.println("La suma de los numeros introducidos es: " + suma);
        
    }
    
}
