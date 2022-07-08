package dates;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {

        // Получаем текущее время
        LocalTime time = LocalTime.now();
        System.out.println("Получаем текущее время : " + time);

        //Создаем LocalTime с использование своих данных в качестве параметров
        LocalTime specificTime = LocalTime.of(23, 15, 11, 22);
        System.out.println("Какое-то время дня : " + specificTime);

        //Получаем дату через 2000 секунд после 01.01.1970
        LocalTime sec2000 = LocalTime.ofSecondOfDay(10000);
        System.out.println("Через 2000 секунд после 01.01.1970 : " + sec2000);
    }
}
