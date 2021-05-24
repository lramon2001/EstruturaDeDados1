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


## History / História
- See [Commit changes](https://github.com/lramon2001/Algoritmos/pulse) for details.

> **Consulte [Mudanças de commit](https://github.com/lramon2001/Algoritmos/pulse) para obter detalhes.**

## Memory management / Gerenciamento de memória
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

## License / Licença

[MIT License](https://github.com/lramon2001/INMTE/blob/main/LICENSE) © [Lucas Ramon](https://github.com/lramon2001)
