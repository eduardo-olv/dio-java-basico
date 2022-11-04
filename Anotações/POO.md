## Orientação a Objetos

A orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos.

**Pilares**: Abstração; Reuso; Encapsulamento;

## Classes

Estrutura que abstrai um conjunto de objetos com características similares. Define o comportamento dos seus objetos através de atributos. Uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.

O nome da classe é composto por um substantivo.

**class** Carro { }



## Atributos

Atributos são responsáveis por caracterizar uma classe, deixar sua representação mais precisa no mundo real. Um atributo para a classe carro poderia ser "vermelho". Atributo é parecido com variável, mas o atributo é feito na classe, e a variável é feita no método.

O nome do atributo é composto por um substantivo e/ou adjetivo.

**class** Carro {

​	**String** modelo;

​	**String** cor;

​	**int** capacidadeTanque;

}

## Método

Realizam as ações da classe quando requisitados. É escrito com a **Visibiliade**, **Retorno**, *Nome* e *Parâmetros*. Aceitam sobrecarga.

**class** Carro {

​	**void** frear( ){

​	}

}



**Construtor**:

Método especial que cria objetos. Também serve para armazenar valores iniciais de objetos ou atributos da classe. É escrito apenas com seu nome, que é o mesmo da classe, seguido de parênteses.

**class** Carro{

​	Carro( ){

​	}

}



**Destrutor**

Método especial que auxilia a destruição de um objeto (libera recursos que o objeto utilizava). Diferente do Construtor, precisa de um **void** antes do nome que se chama finalize.

**class** Carro{

​	**void** finalize ( ) {

​	}

}



**Get e Set**



**Set**: Serve para definir um valor a uma variável.

*void* **String** serCor (**String** cor ) {

​	**this**.*cor* = "Vermelho";

}



**Get**: Serve para retornar um valor.

**String** getCor( ){

​	*return* cor;

} 



## Objetos

É a representação de um conceito/entidade do mundo real. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos.

A diferença entre classe e objeto é que classe é apenas a "descrição" de como o conceito/entidade funciona. Já o objeto coloca em prática o que está na classe. Objetos são instâncias de classes.

A criação de objetos é composta por: **Classe** nomeDoObjeto = **new** *Construtor*;



**Carro** carro = **new** Carro ( );



## Mensagem

É o processo de ativação de um método de um objeto ou classe. Isso ocorre quando uma requisição (chamada) a esse método é realizada.

Para chamar o método de um objeto: *objeto*.**método**;

*carro*.**método**;

Para chamar o método de uma classe: *Classe*.**método**;

*Carro*.**método**;







## Herança

Quando uma classe herda atributos e métodos de outra classe.

**class** A **extends** B{ 

}



- **Tipos de herança**:

**Herança Simples**: A classe filha tem só uma classe mãe.

**Herança Múltipla**: A classe filha tem mais de uma classe mãe. **<--- NÃO EXISTE NO JAVA ----**





- **Upcast e downcast**

- - **Upcast**: Transformar uma classe mais baixa da hierarquia em uma classe mais alta.

  - **A** a = *new* **B ( )**;

    

- - **Downcast**: Transformar uma classe mais alta em uma mais baixa.
  - **B** b = **(B)** *new* **A ( )**;



## Polimorfismo

A mesma ação se comportando diferente. Colocando vários objetos em um array e chamando um método com nome em comum entre eles.



## Sobrescrita 

A mesma ação PODENDO se comportar diferente.

@Override

## Associação

Interação entre classes e objetos para atingirem seus objetivos.

**Tipos**:

- Estrutural (Atributos)

  

  - Composição (Com Parte Todo) - A **parte** só existe com o **todo**. Ex.: O **endereço** de uma **pessoa**.

    **class** Pessoa {

    **Endereco** endereco;

    }

  - Agregação (Sem Parte Todos) - A **parte** existe mesmo sem o **todo**. Ex.: Uma **Disciplina** de um **aluno**.

    **class** Disciplina {

    **Aluno** aluno;

    }

- Comportamental (Métodos)

  - Dependência: "Depende de": Quando um método em uma classe depende de outro objeto para se realizar. Ex.: o método para finalizar uma compra, que pode precisar do objeto "cupom de desconto".

    **class** Compra {

    ...

    ​	**finalizar** (**Cupom** cupom, ...)

    ...

    }

**Herança x Associação**: "Uma coisa é a outra?" Se sim, então usamos herança, se não, ela uma coisa usará a outra, usamos associação.

## Interface

Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza.

**interface** A{

}



**class** B **implements** A{

}
