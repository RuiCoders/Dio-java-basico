<h1 align="center"> Desafio plataforma DIO </h1>
<h2 align="center"> Simulando uma conta bancária através do terminal/console </h2>

## Introdução
- Desafio do curso Trilha Java Básico da [DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe) ministrado pelo instrutor [Gleyson Sampaio](https://github.com/glysns).

## Sintaxe - Desafio Condicionalmente Rico
1. Descrição
Uma nova feature para um sistema bancário foi analisada pela equipe de desenvolvimento e será uma das tarefas a serem trabalhadas durante a sprint, como desenvolvedor da empresa você recebeu os requisitos para a nova implementação que consiste em uma solução algorítmica que permita aos clientes realizarem saques em caixas eletrônicos. No entanto, existem algumas regras a serem seguidas para garantir que um saque possa ser realizado com sucesso.

Regras do saque:

- Cada cliente digitará o valor do seu saldoTotal de sua conta bancária e o valorSaque.
- Um saque só pode ser realizado se o saldoDisponível na conta for igual ou superior ao valor solicitado.
- Se o saldo for suficiente, o valor solicitado deve ser subtraído do saldo disponível, indicando que o saque foi realizado.
- Se o saldo for insuficiente, o saque não deve ser realizado e uma mensagem adequada deve ser exibida.

2. `Entrada`
A entrada consiste em dois valores inteiros que representam o total do saldo da conta e o valor do saque.

3. `Saída`
Se o saque for realizado com sucesso, exibir a mensagem "Saque realizado com sucesso! Novo saldo: {saldo}", onde {saldo} é o novo saldo disponível na conta.

Se o saque não for possível devido a saldo insuficiente, exibir a mensagem "Saldo insuficiente. Saque nao realizado!"

`Exemplos`
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída   
| --------- | ------- 
| 1000  | 
| 200    |`Saque realizado com sucesso. Novo saldo: 800` 

| Entrada | Saída   
| --------- | ------- 
| 1500  | 
| 1000    |`Saldo insuficiente. Saque nao realizado!`  

| Entrada | Saída   
| --------- | ------- 
| 300  | 
| 200    |`Saque realizado com sucesso. Novo saldo: 100`  