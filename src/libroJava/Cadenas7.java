package libroJava;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *Utilizando la clase StringTokenizer podemos separar una cadena en tokens delimitados por un separador.En el siguiente ejemplo,veremos como hacerlo.
 * @author car
 */
public class Cadenas7 {
    public static void main(String[] args){
        String s="Juan|Marcos|Carlos|Matias";
        StringTokenizer st=new StringTokenizer(s,"|");
        
        String tok;
        while(st.hasMoreTokens()){
            tok=st.nextToken();
            System.out.println(tok);
        }
    }
}
/**
*Primero,instanciamos el objeto st pasandole como argumentos la cadena s y una cadena "|" que sera considerada como separador.Luego,el objeto st(objeto de la clase StringTokeizer)
*provee los metodos hasMoreTokens y nextToken que permiten(respectivamente) controlar si existen mas tokens en la cadena y avanzar
* al siguiente token.
* Notemos que el recorrido a traves de los tokens de la cadena es forward only.Es decir,solo se pueden recorrer desde el primero hasta el utlimo (de izquierda a derecha ).
* No se puede tener acceso directo a un token en particular, ni tampoco se puede retroceder para recuperar el token anterior.
**/
