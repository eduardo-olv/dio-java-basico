## Repetição

#### While

Repete de acordo com condição.

**while**(true) { }

Pode ser interrompida com **break;**



#### Do While

Mesma coisa que while, mas a checagem da condição é feita no final.

**do**{

}**while** (true);



#### For

Parecido com while, mas condições são impostas de forma diferente.

Exemplo em um programa que gera tabuada:

**for**(int = 1; int <= 10; int++){ }

**condição 1:** declaração da variável; **condição 2:** condição para o for continuar repetindo; **condição 3:** aumenta valor da variável.



#### ForEach

Para cada elemento dentro do array especificado, vai fazer a ação especificada, como por exemplo, imprimir cada elemento.

**for** (**String** string : *array*) { }



Para utilizar em Arrays **Multidimensionais**:

**for** (**int**[ ] *linha* : *array*) {

​      **for** (**int** *coluna* : *linha*) {

​        System.out.println(coluna); }

​      }

