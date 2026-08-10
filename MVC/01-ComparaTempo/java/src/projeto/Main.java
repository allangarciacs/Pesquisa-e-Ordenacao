package projeto;

import projeto.controller.ListaController;

// Ponto de partida do programa. Ela apenas instancia o Controller
// e inicia o sistema.

public class Main {
    public static void main(String[] args) {
        ListaController controller = new ListaController();
        controller.executarProcessamento();
    }
}