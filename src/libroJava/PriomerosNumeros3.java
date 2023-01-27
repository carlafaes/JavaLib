package libroJava;
import java.util.Scanner;
/**
 *Este ciclo tiene tres secciones separadas por ;. En la primera seccion, se define e inicializa una variable entera que llamaremos
 * varaible de control. En la segunda seccion, se especifica una condicion logica que(frecuentemente) estara en funcion de esta variable. En la tercera seccion, se definde el incremento 
 * de la variable de control.
 * Ejemplo: muestra numeros naturales utilizando for
 * @author car
 */
public class PriomerosNumeros3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i <=n; i++){
            System.out.println(i);
        }
    }
}
