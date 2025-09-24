Locadora de Filmes – Projeto Refatorado
Descrição

Este projeto implementa um sistema de locadora de filmes, permitindo cadastrar fitas, clientes, realizar alugueis e gerar extratos.

O código original do GitHub (apsii) possuía uma classe Cliente com métodos grandes e responsabilidades misturadas. Este projeto aplica boas práticas de refatoração para tornar o código mais coeso, desacoplado e extensível.

Alterações e Refatorações
1. Extração de Classe

Criamos a classe ListaAlugueis para gerenciar a lista de alugueis do cliente.

Cliente agora não gerencia diretamente a lista de alugueis, apenas delega para ListaAlugueis.

Isso aplica o Princípio da Responsabilidade Única (SRP).

2. Polimorfismo no cálculo de preços

Originalmente, o cálculo de preço utilizava switch/case dentro do extrato().

Agora criamos uma hierarquia de classes:

Preco (abstrata)

PrecoNormal

PrecoLancamento

PrecoInfantil

Cada Fita possui uma instância de Preco que define a regra de cálculo.

Benefício: eliminar switch e permitir fácil adição de novos tipos de preço.

3. Classe Extrato

Extraímos a lógica de gerar o extrato para uma classe separada (Extrato).

Extrato recebe um Cliente ou ListaAlugueis e monta o relatório.

Benefício: Cliente não precisa conhecer detalhes de formatação ou cálculo de extrato.

4. Encapsulamento e delegação

Aluguel sabe calcular valor e pontos do próprio aluguel, delegando para Fita e Preco.

Fita delega o cálculo para sua estratégia de Preco.

ListaAlugueis calcula total de valores e pontos somando os alugueis.

Benefício: cada classe tem uma única responsabilidade e não depende de detalhes internos de outras classes.

5. Classe principal Locadora

Substituímos Main por Locadora para refletir melhor o domínio.

Responsável por criar fitas, clientes e alugueis, e gerar extratos.

Futuramente pode ser expandida para menu interativo ou integração com banco de dados.

Estrutura do Projeto
src/
├── locadora/
│   ├── Locadora.java
│   ├── Cliente.java
│   ├── Aluguel.java
│   ├── Fita.java
│   ├── ListaAlugueis.java
│   ├── Extrato.java
│   └── preco/
│       ├── Preco.java
│       ├── PrecoNormal.java
│       ├── PrecoLancamento.java
│       └── PrecoInfantil.java

Benefícios das Refatorações

Código mais limpo e legível.

Facilita adição de novos tipos de preço sem modificar classes existentes.

Permite manutenção mais simples (extrato, cálculo, cadastro separados).

Segue princípios SOLID:

SRP: cada classe tem uma responsabilidade clara.

OCP (Open/Closed): novas estratégias de preço podem ser adicionadas sem alterar código existente.

Encapsulamento: cada objeto gerencia seu próprio estado e comportamento.