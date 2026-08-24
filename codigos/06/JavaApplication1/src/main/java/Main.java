import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
     
        lista.add(new Pessoa("Gabriel", 19));
        lista.add(new Pessoa("Alex", 52));
        lista.add(new Pessoa("Gabriel", 20));       
        lista.add(new Pessoa("Alex", 51));
        

//        Collections.sort(lista);
//        System.out.println(lista);

        lista.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
        
        
        System.out.println(lista.get(3));
        
    }
    
}
