## Variáveis

*Tipo* **nomeDaVariavel** = Atribuição; (As vezes opcional)

- Apenas letras, números, _ ou $
- Nunca começa com número
- Inicia com letra minúscula (boa prática)
- Sem espaços ou palavras chave da linguagem

*String* **carro1_$** = "Sedan";



Para trocar o valor de atribuição:

*int* **anoFabricacao** = 2015

**anoFabricacao** = 2022 (O tipo da variável é mantido, sem necessidade de repetir)



## Variáveis Imutáveis (Constantes)

- Quando a própria variável já entrega o significado e é escrita em caps lock. (Convenção)

*String* **BR** = "Brasil";

*int* **PI** = "3.14";

- O tipo *final* garante que a variável não vai mudar.

**final** *String* **BR** = "Brasil";



## Tipos de Variáveis 



Tabela de Tipos Primitivos e seus valores:

| Tipo  | Memória | Valor Máximo               | Valor Mínimo               |
| ----- | ------- | -------------------------- | -------------------------- |
| byte  | 1 byte  | 127                        | -128                       |
| short | 2 byte  | 32.767                     | -32.768                    |
| int   | 4 bytes | 2.147.483.647              | -2.147.483.648             |
| long  | 8 bytes | 9.223.372.036.854.775.807L | -9.223.372.036.854.775.808 |

Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:

| Tipo   | Memória | Mínimo         | Máximo        | Precisão      |
| ------ | ------- | -------------- | ------------- | ------------- |
| float  | 4 bytes | -3,4028E + 38F | 3,4028E + 38F | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos    |

Tipos não numéricos:

| Tipo    | Memória | Função                     | Exemplo de valor                            |
| ------- | ------- | -------------------------- | ------------------------------------------- |
| boolean | 1 bit   | Lógico                     | false; true                                 |
| char    | 1 byte  | Caractere                  | 'A'                                         |
| String  |         | Texto                      | "abcdefghi"                                 |
| Classe  |         | Classe que representa algo | **Date** dataNascimento = new **Date** ( ); |



