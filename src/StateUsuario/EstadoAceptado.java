/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateUsuario;

import Decorator.UsuarioCliente;
import java.io.Serializable;

/**
 *
 * @author karlos
 */
public class EstadoAceptado implements Estado{

    @Override
    public void ejecutar(UsuarioCliente c) {
        System.out.println("Enviar Email a " + c.getEmail() + " usuario validado");
    }
    
}
