/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará 
dónde se encuentra el numero y si se encuentra repetido
 */

import java.util.Scanner;

public class Guia5Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la dimension del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100); // Generar número aleatorio entre 0 y 99
        }
        
        System.out.println("El vector generado es:");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        
        System.out.print("Ingrese un numero a buscar en el vector: ");
        int numero = sc.nextInt();
        
        boolean encontrado = false;
        int indice = -1;
        int repeticiones = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                if (!encontrado) {
                    encontrado = true;
                    indice = i;
                }
                repeticiones++;
            }
        }
        
        if (encontrado) {
            System.out.println("El numero " + numero + " se encuentra en la posicion " + indice + " del vector.");
            if (repeticiones > 1) {
                System.out.println("El numero " + numero + " se repite " + repeticiones + " veces en el vector.");
            } else {
                System.out.println("El numero " + numero + " no se repite en el vector.");
            }
        } else {
            System.out.println("El numero " + numero + " no se encuentra en el vector.");
        }
    }
}
