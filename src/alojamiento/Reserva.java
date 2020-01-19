/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import Decorator.UsuarioCliente;
import FactoryAlojaminentos.Alojamiento;
import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{
    
    private UsuarioCliente cliente;
    private Alojamiento alojamiento;
    private Date fechaInicio;
    private Date fechaFin;
    private int NOcupantes;

    public Reserva(UsuarioCliente cliente, Alojamiento alojamiento, Date fechaInicio, Date fechaFin, int NOcupantes) {
        this.cliente = cliente;
        this.alojamiento = alojamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.NOcupantes = NOcupantes;
    }
    
    public int getNOcupantes() {
        return NOcupantes;
    }

    public void setNOcupantes(int NOcupantes) {
        this.NOcupantes = NOcupantes;
    }
    
    public UsuarioCliente getCliente() {
        return cliente;
    }

    public void setCliente(UsuarioCliente cliente) {
        this.cliente = cliente;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
