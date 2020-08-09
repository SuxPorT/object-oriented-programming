# Programação Orientada a Objetos - Trabalho 5
![diagram](https://user-images.githubusercontent.com/51892110/89720661-02554880-d9ab-11ea-81fb-afb9368cad9f.png)

Considere a hierarquia de classes representado no diagrama acima. Os atributos são anotados com um símbolo "-" para
indicar visibilidade *private* e com um símbolo "#" para indicar visibilidade *protected*. Implemente as classes com
os atributos indicados no diagrama acima e com métodos da seguinte forma:

1. Classe **Jogador**
    - a. Método ***construtor***
    - b. ***void imprimir()***: imprime todos os atributos do objeto
2. Classe **Principiante**
    - a. Método ***construtor***
    - b. ***void imprimir()***: imprime todos os atributos do objeto
    - c. ***void ganhar(int p)***:
        - i. adiciona **p** ao *score*;
        - ii. adiciona *10%* de **p** ao *bonus*.
    - d. ***void perder(int p)***:
        - i. subtrai **p** do *score*
        - ii. desconta *10%* de **p** do *bonus*.
3. Classe **Profissional**
    - a. Método ***construtor***
    - b. ***void imprimir()***: imprime todos os atributos do objeto
    - c. ***void ganhar(int p)***:
        - i. adiciona **p** ao *score*;
        - ii. aumenta o *capital* de **p * 4**
    - d. ***void perder(int p)***:
        - i. subtrai **p** do *score*
        - ii. diminui o *capital* de **p * 4**
4. Classe **Senior**
    - a. Método ***construtor***
    - b. ***void imprimir()***: imprime todos os atributos do objeto
    - c. ***void ganhar(int p)***:
        - i. chama o método ganhar da **superclasse**
        - ii. dobra o valor do *prêmio*
    - d. ***void perder(int p)***:
        - i. chama o método perder da **superclasse**
        - ii. reduz o valor do *prêmio* à metade

Deve ser implementada uma classe adicional denominada **Teste** contendo o método ***main*** que deverá criar um
objeto de cada tipo de jogador (*Princiante*, *Profissional* e *Senior*) e chamar todos os métodos disponíveis para
esses objetos.