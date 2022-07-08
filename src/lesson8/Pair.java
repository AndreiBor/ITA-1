package lesson8;

import java.util.Arrays;

public class Pair<T, V> {
    private T key;
    private V value;


    public Pair(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<Day, Integer>[] scheduler = new Pair[4];
        scheduler[0] = new Pair(Day.FRIDAY, 5);
        scheduler[1] = new Pair(Day.SATURDAY, 0);
        scheduler[2] = new Pair(Day.SUNDAY, 4);
        scheduler[3] = new Pair(Day.MONDAY, 6);

        for (Pair p : scheduler) {
            System.out.println(" День: " + p.getKey() + " Рабочих часов: " + p.getValue());
        }
    }

}
