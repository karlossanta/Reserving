/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Reserva {
    
    Cliente cliente;
    Alojamiento alojamiento;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    int NOcupantes;

//    public Reserva(Cliente cliente, Alojamiento alojamiento, Date fechaInicio, Date fechaFin, int NOcupantes) {
//        this.cliente = cliente;
//        this.alojamiento = alojamiento;
//        this.fechaInicio = fechaInicio;
//        this.fechaFin = fechaFin;
//        this.NOcupantes = NOcupantes;
//    }

    public Reserva(Cliente cliente, Alojamiento alojamiento, LocalDate fechaInicio, int NOcupantes) {
        this.cliente = cliente;
        this.alojamiento = alojamiento;
        this.fechaInicio = fechaInicio;
        this.NOcupantes = NOcupantes;
    }
    
    public int getNOcupantes() {
        return NOcupantes;
    }

    public void setNOcupantes(int NOcupantes) {
        this.NOcupantes = NOcupantes;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

//    public String getFechaInicio() {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//	Calendar cal = Calendar.getInstance();
//        fechaInicio = dateFormat.format(cal);
////	System.out.println(dateFormat.format(cal)); 
//        return fechaInicio;
//    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
//    public long calcularTiempo(){
//        long duracionMs = fechaFin.getTime() - fechaInicio.getTime();
//        long dias = duracionMs / (1000 * 60 * 60 * 24);
//        return dias;
//    }

    
}
