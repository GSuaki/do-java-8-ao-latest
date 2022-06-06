package com.deploydesexta.j8;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * https://openjdk.java.net/jeps/150
 *
 * https://www.infoq.com/br/news/2010/03/jsr-310/
 */
public class Ex2_DateAndTimeAPI {

    public static void main(String[] args) {

        /**
         * Antes
         * Classes mutáveis e bem limitadas.
         *
         */
        final Date now = new Date();
        final Calendar calendar = Calendar.getInstance();
        /**
         * Para formatar um Date em uma String, usava-se o SimpleDateFormat.
         */
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        /**
         * Depois
         *
         * Primeiro temos a classe Instant que representa um ponto no tempo, é
         * equivalente a antiga classe Date. Importante ressaltar que Instant
         * tem precisão de nanosegundos e é sempre UTC.
         */
        final Instant aPointInTime = Instant.now();

        /**
         * Uma representação do conceito humano de um compromisso, de uma data,
         * são as classes abaixo. Começando com LocalDate e LocalTime que representam,
         * respectivamente, uma data e um horário.
         */
        final LocalDate aDate = LocalDate.now();
        final LocalTime aTime = LocalTime.now();

        /**
         * Quando tratamos de datas mais complexas e com horas, temos três níveis
         * de classes as quais estão representadas abaixo.
         *
         * A LocalDateTime é usada quando não nos importamos com timezone.
         */
        final LocalDateTime aDateTime = LocalDateTime.now();
        /**
         * A OffsetDateTime é usada quando só nos importamos com o offset que é a
         * diferença de horas entre o local e UTC (-03:00, +01:00, etc).
         */
        final OffsetDateTime aDateTimeWithOffset = OffsetDateTime.now();
        /**
         * O ZonedDateTime também trabalha com offsets, assim como OffsetDateTime,
         * mas o que diferencia é que o conceito de timezone é um pouco mais complexo,
         * pois leva em consideração DLS (horário de verão), onde o offset pode variar
         * dependendo do dia do ano.
         */
        final ZonedDateTime aDateTimeWithZone = ZonedDateTime.now();

        /**
         * Usado para armazenar o dia do aniversário de alguém sem o ano.
         */
        final MonthDay monthDay = MonthDay.now();

        /**
         * Usado para representar um mês específico de um ano.
         */
        final YearMonth yearMonth = YearMonth.of(2020, 3);

        /**
         * Utilizado para representar um período.
         * Algo durou dois anos, um mês e sete dias.
         */
        final Period aPeriod = Period.of(2, 1, 7);

        /**
         * A classe Duration é utilizada para representar um intervalo
         * de tempo entre dois períodos.
         */
        final Duration aDuration = Duration.between(Instant.now(), Instant.now());
    }
}
