## Collections Framework

| Método                                                   | Função                                      |
| -------------------------------------------------------- | ------------------------------------------- |
| **List** <Double> notas = **new** ArrayList<>();         | Cria um ArrayList                           |
| **notas**.add(7d);                                       | Adiciona conteúdo na lista                  |
| **notas**.add(4, 8d);                                    | Adiciona conteúdo em uma posição específica |
| **notas**.indexOf(5d);                                   | Exibe a posição de um item                  |
| **notas**.contains(5d);                                  | Checa se um item existe                     |
| **notas**.set(**notas**.indexOf(1d), 6d);                | Substitui um item                           |
| **notas**.get(2);                                        | Exibe um item de acordo com a posição       |
| **Collections**.min(notas);  **Collections**.max(notas); | Exibe o menor e maior valor da lista        |
| **notas**.remove(2)                                      | Remove um item na posição indicada          |

| Método                                                       | Função                                                   |
| :----------------------------------------------------------- | :------------------------------------------------------- |
| **nome**.size( );                                            | Mostra o tamanho da lista                                |
| **notas**.clear( );                                          | Apaga toda a lista                                       |
| **notas**.isEmpty;                                           | Checa se a lista está vazia                              |
| **Collections**.shuffle(NomeDaLista);                        | Embaralha a lista                                        |
| **Collections**.sort(NomeDaLista)                            | Organiza a lista em ordem natural, precisa do comparable |
| **Collections**.sort(meusGatos, new ComparatorIdade());   **//ou** | Organiza lista                                           |
| **meusGatos**.sort(new ComparatorIdade());                   |                                                          |
|                                                              |                                                          |
|                                                              |                                                          |



| Método                            | Função                                                       |
| :-------------------------------- | :----------------------------------------------------------- |
| **nomeDoMap**.put(key, value)     | Adiciona uma chave e valor no Map / Substitui um item já existente |
| **nomeDoMap**.containsKey(key)    | Verifica se existe determinada key no Map                    |
| **nomeDoMap**.get(key)            | Exibe determinada key e seu valor                            |
| **nomeDoMap**.keySet()            | Exibe apenas as keys - Retorna como um **Set**               |
| **nomeDoMap**.valuest()           | Exibe apenas os values - Retorna como uma **Collection**     |
| nomeDoMap**.entrySet()**;         | Transforma o map em uma lista que permite trabalhar com keys e values individualmente em um for each |
| **nomeDoMap**.replace(key, value) | Substitui um elemento no Map                                 |
|                                   |                                                              |
|                                   |                                                              |

| Método Stream                                                | Função                                                       |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| nomeDaLista.**stream()**                                     | Habilita a utilização de stream, sempre vem antes dos métodos |
| nomeDaLista.stream().**limit(numero)**                       | Pega os x primeiros números da lista para fazer algo         |
| nomeDaLista.stream().limit(numero).**collect(Collectors.toSet())** | Pega os x primeiros números e passa para um Set (poderia ser outro tipo, como List) |
| **.forEach(System.out::println)**                            | Forma simplificada por referência para imprimir a lista      |
|                                                              |                                                              |
|                                                              |                                                              |
|                                                              |                                                              |
|                                                              |                                                              |
|                                                              |                                                              |

## Interface List

​	Lista que permite elementos duplicados e garante ordem de inserção.

​	**import** java.util.List;





**Para fazer operações com os elementos da lista:**

- Importar o iterator

**Iterator**<Double> iterator = *notas.iterator()*;    //*Fazer uma variavel utilizando a classe iterator<>*

**Double** soma = 0d;

**while** (iterator.**hasNext( )**){

​	Double next = iterator.**next( )**;

​	soma += next;

}        //*Utilizar while para somar os elementos*



## Ordenação 

É possível ordenar a lista de acordo com os atributos, utilizado o COMPARABLE ou COMPARATOR. Quando a comparação é feita é retornado um número que indica o resultado da comparação: **-1** se o *obj1* vier antes do *obj2*; **0**  se os dois *obj* forem iguais; **1** se o *obj1* vier depois do *obj2*.



**Para ordenar a lista com comparable:**

- Fazer a classe implementar a interface comparable:

static class NomeDaClasse **implements Comparable**<NomeDaClasse>{ }



- Aplicar um método compareTo para organizar a lista:

 **@Override**

​    public int **compareTo**(Gato gato) {

​      **return** this.getNome().compareTo(gato.getNome());

​    }

- Chamar a lista organizada:

**Collections**.sort(NomeDaLista)

System.out.println(NomeDaLista)







**Para ordenar com comparator**:

- Criar a classe do comparator com o método compare:

  

static class **ComparatorIdade** implements Comparator<Gato>{

​    **@Override**

​    public int **compare(Gato g1, Gato g2)** {

​      **return** Integer.compare(g1.getIdade(), g2.getIdade());   **// Em caso de números** ou

​	**return** **g1**.getIdade().compareTo(**g2**.getIdade());               **// Em caso de números ou Strings**

​    }

  }

}



- **Critério de desempate**:

Criar uma classe que compara todos os atributos e utilizar if para utilizar outro atributo caso a primeira comparação seja igual (como a comparação retorna -1,0 ou 1, esse retorno será usado no if):



 static class **ComparatorNomeCorIdade** implements Comparator<Gato>{

​    **@Override**

​    public **int** compare(Gato g1, Gato g2) {

​      **int** nome = g1.getNome().compareTo(g2.getNome());

​      if (nome != 0) **return** nome;



​      **int** cor = g1.getCor().compareTo(g2.getCor());

​      if (cor != 0) **return** cor;



​      **return** Integer.compare(g1.getIdade(), g2.getIdade());

​    }

  }



### ArrayList 

**Implementa List** - Funciona como lista.

​	Utiliza arrays para guardar elementos. Funciona melhor quando são feitas muitas consultas aos elementos, pois manipula-los 	com arraylist demanda mais tempo.



### LinkedList 

**Implementa List e Queue** - Funciona como lista e queue.

Utiliza lista duplamente ligada para guardar elementos. Funciona melhor quando é necessário manipular os elementos.



### Vector 

Implementa List

Thread Safe



## Interface Set

"Lista" que não permite elementos duplicados e não possui índice (posições). Utiliza os mesmos métodos da List, de acordo com suas limitações.

**import** java.util.Set

**Convertendo um tipo de set em outro (Funciona apenas com Double/Classes com comparable):**

Set<Double> nomeDoTreeSet = new TreeSet<>(nomeDoSet);



### HashSet

**Implementa Set**

Utiliza HashMap para armazenar, guarda itens em ordem aleatória, tem maior performance e permite um único elemento null.



### LinkedHashSet

**Extends de HashSet**

Utiliza LinkedHashMap para armazenar, guarda itens em ordem de inserção, tem performance mediana, e permite um único elemento null.



### TreeSet

**Implementa NavigableSet que extends de SortedSet**

Utiliza TreeMap para armazenar, guarda itens em ordem numérica/alfabética, pior performance dos 3, não permite nenhum elemento null.



## Interface Map

Não implementa de collections. Cada elemento do map tem uma chave **(key)** que não pode se repetir, e um valor **(value)** que pode se repetir.



**Map**<TipoDaKey, TipoDoValue> nomeDoMap = **new** HashMap<>()



### Hashtable 

Threadsafe



### TreeMap

**implementa NavigableMap que extende de SortedMap**

Comparação, ordenação.



### HashMap



### LinkedHashMap

**implementa HashMap**

Guarda os itens por ordem de inserção.



**Map.Entry** com forEach



**Set**<**Map**.**Entry**<key, value>> nome = nomeDoMap**.entrySet()**;

**for** (**Map.Entry**<String,Double> entry : nome){

**System.out.println**("key: " + **nomeDoMap**.getKey() + " value: " + **nomeDoMap**.getValue());

}

**// OU**



**for** (**Map.Entry**<String,Double> entry : nomeDoMap**.entrySet()**){

**System.out.println**("key: " + **nomeDoMap**.getKey() + " value: " + **nomeDoMap**.getValue());

}



## Java Streams



### Classe anônima

Classe sem nome que é declarada em instanciada em uma única instrução. Utilizada quando for utilizada apenas uma vez.

Exemplo:



**nomeDeLista.sort**(new Comparator<ClasseASerComparada>() {

@Override

public int compare(*ClasseASerComparada* c1, *ClasseASerComparada* g2) {

​		**return** Integer.compare(c1.getNome(), g2.getNome())

}})



## Functional Interface

Qualquer interface com uma SAM (Single Abstract Method) é uma interface fuincional e sua implementação pode ser tratada como expressões lambda.

- Comparator
- Consumer
- Function
- Predicate





## Lambda

Uma função sem declaração. Usado assim que declarado, como a Classe Anônima.

(argumento) -> (corpo)



## Reference Method

Recurso que permite fazer referência a um método ou construtor de uma classe e indicar que ele deve ser utilizado num ponto específico, deixando mais simples e legível. para utilizar basta indicar a classe ou referência seguida do símbolo "::" e o nome do método sem os parenteses no final. É um método que simplifica o Lambda.

Exemplo:

**nomeDaLista**.sort(**Comparator**.*comparing*(Classe::getNome));



## Streams API

Nova opção de manipluação de collections em Java seguindo os princípios da programação funcional. Utiliza Lambda.

**Source** -------> **Pipeline** -------> **Terminal**



NomeDaLista.**stream()**



