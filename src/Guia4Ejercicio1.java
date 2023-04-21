
import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados 
para imprimirlos en el main.
 */

public class Guia4Ejercicio1 {
    
static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        
        System.out.println("Ingrese el primer numero entero: ");
              int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
              int num2 = sc.nextInt();
        
        System.out.println("Bienvenido al Menu Principal.");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        
        System.out.println("Elija una opcion para continuar.");
        int opcion = sc.nextInt();
              
        
        switch(opcion){
           case 1:
               System.out.println("El resultado de su operacion es: " + suma(num1, num2));
               break;
           case 2:
               System.out.println("El resultado de su operacion es: " + resta(num1, num2));
               break;
           case 3:
               System.out.println("El resultado de su operacion es: " + multiplicacion(num1, num2));
               break;   
           case 4:
               System.out.println("El resultado de su operacion es: " + division(num1, num2));
               break;
           case 5:
               break;
           default:
               System.out.println("Opcion Invalida");
        }   
              
        
    }
    
    public static int suma(int a, int b){
        int resultado = a + b;
        
        return resultado;
    }
    
    public static int resta(int a, int b){
        int resultado = a - b;
        
        return resultado;
    }
    
    public static int multiplicacion(int a, int b){
        int resultado = a * b;
        
        return resultado;
    }
    
    public static int division(int a, int b){
        int resultado = a / b;
        
        return resultado;
    }
    
}
