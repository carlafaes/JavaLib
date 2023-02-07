package libroJava;

/**
 *La  clase String provee el metodo split que permite particionar una  cadena a partir de una expresion regular.
 * @author car
 */
public class Cadenas7a {
    public static void main(String[] args){
        String s="Juan|Marcos|Carlos|Maria";
        String[] tokens=s.split("[|]");
        
        for(int i=0; i<tokens.length;i++){
            System.out.println(tokens[i]);
        }
    }
}
