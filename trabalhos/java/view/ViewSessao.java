package view;

import java.util.Scanner;
import controller.ControllerSessao;
import model.Sessao;

public class ViewSessao {

    private Scanner teclado = new Scanner(System.in);
    private ControllerSessao controller = new ControllerSessao();

    public void start() {
        controller.carregarArquivo("telephony_sessions.txt");

        System.out.print("Digite o número do celular a ser pesquisado: ");
        String numeroCelular = teclado.nextLine().trim(); // trim() tira os espaços

        Sessao sessao = controller.buscarSessao(numeroCelular);

        if (sessao != null) {
            System.out.println("\nSessão encontrada:" + sessao);
        } else {
            System.out.println("Número não esta no sistema.");
        }

        teclado.close();
    }
}