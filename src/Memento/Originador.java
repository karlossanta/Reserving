package Memento;

import Decorator.Usuario;
import FactoryAlojaminentos.Alojamiento;
import alojamiento.Reserva;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase que crea el objeto recuerdo y lo utiliza para recuperar su estado. Crea
 * un Recuerdo que contiene una instantánea de su estado interno actual. Usa el
 * Recuerdo para restaurar su estado interno.
 *
 */
public class Originador {

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

    public Recuerdo crearRecuerdo() {
        return new Recuerdo();
    }
}
