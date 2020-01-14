/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;


/**
 *
 * @author karlos
 */
public class Cliente extends Usuario{

    public Cliente(String nombre, String apellidos, String email, String telefono, String usuario, String contrasenna) {
        super(usuario, contrasenna);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }
    
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private boolean aceptado = false;
    
    /**
     * Get the value of aceptado
     *
     * @return the value of aceptado
     */
    public boolean isAceptado() {
        return aceptado ;
    }

    /**
     * Set the value of aceptado
     *
     * @param aceptado new value of aceptado?
     */
    public void setAceptado(boolean aceptado) {
        this.aceptado  = aceptado;
    }

    
    
//    private ArrayList<Reserva> historial_reservas = new ArrayLisy<>();
//    private Reserva reserva;
//
//    /**
//     * Get the value of reserva
//     *
//     * @return the value of reserva
//     */
//    public Reserva getReserva() {
//        return reserva;
//    }
//
//
//    /**
//     * Get the value of historial_reservas
//     *
//     * @return the value of historial_reservas
//     */
//    public ArrayList<Reserva> getHistorial_reservas() {
//        return historial_reservas;
//    }


    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Get the value of apellidos
     *
     * @return the value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    
}