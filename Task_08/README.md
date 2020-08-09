# Programação Orientada a Objetos - Trabalho 8
Implemente as classes representadas nos diagramas abaixo conforme as definições a seguir.

![diagram](https://user-images.githubusercontent.com/51892110/89721902-fc666400-d9b8-11ea-81b5-f288eacdd4db.png)

![diagram](https://user-images.githubusercontent.com/51892110/89721907-0d16da00-d9b9-11ea-9fdf-b35651ca0f5f.png)

1. O método **retirar** da classe **ContaCorrente** pode lançar os seguintes tipos de exceção:
    - a. ***ExcecaoSenhaInvalida***
    - b. ***ExcecaoSaldoInsuficiente***
2. O método **sacar** da classe **Banco** pode lançar  os seguintes tipos de exceção:
    - a. ***ExcecaoContaInvalida***: lançada quando é fornecido um número de conta inexistente.
    - b. ***ExcecaoSenhaInvalida***: lançada quando a senha fornecida é diferente da senha cadastrada para a conta
    corrente.
    - c. ***ExcecaoHorarioInvalido***: lançada quando o horário de tentativa de saque ocorre antes das 8h ou depois
    das 22h.
    - d. ***ExcecaoSaldoInsuficiente***: lançada quando não há saldo suficiente para realizar o saque solicitado.
3. O método ***main*** de uma classe **Teste** deve criar um objeto da classe **Banco** e, em seguida, deve chamar
métodos da seguinte forma:
    - a. Chamar 5 vezes o método **criar_conta** (com isso, são criadas 5 instâncias de **ContaCorrente**)
    - b. Chamar 10 vezes o método **sacar**. Devem ser usados valores para os parâmetros tal que ocorra, ao menos uma
    vez, uma exceçãode cada tipo.