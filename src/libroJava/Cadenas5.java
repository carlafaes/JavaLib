package libroJava;

/**
 *Los metodos indexOf y lastIndexOf estan sobrecargados de forma tal que permiten detectar la primera
 * y la ultima ocurrencia (respectivamente) de un substring dentro de la cadena en cuestion.
 * @author car
 */
public class Cadenas5 {
    public static void main(String[] args){
        String s= "Un buen libro de Java, un buen material";
        int pos1= s.indexOf("buen");
        int pos2=s.lastIndexOf("buen");
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
