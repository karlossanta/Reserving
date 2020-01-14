/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

/**
 *
 * @author Roberto
 */
public abstract class AlojamientoBuilder {
    
    //hotel
    public Hotel crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int estrellas, boolean pensionCompleta){
        Hotel alojamiento = new Hotel(id, direccion, plazas, mascotas, discapacitados, precio_noche, estrellas, pensionCompleta);
        return alojamiento;
    }
    
    //apartamento
    public Apartamento crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int habitaciones, int camas, boolean aparcamiento){
        Apartamento alojamiento = new Apartamento(id, direccion, plazas, mascotas, discapacitados, precio_noche, habitaciones, camas, aparcamiento);
        return alojamiento;
    }
    
    //casa rural
    public Alojamiento crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, boolean piscina, boolean barbacoa, int habitaciones, int camas){
        CasaRural alojamiento = new CasaRural(id, direccion, plazas, mascotas, discapacitados, precio_noche, piscina, barbacoa, habitaciones, camas);
        return alojamiento;
    }
    
}
