# UTFPR — Teste de Software — Pós-Graduação em Tecnologia Java

## Atividade 05 - Mock Objects (Parte 2)

**Descrição da Atividade:**

Esta atividade tem como objetivo aplicar os princípios de **Test Driven Development (TDD)** no desenvolvimento e teste de um gerador de números aleatórios com regras de intervalo, utilizando **JUnit** para automatizar os testes e simular comportamentos por meio de objetos mock, quando necessário.

---

### Enunciado:

Seguindo o ciclo de desenvolvimento orientado por testes (TDD), o participante deve desenvolver as classes abaixo utilizando a linguagem **Java** e a biblioteca de testes **JUnit**:

---

### Classes a Serem Implementadas:

#### (1) `MyRandomNumber.java`

Esta classe é responsável por gerar números aleatórios dentro de um intervalo fechado `[begin, end]`, obedecendo às seguintes regras:

- O número gerado deve **estar dentro do intervalo** definido.
- O número gerado **não pode ser igual ao número anterior**.
- Deve ser lançada a exceção `IntervaloInvalidoException` quando:
  - `begin ≥ end`
  - `begin < 0` ou `end < 0`

```java
public class MyRandomNumber {
    Random random = new Random();

    /**
     * Gera um número aleatório entre [begin, end] diferente do anterior.
     *
     * @param begin início do intervalo (inclusive)
     * @param end fim do intervalo (inclusive)
     * @return número aleatório diferente do anterior
     * @throws IntervaloInvalidoException quando o intervalo é inválido
     */
    public int nextRandomNumber(int begin, int end) throws IntervaloInvalidoException {
        if (begin < 0 || end < 0 || begin >= end) {
            throw new IntervaloInvalidoException("Intervalo inválido.");
        }

        // TODO: Implementar lógica de geração evitando repetição do último valor
        return -1;
    }
}
```

#### (2) `IntervaloInvalidoException.java`
Classe de exceção personalizada utilizada para representar erros de intervalo:

```java
public class IntervaloInvalidoException extends Exception {
    public IntervaloInvalidoException(String msg) {
        super(msg);
    }
}
