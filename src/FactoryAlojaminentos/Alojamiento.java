/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryAlojaminentos;

import java.io.Serializable;

/**
 *
 * @author Roberto
 */
public abstract class Alojamiento {
    
    String id;
    String direccion;
    int plazas;
    boolean mascotas;
    boolean discapacitados;
    float valoracion;
    float precio_noche; //asociado a temporada alta

    public Alojamiento(String id, String direccion, int plazas, boolean mascotas, boolean discapacitados, float precio_noche) {
        this.id = id;
        this.direccion = direccion;
        this.plazas = plazas;
        this.mascotas = mascotas;
        this.discapacitados = discapacitados;
        this.valoracion = 7;
        this.precio_noche = precio_noche;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public boolean paraMascotas() {
        return mascotas;
    }

    public void setMascotas(boolean mascotas) {
        this.mascotas = mascotas;
    }

    public boolean paraDiscapacitados() {
        return discapacitados;
    }

    public void setDiscapacitados(boolean discapacitados) {
        this.discapacitados = discapacitados;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public float getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(float precio_noche) {
        this.precio_noche = precio_noche;
    }

    
    
}
