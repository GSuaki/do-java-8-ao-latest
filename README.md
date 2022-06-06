<center>
  <p align="center">
    <img src="https://icon-library.com/images/java-icon-png/java-icon-png-15.jpg"  width="150" />
  </p>  
  <h1 align="center">Do Java 8 ao Latest</h1>
  <p align="center">
    Repositório criado para destacar as versões do Java e as features que vieram em cada versão.
  </p>
</center>
<br />

## Ferramentas necessárias

- JDK 19

## Instalando a versão mais recente

Eu recomendo a utilização do [sdkman](https://sdkman.io/install) para gerenciar mais facilmente as SDKs em sua máquina.

```shell
sdk list java
```

Existem várias distribuições da JVM, a que estarei usando são as oficiais que se encontram no agrupador Java.net.

```shell
sdk install java 19.ea.25-open
```

No final da instalação, o CLI já pergunta se quer tornar a imagem default e também já coloca ela como imagem selecionada.
Caso algo aconteça, para utilizar a imagem recém instalada, basta executar:

```shell
sdk use java 19.ea.25-open
```

## Releases

### Java 8 (LTS)

* Default methods
* [Date & Time API](docs/j8/jep150-date-and-time-api.md)
* Streams API
* Lambda expressions
* Method reference
* Type Annotations
* Repeating Annotations
* Nashorn Engine

### Java 9

* Inner Class Diamond Operator
* Java Module System
* Private Methods in Interfaces
* Stack-Walking API
* Try-with-Resources improvements

### Java 10

* Local variable Type Inference

### Java 11 (LTS)

* HTTP Client
* Java EE packages removed
* Lambda local variable Type Inference
* Nashorn Engine marked as deprecated
* TLS 1.3
* ZGC (Experimental)

### Java 12

* Switch Expressions (Preview 1)
* ShenandoahGC (Experimental)

### Java 13

* Switch Expressions (Preview 2)
* Text Blocks (Preview 1)

### Java 14

* Switch Expressions
* Helpful NPE
* Records (Preview 1)
* Pattern Matching for InstanceOf (Preview 1)
* Text Blocks (Preview 2)

### Java 15

* Nashorn Engine removed
* Pattern Matching for InstanceOf (Preview 2)
* Records (Preview 2)
* Sealed Classes (Preview 1)
* Text Blocks
* ZGC
* ShenandoahGC

### Java 16

* Pattern Matching for InstanceOf
* Records
* Sealed Classes (Preview 2)
* Stream (toList)
* Day Periods support

### Java 17 (LTS)

* Pattern Matching for Switch (Preview 1)
* Sealed Classes

### Java 18

* Code Snippets for Javadoc
* Pattern Matching for Switch (Preview 2)
* Simple Web Server

### Java 19

* Pattern Matching for Switch (Preview 3)
* Record Patterns (Preview 1)
* Structured Concurrency (Incubator)
* Virtual Threads (Preview 1)