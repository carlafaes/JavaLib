package libroJava;

import java.util.Scanner;

/**
 * El siguiente programa pide al usuario que ingrese un valor entero e indica si el valor ingresado es par o impar.
 * Recordemos que un numero es par si es divisible por 2. Es decir que el resto en dicha division debe ser cero. Para esto, utilizaremos el operador %
 * (operador modulo, retorna el residuo o resto de la division).
 *
 * @author car
 */
public class ParOImpar {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int v= scanner.nextInt();
        
        //obtenemos el resto de dividir v por 2
        int resto=v%2;
        //para preguntar por utilizamos ==
        if(resto ==0){
            System.out.println(v + " es par.");
        }
        else{
            System.out.println(v + " es impar");
        }
    }
}

//Para resolver este problema,primero obtenemos el resto que se origina al dividir v por 2. Luego preguntamos si este resto es igual a cero. Notemos que el operador para comparar es == (igual igual). Java utiliza == como operador de comparacion ya que el operador = se utiliza para asignacion.
// el If in-line tiene la siguiente estructura:
//condicion? retornoPorTrue : retornoPorFalse;
/*
*Lo anterior debe leerse de la siguiente manera: si se verifica la condicion entonces se retorna la expresion ubicada entre el ? (signo de interrogacion ) y los : (dos puntos). Si la condicion resulta falsa entonces se retorna la expresion ubicada despues de los : (dos puntos).
*/