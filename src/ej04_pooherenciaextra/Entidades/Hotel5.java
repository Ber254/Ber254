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
public final class Hotel5 extends Hotel4 {
    
    private Integer salonesConferencia;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;

    public Hotel5() {
    }

    public Hotel5(Integer salonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas, String Gimnasio, String nombreRestaurante, Integer capacidadRestaurante, float precio, Integer habitaciones, Integer camas, Integer pisos, String nombre, String direccion, String localidad, String gerente) {
        super(Gimnasio, nombreRestaurante, capacidadRestaurante, precio, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.salonesConferencia = salonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Integer getSalonesConferencia() {
        return salonesConferencia;
    }

    public void setSalonesConferencia(Integer salonesConferencia) {
        this.salonesConferencia = salonesConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
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
        return "Hotel5{" + "salonesConferencia=" + salonesConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + super.toString()+ '}';
    }

    public Hotel5 CrearHotel(){
        
        Gimnasio="";
        super.crearAlojamiento();
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
         
        System.out.println("Cuantos salones posee?");
        salonesConferencia=sc.nextInt();
        System.out.println("Cuantas Suits posee??");
        cantidadSuites=sc.nextInt();
        System.out.println("Cuantas limusinas pose??? ");
        cantidadLimosinas=sc.nextInt();
        precio = CalcularPrecio();
        return new Hotel5(salonesConferencia, cantidadSuites, cantidadLimosinas, Gimnasio, nombreRestaurante, capacidadRestaurante, precio, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
    }

    @Override
    public float CalcularPrecio() {
        super.CalcularPrecio(); //To change body of generated methods, choose Tools | Templates.
        
        precio += cantidadLimosinas*15;
        return precio;
    }
    
    
    
    
}
