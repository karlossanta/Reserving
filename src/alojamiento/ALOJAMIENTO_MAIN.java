/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import Decorator.Usuario;
import Decorator.UsuarioCliente;
import Decorator.UsuarioGeneral;
import Decorator.UsuarioGerente;
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
        
        UsuarioGeneral u = new UsuarioGeneral( "hola", "adios");
        UsuarioCliente c1 = new UsuarioCliente ("carlos", "santamaria", "karlos@hma.com", "666", u);
//        Cliente c2 = new Cliente ("jose", "andres", "karlos@hma.com", "777", "hola", "pass2");
//        Cliente c3 = new Cliente ("carlos", "santamaria", "karlos@hma.com", "666", "c3", "pass3");
        UsuarioGeneral u1 = new UsuarioGeneral("g1", "pass1");
        UsuarioGerente g1 = new UsuarioGerente (u1);
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
        UsuarioCliente x1 = (UsuarioCliente) Usuarios.getUsuario(c1.getUsuario());
        System.out.println(x1.toString());
                
        x1.aceptar();
        
        System.out.println(x1.toString());
        
        
        
    }
    
}
