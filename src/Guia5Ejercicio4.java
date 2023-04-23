/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz. La matriz traspuesta de una 
matriz A se denota por B y se obtiene cambiando sus filas por 
columnas (o viceversa).
 */

import java.util.Random;

public class Guia5Ejercicio4 {
    public static void main(String[] args) {
        // Crear una matriz de 4x4 con valores aleatorios
        int[][] matriz = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // Generar un número aleatorio del 0 al 9
            }
        }
        
        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Calcular la matriz traspuesta
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j]; // Cambiar fila por columna
            }
        }
        
        // Mostrar la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}