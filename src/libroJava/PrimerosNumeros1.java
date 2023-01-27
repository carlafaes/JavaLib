package libroJava;

import java.util.Scanner;

/**
 *El siguiente programa utiliza un while para mostrar los primeros n numeros naturales. El usuario ingresa el valor n por teclado.
 * 
 * @author car
 */
public class PrimerosNumeros1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //leo el valor de n
        int n=scanner.nextInt();
        int i=1;
        while(i<=n){
            //muestro el valor de i
            System.out.println(i);
            //incremento el valor de i
            i++;
        }
    }
}
/**
*Vemos que el ciclo while itera mientras que el valor i sea menor o
* igual que el valor de n(que fue ingresado por el teclado). 
* Por cada iteracion mostramos el valor de la variable i y luego la incrementacion.
**/