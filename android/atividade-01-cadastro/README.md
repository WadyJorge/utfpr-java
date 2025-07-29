# UTFPR — Desenvolvimento Java para Dispositivos Móveis — Pós-Graduação em Tecnologia Java

## Entrega 01 — Formulário de Cadastro com Componentes de Interface

**Descrição da Atividade:**
- Criar um projeto Android com o nome relacionado ao **tema escolhido e aprovado pelo professor**.
- Desenvolver uma `Activity` contendo um **formulário de cadastro** de uma das entidades previstas, com os seguintes componentes:

### Componentes obrigatórios:
- `TextView`
- Pelo menos **1 EditText`
- Pelo menos **2 RadioButtons** dentro de um `RadioGroup`
- Pelo menos **1 CheckBox**
- Pelo menos **1 Spinner**
- **2 Buttons**, com as seguintes funções:
  - **Salvar:** Deve coletar os dados preenchidos no formulário e validar os campos obrigatórios. Caso haja campos vazios ou nenhuma opção selecionada, deve exibir um `Toast` de erro e posicionar o foco no campo com erro.
  - **Limpar:** Deve limpar todos os campos e exibir um `Toast` informando que os dados foram apagados.

> Caso o formulário ultrapasse o tamanho da tela, use o componente `ScrollView` para possibilitar a rolagem da tela.

**Observações sobre o Toast:**
- O componente `Toast` possui limite de exibição (principalmente em dispositivos físicos).
- No Android 12 (API 31) ou superior, o limite é de **duas linhas**, e textos maiores serão cortados com reticências.
- Isso será resolvido em entregas futuras com o uso de uma tela de listagem.

---

**Requisitos Técnicos:**
- **IDE:** Android Studio **Ladybug 2024.2.2** ou superior (versões estáveis).
- **Gradle:** Versão compatível com a versão do Android Studio utilizada.
- **API:**
  - `targetSdkVersion`: **API Level 35 (Android 15.0)** ou superior.
  - `minSdkVersion`: **24** (pode ser alterado no `build.gradle` se necessário).
- **Linguagem:** Java

---

**Forma de Entrega:**
- Compacte o projeto em `.zip` com a opção:  
  `File -> Export -> Export to Zip File...`
- Renomeie o arquivo para o seguinte formato:  
  `NomeDoAluno_Entrega01.zip`

> Caso o arquivo ultrapasse **128 MB**, entre em contato com o professor para entrega via compartilhamento em nuvem.

---

**Critérios de Avaliação:**
- O aluno poderá ser convidado a **apresentar o projeto**, explicar o código e tirar dúvidas.
- **Não será aceita a entrega se:**
  - O aluno não souber explicar o código desenvolvido.
  - O projeto **não compilar**.
  - O projeto for plágio ou apenas uma adaptação de exemplo fornecido sem desenvolvimento próprio.

> Códigos de aula podem ser utilizados como base, mas é obrigatório **criar um novo projeto** e **reescrever o código**, não apenas copiar e colar.
