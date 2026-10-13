# Exercícios de Lógica em Java

Caderno de exercícios resolvidos em Java para praticar raciocínio computacional
e fundamentos da linguagem. Os exemplos são pequenos programas independentes,
organizados principalmente no pacote `exercicioslogica.iniciante`.

## Problema resolvido

O repositório serve como laboratório incremental para transformar problemas
matemáticos e de entrada/saída em algoritmos executáveis. Ele cobre decisões,
repetições, operações numéricas, vetores, classificação e leitura de dados.

## Organização

```text
src/exercicioslogica/iniciante/
  cálculos e conversões
  condicionais e classificações
  laços e sequências
  vetores e posições
  exercícios numéricos
```

Cada classe possui seu próprio `main` quando precisa ser executada como
programa. `CordenadasTest.java` é um exercício de saída/teste pelo nome da
classe, mas não há framework de testes configurado no repositório.

## Tecnologias e decisões

- Java, com arquivos-fonte simples e sem dependências externas;
- IntelliJ IDEA metadata (`.idea`) presente no repositório;
- uma classe por exercício para manter cada solução isolada e fácil de testar;
- nomes e pacotes preservados como material de estudo, mesmo quando ainda podem
  ser refinados para uma convenção profissional.

## Como executar

Com JDK instalado, compile uma classe a partir da raiz:

```bash
javac -d out src/exercicioslogica/iniciante/Maior.java
java -cp out exercicioslogica.iniciante.Maior
```

Substitua `Maior.java` pelo exercício desejado. Como não existe Maven ou Gradle,
não há um comando único para compilar todos os exemplos.

## Testes realizados

Não há suíte automatizada nem arquivo de build. A validação prevista é executar
individualmente os programas e conferir suas saídas com entradas representativas.
Uma próxima evolução pode adicionar Maven/Gradle e testes JUnit para separar
algoritmos de entrada/saída.

## Escopo

Este é um repositório de estudos, não uma aplicação de produção. O valor está
na progressão dos exercícios e na comparação entre soluções simples para
problemas de lógica.
