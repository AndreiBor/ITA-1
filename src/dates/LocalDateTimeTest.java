package dates;

import java.time.*;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        // Получаем текущее время
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Получаем текущее время : " + today);

        //Создаем новую дату с помощью LocalDate и LocalTime
        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("DateTime : " + today);

        //Создаем LocalDateTime передавая в качестве аргументов
        //год, месяц, день, час, минуту, сукенду
        LocalDateTime randDate = LocalDateTime.of(2017, Month.JULY, 9, 11, 6, 22);
        System.out.println("LocalDateTime с указанной датой : " + randDate);

        //Получаем дату через 2000 секунд после 01.01.1970
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(2000, 0, ZoneOffset.UTC);
        System.out.println("Через 2000 секунд после 01.01.1970 : " + dateFromBase);

    }

}
