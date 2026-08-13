package projeto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projeto.model.Utilidades;
import projeto.view.Exibicao;

// Dita o fluxo da aplicacao. Chama o model p processar os dados, calcula, etc.
// Envia os dados para o view exibir

public class Controller {
    
    public void executarProcessamento() {
        Scanner teclado = new Scanner(System.in);

        long tempoInicioBolha, tempoFimBolha;
        long tempoInicioInsert, tempoFimInsert;
        long tempoInicioSelect, tempoFimSelect;

        List<Integer> listaAleatoria = new ArrayList<>();
        List<Integer> listaSequencial = new ArrayList<>();

        int opcao;

        do {
            Exibicao.menuTipoLista();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                     Utilidades.popularLista(listaAleatoria, 100, 1, 100, true);
                     tempoInicioBolha = System.nanoTime();
                     Utilidades.bolha(listaAleatoria);
                     tempoFimBolha = System.nanoTime();
                     Exibicao.exibirTempoExecucao(1, (tempoFimBolha - tempoInicioBolha) / 1000000);
                    break;
            
                case 2:
                     Utilidades.popularLista(listaAleatoria, 100, 1, 100, true);
                     tempoInicioInsert = System.nanoTime();
                     Utilidades.bolha(listaAleatoria);
                     tempoFimInsert = System.nanoTime();
                     Exibicao.exibirTempoExecucao(1, (tempoFimInsert - tempoInicioInsert) / 1000000);                   
                    
                    break;

                case 3:
                     Utilidades.popularLista(listaAleatoria, 100, 1, 100, true);
                     tempoInicioSelect = System.nanoTime();
                     Utilidades.bolha(listaAleatoria);
                     tempoFimSelect = System.nanoTime();
                     Exibicao.exibirTempoExecucao(1, (tempoFimSelect - tempoInicioSelect) / 1000000);    
                  
                    break;

                case 4:
                    Exibicao.exibirLista(listaAleatoria, "Lista Aleatória:");
                    break;
            
                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 0);

        teclado.close();
        
    }
}

        // tempoInicio = System.nanoTime();
        // Utilidades.popularLista(listaAleatoria, 100, 1, 100, true);
        // tempoFim = System.nanoTime();
        // Exibicao.exibirTempoExecucao(1, (tempoFim - tempoInicio) / 1000000);

        // Exibicao.exibirLista(listaAleatoria, "Lista Aleatória:");

        // Utilidades.bolha(listaAleatoria);

        // Exibicao.exibirLista(listaAleatoria, "Lista ordenada pelo bolha:");




        // Lista sequencial - ctrl + k -> crtl + u p descomentar
        // tempoInicio = System.nanoTime();
        // Utilidades.popularLista(listaSequencial, 100000, 1, 100000, false);
        // tempoFim = System.nanoTime();
        // Exibicao.exibirTempoExecucao(2, (tempoFim - tempoInicio) / 1000000);
        
