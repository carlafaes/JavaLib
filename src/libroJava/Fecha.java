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
    
    public Fecha(String s){
        //busco la primera ocurrencia de "/"
        int pos1=s.indexOf("/");
        //busco la ultima ocurrencia de "/"
        int pos2=s.lastIndexOf("/");
        //proceso el dia
        String sDia=s.substring(0,pos1);
        //proceso el mes 
        String sMes=s.substring(pos1+1,pos2);
        mes=Integer.parseInt(sMes);
        //proceso el año
        String sAño=s.substring(pos2+1);
        año=Integer.parseInt(sAño);
    }

    Fecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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
    private int fechaToDias(){
        return año*360+mes*30+dia;
    }
    //asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int i){
        //dividimos por 360 y obtenemos el año
        año=(int)i/360;
        //del resto de la division anterior podremos obtener el mes y el dia
        int resto=i%360;
        //el mes es el resto dividido 30
        mes=(int) resto/30;
        //el resto de la division anterior son los dias
        dia=resto%30;
        //ajuste por si dia quedo en cero
        if(dia==0){
            dia=30;
            mes--;
        }
        //ajuste por si el mes quedo en cero
        if(mes==0){
            mes=12;
            año--;
        }
    }
    public void addDias(int d){
        //convierto la fecha a dias y le sumo d
        int sum=fechaToDias()+d;
        
        //la fecha resultante (sum) la separo en dia,mes y año
        diasToFecha(sum);
    }
}
