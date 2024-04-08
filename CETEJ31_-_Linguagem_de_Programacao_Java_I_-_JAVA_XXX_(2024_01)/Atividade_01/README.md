# UTFPR - JAVA I - Pós Graduação em Tecnologia Java

## Atividade 01 – Implementação Motor/Veículo/Teste

**1) OBSERVE O SEGUINTE DIAGRAMA DE CLASSES::**

![Diagrama de Classes - Atividade 01](/CETEJ31_-_Linguagem_de_Programacao_Java_I_-_JAVA_XXX_(2024_01)/Images/Diagrama_de_Classes_-_Atividade_01.png)

**2) DESENVOLVA UMA APLICAÇÃO NA LINGUAGEM DE PROGRAMAÇÃO JAVA ATENDENDO OS SEGUINTES REQUISITOS:**
- a) Todos os métodos construtores default (que não possuem parâmetros formais em sua assinatura) deverão iniciar com 0 (zeros) atributos que sejam de tipos numerais (int, double, float, etc.) e com espaço em branco (“ “) aqueles que forem de tipo literais (char, String e etc).
- b) A classe “Teste” deve ser construída de forma a testar todas as funcionalidades do programa. Nesta deverão ser implementadas as entradas de dados e a impressão destes na tela. Por meio dela deverá ser possível instanciar 5 veículos.
- c) Perceba que, de acordo com as associações descritas no diagrama de classes e suas cardinalidades, a classe “Teste” irá conter apenas objetos do tipo “Veiculo”. Em momento nenhum deverá conter objetos do tipo Motor. No entanto deverá, por meio de um objeto do tipo Veiculo, instanciar os atributos do objeto atributo motor, contido na classe Veiculo, que é do tipo Motor.
- d) Perceba que a classe Veículo POSSUI um atributo do tipo Motor.

**3) O QUE SERÁ AVALIADO:**
- a) Correta construção das classes, com os atributos e métodos conforme descritos no diagrama de classe do item 01.
- b) Criação do construtor default conforme solicitado no item 2.a.
- c) Correta criação da classe Teste, a qual deve instanciar os objetos e fazer uso de métodos para atribuir valores aos atributos e imprimi-los na tela.
- d) Instanciação da quantidade de elementos solicitados no item 2.b.
- e) Correta implementação da relação entre as classes Teste -> Veículo e Veículo -> Motor, conforme solicitado no item 2.c.
- f) Correto uso dos recursos da linguagem de programação Java, tais como criação de variáveis, laços de repetição, blocos condicionais.


**IMPORTANTE!**
- Atenha-se aos nomes dos elementos (classes, atributos e métodos) conforme apresentados no diagrama.
- Novos métodos poderão ser criados, caso julgue necessário.
- Os itens avaliados são os solicitados no enunciado. Elementos extras NÃO renderão pontos a mais.
- O não cumprimento do que foi solicitado acarretará no decréscimo da nota de acordo com a gravidade da falta.
- A justificativa para qualquer desconto será colocada, pelo avaliador, no campo de feedback de cada Atividade.

&nbsp;
### INFORMAÇÕES SOBRE O DESENVOLVIMENTO:
1. O projeto foi desenvolvido utilizando o Notepad++.
2. O código foi desenvolvido em Java "puro", sem o uso de nenhum Framework.
3. Para rodar o programa, siga as instruções abaixo:
    - Certifique-se de que todos os arquivos estejam dentro do mesmo diretório (pasta).
    - No diretório, execute o comando **$ javac Teste.java** para compilar o código-fonte. Isso criará os bytecodes (arquivos .class).
    - Em seguida, execute o comando **$ java Teste** para executar o programa.

Obs.: Se a lista de veículos for impressa no terminal, o programa funcionou corretamente!
