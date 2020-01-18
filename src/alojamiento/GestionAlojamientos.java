/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import FactoryAlojaminentos.FactoryAlojamiento;
import FactoryAlojaminentos.Alojamiento;
import FactoryAlojaminentos.Apartamento;
import FactoryAlojaminentos.Hotel;
import FactoryAlojaminentos.CasaRural;
import Iterator.Iterador;
import Iterator.AgregadoConcreto;
import Iterator.Agregado;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class GestionAlojamientos extends AlojamientoBuilder{
    
    private static ArrayList<Alojamiento> alojamientos = new ArrayList();
    
    
    
    public static ArrayList<Alojamiento> getAlojamientos() {
        return alojamientos;
    } 
    public static void setAlojamientos(ArrayList<Alojamiento> alojamientos) {
        GestionAlojamientos.alojamientos = alojamientos;
    } 
    
    //crear hotel
    public static boolean crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int estrellas, boolean pensionCompleta ){
        boolean correcto = false;
        Hotel hotel = FactoryAlojamiento.crearHotel(id, direccion, plazas, mascotas, discapacitados, precio_noche, estrellas, pensionCompleta);
        if (GestionAlojamientos.buscarAlojamiento(alojamientos, id) == null) {
            alojamientos.add(hotel);
            correcto = true;
        }
        return correcto;
    }
    
      //apartamento
    public static boolean crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int habitaciones, int camas, boolean aparcamiento){
        boolean correcto = false;
        Apartamento apartamento = FactoryAlojamiento.crearApartamento(id, direccion, plazas, mascotas, discapacitados, precio_noche, habitaciones, camas, aparcamiento);
        if (GestionAlojamientos.buscarAlojamiento(alojamientos, id) == null){
            alojamientos.add(apartamento);
            correcto = true;
        }
        return correcto;
    }
    
    //casa rural
    public static boolean crearAlojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, boolean piscina, boolean barbacoa, int habitaciones, int camas){
        boolean correcto = false;
        CasaRural casaRural = FactoryAlojamiento.crearCasaRural(id, direccion, plazas, mascotas, discapacitados, precio_noche, piscina, barbacoa, habitaciones, camas);
        if (GestionAlojamientos.buscarAlojamiento(alojamientos, id) == null){
            alojamientos.add(casaRural);
            correcto = true;
        }
        return correcto;
    }

    public static void añadirAlojamiento(Alojamiento alojamiento){
        if(!GestionAlojamientos.alojamientos.contains(alojamiento)){
            alojamientos.add(alojamiento); 
        }
    }
    
    public static boolean existeAlojamiento(Alojamiento alojamiento) {
        return alojamientos.contains(alojamiento);
    }
    public static boolean existeAlojamiento(String idAlojamiento) {
        return alojamientos.contains(buscarAlojamiento(alojamientos, idAlojamiento));
    }
    
    public  static Alojamiento buscarAlojamiento(ArrayList<Alojamiento> aux, String id) {
        // Crea el agregado.
        Agregado agregado = new AgregadoConcreto(aux);
        // Crea el iterador.
        Iterador iterador = agregado.crearIterador();
        boolean encontrado = false;
        Alojamiento res = null;
        Alojamiento aloj = (Alojamiento) iterador.elementoActual();
        // Recorre la lista con el iterador.
        while (iterador.hayMas() && !encontrado) {
            if(aloj.getId().equals(id)){
                encontrado = true;
                res = aloj;
            }
            iterador.siguiente();
        }
        aloj = (Alojamiento) iterador.elementoActual();
        if(aloj.getId().equals(id)){
            encontrado = true;
            res = aloj;
        }
        return res;
    }
    
    public static void eliminarAlojamiento(Alojamiento alojamiento){
        if(GestionAlojamientos.alojamientos.contains(alojamiento)){
            alojamientos.remove(alojamiento);
        }
    }
    
     
//    public static void cargarAlojamientos() {
//        FileInputStream fis = null;
//        ObjectInputStream entrada = null;
//        ArrayList<Alojamiento> alojamientos;
//        try {
//
//            fis = new FileInputStream("./ficheros/alojamientos/alojamientos.dat");
//            entrada = new ObjectInputStream(fis);
//            alojamientos = (ArrayList<Alojamiento>) entrada.readObject();
//            GestionAlojamientos.setAlojamientos(alojamientos);
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (fis != null) {
//                    fis.close();
//                }
//                if (entrada != null) {
//                    entrada.close();
//                }
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//    
//    public static void guardarAlojamientos() {
//        FileOutputStream fos = null;
//        ObjectOutputStream salida = null;
//        try {
//            
//            fos = new FileOutputStream("./ficheros/alojamientos/alojamientos.dat");
//            salida = new ObjectOutputStream(fos);
//            salida.writeObject(GestionAlojamientos.getAlojamientos());
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if(fos!=null) fos.close();
//                if(salida!=null) salida.close();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//    
//    public static void guardarAlojamientos() {
//        FileOutputStream fos = null;
//        ObjectOutputStream salida = null;
//        try {
//            
//            fos = new FileOutputStream("./ficheros/alojamientos/alojamientos.dat");
//            salida = new ObjectOutputStream(fos);
//            salida.writeObject(GestionAlojamientos.getAlojamientos());
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if(fos!=null) fos.close();
//                if(salida!=null) salida.close();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }

}
