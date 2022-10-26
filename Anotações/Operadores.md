## Operadores

| Operador | Função                                   |
| -------- | ---------------------------------------- |
| +        | Operador de adição                       |
| -        | Operador subtração                       |
| *        | Operador de multiplicação                |
| /        | Operador de divisão                      |
| %        | Operador de módulo (ou resto da divisão) |

| Operador | Função                                                       |
| -------- | ------------------------------------------------------------ |
| ==       | Utilizado quando desejamos verificar se uma variável é igual a outra. |
| !=       | Utilizado quando desejamos verificar se uma variável é diferente de outra. |
| >        | Utilizado quando desejamos verificar se uma variável é maior que outra. |
| >=       | Utilizado quando desejamos verificar se uma variável é maior ou igual a outra |
| <        | Utilizado quando desejamos verificar se uma variável é menor que outra. |
| <=       | Utilizado quando desejamos verificar se uma variável é menor ou igual a outra. |

| Operador Lógico | Significado |
| :-------------- | ----------- |
| \|\|            | OU          |
| &&              | E           |





## Operador ternário



**Forma padrão:**

*if*  (a==b)

​		**resultado** = verdadeiro;

*else*

​		**resultado** = falso;



**Forma Abreviada em uma linha:**

*String* **resultado** = a == b *?* "verdadeiro" *:* "falso";

*ou*

*int* **resultado** = a == b *?* 1 *:* 0 ; 



**Checando igualdade em strings ou objetos:**

Ao invés de **==** utiliza-se **.equals( )**

System.out.println(nomeUm.*equals*(nomeDois));