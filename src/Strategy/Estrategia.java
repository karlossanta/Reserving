package Strategy;

import Interface.ConsultarAlojamientos;

/**
 * Interfaz en la que se definen todos los métodos disponibles para ser
 * manejados por Contexto.
 *
 * @author Salvador Oton
 */
public interface Estrategia {

    /**
     * Ordena lista de alumnos pasada como argumento
     *
     * @param ca
     * @param a
     */
    public void cambiarBoton(ConsultarAlojamientos ca);
}
