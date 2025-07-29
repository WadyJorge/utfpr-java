# UTFPR — Frameworks Web — Pós-Graduação em Tecnologia Java

## Atividade 02 — Formulário de Pesquisa

### Descrição da Atividade:

Esta atividade tem como objetivo complementar o projeto Angular criado na **Atividade 01**, denominado `frontend-funcionarios-departamentos`, por meio da implementação de um formulário de pesquisa utilizando os recursos do PrimeNG e da estruturação de componentes visuais interativos.

### Requisitos da Atividade:

1. **Instalar bibliotecas**:
   - PrimeNG (sugere-se a versão 16).
   - PrimeIcons.
   - PrimeFlex.

2. **Configurar o `angular.json`**:
   - Incluir corretamente as folhas de estilo do PrimeNG, PrimeIcons e PrimeFlex, conforme instruído na *Videoaula 10 – Biblioteca de Componentes*.

3. **Criar o componente `departamentos-pesquisa`**:
   - Declarar um array `departamentos` com 11 objetos, contendo os atributos: `id` e `nomeDepartamento`.
   - Utilizar os seguintes componentes do PrimeNG:
     - `pInputText`
     - `pButton`
     - `pTable`
   - A tabela (`pTable`) deve:
     - Exibir os dados do array.
     - Conter uma coluna de **ações** com os botões "Editar" (`pi-pencil`) e "Excluir" (`pi-trash`), ambos com tooltips.
     - Ter paginação configurada para 5 linhas por página.
   - Adicionar botão “Novo Departamento” abaixo da tabela.

4. **Criar o componente `navbar`**:
   - Deve conter:
     - Ícone `pi-bars` alinhado à esquerda.
     - Menu lateral exibido ao clicar no ícone, contendo:
       - Texto “Usuário” no topo.
       - Itens: “Departamentos” e “Funcionários”.
     - Funcionalidade de exibir/ocultar menu via clique.

5. **Utilizar conceitos abordados nas videoaulas e blocos de conteúdo**:
   - Bloco 06: Diretivas e Binding.
   - Bloco 07: Formulários de Pesquisa.
   - Videoaulas 10 e 14.

---

### Forma de Entrega:

- Compactar o projeto em formato `.zip`.
- **Não incluir os diretórios**:
  - `node_modules/`
  - `.angular/`
  - `.vscode/`
- Submeter o `.zip` no ambiente Moodle.
- **Certificar-se de que a tarefa está enviada por definitivo (não em modo rascunho).**

---

### Observações Importantes:

- **Atividades deixadas em modo rascunho não serão corrigidas.**
- **Serão desconsideradas as seguintes formas de envio:**
  - Capturas de tela.
  - Arquivos em formatos diferentes de `.zip` (ex: `.pdf`, `.doc`, `.txt`).

---

### Sugestão Final:

Testar todos os componentes e funcionalidades antes de gerar o `.zip`, garantindo que o projeto esteja funcionando corretamente e que os requisitos visuais e funcionais foram atendidos.
