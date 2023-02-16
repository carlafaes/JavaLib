package libroJava;

/**
 *
 * @author car
 */
public class TestFecha {
    public static void main(String[] main){
        Fecha f=new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAño(1970);
        
        //imrpimo el dia
        System.out.println("Dia= "+f.getDia());
        
        //imprimo el mes
        System.out.println("Mes="+f.getMes());
        
        //imprimo el año
        System.out.println("Año="+f.getAño());
        
      
}
}
