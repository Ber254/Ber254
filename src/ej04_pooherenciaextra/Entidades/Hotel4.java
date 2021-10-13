/*
 Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones
 */
package ej04_pooherenciaextra.Entidades;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Hotel4 extends Hotelero implements CalculoPrecio {
   
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    protected String Gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

     

    public Hotel4(String Gimnasio, String nombreRestaurante, Integer capacidadRestaurante, float precio, Integer habitaciones, Integer camas, Integer pisos, String nombre, String direccion, String localidad, String gerente) {
        super(precio, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.Gimnasio = Gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4() {
    }

    public String getGimnasio() {
        return Gimnasio;
    }

    public void setGimnasio(String Gimnasio) {
        this.Gimnasio = Gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "Gimnasio=" + Gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + super.toString() + '}';
    }
    
    public Hotel4 CrearHotel(){
        
        String op;
        Gimnasio="";
        super.crearAlojamiento();
//        System.out.println("Cuantas habitaciones");
//        habitaciones = sc.nextInt();
//        System.out.println("Camas ??");
//        camas=sc.nextInt();
//        System.out.println("Pisos");
//        pisos = sc.nextInt();
//        System.out.println("NOmbre''");
//        nombre = sc.next();
//        System.out.println("Direccion");
//        direccion=sc.next();
//        System.out.println("Localidad ??");
//        localidad=sc.next();
//        System.out.println("Gerente??");
//        gerente=sc.next();
        super.crearHotel();
        System.out.println("Nombre de restaurante??");
        nombreRestaurante=sc.next();
        System.out.println("Capacidad Restaurante??? ");
        capacidadRestaurante=sc.nextInt();
        do {
        System.out.println("Que tipo de gimnasio tiene A / B");
        Gimnasio = sc.next();
         
        if((!Gimnasio.equalsIgnoreCase("a")&&!Gimnasio.equalsIgnoreCase("b"))){
            System.out.println("Digite A o B");
        }           
        }while (!Gimnasio.equalsIgnoreCase("A")&&!Gimnasio.equalsIgnoreCase("B"));
        precio = CalcularPrecio();
        return new Hotel4(Gimnasio, nombreRestaurante, capacidadRestaurante, precio, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
    }
    
    
    
    

    @Override
    public float CalcularPrecio() {
        
        
        float valorAgregadoGimnasio=0;
        float valorAgregadoResto = 0;
        if(capacidadRestaurante<30){
            valorAgregadoResto+=10;
        }
        if (capacidadRestaurante>=30&&capacidadRestaurante<50){
         valorAgregadoResto+=30;   
        }
        if (capacidadRestaurante>=50){
            valorAgregadoResto+=50;
        }
        
        if (Gimnasio=="a"){
            valorAgregadoGimnasio=50;
        }
        if (Gimnasio=="a"){
            valorAgregadoGimnasio=30;
        }
         precio = 50+(camas)+(valorAgregadoResto)+valorAgregadoGimnasio;
        
        
        return precio;
    }
    
}
