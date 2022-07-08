package test;

public class Rubles {
    public static void main(String[] args) {
        int num = 14;
        int a = num % 10;
        int b = num % 100;
        if ( a == 1 && b != 11) {
            System.out.println(num + " рубль");
        } else if ( a >= 2 && a  <= 4 ) {
            System.out.println(num + " рубля");
        } else {
            System.out.println(num + " рублей");
        }
    }
}