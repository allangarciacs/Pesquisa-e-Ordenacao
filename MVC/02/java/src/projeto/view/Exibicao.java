package projeto.view;

import java.util.List;

// Interface do usuario, ela somente exibe oq recebe

public class Exibicao {

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

    public static void menuTipoLista() {
        System.out.println("Ordenacao de lista aleatoria");
        System.out.println("===== MENU =====");
        System.out.println("1 - Bolha");
        System.out.println("2 - Insert");
        System.out.println("3 - Select");
        System.out.println("4 - Exibir lista");
        System.out.print("Opcao:");
    }


}