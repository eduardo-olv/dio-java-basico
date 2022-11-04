## Exceções

Exceção é um evento que interrompe o fluxo normal do processamento de uma classe. Torna o programa mais robusto e confiável.

**Error**: Usado pela JVM que serve para indicar se existe um problema de recurso do programa, tornando a execução impossível de continuar.



**Unchecked (Runtime)**: Exceptions que **PODEM** ser tratadas e analisadas pelo desenvolvedor.



**Checked**: Exceptions que **DEVEM** ser evitadas e tratadas para o programa funcionar



--------------

**Para lançar os erros**:

Para lançar (se livrar) as exceções que vão dar erro (ainda precisa tratar):

(Após parametros do método ) **throws** NomeDaExceção {

}

Com esse comando o erro será "ignorado" e o próximo método que chamar esse método com erro, deve trata-lo



------------------------------------------------------------------------

**Para tratar os erros:**

Deve-se envolver os códigos que podem dar erro em um **try**, que deve ser seguido por um **catch** que decide o que fazer com o exception, e opcionalmente por um **finally**. 

É possível lançar vários catches seguidos para tratar os diferentes Exceptions de formas específicas, mas devem ser ordenados de forma que as Exceptions filhas fiquem acima das Exceptions mãe. Olhar hierarquia.

**try** {

Códigos a serem executados.

}

**catch**(NomeDaExcessão *variável*){



}

**catch**(NomeDaExcessão *variável*){



}

**finally**{

}



## Criando Exceptions personalizadas

Exception é uma classe java como qualquer outra, sendo assim é possível criar uma exception personalizada. Colocar Exception no final do nome como boa prática. 

Extender de Exception.

Para funcionar tem que fazer um **try** **catch** no método que pode dar erro com a exception correspondente, e fazer um **throws** para ser tratado no próximo método que o chamar. É como atribuir uma exception já existente à sua exception personalizada.



**class** NomeDaExcecaoException **extends** Exception{

}



