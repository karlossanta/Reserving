package Memento;

import java.util.ArrayList;

public class Conserje {

    private ArrayList<Recuerdo> recuerdos = new ArrayList<>();


    public void setRecuerdo(Recuerdo recuerdo) {
        recuerdos.add(recuerdo);
    }

    public Recuerdo getRecuerdo(int indice) {
        if (indice < recuerdos.size()) {
            Recuerdo r = recuerdos.get(indice);
            return r;
        } else {
            return null;
        }
    }
}
