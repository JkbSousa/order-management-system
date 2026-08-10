# Sistema de Pedidos (Order Management)  Java OOP

Projeto de estudo desenvolvido a partir do UML fornecido pelo curso Java COMPLETO Programação Orientada a Objetos + Projetos do professor Nélio Alves,
implementado por conta própria com foco em fixar conceitos de Orientação a Objetos em Java.

## O que foi desenvolvido

- Modelagem das classes e relacionamentos (composição e associação) a partir do diagrama UML
- Lógica de negócio: cálculo de total do pedido, subtotal por item
- Uso da API moderna `java.time` (LocalDate/LocalDateTime) para datas, em substituição ao
  `Date`/`Calendar` legado
- Leitura de dados via console com tratamento dos objetos criados

## Conceitos aplicados

- Composição entre entidades (`Order` → `OrderItem` → `Product`, `Order` → `Client`)
- Encapsulamento (controle de acesso a coleções via métodos `add`/`remove`, sem exposição direta)
- Enums para representar estados fixos (`OrderStatus`)
- Delegação de responsabilidade entre classes (cada entidade calcula o que é responsabilidade dela)

## Tecnologias

- Java 25

## Como rodar

**Via IntelliJ IDEA:**
1. Abra o projeto no IntelliJ
2. Execute a classe `Program` em `src/application`

**Via terminal:**
\`\`\`bash
javac -d out src/application/*.java src/entities/*.java src/entities/enums/*.java
java -cp out application.Program
\`\`\`

## Origem

Este projeto segue o diagrama UML e enunciado do curso Java COMPLETO Programação Orientada a Objetos + Projetos do professor Nélio Alves, como exercício
de fixação de Orientação a Objetos. A implementação, decisões de design e o código foram
desenvolvidos por mim.