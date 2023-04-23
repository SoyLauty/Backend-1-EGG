/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 
9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */

import java.util.Scanner;

public class Guia5Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la matriz
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese los valores de la matriz (del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
                
                // Comprobar que el valor ingresado está entre 1 y 9
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Error: el valor ingresado debe estar entre 1 y 9");
                    j--;
                }
            }
        }

        // Mostrar la matriz ingresada
        System.out.println("Matriz ingresada:");
        mostrarMatriz(matriz);

        // Comprobar si es un cuadrado mágico
        int suma = 0;
        boolean esMagico = true;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (i == 0) {
                suma = sumaFila;
            } else if (sumaFila != suma || sumaColumna != suma) {
                esMagico = false;
                break;
            }
        }
        if (esMagico && (matriz[0][0] + matriz[1][1] + matriz[2][2] == suma) && (matriz[0][2] + matriz[1][1] + matriz[2][0] == suma)) {
            System.out.println("Es un cuadrado mágico");
        } else {
            System.out.println("No es un cuadrado mágico");
        }
        
        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}