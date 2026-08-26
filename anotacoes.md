# Anotações da disciplina

### **Revisao Prova 01**

Importância da ordenação
  -> É ideal para otimizar buscas, pesquisas ou recuperações de dados dentro de uma estrutura.

Complexidade de algotimos
  -> É o **esforço computacional** de um algoritmo, em outras palavras, é o quanto de recurso que ele aloca para concluir suas tarefas.
  -> Quanto maior a complexidade, mais esforço
  -> A complexidade é medida a partir da **quantidade de trocas e comparações** que ele realiza.
  <pre>
      - O(n!)             - maior complexidade
      - O(n^x)
      - O(log n + n)
      - O(n)
      - O(log n)          - menor complexidade
  </pre>
  
Estabilidade do algoritmo
  -> Estável: o processo de ordenação garante a ordenação temporária da estrutura
  <pre>
            [4,8,1,3,4,2]
            [4,1,3,4,2,8]
            [1,3,4,2,4,8]
            [1,3,2,4,4,8]
            [1,2,3,4,4,8]
            [1,2,3,4,4,8]
  </pre>
  -> Instável: o processo de ordenação não garante a ordenação temporária da estrutura
    <pre>
            [4,8,1,3,4,2]
            [1,8,4,3,4,2]
            [1,2,4,3,4,8]
            [1,2,3,4,4,8]
            [1,2,3,4,4,8]
            [1,2,3,4,4,8]
  </pre>

Tipos de Codificação
  -> Simples: Quando é trabalhado um tipo básico de dado, exemplo:
  ```java
  List<Integer> lista
  ```
  -> Complexo: Quando são trabalhados vários atributos, exemplo:
  ```java
  class Pessoa {
      String nome;
      int idade;
      double salario;
  }
  ```

CompareTo
  -> É um método usado para definir ou controlar o método de ordenação de uma lista de objetos, permitindo que eles sejam ordenados pelas primeira segunda etc chave de comparação.
  ```java
    @Override
  public int compareTo(Pessoa o) {
      int resultado = this.nome.compareTo(o.getNome());
  
      if (resultado != 0) {
          return resultado;
      }
  
      return Integer.compare(this.idade, o.getIdade());
  }
```

Resumindo, simples trabalha um tipo de dado enquanto complexo vários.

Bubble:
```java
/* i menor que o size - 1
// se o .get(i) maior que o get(i-1)
// tmp igual get(i)
// entao, seta o i no get(i + 1) 
/* e seta o i + 1 no tmp

    public void bubble (List<Integer> lista) {
        boolean houveTroca;
        int tmp;

        do {
            houveTroca = false;
            for (int i = 0; i < lista.size()-1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                }
            }
        } while (houveTroca);
    }
```

### **Semana 5**
------- Aula 1 (24/08/2026) -------
Ordenação de listas de objetos
  -> Usar o compareTo de maneira geral
```java
    @Override
    public int compareTo(Pessoa o) {
        int resultadoNome = this.nome.compareTo(o.getNome());
        if (resultadoNome != 0) { 
            return resultadoNome;
        }
        return Integer.compare(this.idade, o.getIdade());
    }
```
  -> Usar o .sort na Main somente de maneira temporária
```java
        lista.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
```

Prova 01
<pre>
-> Algoritmo estável e instável 
-> Codificação simples e não simples
-> Importância da ordenação 
-> Método para reescrever ou controlar para garantir que a listas de objetos sejam ordenadas pela primeira/segunda/etc chave (compareTO)
-> O que é complexidade de algoritmos
-> Como saber se algum algoritmo tem maior ou pior complexidade (comparar o número de comparações e trocas)
-> Saber escrever um algoritmo de ordenação
</pre>


### **Semana 4**
<pre>
-----------------------------------
Entrega do trabalho de benchmark com 5 algoritmos de ordenação (bubble, insert, select, shake e .sort padrão da linguagem).

Atividade (fazer em c#)
  1 - Ordernar uma lista ou chave de objetos
  2 - Ordenar por data e id na 2ª chave (por exemplo)
-----------------------------------
</pre>


### **Semana 3**
<pre>
------- Aula 1 (10/08/2026) -------

javac -d bin src/projeto/Main.java src/projeto/controller/Controller.java src/projeto/model/Utilidades.java src/projeto/view/Exibicao.java src/projeto/controller/Ordenacao.java
  
javac -d bin src/projeto/Main.java src/projeto/controller/Controller.java src/projeto/model/Utilidades.java src/projeto/view/Exibicao.java

java -cp bin projeto.Main
  
Utilizar como base o código da semana passada, em modelo MVC: ListaBolha, ListaSelecao, ListaInsercao
  Cada lista com 5000 itens, calcular o tempo de ordenação de cada uma. 
  Model (Utilidades) - View (ListaView) - Controller (ListaController)
-----------------------------------
</pre>

### **Semana 2**
<pre>
------- Aula 2 (06/08/2026) -------

MVC em java e python

------- Aula 1 (03/08/2026) -------
  
Programar em MVC (Model, View, Controller).

Estabilidade do algoritmo:
  Estável  -> o processo de ordenação sempre garante a ordenação temporária da estrutura.
  Instável -> o processo de ordenação não garante a ordenação temporária da estrutura. São os ideais, geralmente.

Atividade de fixação
  1) Pesquisar sobre os métodos de ordenação e categoriza-los em:
      - algoritmo de memória interna ou memória externa
      - estabilidade (estável ou instável)
      - complexidade
      - porções de ordenação

      -> bolha (bubble sort):
        - memória interna (RAM)
        - estável
        - O(n^2)
        - porção ordenada: final da estrutura
    
      -> seleção (selection sort)
        - memória interna
        - instável 
        - O(nˆ2)
        - porção ordenada: início da estrutura
        - Laça o menor da direita da estrutura.
    
      -> inserção (inserction sort)
        - memória interna
        - estável
        - O(nˆ2)
        - porção ordenada: início da estrutura
        - Cada valor da direita da estrutura é inserido na sua posição correta na porção da esquerda.
    
      -> pente (combsort):
        - memória interna
        - instável
        - O(n²) (caso médio: ~O(n log n))
        - diminui o intervalo (gap) entre comparações
      
      -> agitação (shakesort ou cocktailsort):
        - memória interna
        - estável
        - O(n²)
        - porção ordenada nas duas extremidades
      
      -> shellsort:
        - memória interna
        - instável
        - O(n²) (depende da sequência de gaps; pode chegar a ~O(n log² n))
        - ordenação por intervalos (gaps) decrescentes
    
      -> bucketsort:
        - memória externa (auxiliar)
        - estável (quando a ordenação dos baldes é estável)
        - O(n + k)
        - distribuição em baldes e ordenação de cada balde
    
      -> radix:
        - memória externa (auxiliar)
        - estável
        - O(d · (n + k))
        - ordenação por dígitos (LSD ou MSD)
      
      -> heapsort:
        - memória interna
        - instável
        - O(n log n)
        - árvore heap (máximo ou mínimo)
      
      -> mergesort:
        - memória externa (auxiliar)
        - estável
        - O(n log n)
        - divisão e conquista (divide e intercala)
      
      -> quicksort:
        - memória interna
        - instável
        - O(n log n) (caso médio) / O(n²) (pior caso)
        - divisão e conquista com pivô

  2) Qual o melhor algoritmo de ordenação?
      -> depende do:
        - tamanho da estrutura
        - quanto já está ordenado

-----------------------------------
</pre>

### **Semana 1**
<pre>
------- Aula 2 (30/07/2026) -------

Conceitos iniciais
  - ordenar: organizar uma estrutura (lista ou vetor) a partir de um ou mais índices.
    . por que se ordena? para otimizar a busca ou pesquisa.
  - pesquisar: localizar ou buscar um dado dentro de uma estrutura, via alguma chave.
    . recuperar: localizar ou buscar dados com RELEVÂNCIA (semântica ou significado)
  - complexidade de um algoritmo: é o esforço computacional de um algoritmo, ou seja, quanto de recurso ele aloca para realizar sua
  ou suas tarefas.
    . alta complexidade : mais esforço
    . baixa complexidade: menos esforço
    . Notação Big 0
      - O(n!)              - maior complexidade
      - O(^x)
      - O(log n + n)
      - O(n)
      - O(log n)          - menor  complexidade
  - estabilidade
    . quanto a estrutura é desordenada até chegar na ordenação.
  
------- Aula 1 (27/07/2026) -------

Essa disciplina é a continuação de Estrutura de Dados, e puxa um pouco de POO. Ela vai ter ênfase em algoritmos de ordenação (SORT).

Algoritmos padrões:
  SELEÇÃO  - SELECTION      \
  BOLHA    - BUBBLE          | -> São simples, mas possuem uma alta complexidade.
  INSERÇÃO - INSERTION      /
  AGITAÇÃO
  PENTE                        -> COMB SORT
  SHELL
  BUCKET
  MEASE                     \ 
  QUICK                      \ _ > São complexos, mas possuem baixa complexidade.
  HEAP
  ...

Complexidade, na área da c.comp, é ESFORÇO COMPUTACIONAL. É medida pela quantidade de comparações e trocas.

Eficiente vs Eficaz
  -> Ambos atingem objetivos
  -> Só que o eficaz tem relação com tempo
  
- CRUD:    
  . CREATE
  . READ 
  . UPDATE    
  . DELETE 
  
-----------------------------------
</pre>
