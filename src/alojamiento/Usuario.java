/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import java.io.Serializable;

/**
 *
 * @author karlos
 */
public abstract class Usuario implements Serializable{

    public Usuario(String usuario, String contrasenna) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }
     
    private String usuario; 
    private String contrasenna;

    /**
     * Set the value of contrasenna
     *
     * @param contrasenna new value of contrasenna
     */
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }


    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public boolean validarUsuario(String contrasenna){
        return contrasenna.equals(this.contrasenna);
    }
    
}
