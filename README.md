# 👤 API de Usuários

API REST desenvolvida em **Java com Spring Boot** para praticar desenvolvimento backend e criação de APIs.

## 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- BCrypt
- Maven

## ⚙️ Funcionalidades

- Cadastro de usuários
- Persistência de dados com JPA
- Geração automática de ID
- Senhas armazenadas com hash BCrypt
- Senha não exposta na resposta da API

## 📌 Endpoint

### Cadastrar usuário

```http
POST /usuarios
```

Exemplo:

```json
{
  "nome": "Camila",
  "email": "camila@email.com",
  "senha": "1234"
}
```

## 📚 Em desenvolvimento

Próximos passos:

- Listar usuários
- Buscar por ID
- Atualizar usuários
- Excluir usuários
- Adicionar validações e tratamento de erros

---

Projeto desenvolvido para estudos e prática com **Java e Spring Boot**. ☕
