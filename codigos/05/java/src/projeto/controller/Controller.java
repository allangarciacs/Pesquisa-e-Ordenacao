package projeto.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import projeto.controller.Ordenacao.Complexidade;
import projeto.model.Utilidades;
import projeto.view.Exibicao;

public class Controller {
    
    public void executarProcessamento() {

        long tempoInicioBolha, tempoFimBolha;
        long tempoInicioInsert, tempoFimInsert;
        long tempoInicioSelect, tempoFimSelect;
        long tempoIncioAgitacao, tempoFimAgitacao;
        long tempoInicioJava, tempoFimJava;
        long tempoInicioPente, tempoFimPente;

        List<Integer> listaOriginal = new ArrayList<>();
        Utilidades.popularLista(listaOriginal,5000, 1, 10000, true);

        List<Integer> listaBolha = new ArrayList<>(listaOriginal);
        List<Integer> listaInsercao = new ArrayList<>(listaOriginal);
        List<Integer> listaSelecao = new ArrayList<>(listaOriginal);
        List<Integer> listaAgitacao = new ArrayList<>(listaOriginal);
        List<Integer> listaJava = new ArrayList<>(listaOriginal);
        List<Integer> listaPente = new ArrayList<>(listaOriginal);

        // BOLHA
        tempoInicioBolha = System.nanoTime();
        Complexidade complexidadeBolha = Ordenacao.bolha(listaBolha);
        tempoFimBolha = System.nanoTime();

        Exibicao.exibirTempoExecucao((tempoFimBolha - tempoInicioBolha) / 1000000, "bolha");
        Exibicao.exibirComplexidade("bolha", complexidadeBolha.getComparacoes(), complexidadeBolha.getTrocas());

        // INSERT
        tempoInicioInsert = System.nanoTime();
        Complexidade complexidadeInsert = Ordenacao.insercao(listaInsercao);
        tempoFimInsert = System.nanoTime();

        Exibicao.exibirTempoExecucao((tempoFimInsert - tempoInicioInsert) / 1000000, "insert");
        Exibicao.exibirComplexidade("insert", complexidadeInsert.getComparacoes(), complexidadeInsert.getTrocas());                 

        // SELECT
        tempoInicioSelect = System.nanoTime();
        Complexidade complexidadeSelect = Ordenacao.selecao(listaSelecao);
        tempoFimSelect = System.nanoTime();

        Exibicao.exibirTempoExecucao((tempoFimSelect - tempoInicioSelect) / 1000000, "select");
        Exibicao.exibirComplexidade("select", complexidadeSelect.getComparacoes(), complexidadeSelect.getTrocas());      

        // SHAKE
        tempoIncioAgitacao = System.nanoTime();
        Complexidade complexidadeShake = Ordenacao.agitacao(listaAgitacao);
        tempoFimAgitacao = System.nanoTime();

        Exibicao.exibirTempoExecucao((tempoFimAgitacao - tempoIncioAgitacao) / 1000000, "shake");
        Exibicao.exibirComplexidade("shake", complexidadeShake.getComparacoes(), complexidadeShake.getTrocas());
        
        // PENTE
        tempoInicioPente = System.nanoTime();
        Complexidade complexidadePente = Ordenacao.pente(listaPente);
        tempoFimPente = System.nanoTime();

        Exibicao.exibirTempoExecucao((tempoFimPente - tempoInicioPente) / 1000000, "pente");
        Exibicao.exibirComplexidade("pente", complexidadePente.getComparacoes(), complexidadePente.getTrocas());
        
        // PADRAO DO JAVA
        tempoInicioJava = System.nanoTime();
        Collections.sort(listaJava);
        tempoFimJava = System.nanoTime();
        Exibicao.exibirTempoExecucao((tempoFimJava - tempoInicioJava) / 1000000, "java padrao"); 

        int opcao;
        Scanner teclado = new Scanner(System.in);

        do {
            Exibicao.menuExibir();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    Exibicao.exibirLista(listaOriginal, null);
                    break;

                case 2:
                    Exibicao.exibirLista(listaBolha, null);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 0);

        teclado.close();
    }
}