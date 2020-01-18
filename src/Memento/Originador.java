package Memento;

import FactoryAlojaminentos.Alojamiento;
import alojamiento.Reserva;
import alojamiento.Usuario;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase que crea el objeto recuerdo y lo utiliza para recuperar su estado. Crea
 * un Recuerdo que contiene una instantánea de su estado interno actual. Usa el
 * Recuerdo para restaurar su estado interno.
 *
 */
public class Originador {

    private ArrayList<Alojamiento> alojamientosR;
    private ArrayList<Reserva> reservasR;
    private HashMap<String, Usuario> usuariosR;
    private String ruta;
    private int NgerenteR;

    public ArrayList<Alojamiento> getAlojamientosR() {
        return this.alojamientosR;
    }

    public ArrayList<Reserva> getReservasR() {
        return this.reservasR;
    }

    public HashMap<String, Usuario> getUsuariosR() {
        return this.usuariosR;
    }

    public String getRuta() {
        return this.ruta;
    }

    public int getNgerenteR() {
        return this.NgerenteR;
    }
    
    public void cargarAlojamientos(Recuerdo recuerdo){
        recuerdo.cargarAlojamientos();
    }
    
    public void cargarReserva(Recuerdo recuerdo){
        recuerdo.cargarReservas();
    }
    
    public void cargarUsuarios(Recuerdo recuerdo){
        recuerdo.cargarUsuarios();
    }
    
    public void guardarAlojamiento(Recuerdo recuerdo){
        recuerdo.guardarAlojamientos();
    }
    
    public void guardarReserva(Recuerdo recuerdo){
        recuerdo.guardarReservas();
    }
    
    public void guardarUsuarios(Recuerdo recuerdo){
        recuerdo.guardarUsuarios();
    }
    
    public void setRecuerdo(Recuerdo recuerdo, ArrayList<Reserva> aux) {
        this.reservasR = recuerdo.getReservasR();
    }
    
    public void setRecuerdo(ArrayList<Alojamiento> aux, Recuerdo recuerdo) {
        this.alojamientosR = recuerdo.getAlojamientosR();
    }
    
    public void setRecuerdo(HashMap<String, Usuario> aux, Recuerdo recuerdo) {
        this.usuariosR = recuerdo.getUsuariosR();
    }
    
    public void setRecuerdo(int aux, Recuerdo recuerdo) {
        this.NgerenteR = recuerdo.getNgerenteR();
    }

    public Recuerdo crearRecuerdo() {
        return new Recuerdo();
    }
}
