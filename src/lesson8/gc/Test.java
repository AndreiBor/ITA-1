package lesson8.gc;

import java.util.*;

public class Test {
    static class Othello implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }

    static class Othello2 implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }

    public static void main(String[] args) {
        String[] s = {"map", "pen", "marble", "key"};
        Integer[] a = {5,6,1,3};
        Othello2 o2 = new Othello2();
        Arrays.sort(a, o2);
        for (Integer s2 : a) System.out.print(s2 + " ");
        System.out.println(Arrays.binarySearch(a, 6));
    }
}
