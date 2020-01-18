/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryAlojaminentos;

/**
 *
 * @author Roberto
 */
public class FactoryAlojamiento {
    
    public static Apartamento crearApartamento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int habitaciones, int camas, boolean aparcamiento){
        Apartamento apartamento = new Apartamento(id, direccion, plazas, mascotas, discapacitados, precio_noche, habitaciones, camas, aparcamiento);
        return apartamento;
    }
    
    public static Hotel crearHotel(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int estrellas, boolean pensionCompleta ){
        Hotel hotel = new Hotel(id, direccion, plazas, mascotas, discapacitados, precio_noche, estrellas, pensionCompleta );
        return hotel;
    }
    
    public static CasaRural crearCasaRural(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, boolean piscina, boolean barbacoa, int habitaciones, int camas){
        CasaRural casaRural = new CasaRural(id, direccion, plazas, mascotas, discapacitados, precio_noche, piscina, barbacoa, habitaciones, camas);
        return casaRural;
    }
}
