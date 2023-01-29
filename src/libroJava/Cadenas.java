package libroJava;

/**
 * Acceso a los caracteres de un String
 * Una cadena representa un secuencia finita de cero o mas caracteres numerados a partir
 * de cero. Es decir que la cadena "Hola" tiene 4 caracteres numerados entre 0 y 3.
 * Ejemplo: Acceso directo a los caracteres de una cadena.
 *
 * @author car
 */
public class Cadenas {
    public static void main(String[] args){
        String s= "Esta es mi condena";
        
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(s.length()-1) );
        
        char c;
        for(int i=0; i<s.length(); i++){
            c=s.charAt(i);
            System.out.println(i+"->"+c);
        }
    }
}

/*
*El metodo charAt retorna al caracter (tipo char) ubicado en una posiicion determinada. El metodo length 
*retorna la cantidad de caracteres que tiene la cadena.
*/
