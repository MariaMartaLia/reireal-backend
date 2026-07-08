# 🍺 ReiReal

# Sistema Backend para Gestão Comercial

> Backend Java desenvolvido para gerenciamento de adegas, bares, restaurantes e comércios, utilizando Modelagem de Domínio, Programação Orientada a Objetos, Arquitetura em Camadas e PostgreSQL.

---

## 📌 Sobre o Projeto

O **ReiReal** nasceu da necessidade de resolver problemas reais encontrados durante a gestão operacional de um restaurante.

Ao identificar limitações nos sistemas utilizados, surgiu a ideia de desenvolver uma solução própria para gerenciamento comercial, começando por uma adega e evoluindo para um sistema capaz de atender diferentes segmentos do varejo.

Mais do que um projeto acadêmico, o ReiReal é um projeto de portfólio desenvolvido para consolidar conhecimentos em Engenharia de Software e Desenvolvimento Backend.

---

# 🎯 Objetivo

Construir um sistema backend profissional capaz de gerenciar todo o fluxo operacional de um estabelecimento comercial.

O sistema será responsável por:

- Cadastro de clientes
- Cadastro de produtos
- Controle de estoque
- Gestão de pedidos
- Controle de pagamentos
- Fechamento de caixa
- Gestão de usuários
- Relatórios gerenciais

---

# ❗ Problema

Em muitos estabelecimentos o processo de venda ainda depende de diversas interações entre cliente, atendente e caixa.

Isso gera:

- Filas
- Demora no atendimento
- Erros de comunicação
- Perda de vendas
- Falta de controle de estoque
- Dificuldade de gestão

---

# 💡 Solução

O ReiReal propõe um fluxo totalmente digital.

O cliente apenas realiza a leitura de um QR Code para:

- Realizar cadastro
- Visualizar o catálogo
- Escolher produtos
- Montar o pedido
- Selecionar a forma de pagamento
- Acompanhar o andamento do pedido

Sem necessidade de instalar aplicativos.

---

# 👥 Atores do Sistema

## Cliente

- Realizar cadastro
- Consultar catálogo
- Criar pedidos
- Alterar pedidos
- Escolher forma de pagamento
- Retirar pedido

---

## Caixa

- Localizar pedidos
- Confirmar pagamentos
- Receber pagamentos presenciais
- Cancelar pedidos
- Fechar caixa

---

## Atendente

- Visualizar pedidos pagos
- Separar produtos
- Entregar pedidos

---

## Administrador

- Gerenciar produtos
- Gerenciar categorias
- Gerenciar usuários
- Gerenciar estoque
- Consultar relatórios
- Configurar parâmetros do sistema

---

# ⚙️ Funcionalidades

- Cadastro de Clientes
- Cadastro de Produtos
- Cadastro de Categorias
- Controle de Estoque
- Carrinho de Compras
- Pedido via QR Code
- Pagamento via PIX
- Pagamento Presencial
- Controle de Usuários
- Fechamento de Caixa
- Relatórios Gerenciais

---

# 🏗 Arquitetura Planejada

```
Cliente
    │
    ▼
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
PostgreSQL
```

O projeto seguirá Arquitetura em Camadas utilizando Spring Boot.

---

# 🧩 Modelagem do Domínio

Entidades implementadas:

- Cliente
- Produto
- Categoria
- Pedido
- ItemPedido
- Pagamento
- Usuario
- FechamentoCaixa

---

# 📚 Conceitos Aplicados

- Programação Orientada a Objetos
- Encapsulamento
- Abstração
- Modelagem de Domínio
- Responsabilidade das Entidades
- Regras de Negócio
- Relacionamentos
- Enums
- Arquitetura em Camadas
- Boas Práticas de Código

---

# 🛠 Tecnologias

### Linguagem

- Java

### Banco de Dados

- PostgreSQL

### Framework (em desenvolvimento)

- Spring Boot
- Spring Data JPA
- Hibernate

### Ferramentas

- Git
- GitHub
- IntelliJ IDEA
- Maven
- Draw.io
- Docker (planejado)

---

# 📂 Estrutura do Projeto

```
src
 └── main
      └── java
            └── br.com.reireal
                    ├── controller
                    ├── domain
                    │      ├── entity
                    │      └── enums
                    ├── repository
                    ├── service
                    └── config
```

---

# 🎓 Objetivos de Aprendizado

Este projeto está sendo desenvolvido para consolidar conhecimentos em:

- Java
- Programação Orientada a Objetos
- Modelagem de Domínio
- PostgreSQL
- Spring Boot
- Spring Security
- APIs REST
- JPA/Hibernate
- Docker
- Git Flow
- Engenharia de Software

---

# 🚀 Roadmap

## ✅ Concluído

- [x] Levantamento de requisitos
- [x] Regras de negócio
- [x] Casos de uso
- [x] Modelagem de domínio
- [x] DER
- [x] Entidades Java
- [x] Enums
- [x] GitHub
- [x] Versionamento Git

---

## 🚧 Em Desenvolvimento

- [ ] Finalização das entidades
- [ ] PostgreSQL
- [ ] Spring Boot
- [ ] Spring Data JPA
- [ ] API REST
- [ ] DTOs
- [ ] Services
- [ ] Controllers
- [ ] Tratamento de exceções
- [ ] Validações
- [ ] Swagger
- [ ] Testes Unitários

---

## 📅 Próximas Etapas

- Autenticação JWT
- Docker
- Deploy
- Integração Front-end
- Dashboard Administrativo

---

# 👩‍💻 Desenvolvedora

**Maria Marta Almeida Brito (Lia)**

🎓 Tecnóloga em Análise e Desenvolvimento de Sistemas — FMU

💼 Desenvolvedora Backend Java em formação

🔗 LinkedIn

https://www.linkedin.com/in/mariamartabrito

🔗 GitHub

https://github.com/MariaMartaLia

---

## ⭐ Objetivo do Projeto

Este projeto faz parte da minha jornada de transição de carreira para Desenvolvimento Backend Java.

Meu objetivo é aplicar conceitos de Engenharia de Software na construção de um sistema real, evoluindo continuamente em arquitetura, modelagem de domínio, APIs REST, banco de dados e boas práticas de desenvolvimento.