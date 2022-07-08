package concurrent2;

import dates.LocalDateTimeTest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DateCall implements Callable{

    private LocalDateTime dateTime;


    public DateCall(LocalDateTime dateTime) {
        this.dateTime = dateTime;

    }

    @Override
    public String call() throws Exception {

        while (Duration.between(dateTime, LocalDateTime.now()).toSeconds() < 0 ) {
            Duration d = Duration.between(dateTime, LocalDateTime.now());
            System.out.println("Event: " + Thread.currentThread().getName() + " will be started in " + d.toSeconds() + " seconds");
            Thread.sleep(1000);
        }

        return "Event " + Thread.currentThread().getName() + " started";
    }

    public static void main(String args[]) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        LocalDateTime datetime1 = LocalDateTime.now();
        Callable<Integer> callable1 = new DateCall(datetime1.plusSeconds(5));
        Callable<Integer> callable2 = new DateCall(datetime1.plusSeconds(15));
        Callable<Integer> callable3 = new DateCall(datetime1.plusSeconds(25));
        Callable<Integer> callable4 = new DateCall(datetime1.plusSeconds(35));
        Callable<Integer> callable5 = new DateCall(datetime1.plusSeconds(45));
        Future<Integer> future1 = pool.submit(callable1);
        Future<Integer> future2 = pool.submit(callable2);
        Future<Integer> future3 = pool.submit(callable3);
        Future<Integer> future4 = pool.submit(callable4);
        Future<Integer> future5 = pool.submit(callable5);
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
        System.out.println(future5.get());
        System.exit(1);
    }


}
