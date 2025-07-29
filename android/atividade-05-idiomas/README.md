# UTFPR — Desenvolvimento Java Para Dispositivos Móveis — Pós-Graduação em Tecnologia Java

## Entrega 05 - Uso de SharedPreferences e Internacionalização para Dois Idiomas

**Descrição da Atividade:**
A quinta entrega visa complementar o projeto anterior (Entrega 04), adicionando **persistência de configurações via SharedPreferences** e **suporte multilíngue**, com internacionalização para **inglês (padrão)** e **português do Brasil**. O objetivo é oferecer ao usuário uma experiência mais personalizada e adaptada ao idioma de preferência.

**Requisitos da Entrega:**

- **Internacionalização (i18n):**
  - O aplicativo deve oferecer suporte completo a dois idiomas:
    - **Inglês** como idioma padrão.
    - **Português (Brasil)** como idioma alternativo.
  - Todos os **textos fixos da interface** devem ter tradução nos dois idiomas:
    - Labels, botões, menus, mensagens de Toast, diálogos, títulos, entre outros.
  - Utilizar arquivos `strings.xml` separados:
    - `res/values/strings.xml` para o inglês.
    - `res/values-pt/strings.xml` para o português do Brasil.

- **SharedPreferences:**
  - Implementar **uma tela ou menu de Configurações** com pelo menos **uma funcionalidade de personalização** persistida via SharedPreferences.
  - Exemplos de funcionalidades possíveis (somente uma já é suficiente):
    - Escolher a **forma de ordenação** da lista (ex: por nome ou data).
    - Habilitar ou desabilitar **sugestão automática de preenchimento** no cadastro.
    - Ativar o **Modo Noturno** ou manter o **Modo Normal**.
    - Mostrar as funcionalidades mais usadas em destaque.
  - As configurações escolhidas devem ser **mantidas mesmo após o app ser fechado e reaberto**.

- **Regras Importantes:**
  - **Não é permitido** armazenar login e senha.
  - A internacionalização e as configurações devem funcionar de forma integrada às atividades já existentes (Listagem, Cadastro, Autoria).

**Exemplos base:**
- Videoaulas:
  - **“SharedPreferences - Sugerir Preenchimento de Campo”**
  - **“SharedPreferences - Escolher Ordenação e Restaurar Padrões”**
  - **“Internacionalização - Suporte a Novo Idioma”**

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
  `NomeDoAluno_Entrega05.zip`
- Submeter no **Moodle**.

**Atenção:**
- Caso o arquivo tenha mais de **128 MB**, entre em contato com o professor para combinar entrega via nuvem.
- O aluno deve saber **apresentar e explicar o projeto e o código**.
- **Projeto que não compila = nota zerada**.
- **Plágio total ou parcial = nota zerada**.
- É permitido **reutilizar códigos da disciplina**, desde que sejam **reescritos** em um novo projeto.
