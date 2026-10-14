import java.util.HashSet;

public class ExemploHashSimples {
    public static void main(String[] args) {
        
        HashSet<String> tabelaHashString = new HashSet<>();

        tabelaHashString.add("alexandre");
        tabelaHashString.add("hermes");
        tabelaHashString.add("davi");
        tabelaHashString.add("alan");
        tabelaHashString.add("Alexandre");
        tabelaHashString.add("davi");

        /* dessa maneira nao vai exebir na ordem que foi adicionado
        no hash, e mostrara os repetidos somente uma vez */
        System.out.println(tabelaHashString); 

        /* isso nunca vai funcionar com hash, porque hash nao tem indice
        for (int i = 0; i < tabelaHashString.size(); i++) { } */

        for (String item : tabelaHashString) {
            System.out.println(item + " -> " + item.hashCode());
        }

        System.out.println(tabelaHashString.contains("alan"));


    }
}