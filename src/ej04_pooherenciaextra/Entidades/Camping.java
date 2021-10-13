/*
capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones
 */
package ej04_pooherenciaextra.Entidades;

import java.util.Scanner;

 
public class Camping extends ExtraHotelero {
    
    protected Integer carpas;
    protected Integer baños;
    protected boolean restoCamping;

    public Camping() {
    }

    public Camping(Integer carpas, Integer baños, boolean restoCamping, boolean privado, float metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.carpas = carpas;
        this.baños = baños;
        this.restoCamping = restoCamping;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getBaños() {
        return baños;
    }

    public void setBaños(Integer baños) {
        this.baños = baños;
    }

    public boolean isRestoCamping() {
        return restoCamping;
    }

    public void setRestoCamping(boolean restoCamping) {
        this.restoCamping = restoCamping;
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
        return "Camping{" + "carpas=" + carpas + ", ba\u00f1os=" + baños + ", restoCamping=" + restoCamping + super.toString()+ '}';
    }
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Camping CrearCamping(){
        super.crearAlojamiento();
        super.crearExtraHotelero();
        
        String op;
        privado=false;
        restoCamping=false;
        System.out.println("Cuantas carpas");
        carpas = sc.nextInt();
        System.out.println("baños??");
        baños=sc.nextInt();
        do {
        System.out.println("Tiene resto?? SI/NO");
        op = sc.next();
        if (op.equalsIgnoreCase("si")){
         restoCamping=true;   
        }
        if((!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("no"))){
            System.out.println("Digite SI o NO");
        } 
            
        }while (!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("no"));
        
        return new Camping(carpas, baños, restoCamping, privado, metrosCuadrados);
    
    }
    
}
    
    

