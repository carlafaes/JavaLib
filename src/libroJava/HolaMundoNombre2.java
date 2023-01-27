package libroJava;

import java.util.Scanner;

/**
 *
 * @author car
 */
public class HolaMundoNombre2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //mensaje para el usuario
        System.out.print("Ingrese nombre, edad y altura: ");
        
        //leemos el nombre
        String nombre= scanner.next();
        
        //leemos la edad
        int edad = scanner.nextInt();
        
        //leemos la altura
        double altura= scanner.nextDouble();
        
        //mostramos los datos por consola
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);
    }
}

//Este ejemplo ilustra el uso de datos de diferentes tipos: String, int y double. Tambien muestra que podemos definir variables en cualquier parte del codigo fuente, y por ultimo, muestra como concatenar datos de diferentes tipos para emitir la salida del programa.
