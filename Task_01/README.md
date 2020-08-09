# Programação Orientada a Objetos - Trabalho 1
Escreva um código Java composto pelas seguintes classes:

1. Classe **Semaforo**
    - a. Atributo: **cor**, representada com um valor inteiro ==> 0 (verde), 1 (amarelo) ou 2 (vermelho), sendo o valor
    inicial igual a 2.
    - b. Métodos:
        - i. **MudaProximaCor**: sem parâmetros e sem retorno ==> muda a cor atual do semáforo para a próxima cor (se
        estiver verde, fica amarelo; se estiver amarelo, fica vermelho; se estiver vermelho, fica verde)
        - ii. **MudaCorFixa**: com parâmetro inteiro, sem retorno ==> muda a cor atual do semáforo para a cor fornecida
        como parâmetro
        - iii. **MostraCor**: sem parâmetro, com retorno inteiro ==> retorna a cor atual do semáforo
2. Classe **Controle**
    - a. Contém o método ***main*** com os seguintes passos:
        - i. Imprime a cor do semáforo
        - ii. Repete 10 vezes as seguintes operações:
            - Muda a cor atual do semáforo para a próxima cor
            - Imprime a cor do semáforo
        - iii. Fixa a cor do semáforo em amarelo
        - iv. Imprime a cor do semáforo