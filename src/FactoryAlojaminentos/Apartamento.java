
package FactoryAlojaminentos;

import java.io.Serializable;

public class Apartamento extends Alojamiento implements Serializable{
    int habitaciones;
    int camas;
    boolean aparcamiento;

    public Apartamento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int habitaciones, int camas, boolean aparcamiento) {
        super(id, direccion, plazas, mascotas, discapacitados, precio_noche);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.aparcamiento = aparcamiento;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public boolean tieneAparcamiento() {
        return aparcamiento;
    }

    public void setAparcamiento(boolean aparcamiento) {
        this.aparcamiento = aparcamiento;
    }
    
    
    
    
}
