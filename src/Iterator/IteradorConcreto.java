package Iterator;

//iterator
public class IteradorConcreto implements Iterador {

    private AgregadoConcreto agregado;

    private int indice = 0;

    public IteradorConcreto(AgregadoConcreto agregado) {
        this.agregado = agregado;
    }

    @Override
    public Object primero() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (!agregado.elementos.isEmpty()) {
            indice = 0;
            objeto = agregado.elementos.get(0);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public Object siguiente() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.elementos.size()) {
            indice++;
            objeto = agregado.elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }
    
    public Object anterior() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice > 0) {
            indice--;
            objeto = agregado.elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public boolean hayMas() {
        boolean resultado = true;
        if (agregado.elementos.isEmpty() || indice == agregado.elementos.size() - 1) {
            resultado = false;
        }
        return resultado;
    }
    
    public boolean hayMasAtras() {
        boolean resultado = true;
        if (agregado.elementos.isEmpty() || indice == 0) {
            resultado = false;
        }
        return resultado;
    }

    @Override
    public Object elementoActual() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.elementos.size()) {
            objeto = agregado.elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }
}
