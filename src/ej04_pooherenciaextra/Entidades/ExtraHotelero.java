/*
 privado o no, así como la cantidad de metros cuadrados que ocupa
 */
package ej04_pooherenciaextra.Entidades;
 
import java.util.Scanner;

public abstract class ExtraHotelero extends Alojamiento {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    protected boolean privado;
    protected float metrosCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, float metrosCuadrados) {
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
    public void crearExtraHotelero(){
        String op="";
        privado=false;
        do{
            System.out.println("Es privado SI / NO ??");
            op = sc.next();
            if ( op.equalsIgnoreCase("si")){
                privado=true;
            if((!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("no"))){
            System.out.println(" SI o NO ????");
        }           
        }
        }    while (!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("NO"));
        System.out.println("Metros cuadrados ??? ");
        metrosCuadrados = sc.nextInt();
   }
    
}
