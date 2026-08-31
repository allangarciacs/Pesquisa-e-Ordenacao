/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkt;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

import model.Produto;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Produto> listaProdutos = new ArrayList<>();
        LocalDate dataAtual = LocalDate.now();

        listaProdutos.add(new Produto(1, "Pao de forma Pullman", dataAtual));
        listaProdutos.add(new Produto(4, "Amendoin", dataAtual));
        listaProdutos.add(new Produto(2, "Pao de forma Tubino", LocalDate.parse("2026-08-29")));
        listaProdutos.add(new Produto(3, "Brocolis", dataAtual));

        // listaProdutos.sort((p1, p2) -> Integer.compare(p1.getCodigo(), p2.getCodigo()));
        listaProdutos.sort((p1, p2) -> p1.getData().compareTo(p2.getData()));
        
        for (Produto item : listaProdutos) {
            System.out.println(item);
        }
    }

}
