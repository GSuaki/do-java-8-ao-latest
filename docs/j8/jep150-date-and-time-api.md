# JEP 150: Date & Time API

Antes da versão 8 do Java, era muito primitivo a forma como se trabalhava com datas. 
Inclusive era muito comum usar a biblioteca Joda Time ao invés das classes nativas. 

Além de limitado, a duas classes principais usadas (`java.util.Date` e `java.util.Calendar`) eram mutáveis e suas APIs pouco coesas.

```java
/**
 * <b>Antes</b>
 * Classes mutáveis e bem limitadas.
 *
 */
final Date now = new Date();
final Calendar calendar = Calendar.getInstance();
/**
 * Para formatar um Date em uma String, usava-se o SimpleDateFormat.
 */
final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
```

## JSR 310 - Date and Time API
Com o Java 8 foi introduzido uma nova api que conhecemos como Java Time.

Primeiro temos a classe Instant que representa um ponto no tempo, é
equivalente a antiga classe Date. Importante ressaltar que Instant
tem precisão de nanosegundos e é sempre UTC.

```java
final Instant aPointInTime = Instant.now();
```

Uma representação do conceito humano de um compromisso, de uma data,
são as classes abaixo. Começando com LocalDate e LocalTime que representam,
respectivamente, uma data e um horário.

```java
final LocalDate aDate = LocalDate.now();
final LocalTime aTime = LocalTime.now();
```

Quando tratamos de datas mais complexas e com horas, temos três níveis
de classes as quais estão representadas abaixo.
 
A LocalDateTime é usada quando não nos importamos com timezone.

```java
final LocalDateTime aDateTime = LocalDateTime.now();
```

A OffsetDateTime é usada quando só nos importamos com o offset que é a
diferença de horas entre o local e UTC (-03:00, +01:00, etc).

```java
final OffsetDateTime aDateTimeWithOffset = OffsetDateTime.now();
```

O ZonedDateTime também trabalha com offsets, assim como OffsetDateTime,
mas o que diferencia é que o conceito de timezone é um pouco mais complexo,
pois leva em consideração DLS (horário de verão), onde o offset pode variar
dependendo do dia do ano.

```java
final ZonedDateTime aDateTimeWithZone = ZonedDateTime.now();
```

Usado para armazenar o dia do aniversário de alguém sem o ano.

```java
final MonthDay monthDay = MonthDay.now();
```

Usado para representar um mês específico de um ano.

```java
final YearMonth yearMonth = YearMonth.of(2020, 3);
```

Utilizado para representar um período.
Algo durou dois anos, um mês e sete dias.

```java
final Period aPeriod = Period.of(2, 1, 7);
```

A classe Duration é utilizada para representar um intervalo de tempo entre dois períodos.

```java
final Duration aDuration = Duration.between(Instant.now(), Instant.now());
```

## JSR-310: threeten

A necessidade de uma API descente de Date & Time no Java era tão grande que
até criaram um biblioteca [threeten](https://www.threeten.org/threetenbp/) com
um backport da nova API de datas para ser utilizado nas versões anteriores do Java.

> ThreeTen provides a modern date and time library for Java and is the reference implementation for JSR-310. It includes many of the lessons of the Joda-Time project and aims to standardise date and time concepts in computing. Code now integrated into OpenJDK, this project is archived.

## Referências

* [JEP-150](https://openjdk.java.net/jeps/150)
* [JSR-310](https://www.infoq.com/br/news/2010/03/jsr-310/)
* [threeten](https://www.threeten.org/threetenbp/)
