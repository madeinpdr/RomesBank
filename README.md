  💸 Seus Fundos — Sistema Bancário em Java
Bem-vindo ao Seus Fundos, um projeto simples, didático e funcional feito em Java com aplicação de conceitos de orientação a objetos, herança e os princípios SOLID.

Este sistema permite criar contas correntes comuns ou premium, fazer saques, depósitos e consultar saldo, respeitando regras específicas para cada tipo de cliente.

🧠 Objetivo
Este projeto foi desenvolvido com fins educativos para entender melhor:

Encapsulamento

Herança

Polimorfismo

Abstração

Princípios S.O.L.I.D

Boas práticas em Java

⚙️ Tecnologias Utilizadas
Java (JDK 11+)

IDE: IntelliJ, Eclipse ou VS Code (qualquer IDE com suporte a Java)

Console / Terminal para execução

    📁 Estrutura de Pastas

    css

    Copiar

    Editar

    SeusFundos/

    ├── src/

    │   └── SeusFundos/

    │     ├── IConta.java

    │        ├── SeusFundos.java

    │          ├── SeusFundosPremium.java

    │            ├── OperacaoConta.java

    │               ├── Menu.java

    │                 └── Main.java
    
    │                     └── README.md
🚀 Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seuusuario/SeusFundos.git
Abra em sua IDE preferida ou compile pelo terminal:

bash
Copiar
Editar
cd SeusFundos/src
javac SeusFundos/*.java
java SeusFundos.Main
🧪 Exemplos de Uso
Escolha o tipo de conta: comum ou premium.

Deposite valores positivos (valores negativos serão recusados).

Saques respeitam regras diferentes:

Conta comum: taxa de 0.5%

Conta premium: taxa de 0.1%

Consultas ao saldo são sempre disponíveis.

📌 Regras de Negócio
Saldo inicial: R$1000

Não é permitido:

Sacar mais que o saldo

Depositar ou sacar valores menores ou iguais a zero

💡 Conceitos Aplicados
Princípio	Aplicação
S: Single Responsibility	Cada classe tem uma única responsabilidade.
O: Open/Closed	As classes podem ser estendidas (ex: SeusFundosPremium) sem modificar a base (SeusFundos).
L: Liskov Substitution	Uma SeusFundosPremium pode ser usada onde SeusFundos é esperado.
I: Interface Segregation	Interface IConta define apenas o necessário.
D: Dependency Inversion	Menu e OperacaoConta dependem de abstrações (IConta), não de classes concretas.

📫 Contato
Se tiver dúvidas, sugestões ou quiser contribuir, fique à vontade para abrir uma issue ou pull request.

📝 Licença
Este projeto é livre para uso educacional. Se quiser usar em produção, adapte conforme necessário e teste com rigor! 😉
