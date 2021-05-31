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

### Doubly Linked Lists / Listas Duplamente Ligada
- Definition of doubly linked lists / Definição de listas duplamentes ligadas;
- Basic concepts and implementations / Conceitos e implementações básicas;
- Modifying the removal methods / Modificando os métodos de remoção;
- Testing the doubly linked list / Testando a lista duplamente ligada. 

### Stacks / Pilhas
- Basic concept / Conceito básico;
- Implementing the stacking and checking the existence of nodes functionality / Implementando as funcionalidades de empilhamento e de verificação de existênica de nós;
- Implementing the destacking functionality / Implementando a funcionalidade de desempilhamento;

### Queues / Filas
- Basic concept / Conceito básico;
- Implementing queuing, dequeuing, and node presence checking features / Implementando as funcionalidades de enfileiramento, desenfileiramento e verificação de presença de nós.


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
## Doubly Linked Lists / Listas Duplamente Ligada
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
## Stacks / Pilhas
![gif](https://github.com/lramon2001/EstruturaDeDados1/blob/main/stack.gif)
```
Pilha ou stack é um tipo especial de lista linear em que todas as operações de inserção e remoção são realizadas pela mesma 
extremidade chamada topo. Os elementos são removidos na ordem do programa inversa daquela em que foram inseridos de modo que
o último elemento que entra é sempre o primeiro ser executado , por isto este tipo de estrutura é chamada LIFO (Last In - First Out)
ou FILO (First In - Last Out).
"O exemplo mais prático que costuma utilizar-se para entender o processo de pilha é como uma pilha de livros ou pilha de pratos, no qual
ao se colocar diversos elementos uns sobre os outros, se quisermos pegar o livro mais abaixo deveremos tirar todos os livros que estiverem 
sobre ele."

Uma pilha geralmente suporta 4 operações básicas:
-TOP: acessa-se o elemento posicionado no topo da pilha;
-PUSH: insere um novo elemento no topo da pilha;
-POP: remove o elemento do topo da pilha.
-PULL:altera o elemento posicionado no topo da pilha;
```
## Queues / Filas
```
A Fila é uma estrutura de dados bastante usada em computação. Na estrutura de fila, os acessos aos elementos também seguem uma regra. 
O que diferencia a fila da pilha é a ordem de saída dos elementos: enquanto na pilha “o último que entra é o primeiro que sai”, na fila 
“o primeiro que entra é o primeiro que sai” (a sigla FIFO – first in, first out – é usada para descrever essa estratégia).
A ideia fundamental da fila é que só podemos inserir um novo elemento no final da fila e só podemos retirar o elemento do início.
A estrutura de fila é uma analogia natural com o conceito de fila que usamos no nosso dia a dia: quem primeiro entra numa fila é o primeiro
a ser atendido (a sair da fila). Um exemplo de utilização em computação é a implementação de uma fila de impressão, fila de atendimento, etc. 
Se uma impressora é compartilhada por várias máquinas, deve-se adotar uma estratégia para determinar que documento será impresso primeiro. 
A estratégia mais simples é tratar todas as requisições com a mesma prioridade e imprimir os documentos na ordem em que foram submetidos – 
o primeiro submetido é o primeiro a ser impresso. 
Para implementar uma fila, devemos ser capazes de inserir novos elementos em uma extremidade, o fim, e retirar elementos da outra extremidade,
o início. Ou seja, sempre inserimos novos elementos no fim da fila e quando removemos u um elemento ele é retirado do início da fila.

```

## History / História
- See [Commit changes](https://github.com/lramon2001/Algoritmos/pulse) for details.

> **Consulte [Mudanças de commit](https://github.com/lramon2001/Algoritmos/pulse) para obter detalhes.**

## License / Licença

[MIT License](https://github.com/lramon2001/INMTE/blob/main/LICENSE) © [Lucas Ramon](https://github.com/lramon2001)
