package libroJava;

import java.util.Scanner;

/**
 *
 * @author car
 */
public class HolaMundoNombre {
    public static void main(String[] args){
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        //mensaje para el usuario
        System.out.print("Ingrese su nombre: ");//inprime el valor sin salto de linea
        
        //leemos un valor entero por teclado
        String nom= scanner.nextLine();
        
        //mostramos un msj y luego el valor leido
        System.out.println("Hola mundo: " + nom);//imprime el valor con un salto de linea al final
    }
}
