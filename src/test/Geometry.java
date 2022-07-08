package test;

public class Geometry {

    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int r = 6;
        if (r >= Math.sqrt((a * a + b * b) / 4)) {
            System.out.println("Прямоугольник полностью закрыт кругом");
        } else {
            System.out.println("Прямоугольник не полностью закрыт кругом");
        }
    }
}