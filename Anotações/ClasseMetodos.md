## Classe

Objeto que representa objetos do mundo real. Métodos, variáveis e etc são montados dentro de classes.

**Modificador** *class* **NomeDaClasse** { }



**public** *class* NomeDaClasse { }



## Método

Estruturas resposáveis por executar uma ação dentro do programa, como calcular, enviar, imprimir, etc ...

Deve-se especificar a visibilidade, o tipo de retorno, o nome e os parâmetros.



**Visibilidade:** *public* (visível para todo o código) ou *private* (Não pode ser visto por outras classes).

**Tipo de retorno:** Mesmos tipos das variáveis. *void* não retorna nada.

**Nome:** Verbo infinitivo, ação a ser feita.

**Parâmetros:** Elementos a serem utilizados no método, como os números a serem somados.



*public* **int** somar (*int* numeroUm, *int* numeroDois){

**int** *resultado* = numeroUm + numeroDois;

**return** resultado; 

}

O **return** acima diz que o método deve retornar o número **int** obtido na variável *resultado*.



**Assinatura do método:** nome + parâmetros. Utilizado para chamar o metódo para ser acionado em outra classe.

**main**( )

nomeDaClasse.**main**()





#### Sobrecarga

Quando um método (Assinatura) pode receber diferentes parâmetros para fazer a mesma coisa.

**converterParaInt** (float f, RoudType rd) <-- **RoudType rd** arredonda o **float f** para baixo.

**converterParaInt** (double d)

**converterParaInt** (string s)