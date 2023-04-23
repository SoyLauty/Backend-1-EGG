/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).
 */

import java.util.Scanner;

public class Guia5Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la matriz
        int n = 0;
        while (n <= 0) {
            System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Error: el tamaño de la matriz debe ser mayor que cero");
            }
        }
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Comprobar si la matriz es antisimétrica
        boolean esAntisimetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) { // Comprobar si A[i][j] = -A[j][i]
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
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
