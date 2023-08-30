<h1 align="center"> Desafio plataforma DIO </h1>
<h2 align="center"> Simulando uma conta bancária através do terminal/console </h2>

## Introdução
- Desafio do curso Trilha Java Básico da [DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe) ministrado pelo instrutor [Gleyson Sampaio](https://github.com/glysns).

## Sintaxe - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revise sobre regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

## Código em execução

https://github.com/RuiCoders/Dio-java-basico/assets/77218064/d86dd6f3-66cd-4def-b919-a806aaa810e8

<h2>Ferramentas utilizadas</h2>

- ``Java``
- ``Editor Vscode``

<h2>Acesse o projeto</h2> 

Você pode [acessar o código fonte do projeto](https://github.com/RuiCoders/Dio-java-basico/blob/main/conta-banco-desafio/src/ContaTerminal.java).

<h2>Desenvolvedor</h2>

[<img src="https://avatars.githubusercontent.com/u/77218064?v=4" width=115><br><sub>Rui Andrade</sub>](https://github.com/Ruicoders)
## Começando
Bem-vindo ao mundo Java do VS Code. Aqui está uma diretriz para ajudá-lo a começar a escrever código Java no Visual Studio Code.

## Estrutura de pastas
O espaço de trabalho contém duas pastas por padrão, onde:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
Enquanto isso, os arquivos de saída compilados serão gerados na  `bin` pasta por padrão.

Se você deseja personalizar a estrutura de pastas, abra `.vscode/settings.json` ne atualize as configurações relacionadas lá.

## Gerenciamento de Dependências
A `JAVA PROJECTS` visualização permite que você gerencie suas dependências. Mais detalhes podem ser encontrados [Aqui](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
