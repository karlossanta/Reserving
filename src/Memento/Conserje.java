package Memento;

import java.util.ArrayList;

public class Conserje {

    private ArrayList<Recuerdo> recuerdos = new ArrayList();


    public void setRecuerdo(Recuerdo recuerdo) {
        recuerdos.add(recuerdo);
    }
    
    public void insertar(Recuerdo recuerdo, int indice){
        ArrayList<Recuerdo> aux= new ArrayList();
        for (int i=0; i < this.recuerdos.size(); i++) {
            if (indice == i){
                aux.add(recuerdo);
            } else {
                Recuerdo rec = this.recuerdos.get(i);
                aux.add(rec);
            }
        }
        this.recuerdos = aux;
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
