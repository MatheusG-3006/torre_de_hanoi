# Torre de Hanói

Implementação do clássico puzzle Torre de Hanói para execução via terminal, desenvolvida em Java com foco em lógica recursiva e boas práticas de programação.

---

## Índice
- [Sobre o Projeto](#sobre-o-projeto)
- [Como Funciona](#como-funciona)
- [Pré-requisitos](#pré-requisitos)
- [Como Executar](#como-executar)
- [Exemplo de Uso](#exemplo-de-uso)
- [Conceitos Aplicados](#conceitos-aplicados)
- [Autor](#autor)

---

## Sobre o Projeto

A Torre de Hanói é um dos puzzles matemáticos mais famosos da computação, amplamente utilizado para demonstrar o poder da recursividade. O desafio consiste em mover uma pilha de discos de um pino de origem para um pino de destino, respeitando duas regras:

- Apenas um disco pode ser movido por vez.
- Um disco maior nunca pode ser colocado sobre um disco menor.

Este projeto implementa o puzzle de forma interativa no terminal, permitindo ao usuário definir o número de discos e acompanhar cada movimento da solução ótima, com contador de movimentos ao final.

---

## Como Funciona

O algoritmo resolve o problema utilizando recursão, seguindo a lógica de dividir o problema em subproblemas menores. O número mínimo de movimentos necessários segue a fórmula **2ⁿ - 1**, onde `n` é o número de discos.

| Discos | Movimentos mínimos |
|--------|--------------------|
| 1      | 1                  |
| 2      | 3                  |
| 3      | 7                  |
| 4      | 15                 |
| 5      | 31                 |
| n      | 2ⁿ - 1             |

---

## Pré-requisitos

- Java JDK 8 ou superior

Verifique sua instalação com:
```bash
java --version
```

---

## Como Executar

Clone o repositório:
```bash
git clone https://github.com/seu-usuario/torre-de-hanoi.git
```

Acesse a pasta:
```bash
cd torre-de-hanoi
```

Compile:
```bash
javac Main.java
```

Execute:
```bash
java Main
```

---

## Exemplo de Uso

```
=== Torre de Hanói ===
"Bem-vindo ao jogo da Torre de Hanoi!"
Digite o número de discos:

"\n--- MENU TORRE DE HANOI ---"
1 - Mover disco
2 - Mostrar torres
3 - Reiniciar jogo
4 - Sair"
```
| Opção | Função |
|--------|--------------------|
| 1      | Mover Discos       |
| 2      | Mostra Torres      |
| 3      | Reinicia o Jogo    |
| 4      | Sai do Jogo        | 
---

## Conceitos Aplicados

- **Recursividade** — solução baseada em chamadas recursivas
- **Dividir e conquistar** — decomposição do problema em casos menores
- **Análise de complexidade** — tempo O(2ⁿ), espaço O(n) na pilha de chamadas
- **Interação via terminal** — leitura de entrada com Scanner

---

## Autor

Desenvolvido por **Matheus Gonçalves dos Santos**
**Jean Carlos Antunes Rocha**

---

Projeto acadêmico desenvolvido como parte da grade curricular.
