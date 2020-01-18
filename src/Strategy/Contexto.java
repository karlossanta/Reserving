package Strategy;

import Interface.ConsultarAlojamientos;

/**
 * Clase que utiliza las diferentes estrategias para las distintas tareas.
 * Mantiene una referencia a la instancia Estrategia que usa, y tiene un método
 * para reemplazar la actual instancia de Estrategia.
 *
 * @author Salvador Oton
 */
public class Contexto {

    private Estrategia estrategia; // Estrategia que se usa.
    private final ConsultarAlojamientos interfaceAlojamientos;
 
    /**
     * Constructor.
     *
     * @param e Estrategia que se usa.
     * @param ca
     */
    public Contexto(Estrategia e, ConsultarAlojamientos ca) {
        this.estrategia = e;
        this.interfaceAlojamientos = ca;
    }

    /**
     * Establece la estrategia a usar.
     *
     * @param e Estrategia a usar.
     */
    public void setEstrategia(Estrategia e) {
        this.estrategia = e;
    }

    /**
     * Ejecuta la estrategia.
     */
    public void ejecutaEstrategia() {
        estrategia.cambiarBoton(interfaceAlojamientos);
    }
}
