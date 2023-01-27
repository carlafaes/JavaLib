package libroJava;
import java.util.Scanner;
/**
 *Este ciclo tambien itera mientras se verifique la condicion,pero a diferencia del ciclo anterior
 * en este caso la entrada al ciclo no esta condicionada; por lo tanto, las acciones encerradas entre el do y el while se ejecutaran al menos una vez.
 * Ejemplo:muestra numeros naturales (utilizando do-while)
 * @author car
 */
public class PrimerosNumeros2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}
