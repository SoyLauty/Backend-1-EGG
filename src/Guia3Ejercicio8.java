
import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:

* * * *
*     *
*     *
* * * *

 */

public class Guia3Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero del cuadrado:");
        int lados = sc.nextInt();
        
        for(int i = 0; i < lados; i++){
            //Linea Superior
            System.out.print("*");   
        }
        System.out.println();
        //centro de la forma
            for(int i = 0; i < lados-2; i++) {
                System.out.print("*");
                for(int j = 0; j < lados-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        //Linea inferior
            for(int i = 0; i < lados; i++) {
                System.out.print("*");
            }
        }    
    }
    

