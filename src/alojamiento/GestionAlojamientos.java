/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class GestionAlojamientos implements Serializable{

    private static AlojamientoBuilder alojamientoBuilder;
    private static ArrayList<Alojamiento> alojamientos;
    

    public static void setAlojamientoBuilder(AlojamientoBuilder ab){
        alojamientoBuilder = ab;
    }
    
    public static ArrayList<Alojamiento> getAlojamientos() {
        return alojamientos;
    } 
    
    //crear hotel
    public static void crearHotel(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int estrellas, boolean pensionCompleta ){
        Hotel hotel = alojamientoBuilder.crearAlojamiento(id, direccion, plazas, mascotas, discapacitados, precio_noche, estrellas, pensionCompleta );
        alojamientos.add(hotel);
    }
    
      //apartamento
    public static void crearApartamento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int habitaciones, int camas, boolean aparcamiento){
        Apartamento apartamento = new Apartamento(id, direccion, plazas, mascotas, discapacitados, precio_noche, habitaciones, camas, aparcamiento);
        alojamientos.add(apartamento);
    }
    
    //casa rural
    public static void crearCasaRural(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, boolean piscina, boolean barbacoa, int habitaciones, int camas){
        CasaRural casaRural = new CasaRural(id, direccion, plazas, mascotas, discapacitados, precio_noche, piscina, barbacoa, habitaciones, camas);
        alojamientos.add(casaRural);
    }
    
//    public static Alojamiento crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float valoracion, float precio_noche, int estrellas, boolean pensionCompleta ){
//        Alojamiento aloj = alojamientoBuilder.crearAlojamiento(id, direccion, plazas, mascotas, discapacitados, precio_noche, estrellas, pensionCompleta);
//        return aloj;
//    }

    public static void añadirAlojamiento(Alojamiento alojamiento){
        if(!GestionAlojamientos.alojamientos.contains(alojamiento)){
            alojamientos.add(alojamiento); 
        }
    }
    
    public static boolean estaAlojamiento(ArrayList<Alojamiento> aux, Alojamiento alojamiento) {
        // Crea el agregado.
        Agregado agregado = new AgregadoConcreto(aux);
        // Crea el iterador.
        Iterador iterador = agregado.crearIterador();
        boolean encontrado = false;
        // Recorre la lista con el iterador.
        while (iterador.hayMas() && !encontrado) {
            Alojamiento aloj = (Alojamiento) iterador.elementoActual();
            if(aloj.id == alojamiento.id){
                encontrado = true;
            }
            iterador.siguiente();
        }
        return encontrado;
    }
    
    public  static Alojamiento buscarAlojamiento(ArrayList<Alojamiento> aux, String id) {
        // Crea el agregado.
        Agregado agregado = new AgregadoConcreto(aux);
        // Crea el iterador.
        Iterador iterador = agregado.crearIterador();
        boolean encontrado = false;
        Alojamiento res = null;
        // Recorre la lista con el iterador.
        while (iterador.hayMas() && !encontrado) {
            Alojamiento aloj = (Alojamiento) iterador.elementoActual();
            if(aloj.id == id){
                encontrado = true;
                res = aloj;
            }
            iterador.siguiente();
        }
        return res;
    }
    
    public static void eliminarAlojamiento(Alojamiento alojamiento){
        if(GestionAlojamientos.estaAlojamiento(alojamientos, alojamiento)){
            alojamientos.remove(alojamiento);
        }
    }
}
