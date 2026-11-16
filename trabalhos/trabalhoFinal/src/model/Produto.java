package model;

public class Produto {
    private String id;
    private String nome;
    private String categoria;
    private String preco;
    private String estoque; 

    public Produto(String id, String nome, String categoria, String preco, String estoque) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.estoque = estoque;
    }



    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + ", estoque=" + estoque + '}';
    }
    
    
    
}
