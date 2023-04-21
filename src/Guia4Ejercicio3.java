
import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes 
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda 
a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
1 * 0.86 libras es un 1 €
2 * 1.28611 $ es un 1 €
3 * 129.852 yenes es un 1 €

 */

public class Guia4Ejercicio3 {
    
  public static void convertir(int euros, String moneda){
      double resultado = 0.0;
        String mensaje = "";
        switch (moneda){
            case "dolares":
              resultado = euros * 1.28611;  
              mensaje = euros + " euros equivalen a " + resultado + "dolares";
              break;
        
            case "libras":
              resultado = euros * 0.86;  
              mensaje = euros + " euros equivalen a " + resultado + "libras";
              break;
        
            case "yenes":
              resultado = euros * 129.852;  
              mensaje = euros + " euros equivalen a " + resultado + "yenes";
              break;
            default:
                mensaje = "La opcion que ingreso es invalida";
        }
        
        System.out.println(mensaje);
     
        
  }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Introduce una cantidad de euros: ");
        double euros = sc.nextInt();
        
        System.out.print("Introduce la moneda a la que quieres convertir (dolares, yenes o libras): ");
        String moneda = sc.next().toLowerCase();
        
        convertir((int) euros, moneda);
        
        sc.close();
        
    }
   
    
}
