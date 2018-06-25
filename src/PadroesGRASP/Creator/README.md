# Creator

## Definição:

Este padrão é responsável por atribuir a responsabilidade de criação de objetos.

O padrão Creator veio para dar ordem a esse caos, segundo o padrão, para uma classe B ter a 
responsabilidade de criar instâncias de outra classe A, ele deve obedecer a mais de um dos 
requisitos abaixo:

* B agrega objetos da classe A;
* B contém objetos da classe A;
* B registra instâncias da classe A;
* B usa muitos objetos da classe A;
* B possui os dados usados para inicializar A.

## Vantagens:

* O código fica mais fácil de manter e de testar;

* Fraco acoplamento.

## Diagrama:

![alt text](../../imgs/010.png)
