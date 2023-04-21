
import java.util.Scanner;

/*
 Crea una aplicación que nos pida un número por teclado y con una función se 
lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
sin embargo, 17 si es primo.
 */

public class Guia4Ejercicio4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero positivo: ");
        int num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es un numero primo.");
        } else {
            System.out.println(num + " no es un numero primo.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
