/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import Interface.Login;

/**
 *
 * @author karlos
 */
public class ALOJAMIENTO_MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Cliente c1 = new Cliente ("carlos", "santamaria", "karlos@hma.com", "666", "hola", "adios");
//        Cliente c2 = new Cliente ("jose", "andres", "karlos@hma.com", "777", "hola", "pass2");
//        Cliente c3 = new Cliente ("carlos", "santamaria", "karlos@hma.com", "666", "c3", "pass3");
        Gerente g1 = new Gerente ("g1", "pass1");
//        Gerente g2 = new Gerente ("g2", "pass2");
//        Gerente g3 = new Gerente ("g3", "pass3");
//        Gerente g4 = new Gerente ("g4", "pass4");

        
//        Usuarios.altaCliente(c2);
//        Usuarios.altaCliente(c3);
        Usuarios.altaGerente(g1);
//        Usuarios.altaGerente(g2);
//        Usuarios.altaGerente(g3);
//        Usuarios.altaGerente(g4);
        
        Usuarios.altaCliente(c1);
        Cliente x1 = (Cliente) Usuarios.getUsuario(c1.getUsuario());
        System.out.println(x1.toString());
                
        x1.aceptar();
        
        Login.guardarUsuarios();
        System.out.println(x1.toString());
        
        
        
    }
    
}
