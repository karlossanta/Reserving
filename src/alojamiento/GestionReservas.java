/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import FactoryAlojaminentos.Alojamiento;
import Interface.Login;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Roberto
 */
public class GestionReservas {
    
    private static ArrayList<Reserva> reservas = new ArrayList<>();

    /**
     * Get the value of reservas
     *
     * @return the value of reservas
     */
    public static ArrayList<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Set the value of reservas
     *
     * @param reservas new value of reservas
     */
    public static void setReservas(ArrayList<Reserva> reservas) {
        GestionReservas.reservas = reservas;
    }

    public static boolean estaReservado(Alojamiento alojamiento, Date fechaInicio, Date fechaFin) {
        boolean reservado = false;
        if (tieneReservas(alojamiento)) {
            ArrayList<Reserva> reservasAlojamiento = getReservasAlojamiento(alojamiento);
            for (int i = 0; i < reservasAlojamiento.size(); i++) {
                if (comprobarFechasAlojamiento(fechaInicio, fechaFin, reservasAlojamiento.get(i))) {
                    reservado = true;
                }
            }
        }
        return reservado;
    }
    public static boolean tieneReservas(Alojamiento alojamiento) {
        boolean tieneReservas = false;
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getAlojamiento().equals(alojamiento)) {
                tieneReservas = true;
                break;
            }
        }
        return tieneReservas;
    }
    public static ArrayList<Reserva> getReservasAlojamiento(Alojamiento alojamiento) {
        ArrayList<Reserva> reservasAlojamiento = new ArrayList<>();
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getAlojamiento().equals(alojamiento)) {
                reservasAlojamiento.add(reservas.get(i));
            }
        }
        return reservasAlojamiento;
    }
    public static ArrayList<Reserva> getReservasAlojamiento(Cliente cliente) {
        ArrayList<Reserva> reservasAlojamiento = new ArrayList<>();
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getAlojamiento().equals(cliente)) {
                reservasAlojamiento.add(reservas.get(i));
            }
        }
        return reservasAlojamiento;
    }
    //devuelve true si las fechas coinciden
    public static boolean comprobarFechasAlojamiento(Date fechaInicio, Date fechaFin, Reserva reserva) {
        boolean correcto = false;
        Date fechaInicioReserva = reserva.getFechaInicio();
        Date fechaFinReserva = reserva.getFechaFin();
        if (fechaInicioReserva.compareTo(fechaInicio) > 0 && fechaInicioReserva.compareTo(fechaFin) > 0 && fechaFinReserva.compareTo(fechaInicio) < 0 && fechaFinReserva.compareTo(fechaFin) < 0) {
            correcto = true;
        }
        return correcto;
    }
    
    
    public static Reserva crearReserva(Cliente cliente, Alojamiento alojamiento, Date fechaInicio, Date fechaFin, int ocupantes){
        Reserva reserva = null;
        if (GestionAlojamientos.existeAlojamiento(alojamiento)) {
            if (Usuarios.existeUsuario(cliente.getUsuario()) && !Usuarios.esGerente(cliente)) {
                if (!GestionReservas.estaReservado(alojamiento, fechaInicio, fechaFin)) {
                    if (ocupantes <= alojamiento.getPlazas()) {
                        reserva =  new Reserva(cliente, alojamiento, fechaInicio, fechaFin, ocupantes);
                    } else {
                        System.out.println("El alojamiento no tiene tantas plazas");
                    }
                } else {
                    System.out.println("El alojamiento ya está reservado en estas fechas");
                }
            } else {
                System.out.println("El cliente no es Valido");
            }
        } else {
            System.out.println("El alojamiento  no es valido");
        }
        //COMPROBAR SI LAS PLAZAS DEL ALOJAMIENTO COINCIDEN CON LAS DE LA RESERVA
        
        return reserva;
    }
    
    public static void reservar(Reserva res){
        reservas.add(res);
    }
    //Devuelve 0 si no existe la reserva
    public static int getDiasReserva(Reserva reserva) {
        int diasReserva = 0;
        if (reservas.contains(reserva)) {
            diasReserva = (int) ((reserva.getFechaFin().getTime()-reserva.getFechaInicio().getTime())/86400000);
        }
        return diasReserva;
    } 
    
    
    
    public static void cargarReservas() {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList<Reserva> reservas;
        try {

            fis = new FileInputStream("./ficheros/reservas/reservas.dat");
            entrada = new ObjectInputStream(fis);
            reservas = (ArrayList<Reserva>) entrada.readObject();
            GestionReservas.setReservas(reservas);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void guardarReservas() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        try {
            
            fos = new FileOutputStream("./ficheros/reservas/reservas.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(GestionReservas.getReservas());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
