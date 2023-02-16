package libroJava;
/**La clase Fecha nos es util,funciona bien y es practica. Sin embargo, queremos modificar la forma en la que una fecha
 * se representa a si misma cuando le invocamos el metodo toString.
 * La solucion sera crear una nueva clase que herede de Fecha y que modifique la manera en la que esta se representa como cadena.
 * Esto lo podremos hacer sobrescribiendo el metodo toString. Llamaremos a la nueva clase FechaDetallada y haremos 
 * que se represente asi:"25 de Octubre de 2009".
 *
 * 
 */
public class FechaDetallada extends Fecha{
   
    private static String meses[]={"Enero","Febrero","Marzo","Abril",
        "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    public FechaDetallada(String f) {
        super(f);
    }
    
    public String toString(){
    return getDia()+" de "+meses[getMes()-1]+" de "+getAño();
    }
}
