/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04_pooherenciaextra.Entidades;

/**
 *
 * @author berna
 */
public abstract class Hotelero extends Alojamiento {
    
    protected Float precio;
    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;

    public Hotelero() {
    }

    

    public Hotelero(float precio, Integer habitaciones, Integer camas, Integer pisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.precio = precio;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
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
        return "Hotelero{" + "precio=" + precio + ", habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + super.toString() + '}';
    }
     public void crearHotel(){
         System.out.println("Habitaciones ??");
         habitaciones = sc.nextInt();
         System.out.println("Camas ??");
         camas = sc.nextInt();
         System.out.println("Pisos??? ");
         pisos=sc.nextInt();
     }
    
    
    
    
    
    
    
}
