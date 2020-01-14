/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Roberto
 */
public class GestionReservas {
    
    ArrayList<Reserva> reservas;
    
    public Reserva crearReserva(Cliente cliente, Alojamiento alojamiento, LocalDate fechaInicio, int ocupantes){
        Reserva reserva =  new Reserva(cliente, alojamiento, fechaInicio, ocupantes);
        return reserva;
    }
    
    public void reservar(Reserva res){
        reservas.add(res);
    }
    
    
}
