# Anotações da disciplina

### **Semana 2**
<pre>
------- Aula 1 (03/08/2026) -------
  
Programar em MVC (Model, View, Controller).

Estabilidade do algoritmo:
  Estável  -> o processo de ordenação sempre garante a ordenação temporária da estrutura.
  Instável -> o processo de ordenação não garante a ordenação temporária da estrutura.

Atividade de fixação
  1) Pesquisar sobre os métodos de ordenação e categoriza-los em:
      - algoritmo de memória interna ou memória externa
      - estabilidade (estável ou instável)
      - complexidade
      - porções de ordenação

      -> bolha (bubble sort):
        - memória interna
        - estável
        - O(n^2)
        - porção ordenada
    
      -> seleção (selection sort)
        - memória interna
        - instável
        - O(nˆ2)
        - porção ordenada: início
    
      -> inserção (inserction sort)
        - memória interna
        - estável
        - O(nˆ2)
        - porção ordenada: início
    
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
