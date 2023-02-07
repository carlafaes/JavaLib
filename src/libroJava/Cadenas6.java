package libroJava;
import java.util.Scanner;
/**Con los metoos starWith y endsWith, podemos
 * verificar muy facilmente si una cadena comienza con un determinado prefijo o termina con algun sufijo.
 *Ejemplo:muestra un valor entero en diferentes bases numericas.
 * @author car
 */
public class Cadenas6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("ingrese un valor entero: ");
        int v=scanner.nextInt();
        
        System.out.println("Valor ingresado: "+ v);
        System.out.println("binario= "+ Integer.toBinaryString(v));
        System.out.println("octal= "+ Integer.toOctalString(v));
        System.out.println("hexadecimal= "+ Integer.toHexString(v));
        
        System.out.print("Ingrese una base numerica: ");
        int b=scanner.nextInt();
        
        String sBaseN= Integer.toString(v,b);
        System.out.println(v + " en base("+b+")=" + sBaseN);
    }
}
