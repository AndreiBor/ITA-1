package dates;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        // Получае текущую дату
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата : " + today);

        //Создадим LocalDate и в качестве аргументов
        //укажем год месяц и день
        LocalDate specificDate = LocalDate.of(2017, Month.NOVEMBER, 30);
        System.out.println("Дата с указанием года, месяца и дня : " + specificDate);


        //А теперь попробуем хитрость. Укажем дату с ошибкой
        //LocalDate invDate = LocalDate.of(2014, Month.JULY, 33);
        //Но получим исключение java.time.DateTimeException:
        //Invalid value for DayOfMonth (valid values 1 - 28/31): 33

        //Получаем дату, например с 01.01.1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("Дата с начала отсчета времени : " + dateFromBase);

        LocalDate day256_2017 = LocalDate.ofYearDay(2014, 256);
        System.out.println("256 день 2017 : " + day256_2017);
    }
}
