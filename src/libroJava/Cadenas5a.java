package libroJava;

/**
 * La clase StringBuffer
 * Esta clase representa a un string cuyo contenido puede variar(mutable). Provee metodos a traves de los cuales podemos 
 * insertar nuevos caracteres,eliminar algunos o todos y cambiar los caracteres contenidos en las diferentes posiciones del string.
 * El compilador utiliza un string buffer para resolver la implementacion del operador de concatenacion +. 
 * La diferencia de rendimiento entre urilizar el operador + y la clase StringBuffer 
 * para concatenar cadenas es abismal y a continuacion lo demostraremos.
 *
 * El siguiente programa utiliza un StringBuffer para concatenar n caracteres sobre un string inicialmente vacio. Al finalizar,
 * muestra la cadena resultante y el tiempo que insumio todo el proceso.
 * @author car
 */
public class Cadenas5a {
    public static void main(String[] args){
        //obtengo el milisegundo actual
        long hi= System.currentTimeMillis();
        //instancio un StringBuffer inicialmente vacio
        StringBuffer sb=new StringBuffer();
        //voy a concatenar n caracteres
        int n=100000;
        char c;
        for(int i=0; i<n; i++){
            //obtengo caracteres entre ‘A‘ y ‘Z‘
            c=(char)('A'  + i%('Z' - 'A'  +1));
            //concateno el caracter en el StringBuffer
            sb.append(c);
        }
        //obtengo el milisegundo actual
        long hf=System.currentTimeMillis();
        //muestro la cadena resultante
        System.out.println(sb.toString());
        //muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi) + "milisegundos");
    }
}
