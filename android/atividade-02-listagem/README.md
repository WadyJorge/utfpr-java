# UTFPR — Desenvolvimento Java Para Dispositivos Móveis — Pós-Graduação em Tecnologia Java

## Entrega 02 - Listagem de Itens a partir de Arrays do Resource

**Descrição da Atividade:**
- Criar uma nova **Activity** que liste itens relacionados ao tema do projeto da Entrega 1.
- Essa listagem deve exibir objetos de uma **Entidade criada especificamente**, com pelo menos 4 atributos.
- Os dados devem ser carregados de **arrays no `res/values/`**, permitindo a criação de pelo menos 10 objetos da Entidade.
- As entidades devem ser armazenadas em um **ArrayList**.

**Requisitos Técnicos:**
- Criar um componente de listagem (preferencialmente `ListView`, ou `RecyclerView`).
- Implementar um **Adapter customizado** para exibir os dados da Entidade.
- Ao clicar em um item da lista, exibir um **Toast** com informações que identifiquem o elemento.
- A nova Activity de listagem deve ser a **principal do app (Launcher)**. A Activity da Entrega 1 permanecerá no projeto, mas não será utilizada diretamente.

**Exemplos indicados para consulta:**
- Videoaulas “ListView e Custom Adapter” e “RecyclerView e ItemClick”.

**Requisitos de Ambiente:**
- Android Studio Ladybug 2024.2.2 ou superior.
- Gradle compatível com a versão utilizada do Android Studio.
- `targetSdkVersion`: API Level 35 (Android 15.0) ou superior.
- `minSdkVersion`: 24 (pode ser ajustado no `build.gradle`).
- Linguagem de Programação: **Java**.

**Forma de Entrega:**
- Compactar o projeto usando o Android Studio via:  
  `File -> Export -> Export to Zip File...`
- Renomear o arquivo `.zip` para o formato:  
  `NomeDoAluno_Entrega02.zip`
- Submeter o arquivo no **Moodle**.
- Caso o arquivo ultrapasse **128 MB**, entrar em contato com o professor para entrega via nuvem.

**Observações Importantes:**
- O projeto **deve compilar**. Caso contrário, será **zerado**.
- O aluno deverá ser capaz de **explicar o projeto** ao professor.
- Projetos idênticos, plagiados ou apenas copiados de exemplos terão a nota **zerada**.
- É permitido reutilizar os códigos da disciplina, desde que **reescritos e incorporados em um projeto novo**.
