package projeto.model;

import java.util.List;
import java.util.Random;

// Gera números e popula as listas
// Não sabe como os dados serão exibidos.

public class Ordenacao {

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

    public static class Complexidade {
        private int comparacoes;
        private int trocas;

        public Complexidade(int comparacoes, int trocas) {
            this.comparacoes = comparacoes;
            this.trocas = trocas;
        }

        public int getComparacoes() {
            return comparacoes;
        }

        public int getTrocas() {
            return trocas;
        }
    }

    public static Complexidade bolha(List<Integer> lista) {
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

        return new Complexidade(qtdComparacoes, qtdTrocas);
    }

    public static Complexidade selecao(List<Integer> lista) {
        int posMenor, tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;
        for (int i = 0; i < lista.size()-1; i++) {
            posMenor = i;
            for (int j = i+1; j < lista.size(); j++) {
                qtdComparacoes++;
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                qtdTrocas++;
                tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }
        return new Complexidade(qtdComparacoes, qtdTrocas);
    }

    public static Complexidade insercao(List<Integer> lista) {
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
        return new Complexidade(qtdComparacoes, qtdTrocas);
    }

    public static Complexidade agitacao(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int ini = 0;
        int fim = lista.size();
        int qtdComparacoes = 0, qtdTrocas = 0;

        do {
            houveTroca = false;
            for (int i = ini; i < fim-1; i++){
                qtdComparacoes++;
                if (lista.get(i) > lista.get(i+1)) {
                    qtdTrocas++;
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, tmp);
                }
            }

            if (!houveTroca) {
                break;
            }
            fim--;

            houveTroca = false;
            for (int i = fim; i > ini+1; i--){
                qtdComparacoes++;
                if (lista.get(i) < lista.get(i-1)) {
                    qtdTrocas++;
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i-1));
                    lista.set(i-1, tmp);
                }
            }
            ini++;

        } while (houveTroca);
        return new Complexidade(qtdComparacoes, qtdTrocas);
    }
}
