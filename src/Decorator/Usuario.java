package Decorator;

import java.io.Serializable;

/**
 * Componente. Interfaz con las operaciones de un cliente.
 */
public interface Usuario extends Serializable{

    
    /**
     * Set the value of contrasenna
     *
     * @param contrasenna new value of contrasenna
     */
    public void setContrasenna(String contrasenna);


    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public String getUsuario();

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(String usuario);
    
    /**
     * Valida el usuario en base a la contrasenna introducida
     *
     * @param contrasenna contrasenna a comprobar
     * @return si la contrasenna coincide con la establecida
     */
    public boolean validarUsuario(String contrasenna);
    
}
