
package FactoryAlojaminentos;


public class CasaRural  extends Alojamiento{
    boolean piscina;
    boolean barbacoa;
    int habitaciones;
    int camas;

    public CasaRural(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, boolean piscina, boolean barbacoa, int habitaciones, int camas) {
        super(id, direccion, plazas, mascotas, discapacitados, precio_noche);
        this.piscina = piscina;
        this.barbacoa = barbacoa;
        this.habitaciones = habitaciones;
        this.camas = camas;
    }

    public boolean tienePiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean tieneBarbacoa() {
        return barbacoa;
    }

    public void setBarbacoa(boolean barbacoa) {
        this.barbacoa = barbacoa;
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
    
    
    
}
