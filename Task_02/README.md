# Programação Orientada a Objetos - Trabalho 2
Acrescente as seguintes classes ao projeto organizado nos pacotes **Matematica** e **Especialista** que contêm,
respectivamente, as classes **Circulo** e **Arquiteto**, estudadas em aula:

1. Classe **Retangulo**
    - a. Contida no pacote **Matematica**.
    - b. Contém os seguintes atributos privados do tipo *float*: **ladoH** e **ladoV**.
    - c. Contém os seguintes métodos públicos:
        - i. **definir_lados**: atribui dois valores fornecidos como parâmetros aos atributos **ladoH** e **ladoV**.
        - ii. **area**: retorna a área de um retângulo cujas medidas dos lados são dadas por **ladoH** e **ladoV**.
        - iii. **perimetro**: retorna o perímetro de um retângulo cujas medidas dos lados são dadas por **ladoH** e
        **ladoV**.
    - d. Possui a seguinte invariante: as medidas dos lados são positivas.
2. Classe **EngenheiroCivil**
    - a. Contida no pacote **Especialista**.
    - b. Contém o método **exibir_dados_pessoais** de forma análoga à classe **Arquiteto**.
    - c. Contém o método ***main*** com os seguintes passos:
        - i. Chama o método **exibir_dados_pessoais**.
        - ii. Chama o método **definir_lados** da classe **Retangulo** com os valores *4.7* e *8.2* como parâmetros.
        - iii. Chama os métodos **area** e **perimetro** da classe **Retangulo** e imprime os resultados dessas
        chamadas.