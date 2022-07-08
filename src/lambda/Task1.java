package lambda;

import java.util.Arrays;
import java.util.List;

public class Task1 {



    public static void main(String[] args) {
        // Старый способ:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();



        new Thread(
                () -> System.out.println("Hello from thread")
        ).start();


        // Старый способ:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list) {
            System.out.println(n);
        }

        // Новый способ:
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list1.forEach(n -> System.out.println(n));

        // Новый способ с использованием оператора двойного двоеточия ::
        list1.forEach(System.out::println);


        MathInterface m = new MathInterface<Integer>() {
            @Override
            public Integer getMax(Integer first, Integer second) {
                if (first > second)
                    return first;
                return second;
            }
        };

        System.out.println("MAX L: " + m.getMax(5,1));

        MathInterface<Integer> maxValueLambda = (Integer a, Integer b) -> {
            if(a>b) return a;
            else return b;
        };
        System.out.println("MAX L: " + maxValueLambda.getMax(3,4));

    }



}
@FunctionalInterface
interface MathInterface<T> {

    T getMax(T first, T next);
}