# Readme

**Programação Orientada a Objetos**

**Relacionamento, herança,classe e métodos abstratos**

**Objetivo**

Identifique, modele e implemente em Java as classes envolvidas na instrução especificando seus atributos, responsabilidades e relacionamentos entre elas.

**Exercício**

O Banco Nacional nos pede para modelar um novo sistema. Este sistema manterá um registro das contas e clientes do banco.

**CLIENTES:** Os clientes serão identificados com um número de cliente, sobrenome, CPF e conta.
**CONTAS:** permitem que você deposite, retire dinheiro e mostre o saldo. Uma conta possui um cliente associado.



**EXTENSÃO:**

**Conta poupança:** tem saldo e também taxa de juros. Nesse tipo de conta, você pode realizar três operações:
○ Depositar dinheiro: o cliente pode depositar a quantia que desejar.○ Sacar dinheiro: o cliente pode sacar dinheiro sem ultrapassar seu saldo.

○ Cobrar juros: o cliente pode cobrar mensalmente os juros que sua poupança lhe concede.

**Conta corrente:** Possuem saldo e, além disso, valor autorizado para saque. Duas operações podem ser realizadas neste tipo de conta:

○ Depositar dinheiro: o cliente pode depositar a quantia que desejar.

○ Sacar dinheiro: o cliente pode sacar dinheiro e usar o cheque especial se não tiver saldo suficiente.

**Esclarecimento:** Para este exercício, lembre-se de que a conta pode ser modelada como uma classe abstrata e, embora uma conta tenha várias responsabilidades, como mostra a declaração, algumas podem ter que se comportar de maneira diferente nas subclasses e um método abstrato pode ser possível.