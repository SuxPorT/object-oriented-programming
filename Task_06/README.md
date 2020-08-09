# Programação Orientada a Objetos - Trabalho 6
![diagram](https://user-images.githubusercontent.com/51892110/89721201-21ef6f80-d9b1-11ea-8a22-7c450b8fcd06.png)

Implemente as classes representadas no diagrama acima, de acordo com a seguinte definição de atributos e métodos.
- a. **Atributos de cada classe**
    - **Disco**: um nome (apenas uma letra - *char*) e uma coleção de **pastas**
    - **Pasta**: um nome (*String*) e uma coleção de **arquivos**
    - **Arquivo**: um nome (*String*) e uma sequência de **bytes**
- b. **Métodos de cada classe**
    - **Disco**: criar uma pasta, remover uma pasta, listar as pastas
    - **Pasta**: inserir um arquivo, remover um arquivo, listar os nomes dos arquivos, duplicar (i.e. criar uma cópia
    de) um arquivo, imprimir o nome da pasta
    - **Arquivo**: abrir o arquivo no aplicativo adequado, criar uma cópia do arquivo, imprimir o nome do arquivo
    - **Documento**: abrir
    - **Planilha**: abrir
    - **Apresentação**: abrir
    - **Texto**: abrir
    - **Imagem**: abrir
    - **Som**: abrir
    - **Video**: abrir

Cada implementação do método abrir na hierarquia de classes com raiz na classe **Arquivo** deve acionar um aplicativo
apropriado. Por exemplo, na classe **Planilha**, o aplicativo acionado pode ser o *Excel*. Para fins de teste, o
acionamento de um aplicativo é simbolizado simplesmente com a impressão do seu nome na tela. Na classe **Arquivo**, o
método abrir deve acionar um aplicativo que permita a edição de *bytes*. A implementação deve ser testada com a classe
**Sistema** abaixo.

![class](https://user-images.githubusercontent.com/51892110/89721284-3122ed00-d9b2-11ea-8464-a409f92f5755.png)