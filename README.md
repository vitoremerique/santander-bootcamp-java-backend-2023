# santander-bootcamp-java-backend-2023
Java Restful criada para finalizar o bootcamp da Santander Bootcamp Java Backend 2023

## Diagrama de classes
```mermaid
classDiagram
    class Pessoa {
        +nome: string
    }

    class Conta {
        +numero: string
        +agencia: string
        +saldo: float
        +limite: float
    }

    class Cartao {
        +numero: string
        +limite: float
    }

    class Recurso {
        +icone: string
        +descricao: string
    }

    class Novidade {
        +icone: string
        +descricao: string
    }

    Pessoa "1" --> "1" Conta : possui
    Pessoa "1" --> Cartao : possui 1..*
    Pessoa  "1" -->  Recurso : possui 0..*
    Pessoa "1" --> Novidade : possui 0..*
```
