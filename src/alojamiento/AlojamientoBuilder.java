/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import java.io.Serializable;

/**
 *
 * @author Roberto
 */
public abstract class AlojamientoBuilder implements Serializable{
    
    //hotel
    public static boolean crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int estrellas, boolean pensionCompleta){
        return false;
    }
    
    //apartamento
    public static boolean crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int habitaciones, int camas, boolean aparcamiento){
        return false;
    }
    
    //casa rural
    public static boolean crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, boolean piscina, boolean barbacoa, int habitaciones, int camas){
        return false;
    }
    
}
