/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

/**
 *
 * @author Roberto
 */
public class Hotel extends Alojamiento {
     int estrellas;
     boolean pensionCompleta;

    public Hotel(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche, int estrellas, boolean pensionCompleta) {
        super(id, direccion, plazas, mascotas, discapacitados, precio_noche);
        this.estrellas = estrellas;
        this.pensionCompleta = pensionCompleta;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public boolean tienePensionCompleta() {
        return pensionCompleta;
    }

    public void setPensionCompleta(boolean pensionCompleta) {
        this.pensionCompleta = pensionCompleta;
    }
     
     
    
}
