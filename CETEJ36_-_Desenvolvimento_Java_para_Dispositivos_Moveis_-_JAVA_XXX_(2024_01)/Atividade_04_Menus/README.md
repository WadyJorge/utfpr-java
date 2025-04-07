# UTFPR — Desenvolvimento Java Para Dispositivos Móveis — Pós-Graduação em Tecnologia Java

## Entrega 04 - Incorporação de Menus de Opções, Menu de Ação Contextual e Botões Up

**Descrição da Atividade:**
A quarta entrega tem como objetivo substituir os botões da interface por menus mais sofisticados (menus de opções e menus contextuais), além de adicionar botões de navegação "Up" nas activities secundárias, oferecendo uma navegação mais intuitiva e aderente ao padrão Android.

**Requisitos da Entrega:**

- **Activity de Listagem:**
  - Substituir os **Buttons** por **Menu de Opções** contendo:
    - **"Adicionar"**:
      - Com ícone.
      - `showAsAction="ifRoom"`.
      - Abre a **Activity de Cadastro** esperando resultado (`startActivityForResult()` ou `launch()`).
    - **"Sobre"**:
      - Sem ícone.
      - Abre a **Activity de Autoria**.
  - Implementar **Menu de Ação Contextual (por clique longo)** nos itens da listagem:
    - **"Editar"**:
      - Com ícone.
      - Abre a **Activity de Cadastro** com os dados do item selecionado esperando resultado.
    - **"Excluir"**:
      - Com ícone.
      - Remove o item do `ArrayList` e chama `adapter.notifyDataSetChanged()`.
  - Método `onActivityResult()`:
    - Recebe os dados da Activity de Cadastro.
    - Atualiza ou adiciona a Entidade no `ArrayList`.
    - Chama `adapter.notifyDataSetChanged()` para atualizar a listagem.

- **Activity de Cadastro:**
  - Suporte à **edição de dados** (formulário pré-preenchido).
  - Substituir botões por **Menu de Opções** contendo:
    - **"Salvar"**:
      - Com ícone.
      - Recupera, valida os dados e retorna com `setResult(RESULT_OK)`.
    - **"Limpar"**:
      - Com ícone.
      - Limpa os campos da interface e exibe mensagem via `Toast`.
  - Adicionar **botão Up** na barra da aplicação:
    - Cancela a operação e retorna para a Listagem.

- **Activity de Autoria:**
  - Exibe:
    - Nome do aluno.
    - Curso.
    - E-mail.
    - Breve descrição do app.
    - Nome e logotipo da UTFPR.
  - Adicionar **botão Up** na barra da aplicação:
    - Retorna para a Activity de Listagem.

**Exemplos base:**
- Videoaulas:
  - **“Menu de Contexto Flutuante”**
  - **“Menu de Ação Contextual”**
  - **“Botão Up e Ordenação”**
  - **“Temas, Estilos e Ícones”**

**Requisitos de Ambiente:**
- Android Studio Ladybug 2024.2.2 ou superior.
- Gradle compatível com a versão utilizada do Android Studio.
- `targetSdkVersion`: API Level 35 (Android 15.0) ou superior.
- `minSdkVersion`: 24.
- Linguagem de Programação: **Java**.

**Forma de Entrega:**
- Exportar o projeto com:  
  `File -> Export -> Export to Zip File...`
- Nomear o arquivo como:  
  `NomeDoAluno_Entrega04.zip`
- Submeter no **Moodle**.

**Atenção:**
- Se o projeto tiver mais de **128 MB**, combinar entrega via nuvem com o professor.
- O aluno deve saber **apresentar e explicar o código**.
- Projeto que **não compila = nota zerada**.
- **Plágio total ou parcial** implicará em **nota zerada**.
- É permitido reutilizar códigos da disciplina, desde que sejam **reescritos** em um **novo projeto**.
