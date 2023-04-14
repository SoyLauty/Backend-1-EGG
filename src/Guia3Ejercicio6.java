import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

public class Guia3Ejercicio6 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       int opcion = 0;
  
        do{
        System.out.println("Bienvenido al Menu Principal.");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        
        System.out.println("Elija una opcion para continuar.");
        opcion = sc.nextInt();
        
        switch(opcion){
           case 1:
               suma();
               break;
           case 2:
               resta();
               break;
           case 3:
               multiplicacion();
               break;   
           case 4:
               division();
               break;
           case 5:
               break;
           default:
               System.out.println("Opcion Invalida");
        }   
        
        }while(opcion != 5);
        
        System.out.println("El programa finalizo.");
    }
    
    static void suma(){
         System.out.println("OPERACION DE SUMA");
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);
    }
    
    static void resta(){
        System.out.println("OPERACION DE resta");
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 - num2;
        System.out.println("El resultado es " + resultado);
    }
    
    static void multiplicacion(){
        System.out.println("OPERACION DE MULTIPLICACION");
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 * num2;
        System.out.println("El resultado es " + resultado);
    }
    
    static void division(){
        System.out.println("OPERACION DE DIVISION");
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 / num2;
        System.out.println("El resultado es " + resultado);
    }
}    