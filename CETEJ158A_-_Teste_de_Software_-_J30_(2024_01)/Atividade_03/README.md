# UTFPR — Teste de Software — Pós-Graduação em Tecnologia Java

## Atividade 03 - Test-Driven Development (TDD)

**Descrição da Atividade:**

Esta atividade tem como objetivo aplicar os princípios de **Test Driven Development (TDD)** na construção de uma funcionalidade em Java, utilizando a biblioteca **JUnit** para testes automatizados.

---

### Enunciado:

Seguindo o ciclo de desenvolvimento orientado por testes (TDD), deve-se implementar uma **calculadora de salário líquido** para funcionários, considerando os seguintes critérios:

Cada funcionário possui os atributos:

- Nome
- E-mail
- Salário-base
- Cargo

A regra para o cálculo do salário líquido depende do cargo ocupado, conforme descrito abaixo:

| Cargo         | Regra de Desconto                                                    |
|---------------|----------------------------------------------------------------------|
| DESENVOLVEDOR | - 20% se salário ≥ 3.000,00  <br> - 10% se salário < 3.000,00         |
| DBA           | - 25% se salário ≥ 2.000,00  <br> - 15% se salário < 2.000,00         |
| TESTADOR      | - 25% se salário ≥ 2.000,00  <br> - 15% se salário < 2.000,00         |
| GERENTE       | - 30% se salário ≥ 5.000,00  <br> - 20% se salário < 5.000,00         |

---

### Exemplos de Cálculo:

- DESENVOLVEDOR com salário-base de 5.000,00 → salário final: 4.000,00  
- GERENTE com salário-base de 2.500,00 → salário final: 2.000,00  
- TESTADOR com salário-base de 550,00 → salário final: 467,50  

---

### Requisitos de Implementação:

1. Seguir a abordagem **TDD**, desenvolvendo os testes antes das implementações.
2. Implementar as classes e métodos necessários utilizando a linguagem **Java**.
3. Utilizar a biblioteca **JUnit** para a criação dos testes automatizados.
4. Organizar as classes de forma coesa e seguindo boas práticas de codificação.
5. Não é necessário implementar interface gráfica ou entrada de dados via console.

---

### Forma de Entrega:

A entrega deverá ser realizada em **um único arquivo `.pdf`**, contendo:

- O código-fonte completo das classes implementadas;
- Os testes automatizados escritos em JUnit;
- Todo o conteúdo deve estar visível no PDF, com formatação adequada.
