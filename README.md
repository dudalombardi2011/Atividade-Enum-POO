# 🧾 Sistema de Pedido em Java

## 📌 Descrição da Atividade

Este projeto tem como objetivo implementar um sistema simples de pedidos utilizando **Programação Orientada a Objetos (POO)** em Java.

O programa deve ler os dados de um pedido contendo **N itens** (quantidade informada pelo usuário) e, ao final, exibir um **resumo completo do pedido**.

---

## 🎯 Objetivos

- Praticar conceitos de POO
- Utilizar classes, enums e listas
- Trabalhar com entrada de dados via terminal
- Formatar datas e valores
- Gerar um resumo estruturado de informações

---

## 🧩 Funcionalidades

O sistema permite:

- Cadastrar dados do cliente:
  - Nome
  - Email
  - Data de nascimento

- Registrar um pedido:
  - Status do pedido (utilizando `enum`)
  - Instante do pedido (data atual do sistema)

- Adicionar múltiplos itens ao pedido:
  - Nome do produto
  - Preço
  - Quantidade

- Exibir um resumo completo com:
  - Data e hora do pedido
  - Status
  - Dados do cliente
  - Lista de itens
  - Valor total

---

## 🕒 Observação Importante

O instante do pedido deve ser obtido automaticamente pelo sistema utilizando:

```java
new Date()

#📥 Exemplo de Entrada

Informe os dados do Cliente:
Nome: Alex Green
Email: alex@gmail.com
Data de Nascimento (DD/MM/YYYY): 15/03/1985

Informe os dados do Pedido:
Status: PROCESSANDO
Quantos itens para este pedido? 2

Informe os dados do item 1:
Nome do produto: TV
Preço do produto: 1000,00
Quantidade: 1

Informe os dados do item 2:
Nome do produto: Mouse
Preço do produto: 40,00
Quantidade: 2

#📤 Exemplo de Saída
RESUMO DO PEDIDO:
Momento do pedido: 20/04/2023 11:25:09
Status do pedido: PROCESSANDO
Cliente: Alex Green (15/03/1985) - alex@gmail.com

Itens do Pedido:
TV, R$ 1000,00, Quantidade: 1, Subtotal: R$ 1000,00
Mouse, R$ 40,00, Quantidade: 2, Subtotal: R$ 80,00

Valor Total: R$ 1080,00