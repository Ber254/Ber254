/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04_pooherenciaextra.Entidades;

import java.util.Comparator;

/**
 *
 * @author berna
 */
public class Comparadores {
    
    public static Comparator<Hotelero> orPrecio = new Comparator<Hotelero>(){
       @Override
       public int compare(Hotelero t, Hotelero t1){
           return t1.getPrecio().compareTo(t.getPrecio());
       }
    }; 
    
}
