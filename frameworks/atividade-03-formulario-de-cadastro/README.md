# UTFPR — Frameworks Web — Pós-Graduação em Tecnologia Java

## Atividade 03 — Formulário de Cadastro

### Descrição da Atividade

Dando continuidade ao projeto Angular criado na **Atividade 01**, chamado `frontend-funcionarios-departamentos`, esta atividade tem como objetivo implementar um formulário para **cadastro de departamentos**, utilizando Angular, PrimeNG e os conceitos abordados no **Bloco 08 – Formulários de Cadastro**.

### Instruções

1. Criar um componente de formulário com o nome `departamento-cadastro`.

2. No arquivo `departamento-cadastro.component.ts`, implementar:
   - Um método chamado `salvar`, que deve receber como parâmetro um objeto do tipo `NgForm`.
   - Esse método deve imprimir o valor do formulário no console.
   - Após a impressão, o formulário deve ser resetado.

3. No arquivo `departamento-cadastro.component.html`, criar:
   - Um elemento `<form>` com:
     - Um campo de entrada utilizando o componente `pInputText` do PrimeNG.
       - Este campo deve ser obrigatório.
       - Deve aceitar nomes de no mínimo 2 caracteres.
       - Em caso de validação inválida, mensagens de erro apropriadas devem ser exibidas.
     - Um botão **Salvar** (`pButton`, tipo `submit`):
       - Só deve estar habilitado se o formulário estiver válido.
     - Um botão **Novo** (`pButton`, tipo `button`):
       - O botão deve estar presente, mas não precisa executar nenhuma ação.

4. Enviar o projeto compactado no formato `.zip`.

5. **Não incluir no arquivo `.zip` os seguintes diretórios**:
   - `node_modules/`
   - `.angular/`
   - `.vscode/`

### Entrega

- Submeter o projeto `.zip` no ambiente de ensino (Moodle).
- **Certificar-se de enviar a tarefa por definitivo**, e não deixá-la em modo rascunho.

---

### Observações Importantes

- **Atividades deixadas em modo rascunho não serão corrigidas**.
- **Não serão aceitas**:
  - Capturas de tela como forma de comprovação.
  - Arquivos em formatos como `.pdf`, `.doc`, `.txt`, entre outros que não sejam `.zip`.

---

### Recomendações Finais

Antes de realizar a submissão, verifique:

- Se o formulário valida corretamente os dados de entrada.
- Se os botões estão presentes e funcionando conforme solicitado.
- Se o método `salvar` realiza a impressão e reset do formulário.
- Se o projeto foi compactado corretamente, **sem os diretórios proibidos**.
