# UTFPR — JAVA II — Pós-Graduação em Tecnologia Java

## B2A1 - Sistema de Arquivos

**Objetivo:**
Consolidar o aprendizado da API de IO do Java por meio da construção de um sistema de arquivos virtual em Java.

**Descrição da Atividade:**
O sistema de arquivos será composto por uma aplicação de linha de comando que deve suportar os seguintes comandos:

1. **SHOW** deve exibir o conteúdo apenas de arquivos de texto (TXT). Se usado em diretórios, deve exibir um erro;
2. **LIST** deve listar o conteúdo do diretório atual;
3. **BACK** deve ser usado para sair de um diretório e ir para o diretório "pai". Se usado na raiz, deve exibir um erro informando que não é possível ir além do diretório raiz;
4. **OPEN** deve ser usado para abrir (ou acessar) um determinado diretório fornecido como parâmetro;
5. **DETAIL** deve ser usado para detalhar informações de um arquivo ou diretório utilizando a classe **BasicFileAttributeView** do NIO2. Faça uma pesquisa na documentação da linguagem e/ou no material de apoio para entender como usar esta classe.
		
**Regras:**
1. Você deve utilizar o projeto template disponibilizado abaixo;
2. É proibido o uso de bibliotecas externas; utilize apenas o que o JDK oferece;
3. Cópias serão zeradas, tanto para quem copiou quanto para quem forneceu a cópia.

**Informações Importantes:**
1. A interpretação do código faz parte da solução da atividade; utilize recursos de debug para entender como ele funciona e para realizar o que se pede;
2. Há alguns TODOs dentro do código para ajudar a encontrar os locais que precisam de implementação;
3. Comandos inválidos ou inconsistentes (ex.: um OPEN sem parâmetros) não devem quebrar a execução. Caso isso ocorra, haverá desconto de nota;
4. Cada comando vale 20 pontos, totalizando 100 pontos;
5. Estamos em Java II, então espera-se um código que siga os padrões da linguagem. O não uso desses padrões pode acarretar descontos na nota;
6. Atividades em modo rascunho não serão avaliadas; verifique se realizou o envio em definitivo;
7. Envios com atraso terão desconto de 1 ponto por dia de atraso.

**Entrega:**
1. Envie apenas os arquivos **FileReader.java** e **Command.java**. Não compacte; apenas envie pelo Moodle;
2. Entregas fora do padrão descrito no item 1 não serão avaliadas. O reenvio será considerado como envio em atraso caso esteja fora do prazo da atividade;
3. Em caso de envio fora do prazo, haverá um desconto de 1 ponto por dia de atraso, independentemente de ser um dia completo ou não. Exemplo: 1 dia e 1 hora de atraso contam como 2 dias de atraso, ou seja, 2 pontos de desconto.
