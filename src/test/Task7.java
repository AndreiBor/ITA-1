package test;

public class Task7 {
    public static void main(String[] args) {
        int s1, a, b, r;
        double pi, s2;
        a = 21;
        b = 1;
        r = 10;
        pi = 3.14;
        s1 = a * b;
        s2 = pi * r * r;
        if (s2 > s1) {
            System.out.println("Прямоугольное отверстие со сторонами "
                    + a + " и " + b + " можно полностью закрыть круглой картонкой радиусом " + r);
        } else {
            System.out.println("Прямоугольное отверстие со сторонами "
                    + a + " и " + b + " нельзя полностью закрыть круглой картонкой радиусом " + r);
        }
    }
}