package test;

public class RubleCase {
    public static void main(String[] args) {
        int ruble = 14;
        if (ruble % 10 == 1) {
            System.out.println(ruble + " рубль");
        } else if (ruble % 10 == 2) {
            System.out.println(ruble + " рубля");
        } else if (ruble % 10 == 3) {
            System.out.println(ruble + " рубля");
        } else if (ruble % 10 == 4) {
            System.out.println(ruble + " рубля");
        } else if (ruble % 10 == 5) {
            System.out.println(ruble + " рублей");
        } else if (ruble % 10 == 6) {
            System.out.println(ruble + " рублей");
        } else if (ruble % 10 == 7) {
            System.out.println(ruble + " рублей");
        } else if (ruble % 10 == 8) {
            System.out.println(ruble + " рублей");
        } else if (ruble % 10 == 9) {
            System.out.println(ruble + " рублей");
        } else if (ruble % 10 == 0) {
            System.out.println(ruble + " рубль");
        }
    }
}