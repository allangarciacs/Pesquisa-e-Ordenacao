import java.util.List;
import java.util.Random;

/* 
Essa camada cuida da lógica de negócios e manipulação dos dados
    - Gerar números
    - Popular listas
Ela não sabe com os dados serão exibidos.
*/

public class Utilidades {

    public static void popularLista(List<Integer> lista, long quantidadeNumeros, int inicio, int fim, boolean aleatorio) {
        Random gerador = new Random();
        
        if (aleatorio) {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add(gerador.nextInt(inicio, fim));
            }
        } else {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add((int) (inicio + i));
            }
        }
    }
}