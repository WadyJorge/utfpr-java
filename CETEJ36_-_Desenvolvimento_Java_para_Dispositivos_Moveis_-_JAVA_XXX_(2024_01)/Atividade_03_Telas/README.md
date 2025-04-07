# UTFPR — Desenvolvimento Java Para Dispositivos Móveis — Pós-Graduação em Tecnologia Java

## Entrega 03 - Integração de Activities: Cadastro, Listagem de Itens e Autoria do App

**Descrição da Atividade:**
- Criar uma nova **Activity** que exiba os dados de **Autoria do App**.
- Implementar a **transição entre Activities** criadas nas entregas anteriores: **Cadastro** e **Listagem**.
- A Activity de **Listagem de dados** não irá mais carregar dados estáticos dos Resources, mas sim exibir dados cadastrados dinamicamente via a Activity de Cadastro.

**Requisitos da Entrega:**

- **Activity de Autoria:**
  - Deve conter:
    - Nome do aluno.
    - Curso.
    - E-mail.
    - Breve descrição do aplicativo.
    - Nome e logotipo da UTFPR.

- **Activity de Listagem:**
  - Exibe uma **ListView ou RecyclerView**.
  - Deve conter dois **Buttons**:
    - **"Adicionar"**: abre a Activity de Cadastro esperando um resultado (`startActivityForResult()` ou `launch()`).
    - **"Sobre"**: abre a Activity de Autoria (`startActivity()`).

- **Activity de Cadastro:**
  - Botão "Salvar":
    - Deve recuperar e validar os dados preenchidos.
    - Retornar os dados para a Activity de Listagem com `setResult(RESULT_OK)`.

- **Na Activity de Listagem:**
  - O método `onActivityResult()` (ou equivalente com `ActivityResultLauncher`) deve:
    - Receber os dados.
    - Criar um novo objeto da Entidade.
    - Adicionar ao `ArrayList`.
    - Chamar `adapter.notifyDataSetChanged()` para atualizar a listagem.

- **Barra da Aplicação:**
  - Exibir utilizando as recomendações da videoaula **"Temas, Estilos e Ícones"** e documentação extra do curso.

**Exemplo base:**
- Videoaula **“Abertura de Activity Esperando um Resultado”**.

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
  `NomeDoAluno_Entrega03.zip`
- Submeter no **Moodle**.

**Atenção:**
- Se o projeto tiver mais de **128 MB**, combinar entrega via nuvem com o professor.
- O aluno deve saber **apresentar e explicar o código**.
- Projeto que **não compila = nota zerada**.
- **Plágio total ou parcial** implicará em **nota zerada**.
- É permitido reutilizar códigos da disciplina, desde que sejam **reescritos** em um **novo projeto**.
