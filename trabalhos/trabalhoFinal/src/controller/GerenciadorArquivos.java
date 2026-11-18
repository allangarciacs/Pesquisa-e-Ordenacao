package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.Produto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*

- Ler o arquivo escolhido para uma `ArrayList<Produto>`,
ignorando o cabeçalho. 

- Exportar a lista, na ordem em que estiver no momento, 
para um novo arquivo texto no mesmo formato.

 */
public class GerenciadorArquivos {

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void carregarArquivo(String nome) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(nome))) {

            // Spltar
            String linha;

            br.readLine(); // le a primeira linha (q eh o cabecalho, ent pula ele)

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";", 5);

                if (partes.length == 5) {
                    int id = Integer.parseInt(partes[0].trim());
                    String nomeSplit = partes[1].trim();
                    String categoria = partes[2].trim();
                    double preco = Double.parseDouble(partes[3].trim());
                    int estoque = Integer.parseInt(partes[4].trim());

                    Produto produto = new Produto(id, nomeSplit, categoria, preco, estoque);

                    listaProdutos.add(produto);
                }
            }

            System.out.println("Arquivo carregado!");

            for (Produto p : listaProdutos) {
                System.out.println(p);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo '"
                    + nome + "', erro: "
                    + e.getMessage());
        }
    }

    public void exportarLista(String nome) {
        try (FileWriter fw = new FileWriter(nome)) {

            fw.write("id;nome;categoria;preco;estoque\n");

            for (Produto p : listaProdutos) {
                fw.write(p.getId() + ";"
                        + p.getNome() + ";"
                        + p.getCategoria() + ";"
                        + p.getPreco() + ";"
                        + p.getEstoque() + "\n");
            }
            System.out.println("Arquivo exportado!");

        } catch (IOException e) {
            System.out.println("Erro ao exportar o arquivo '"
                    + nome + "', erro: " + e.getMessage());
        }
    }
}

