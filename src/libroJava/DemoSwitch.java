package libroJava;

import java.util.Scanner;

/**
 *
 * En el siguiente programa, pedimos al usuario que ingrese un dia de la semana (entre 1 y 7) y mostramos el nombre del dia. Si ingresa cualquier 
 * otro valor informamos que el dato ingresado es incorrecto.
 * @author car
 */
public class DemoSwitch {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana(numero): ");
        int v =scanner.nextInt();
        String dia;
        switch(v){
            case 1:
                dia="lunes";
                break;
            case 2:
                dia="martes";
                break;
            case 3:
                dia="miercoles";
                break;
            case 4:
                dia="jueves";
                break;
            case 5:
                dia="viernes";
                break;
            case 6:
                dia="sabado";
                break;
            case 7:
                dia="domingo";
                break;
            default:
                dia="Dia incorrecto..el valor debe ser entre 1 y 7.";
        }
        System.out.println(dia);
    }
}
