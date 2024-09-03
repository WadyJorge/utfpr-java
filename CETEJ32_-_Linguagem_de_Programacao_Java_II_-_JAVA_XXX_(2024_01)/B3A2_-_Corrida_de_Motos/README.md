# UTFPR — JAVA II — Pós-Graduação em Tecnologia Java

## B3A2 - Corrida de Motos

**Objetivo:**

Exercitar os conceitos e a prática de **Race Condition** e **Critical Sections** por meio do uso de sincronização de métodos e/ou objetos para simular uma corrida de motos, onde o vencedor será aquele que acumular mais pontos ao acessar a região crítica (linha de chegada).

**Regras:**
1. O programa deve criar, no mínimo, 10 threads, representando cada competidor. Cada competidor deve ter o nome: Competidor #N (onde N é o número da thread);
2. Haverá, no mínimo, 10 corridas;
3. Uma corrida só deve iniciar após o término da corrida anterior, ou seja, quando todos os competidores cruzarem a linha de chegada (área crítica);
4. O placar da corrida será contabilizado toda vez que um corredor cruzar a linha de chegada (área crítica). O competidor receberá pontos de acordo com sua posição de chegada. Exemplo: O competidor 3 chegou primeiro na área sincronizada, recebendo 10 pontos; o competidor 5 chegou em segundo, recebendo 9 pontos, e assim por diante, até que o último a cruzar a linha de chegada ganhe 1 ponto;
5. As 10 corridas formam um campeonato. O vencedor será aquele que somar o maior número de pontos no campeonato;
6. Ao final do campeonato, deverá ser apresentado o placar com o total de pontos e o pódio, seguindo a estrutura mostrada na imagem.

<div align="center">
    <img src="/CETEJ32_-_Linguagem_de_Programacao_Java_II_-_JAVA_XXX_(2024_01)/Images/B3A2_-_Corrida_de_Motos.png" alt="B3A2 - Corrida de Motos">
</div>

**Critérios de Aceite e Avaliação do Exercício:**
1. Cada requisito possui um peso que compõe 80 pontos no total. Para obter a nota máxima, cumpra todos os requisitos; caso contrário, a nota será ajustada conforme cada requisito implementado;
2. A estrutura do código (uso das regras de escrita da linguagem e organização) e a parametrização dos valores de corridas e competidores (por exemplo, a possibilidade de ter um campeonato com 20 participantes e 30 corridas) terão um peso de 10 pontos;
3. Em caso de envio fora do prazo, haverá um desconto de 1 ponto por dia de atraso, independentemente de ser um dia completo ou não. Exemplo: 1 dia e 1 hora de atraso contam como 2 dias de atraso, ou seja, 2 pontos de desconto.

**Importante:**
- Cópias e/ou exercícios duplicados/idênticos serão descartados, contabilizando apenas os pontos da entrega (se feita no prazo);
- Faça o programa **todo em apenas uma classe**. Utilize recursos como classes aninhadas para organização. Caso envie o projeto e/ou PDF's ou vários arquivos, sua atividade não será avaliada, e o reenvio incorrerá em desconto por atraso;
- Envie **APENAS o arquivo .java** do programa, nada mais. Cada comando vale 20 pontos, totalizando 100 pontos;
- O objetivo da atividade também faz parte da avaliação;
- Atividades enviadas como rascunho não serão avaliadas. Verifique se realizou o envio em definitivo.
