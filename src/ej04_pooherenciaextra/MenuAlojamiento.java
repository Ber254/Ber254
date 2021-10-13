/*
+ todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.

 */
package ej04_pooherenciaextra;

import ej04_pooherenciaextra.Entidades.Alojamiento;
import ej04_pooherenciaextra.Entidades.Camping;
import ej04_pooherenciaextra.Entidades.Comparadores;
import ej04_pooherenciaextra.Entidades.Hotel4;
import ej04_pooherenciaextra.Entidades.Hotel5;
import ej04_pooherenciaextra.Entidades.Hotelero;
import ej04_pooherenciaextra.Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

 
public class MenuAlojamiento {
    
    public void menu() {
         int i=0;
         List <Alojamiento> listaAlojamientos = new ArrayList<>();
         List <Hotelero> listaHoteles = new ArrayList<>();
         List <Camping> listaCamping = new ArrayList<>();
         List <Residencia> listaResidencia = new ArrayList<>();
         
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
         int num;
         int operacion = 0;
         
         while (operacion != 9) {
            System.out.println("\033[33m\tMENU");
            System.out.println("1.  Crear Hotel 4 ****");
            System.out.println("2.  Crear Hotel 5 *****");
            System.out.println("3.  Crear Camping");
            System.out.println("4.  Crear Residencia");
            System.out.println("5.  Mostrar todos los alojamientos");
            System.out.println("6.  Mostrar hoteles de más caro a más barato");
            System.out.println("7.  Mostrar campings con restaurante");
            System.out.println("8.  Mostrar residencias que tienen descuento gremial ");
            System.out.println("9.  SALIR");
             
             
            operacion = Integer.valueOf(sc.next());
            
            if (operacion == 1) {
                Hotel4 h4 = new Hotel4();
                h4.CrearHotel();
                listaAlojamientos.add(h4);
                listaHoteles.add(h4);
            }
            if (operacion == 2) {
                Hotel5 h5 = new Hotel5();
                h5.CrearHotel();
                listaAlojamientos.add(h5);
                listaHoteles.add(h5);
            }
            if (operacion == 3) {
                Camping c1 = new Camping();
                c1.CrearCamping();
                listaAlojamientos.add(c1);
                 
            }
            if (operacion ==4 ){
                Residencia r1 = new Residencia();
                r1.crearResidencia();
                listaAlojamientos.add(r1);          
            }
            if (operacion == 5) {
                for (Alojamiento aux : listaAlojamientos) {
                    System.out.println(aux.toString());
                }
                
            }
            if (operacion == 6) {
                
                for (Alojamiento aux : listaAlojamientos) {
                     if( aux instanceof Hotelero ){
                         listaHoteles.add((Hotelero) aux);
                     }
                     
                     Collections.sort(listaHoteles, Comparadores.orPrecio);
                }
                for (Hotelero aux : listaHoteles) {
                    i++;
                    System.out.println("vuelta "+i);
                    
                    System.out.println("Nombre:"+aux.getNombre());
                    System.out.println("Precio "+aux.getPrecio());
                }
                
            }
            if (operacion == 7) {
                for (Alojamiento aux : listaAlojamientos) {
                     if( aux instanceof Camping ){
                         listaCamping.add((Camping) aux);
                         
                     }                    
                }
                System.out.println("Los Campings privados son:");
                for (Camping aux : listaCamping) {
                    if ( aux.isPrivado()==true){
                        
                        System.out.println(aux.toString());
                    }
                    
                }
            }
            if (operacion == 8) {
                for (Alojamiento aux : listaAlojamientos) {
                     if( aux instanceof Residencia ){
                         listaResidencia.add((Residencia) aux);
                         
                     }                    
                }
                System.out.println("Las Recidencias con descuento gremial son:");
                for (Residencia aux : listaResidencia) {
                    if ( aux.isDescGremio()){
                                             
                        System.out.println(aux.toString());
                    }
                    
                }
            }
            if (operacion == 9) {
                System.out.println("Bye bye");
                break;
            }
            if (operacion!=1 && operacion!=2 && operacion!=3 && operacion!=4 &&operacion!=5 && operacion!=6 && operacion!=7 && operacion!=8 ){
                System.out.println("ERROR ------ Digito fuera del rango 1-9");
            }
        }
    }
    
}
