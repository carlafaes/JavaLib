/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroJava;
import java.util.Scanner;
/**
 * Las constantes se definen fuera de los metodos utilizando el modificador final.
 * Habitualmente se las define como publicas y estaticas(public,static). Mas adelante, explicaremos el significado de public, static y "metodo".
 *Muestra dia de la semana utilizando constantes
 * @author car
 */
public class DemoConstantes {
    //definimos las constantes
    public static final int LUNES=1;
    public static final int MARTES=2;
    public static final int MIERCOLES=3;
    public static final int JUEVES=4;
    public static final int VIERNES=5;
    public static final int SABADO=6;
    public static final int DOMINGO=7;
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana(numero: )");
        int v=scanner.nextInt();
        
        String dia;
        switch(v){
            case LUNES:
                dia="Lunes";
                break;
            case MARTES:
                dia="Martes";
                break;
            case MIERCOLES:
                dia="Miercoles";
                break;
            case JUEVES:
                dia="Jueves";
                break;
            case VIERNES:
                dia="Viernes";
                break;
            case SABADO:
                dia="Sabado";
                break;
            case DOMINGO:
                dia="Domingo";
                break;
            default:
                dia="Dia Incorrecto...Ingrese un valor entre 1 y 7.";
        }
        System.out.println(dia);
    }
}
