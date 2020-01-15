package Iterator;

//iterator
public interface Iterador {

    
    Object primero() throws IndexOutOfBoundsException;

    Object siguiente() throws IndexOutOfBoundsException;

    boolean hayMas();
    
    Object anterior() throws IndexOutOfBoundsException;

    boolean hayMasAtras();

    Object elementoActual() throws IndexOutOfBoundsException;
}
