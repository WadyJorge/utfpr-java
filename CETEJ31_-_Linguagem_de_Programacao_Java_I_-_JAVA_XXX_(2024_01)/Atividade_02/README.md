# UTFPR - JAVA I - Pós Graduação em Tecnologia Java

## Atividade 02 – Encapsulamento

**Ficha para definição dos tipos de encapsulamento.**

Este exercício tem por função testar as restrições de comunicação (trocas de mensagens) entre objetos. Para ajudar a solucioná-lo veja os slides sobre “Encapsulamento” postados no Moodle (Aula5) e depois baixe o arquivo byteCode Pai.class, também postado no Moodle.

**ATENÇÃO:** O objetivo da atividade NÃO É preencher as lacunas com os valores que DEVERIAM estar ali, mas sim pelos modificadores USADOS no byteCode fornecido. Por isso é preciso fazer o teste do byeCode.

Há diversas maneiras de testar o encapsulamento dos atributos e métodos do arquivo byteCode.

Uma forma é criando uma classe de teste como bloco de notas e utilizar o compilador Java por meio da linha de comandos.

Outra maneira é utilizando uma IDE de desenvolvimento, como o Eclipse. Nesse caso, será preciso importar o arquivo .class para as bibliotecas da sua aplicação. No material de apoio da semana há tutoriais explicando a importar o arquivo .class no NetBeans, Eclipse e IntelliJ.

Com a classe de testes desenvolvida, utilize o código abaixo como guia para o preenchimento da “Atividade 02 – Questionário” no Moodle. Nos campos destacados deve conter os modificadores public ou private, de acordo com o resultado dos testes

    public class Pai {
        //ATRIBUTOS
        __________ String nome;
        __________ int idade;
        __________ double salario;
        
        //MÉTODOS
        __________ void cadPai(String nm, int anos, int sal) {
        nome = nm;
        idade = anos;
        salario = sal;
        }

        __________ void calcSalario() {
        salario = salario * 1.10;
        System.out.println("\nSalario......: "+ salario);
        }
        
        __________ void impPai() {
        System.out.println("\nNome.......: "+ nome);

        System.out.println("\nIdade........: "+ idade);
        System.out.println("\nSalario......: "+ salario);
        }
    }

**ATENÇÃO!**
Este documento é apenas um guia para facilitar o preenchimento do questionário online referente a atividade. A entrega da tarefa em si será feita APENAS respondendo à Atividade 02 – Questionário no Moodle.

### INFORMAÇÕES SOBRE O DESENVOLVIMENTO:
1. O projeto foi desenvolvido utilizando o Notepad++.
2. O código foi desenvolvido em Java "puro", sem o uso de nenhum Framework.
3. Para rodar o programa, siga as instruções abaixo:
    - Certifique-se de que todos os arquivos estejam dentro do mesmo diretório (pasta).
    - No diretório, execute o comando **$ javac Teste.java** para compilar o código-fonte. Isso criará os bytecodes (arquivos .class).
    - Em seguida, execute o comando **$ java Teste** para executar o programa.
    - Se houver erros durante a compilação, eles serão exibidos, permitindo identificar quais classes são privadas.