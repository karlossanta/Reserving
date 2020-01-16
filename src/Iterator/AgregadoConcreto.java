package Iterator;

//iterator
import Iterator.Agregado;
import java.util.ArrayList;

public class AgregadoConcreto implements Agregado {


    public ArrayList elementos;

    public AgregadoConcreto(ArrayList vec) {
        elementos = vec;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorConcreto(this);
    }
}
