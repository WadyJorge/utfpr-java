# UTFPR — JAVA II — Pós-Graduação em Tecnologia Java

## B2A1 - Sistema de Arquivos

**Objetivo:**

Fixar o aprendizado da API de IO do Java através da construção de um sistema de arquivos virtual em Java.

**Regras:**
1. Você deve utilizar o projeto template disponibilizado abaixo;
2. É proibido o uso de bibliotecas externas, utilize apenas aquilo que o JDK te oferece;
3. Cópias serão zeradas, tanto para o que copiou quando para o que forneceu a cópia.

**Entrega:**
1. Enviar apenas os arquivos **FileReader.java** e **Command.java**. Não compacte, apenas envie pelo Moodle;
2. Entregas fora do padrão descrito no item 1 não serão avaliadas. O reenvio das mesmas irá considerar como envio em atraso caso esteja fora do prazo da atividade;
3. Em caso de envio fora do prazo, o desconto será de 1 ponto por dia de atraso independente de ser um dia completo ou não, ex.: 1 dia e 1 hora de atraso contam como 2 dias de atraso, ou seja, 2 pontos de desconto.

**Descrição da Atividade:**

O sistema de arquivos será composto por uma aplicação de linha de comando que suporte os seguintes comandos:

1. **SHOW** deverá mostrar o conteúdo apenas de arquivos de tipo texto (TXT), caso seja usado em diretórios, deverá ser exibido um erro;
2. **LIST** deve listar o conteúdo do diretório atual;
3. **BACK** deve ser usado para sair de um diretório e ir para o seu "parente", caso seja usado na raiz, um erro deve ser exibido informando que não há como ir além do diretório raiz;
4. **OPEN** deve ser usado para abrir (ou acessar) um determinado diretório recebido como parâmetro;
5. **DETAIL** deve ser usado para detalhar informações de um arquivo ou diretório através da classe **BasicFileAttributeView** do NIO2, faça uma pesquisa na documentação da linguagem e/ou no material de apoio para entender como usar esta classe.
		
**Informações Importantes:**

1. Interpretação do código faz parte da solução da atividade, utilize os recursos de debug para entender como ele funciona e fazer o que se pede;
2. Há alguns TODOS dentro do código para ajudar a encontrar os locais que precisam ser feitas as implementações;
3. Comandos inválidos ou que não estejam consistentes (ex.: um OPEN sem parâmetros) não devem quebrar a execução, caso o faça, haverá desconto de nota;
4. Cada comando vale 20 pontos, totalizando 100 pontos;
5. Estamos em Java II, logo, espera-se um código que siga os padrões de linguagem da plataforma. O não uso dos padrões pode acarretar descontos de nota;
6. Atividades em modo rascunho não são avaliadas, verifique se realizou o envio em definitivo;
7. Envios com atraso tem desconto de 1 ponto por dia de atraso.
