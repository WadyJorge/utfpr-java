# UTFPR — Desenvolvimento Java Para Dispositivos Móveis — Pós-Graduação em Tecnologia Java

## Projeto Final - Aplicativo com Room, AlertDialogs, SharedPreferences e Internacionalização

**Descrição da Atividade:**  
A entrega final consolida todas as funcionalidades desenvolvidas nas Entregas 01 a 05, adicionando agora a **persistência de dados com Room** e o uso de **AlertDialogs** para interações com o usuário. O projeto deve estar completo, funcional, multilíngue, personalizável e desenvolvido em **Java**, respeitando as boas práticas da plataforma Android.

**Requisitos da Entrega:**

- **Tema da Aplicação:**
  - O aplicativo deve abordar um tema previamente proposto pelo aluno no questionário "Tema do Projeto" e aprovado pelo professor.
  - **Temas repetidos não serão aceitos** dentro da mesma turma.

- **Funcionalidades Obrigatórias:**
  - **Cadastro de dados** relacionados à regra de negócio, com persistência usando **Room**.
  - Pelo menos **uma Classe de Entidade** manipulada pelo app.
  - Pelo menos **uma Activity com suporte a Inserção, Alteração e Remoção** dos dados persistidos.
  - Exibição de **AlertDialog** para confirmar a exclusão de dados.
  - Pelo menos **uma Activity que liste os dados** cadastrados.
  - Uso de **Adapter Customizado** na Activity de listagem.
  - Activity com **informações sobre o aplicativo e o autor**.
  - Utilização de **Menus de Opções** com ícones na ActionBar.
  - Utilização de **Menu de Ação Contextual**, com ações específicas para os itens da lista.
  - Navegação com **botões Up** na ActionBar das Activities secundárias.
  - Implementação de **configurações personalizáveis** com persistência via **SharedPreferences**.
  - Suporte multilíngue com internacionalização para:
    - **Inglês** (idioma padrão).
    - **Português do Brasil** (idioma alternativo).

- **Internacionalização (i18n):**
  - Todos os textos da interface devem estar traduzidos em:
    - `res/values/strings.xml` para inglês.
    - `res/values-pt/strings.xml` para português (Brasil).

**Exemplos base:**
- Videoaulas:
  - **“AlertDialog - Mostrar Aviso e Confirmação”**
  - **“Room - Usando o Código de Persistência”**

**Requisitos de Ambiente:**
- Android Studio Ladybug 2024.2.2 ou superior (versões estáveis).
- Gradle compatível com a versão do Android Studio utilizada.
- `targetSdkVersion`: API Level 35 (Android 15.0) ou superior.
- `minSdkVersion`: 24.
- Linguagem de Programação: **Java**.

**Forma de Entrega:**
- Exportar o projeto com:  
  `File -> Export -> Export to Zip File...`
- Nomear o arquivo como:  
  `NomeDoAluno_EntregaFinal.zip`
- Submeter no **Moodle**.

**Atenção:**
- Caso o arquivo tenha mais de **128 MB**, entre em contato com o professor para combinar entrega via nuvem.
- O aluno deve saber **apresentar e explicar o projeto e o código**.
- **Projeto que não compila = nota zerada**.
- **Plágio total ou parcial = nota zerada**.
- É permitido **reutilizar códigos da disciplina**, desde que sejam **reescritos** em um novo projeto.
