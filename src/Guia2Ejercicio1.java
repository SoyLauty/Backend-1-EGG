/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */

import java.util.Scanner;

public class Guia2Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros para calcular su suma");
        
           int num1 = leer.nextInt();
           int num2 = leer.nextInt();
           
           System.out.println(num1 + num2);
       
        }
    
}