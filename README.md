# Data Structure Course 1 / Curso de Estrutura de Dados 1
[![Série](https://img.shields.io/badge/lramon2001-DataStructure-orange)](https://github.com/lramon2001/EstruturaDeDadosEalgoritmos)
[![licence mit](https://img.shields.io/badge/licence-MIT-blue.svg)](https://github.com/lramon2001/EstruturaDeDadosEalgoritmos/blob/main/LICENSE)
![language](https://img.shields.io/badge/java-only-yellow)

:books: Java approach to a recurring theme in computer science : Data Structure. 
> :books: **Uma abordagem em java sobre um tema recorrente na ciência da computação : Estrutura de Dados.**

## Menu / Ementa
###  Memory management / Gerenciamento de memória
- Value-Types and Reference-Types / Value-Types e Reference-Types
- Basic memory management : Stack e Heap / Gerenciamento básico de memória : Stack e Heap
- pointers,equals method and hashcode / Ponteiros, métodos equals e hashcode.
### Arrays / Vetores
- Basic concepts arrays / Vetores conceitos básicos;
- Encapsulating the features of an array / Encapsulando as funcionalidades de um vetor;
- Creating generic structures with array / Criando estruturas genéricas com vetores;
- Creating the insertion functionality / Criando a funcionalidade de inserção;
- Creating the insertion functionality in a specific position / Criando a funcionalidade de inserção em uma posição específica;
- Interacting under an array / Interando sob um vetor;
- Adding the features contains () and index () / Adicionando as funcionalidades contém() e índice();
- Adding element removal functionality / Adicionando a funcionalidade de remoção de elementos.

### Linked Lists / Listas Ligadas
- Definition of linked lists / Definição de listas ligadas;
- Creating a generic representation for a node / Criando uma representação genérica para um nó;
- Creating the basic structure of a linked list / Criando a estrutura básica de uma lista ligada;
- Creating the functionalities of insertion, return of size and verification of the existence of nodes / Criando as funcionalidades de inserção, de retorno do tamanho e de         verificação de existência de nós;
- Creating functionalities in a position and recovering nodes / Criando as funcionalidades em uma posição e de recuperação de nós;
- Implementing the methods contain() and index() / Implementando os métodos contem() e indice();
- Implementing removal features / Implementando as funcionalidades de remoção;
- Getting to know the LinkedList class / Conhecendo a classe LinkedList.

### Doubly Linked List / Lista Duplamente Ligada
- Definition of doubly linked lists / Definição de listas duplamentes ligadas;
- Basic concepts and implementations / Conceitos e implementações básicas;
- Modifying the removal methods / Modificando os métodos de remoção;
- Testing the doubly linked list / Testando a lista duplamente ligada. 

## Memory management / Gerenciamento de memória
![imagem](https://github.com/lramon2001/EstruturaDeDados1/blob/main/reference-type.png)
```
Um Value-Type armazena seu conteúdo na memória alocada na stack. Quando você cria um Value-Type, 
um único espaço na memória é alocado para armazenar o valor e essa variável contém diretamente um valor. 
Se você atribuí-lo a outra variável, o valor é copiado diretamente e ambas as variáveis funcionam 
independentemente. Tipos de dados, estruturas e enums predefinidos também são tipos de valor e funcionam 
da mesma maneira. Tipos de valor podem ser criados em tempo de compilação e armazenados na memória da
stack, por isso, o coletor de lixo não pode acessar a stack.

Reference-Types são usados por uma referência que contém uma referência (endereço) para o objeto, mas não o próprio 
objeto. Como os tipos de referência representam o endereço da variável em vez dos próprios dados, atribuir uma variável
de referência a outra não copia os dados. Em vez disso, ele cria uma segunda cópia da referência, que se refere ao mesmo 
local do heap que o valor original. Variáveis Reference-Types são armazenadas em uma área diferente da memória chamada heap.
Isso significa que quando uma variável Reference-Type não é mais usada, ela pode ser marcada para coleta de lixo. Exemplos 
de Reference-Types são classes, objetos, matrizes, indexadores, interfaces etc.
```
## Arrays / Vetores
![imagem](https://github.com/lramon2001/EstruturaDeDados1/blob/main/arrayok.png)
```
Um array é uma estrutura de dados que armazena uma coleção de elementos de tal forma que cada um dos elementos possa ser 
identificado por, pelo menos, um índice ou uma chave. Essa estrutura de dados também é conhecida como variável indexada,
vetor (para arranjos unidimensionais) e matriz (para arranjos bidimensionais). Os arranjos mantêm uma série de elementos 
de dados, geralmente do mesmo tamanho e tipo de dados. Elementos individuais são acessados por sua posição no arranjo. A 
posição é dada por um índice, também chamado de subscrição. O índice geralmente utiliza uma sequência de números inteiros,
mas o índice pode ter qualquer valor ordinal. Os arranjos podem ser multidimensionais, significando que eles são indexados
por um número fixo de números inteiros, por exemplo, por uma sequência (ou sucessão) finita de quatro números inteiros.
Geralmente, arranjos unidimensionais e bidimensionais são os mais comuns. Os arrays podem ser considerados como as 
estruturas de dados mais simples. Têm a vantagem de que os seus elementos são acessíveis de forma rápida mas têm uma 
notável limitação: são de tamanho fixo, mas podem ser incrementados ou diminuídos com determinados algoritmos, geralmente
envolvendo a cópia de elementos de um arranjo para outro e reiniciar o original com a nova dimensão. 
```
## Linked Lists / Listas Ligadas
![gif](https://github.com/lramon2001/EstruturaDeDados1/blob/main/listasLigadas.gif)
```
Uma lista encadeada ou lista ligada é uma estrutura de dados linear e dinâmica. Ela é composta por várias células que estão
interligadas através de ponteiros, ou seja, cada célula possui um ponteiro que aponta para o endereço de memória da próxima 
célula. Desse modo, as células da estrutura não precisam estar em posições contíguas da memória. Isso faz com que a estrutura
se torne dinâmica, pois há qualquer momento, é possível alocar uma nova célula e mudar os ponteiros das células já 
existentes, de modo que a nova célula seja inserida na estrutura com êxito, na posição desejada pelo programador.
```
## Doubly Linked List / Lista Duplamente Ligada
![gif](https://github.com/lramon2001/EstruturaDeDados1/blob/main/listaDuplamenteLigadas.gif)
```
Em ciência da computação, uma lista duplamente ligada (ou lista duplamente encadeada) é uma estrutura de dados ligada que 
consiste de um conjunto de registros sequencialmente ligados chamados de nós e é uma extensão da lista simplesmente ligada
(ou lista simplesmente encadeada). Cada nó contem dois campos, chamados de links ou enlaces, que são referências para o nó
anterior e para o nó posterior na sequência de nós. Os links anteriores e posteriores dos nós inicial e final, respectivamente,
apontam para algum tipo de terminador, tipicamente um nó sentinela ou nulo, para facilitar o percorrimento da lista. Se houver 
apenas um nó sentinela, a lista será vinculada circularmente através do nó sentinela. Ele pode ser conceituado como duas listas
unicamente vinculadas formadas a partir dos mesmos itens de dados, mas em ordens sequenciais opostas.

```

## History / História
- See [Commit changes](https://github.com/lramon2001/Algoritmos/pulse) for details.

> **Consulte [Mudanças de commit](https://github.com/lramon2001/Algoritmos/pulse) para obter detalhes.**

## License / Licença

[MIT License](https://github.com/lramon2001/INMTE/blob/main/LICENSE) © [Lucas Ramon](https://github.com/lramon2001)
