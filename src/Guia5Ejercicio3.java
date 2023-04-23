/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

import java.util.Scanner;

public class Guia5Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la dimension del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }
        
        int[] digitos = new int[6]; // Índice 0 es para números de 0 dígitos
        for (int i = 0; i < n; i++) {
            int cantidadDigitos = contarDigitos(vector[i]);
            digitos[cantidadDigitos]++;
        }
        
        System.out.println("Cantidad de numeros por cantidad de digitos:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " digito(s): " + digitos[i]);
        }
    }
    
    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return 1 + contarDigitos(numero / 10);
    }
}
