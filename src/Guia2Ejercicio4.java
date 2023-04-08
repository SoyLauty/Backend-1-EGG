
import java.util.Scanner;

/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Guia2Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de grados Centigrados");
        
        int centigrados = sc.nextInt();
        
        int F = 32 + (9 * centigrados / 5);
        
        System.out.println("Sus grados en Fahrenheit son: " + F);
    }
    
}
