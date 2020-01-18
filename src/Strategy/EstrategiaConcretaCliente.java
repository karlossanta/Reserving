package Strategy;

import Interface.ConsultarAlojamientos;

/**
 * Clase que implementa la interfaz Estrategia. Ordena una lista de alumnos por
 * nombre.
 *
 * @author Salvador Oton
 */
public class EstrategiaConcretaCliente implements Estrategia {

    @Override
    public void cambiarBoton(ConsultarAlojamientos ca) {
        ca.botonCliente();
    }
}
