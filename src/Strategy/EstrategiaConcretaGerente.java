package Strategy;

import Interface.ConsultarAlojamientos;

/**
 * Clase que implementa la interfaz Estrategia. Ordena una lista de alumnos por
 * universidad.
 *
 * @author Salvador Oton
 */
public class EstrategiaConcretaGerente implements Estrategia {

    @Override
    public void cambiarBoton(ConsultarAlojamientos ca) {
        ca.botonGerente();
    }
}
