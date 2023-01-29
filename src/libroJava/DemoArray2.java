package libroJava;
import java.util.Scanner;
/**
 *Muestra dia de la semana (utilizando un array).
 * @author car
 */
public class DemoArray2 {
    public static void main(String[] args){
    String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    Scanner scanner =new Scanner(System.in);
    
    System.out.print("Ingrese un dia de la semana(numero): ");
    int v=scanner.nextInt();
    
    if(v <= dias.length){
        //recordemos que los arrays se numeran desde cero
        System.out.println(dias[v-1]);
    }
    else{
        System.out.println("Dia incorrecto.");
    }
    }
}
