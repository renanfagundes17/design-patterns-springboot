# 📦 Projeto: Sistema de Notificações com Padrões de Projeto (Java + Spring Boot)

Este projeto demonstra o uso prático de **Padrões de Projeto** em um sistema de notificações simples, utilizando **Java 17**, **Spring Boot 3** e **OpenAPI (Swagger)** para documentação. Ele simula o envio de notificações por diferentes canais como **e-mail**, **SMS** e **push**, utilizando os padrões **Factory Method** e **Interface (Strategy-like)**.

---

## 🧠 Padrões de Projeto Utilizados

- **Factory Method:** Cria o tipo de notificação com base no parâmetro recebido (`email`, `sms`, `push`);
- **Interface (Strategy-like):** Cada tipo de notificação implementa a interface `NotificationService`, garantindo comportamento uniforme.

---

## 🚀 Tecnologias e Ferramentas

- Java 17 (LTS)
- Spring Boot 3
- Spring Web
- OpenAPI (Swagger)
- Maven

---

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/renanfagundes17/design-patterns-springboot.git

