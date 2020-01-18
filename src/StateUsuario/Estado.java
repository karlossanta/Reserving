/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateUsuario;

import alojamiento.Cliente;

/**
 *
 * @author karlos
 */
public interface Estado {

    /**
     * Modifica el estado del objeto
     *
     * @param c
     */
    public void ejecutar(Cliente c);
}