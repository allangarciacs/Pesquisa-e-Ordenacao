package projeto;

import projeto.controller.Controller;

// apenas instancia o controller e inicia o sistema

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.executarProcessamento();
        
    }
}



