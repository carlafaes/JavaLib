package libroJava;

import java.util.Scanner;

/**
 * En el siguiente ejemplo utilizamos un If para determinar si el valor (edad) ingresado por el uaurio es mayor o igual que 21.
 *
 * @author car
 */
public class EsMayorQue21 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad= scanner.nextInt();
        
        if(edad >= 21){
            System.out.println("Ud. es mayor de edad.");
        }
        else{
            System.out.println("Ud.es menor de edad");
        }
  }
}
