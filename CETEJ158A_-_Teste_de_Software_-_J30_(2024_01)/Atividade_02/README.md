# UTFPR — Teste de Software — Pós-Graduação em Tecnologia Java

## Atividade 02 - Teste de Unidade

**Descrição da Atividade:**

Esta atividade tem como objetivo aplicar os conceitos de teste de software utilizando particionamento em classes de equivalência para validar identificadores.

### Especificação do Programa:

O programa deve determinar se um identificador é válido ou não. Um identificador será considerado **válido** se atender às seguintes condições:

- Iniciar com uma **letra**;
- Conter apenas **letras ou dígitos**;
- Ter comprimento mínimo de **1 caractere** e máximo de **6 caracteres**.

Exemplos:

- `abc12` → válido  
- `cont*1` → inválido  
- `1soma` → inválido  
- `a123456` → inválido  

---

### Particionamento em Classes de Equivalência:

| Condição de Entrada                     | Classes Válidas | Classes Inválidas |
|----------------------------------------|------------------|--------------------|
| Tamanho `t` do identificador           | 1 ≤ t ≤ 6 (1)    | t > 6 (2)          |
| Primeiro caractere é uma letra         | Sim (3)          | Não (4)            |
| Contém apenas letras ou dígitos        | Sim (5)          | Não (6)            |

---

### Conjunto de Casos de Teste:

Os casos de teste devem ser definidos com base nas classes de equivalência acima. Exemplos de combinações a serem testadas:

| Identificador | Expectativa | Classes Representadas |
|---------------|-------------|------------------------|
| `a1`          | Válido      | (1), (3), (5)          |
| `2B3`         | Inválido    | (4)                    |
| `Z-12`        | Inválido    | (6)                    |
| `A1b2C3d`     | Inválido    | (2)                    |

---

### Requisitos de Implementação:

1. Implementar um método em Java que receba um identificador (como `String`) por passagem de valor e determine sua validade conforme os critérios descritos.
2. Utilizar **exceções personalizadas** para representar falhas associadas às classes inválidas.
3. Implementar os casos de teste definidos anteriormente utilizando a biblioteca **JUnit**.
4. Não é necessário implementar a interface gráfica (View) para entrada dos dados.
5. O uso do **Spring Boot não é permitido** nesta atividade. A implementação deve ser feita em **Java puro** ou com uso de bibliotecas compatíveis com os objetivos da disciplina (ex.: JUnit).

---

### Forma de Entrega:

A entrega deve ser realizada em **um único arquivo `.pdf`**, contendo:

- A descrição das classes de equivalência utilizadas;
- O conjunto de casos de teste com suas respectivas classificações;
- O código-fonte do método Java implementado;
- O código dos testes unitários com JUnit.
