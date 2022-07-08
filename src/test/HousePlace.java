package test;

public class HousePlace {
    public static void main(String[] args) {
        int a = 19;
        int b = 1;
        int c = 19;
        int d = 1;
        int e = 20;
        int f = 20;
        int houseOne = a * b;
        int houseTwo = c * d;
        int placeSqure = e * f;
        if (a < e && a < f && b < e && b < f && c < e && c < f && d < e && d < f && (houseOne + houseTwo) < placeSqure) {
            System.out.println("Дома возможно разместить");
        } else {
            System.out.println("Дома разместить невозможно");
        }

    }
}