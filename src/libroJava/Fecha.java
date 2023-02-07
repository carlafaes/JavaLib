package libroJava;

/**
 *Los metodos de una clase se escriben como funciones.Dentro de los metodos,podemos acceder a los atributos de la clase
 * como si fueran variables globales.
 * A continuacion agregaremos a la clase Fecha metodos para asignar (set y para obtener(get) el valor de sus atributos. 
 * A estos metodos se los suele denominar setters y getters respectivamente.
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public int getDia(){
        //retorna el valor de la variable dia
        return dia;
    }
    public void setDia(int dia){
        //asigna el valor del parametro a la variabnle dia
        this.dia=dia;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año=año;
    }
}
