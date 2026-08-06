package view;

import java.util.List;

/*
Essa camada é responsável pela interface com o usuário
    - Saída no console (nesse caso)
Ela apenas exibe o que recebe e não processa dados.
*/

public class View {

    public static void exibirLista(List<Integer> lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
        System.out.println("--------------------------");
        System.out.println("Total de registros: " + lista.size());
    }

    public static void exibirTempoExecucao(int rotina, long tempoMs) {
        System.out.println("Tempo (ms) rotina " + rotina + ": " + tempoMs);
    }
}
