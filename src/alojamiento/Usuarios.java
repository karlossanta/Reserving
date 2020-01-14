/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author karlos
 */
public class Usuarios implements Serializable{
    
    // Arraylist que almacena todos los usuarios del sistema
    private static HashMap<String, Usuario> usuarios = new HashMap<>();
    private static int nGerentes = 0;
    
    /**
     * Get the value of usuarios
     *
     * @return the value of usuarios
     */
    public static HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }
    
    /**
     * Set the value of usuarios
     *
     * @param the value of usuarios
     */
    public static void setUsuarios(HashMap<String, Usuario> usuarios) {
        Usuarios.usuarios = usuarios;
    }
    
    /**
     * Get the value of usuarios
     *
     * @return the value of usuarios
     */
    public static int getNGerentes() {
        return nGerentes;
    }
    
    /**
     * Set the value of usuarios
     *
     * @param the value of usuarios
     */
    public static void setNGerentes(int nGerentes) {
        Usuarios.nGerentes = nGerentes;
    }
    
    public static boolean altaCliente(Cliente cliente) {
        boolean correcto = false;
        if(!usuarios.containsKey(cliente.getUsuario())){
            usuarios.put(cliente.getUsuario(), cliente);
            correcto = true;
        }
        return correcto;
    }
    public static boolean altaGerente(Gerente gerente) {
        boolean correcto = false;
        if (nGerentes < 3 && !usuarios.containsKey(gerente.getUsuario())) {
            nGerentes++;
            usuarios.put(gerente.getUsuario(), gerente);
            correcto = true;
        }
        return correcto;
    }
    
    public static boolean bajaUsuario(String usuario) {
        boolean correcto = false;
        if(usuarios.containsKey(usuario)) {
            usuarios.remove(usuario);
            correcto = true;
        } 
        return correcto;
    }
    
    public static boolean validarUsuario(String usuario, String contrasenna){
        boolean validado = false;
        if(usuarios.containsKey(usuario)) {
            validado = usuarios.get(usuario).validarUsuario(contrasenna);
        }
        return validado;
    }
    
    //Consideramos que el usuario ya ha sido validado
    public static Usuario getUsuario(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }
    
    
}
