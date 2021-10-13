 
package ej04_pooherenciaextra.Entidades; 
 
import java.util.Scanner;

public abstract class Alojamiento  {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
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
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    public void crearAlojamiento(){
        System.out.println("Nombre ?");
        nombre=sc.next();
        System.out.println("Localidad??");
        localidad=sc.next();
        System.out.println("Gerente?? ");
        gerente=sc.next();
        System.out.println("Direccion ??");
        direccion=sc.next();
    }
    
    
    
}
