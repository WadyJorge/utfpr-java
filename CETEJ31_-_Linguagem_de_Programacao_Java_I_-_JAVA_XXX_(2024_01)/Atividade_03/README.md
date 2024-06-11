# UTFPR - JAVA I - Pós Graduação em Tecnologia Java

## Atividade 03 – Herança

**Este exercício trata-se de uma evolução da Atividade 01.**

Embora a Atividade 3 trate do conceito e aplicação do mecanismo de Herança, ela também pode nos ajudar compreender a realidade das empresas e instituições que buscam intensificar o uso de padrões de projetos desenvolvidos, de maneira ad hoc, por elas mesmas, com intuito de padronizar a construção de seus softwares.

Por exemplo, ao definir-se como "final" um método "set", indicando que não poderá ser sobrescrito, garantimos a perpetuação de uma regra de negócio restritiva sobre as características possíveis de um objeto (um atributo deste), como quando não queremos que um atributo receba um valor fora de uma escala prevista.

**1) OBSERVE O SEGUINTE DIAGRAMA DE CLASSES:**

Obs.: As alterações e novos elementos referentes à atividade encontram-se marcadas em
amarelo e laranja (relacionamentos) no diagrama.

![Diagrama de Classes - Atividade 03](/CETEJ31_-_Linguagem_de_Programacao_Java_I_-_JAVA_XXX_(2024_01)/Images/Diagrama_de_Classes_-_Atividade_03.png)

**2) UTILIZE O CÓDIGO DESENVOLVIDO NA ATIVIDADE 01 E DESENVOLVA OS NOVOS ELEMENTOS APRESENTADOS NO DIGRAMA ACIMA. ABAIXO, SEGUE A LISTA DE REQUISITOS A SEREM SEGUIDOS:**
- a) A “entrada” da velocidade (atributo velocMax) sempre será dada em km/h porém, a exibição destes dados ocorrerá na classe Teste e da seguinte forma:
    - i. A velocidade do veículo de passeio deverá ser calculada em m/h;
            1 kilometer/hour = 1000 meter/hour
    - ii. A velocidade do veículo de carga deverá ser calculada em cm/h;
            1 kilometer/hour = 100000 centimeter/hour
- b) Os métodos construtores default das novas classes também deverão iniciar com 0 (zeros) atributos que sejam de tipos numerais (int, double, float, etc.) e com espaço em branco os que forem de tipo literais (char, String e etc.).
- c) Garanta que nunca ocorra:
    - i. As classes Passeio e Carga jamais deverão ser estendidas (herdadas);
    - ii. Nenhum método “set” (de nenhuma classe) poderá ser sobrescrito;
- d) A classe “Teste” deve ser construída de forma a testar todas as funcionalidades do programa (entrada, saída e cálculos), propiciando assim “trocas de mensagens” entre os objetos das classes Teste→Passeio e Teste→Carga. Por meio dela deverá ser possível instanciar 5 veículos de cada tipo (Passeio/Carga).

**3) O QUE SERÁ AVALIADO:**
- a) Correta construção das classes, com os atributos e métodos conforme descritos no diagrama de classe do item 01.
- b) Relacionamento de herança entre as classes..
- c) Cada uma das solicitações presentes no item 2.
- d) Implementação da relação entre as classes Teste -> Passeio, Teste -> Carga, conforme solicitado no item 2.d.
- e) Uso do encapsulamento.

**IMPORTANTE!**
- Atenha-se aos nomes dos elementos (classes, atributos e métodos) conforme apresentados no diagrama.
- Novos métodos poderão ser criados, caso julgue necessário.
- Os itens avaliados são os solicitados no enunciado. Elementos extras NÃO renderão pontos a mais.
- O não cumprimento do que foi solicitado acarretará no decréscimo da nota de acordo com a gravidade da falta.
- A justificativa para qualquer desconto será colocada, pelo avaliador, no campo de feedback de cada Atividade.

**4) EXEMPLO DE ENTRADA DE DADOS E SAÍDA ESPERADA:**

![Entrada de Dados - Atividade 03](/CETEJ31_-_Linguagem_de_Programacao_Java_I_-_JAVA_XXX_(2024_01)/Images/Exemplo_EntradaDados_-_Atividade_03.png)

Obs.: A entrada de dados pode ser feita por meio dos métodos setters (como nos exemplos
acima) ou utilizando os construtores de cada classe. 

![Saída de Dados - Atividade 03](/CETEJ31_-_Linguagem_de_Programacao_Java_I_-_JAVA_XXX_(2024_01)/Images/Exemplo_SaidaDados_-_Atividade_03.png)

Obs.: Embora os exemplos acima mostrem apenas 1 saída para cada tipo de veículo, a aplicação
desenvolvida deve ter a saída para os CINCO veículos de CADA TIPO, conforme solicitado no
enunciado acima.

&nbsp;
### INFORMAÇÕES SOBRE O DESENVOLVIMENTO:
1. O projeto foi desenvolvido utilizando o Notepad++.
2. O código foi desenvolvido em Java "puro", sem o uso de nenhum Framework.
3. Para rodar o programa, siga as instruções abaixo:
    - Certifique-se de que todos os arquivos estejam dentro do mesmo diretório (pasta).
    - No diretório, execute o comando **$ javac Teste.java** para compilar o código-fonte. Isso criará os bytecodes (arquivos .class).
    - Em seguida, execute o comando **$ java Teste** para executar o programa.

Obs.: Se a lista de veículos for impressa no terminal, o programa funcionou corretamente!