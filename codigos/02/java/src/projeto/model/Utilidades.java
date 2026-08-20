package projeto.model;

import java.util.List;
import java.util.Random;

// Gera números e popula as listas
// Não sabe como os dados serão exibidos.

public class Utilidades {

    public static void popularLista(List<Integer> lista, long quantidadeNumeros, int inicio, int fim, boolean aleatorio) {
        Random gerador = new Random();
        
        if (aleatorio) {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add(gerador.nextInt(inicio, fim));
            }
        } else {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add((int) (inicio + i));
            }
        }
    }

    public static void bolha(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;

        do {
            houveTroca = false;
            for (int i = 0; i < lista.size()-1; i++){
                qtdComparacoes++;
                if (lista.get(i) > lista.get(i+1)) {
                    qtdTrocas++;
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, tmp);
                }
            }
        } while (houveTroca);
    }

    public static void selecao(List<Integer> lista) {
        int posMenor, tmp;
        int qtd_comparacoes = 0, qtd_trocas = 0;
        for (int i = 0; i < lista.size()-1; i++) {
            posMenor = i;
            for (int j = i+1; j < lista.size(); j++) {
                qtd_comparacoes++;
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                qtd_trocas++;
                tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }
    }

    public static void insercao(List<Integer> lista) {
        int i, j;
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;

        for (i = 1; i < lista.size(); i++) {
            tmp = lista.get(i);
            for (j = i - 1; j >= 0; j--) {
                qtdComparacoes++;
                if (tmp < lista.get(j)) {
                    lista.set(j + 1, lista.get(j));
                    qtdTrocas++;
                } else break;
            }
            lista.set(j + 1, tmp);
            qtdTrocas++;
        }
    }


}
