# Programação Orientada a Objetos - Trabalho 3
Implemente as seguintes classes:

1. Classe **ContaCorrente**
    - a. Contém os seguintes atributos privados:
        - i. **numero**, do tipo *int*
        - ii. **saldo**, do tipo *double*
    - b. Contém os seguintes métodos públicos:
        - i. construtor, cujos parâmetros são o número e o saldo inicial da conta corrente
        - ii. depositar um valor (*double*) na conta
        - iii. retirar um valor (*double*) da conta, desde que o saldo seja suficiente
        - iv. imprimir todos os dados da conta corrente
    - c. Possui a seguinte invariante: o saldo nunca é negativo.
2. Classe **Cliente**
    - a. Contém os seguintes atributos privados:
        - i. **nome**, do tipo *String*
        - ii. **conta corrente**, do tipo **ContaCorrente**
    - b. Contém os seguintes métodos públicos:
        - i. construtor, cujo parâmetro é o nome do cliente
        - ii. ligar uma conta corrente (previamente criada) ao cliente
        - iii. depositar um valor (*double*) na contado cliente
        - iv. retirar um valor (*double*) da contado cliente
        - vi. mprimir os dados do cliente, o que inclui o seu nome e todos os dados da sua conta corrente
3. Classe **Banco**
    - a. Contém somente o método ***main***, com os seguintes passos:
        - i. criar três instâncias de **Cliente** e três respectivas instâncias de **ContaCorrente**, devidamente
        ligadas, com os seguintes dados:
            - *Jandira Silva, conta número84037, saldo inicial R$2.500,002*
            - *Sandra Rodrigues, conta número 70662, saldo inicial R$1.800,003*
            - *Luciana Teixeira, conta número 20718, saldo inicial R$5.000,00*
        - ii. Imprimir os dados dos três clientes criados
        - iii. Retirar *R$1.000,00* da conta de *Jandira Silva*
        - iv. Imprimir os dados da cliente *Jandira Silva*
        - v. Retirar *R$2.000,00* da conta de *Sandra Rodrigues*
        - vi. Depositar *R$500,00* na conta de *Sandra Rodrigues*
        - vii. Imprimir os dados da cliente *Sandra Rodrigues*
        - viii. Retirar *R$2.000,00* da conta de *Sandra Rodrigues*
        - ix. Imprimir os dados da cliente *Sandra Rodrigues*
        - x. Depositar *R$1.000,00* na conta de *Luciana Teixeira*
        - xi. Imprimir os dados da cliente *Luciana Teixeira*