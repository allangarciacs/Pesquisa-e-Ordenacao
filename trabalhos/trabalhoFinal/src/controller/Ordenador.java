package controller;

import java.util.List;

public class Ordenador {

    public static void bubble(List<Integer> lista) {
        boolean houveTroca;
        int tmp;

        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                }
            }
        } while (houveTroca);
    }

    public static void selection(List<Integer> lista) {
        int posMenor, tmp;
        for (int i = 0; i < lista.size() - 1; i++) {
            posMenor = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }
    }

}
