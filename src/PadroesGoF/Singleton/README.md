# Singleton

## Definição:
Permitir que a classe tenha somente uma instância no projeto e que essa instância seja de 
acesso global.

Esse padrão é muito utilizado quando o algoritmo trabalha com instâncias de classes que não 
alteram seus estados ou quando há necessidade de utilizar algum método especifico da 
classe, várias vezes. Algo que seria um problema sem o Singleton. Muitas instâncias 
seriam criadas somente para utilizar alguns métodos, esse sendo independentes do estado 
do objeto.

## Vantagens:

* Melhora o desempenho do software quando utilizado em classes que nunca mudam de estado 
ou que sempre precisam de somente uma instância executando;

* Melhora a leitura do código, tendo mente que o Singleton, apesar de ser um padrão 
(aplica uma linguagem universal), é o mais conhecido dentre os padrões.

## Desvantagens:

* Uma das desvantagens do padrão de projeto Singleton é que não é possível inibir o acesso 
a sua classe. Qualquer parte do código por chamar o método Instance(), pois ele é estático, 
e ter acesso aos dados da classe;

* Devemos utilizar esté padrão com moderação.

## Diagrama:


