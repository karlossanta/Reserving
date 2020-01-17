package Iterator;

//iterator
public interface Iterador {

    
    Object primero() throws IndexOutOfBoundsException;

    Object siguiente() throws IndexOutOfBoundsException;

    boolean hayMas();
    
    Object anterior() throws IndexOutOfBoundsException;

    boolean hayMasAtras();

    boolean estaVacio();
    
    Object elementoActual() throws IndexOutOfBoundsException;
}
