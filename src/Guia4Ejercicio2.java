
import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima 
los datos de las personas ingresadas por teclado e indique si 
son mayores o menores de edad. Después de cada persona, el programa debe 
preguntarle al usuario si quiere seguir mostrando personas 
y frenar cuando el usuario ingrese la palabra “No”.

 */

public class Guia4Ejercicio2 {

    static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        String seguirMostrando = "Si";
        
        while(seguirMostrando.equalsIgnoreCase("Si")){
             System.out.println("Ingrese su nombre: ");
             String nombre = sc.nextLine();
             System.out.println("Ingrese su edad: ");
             int edad = sc.nextInt();
             sc.nextLine(); //Limpiar el buffer del scanner
             
             if(edad > 18){
                 System.out.println(nombre + " usted es mayor de edad");
                 }else {
                   System.out.println(nombre + " usted es menor de edad");
             }
             System.out.println("Quiere seguir mostrando personas? (SI / NO: )");
             seguirMostrando=sc.nextLine();
        }
    }
    
}
