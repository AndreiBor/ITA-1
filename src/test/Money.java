package test;

public class Money {

    public static void main(String[] args) {
        int x =238742;
        if ((x % 10 == 1) && (x != 11)) {
            System.out.println("У меня в кошельке " + x + " рубль");
        } else if (((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4) && (x != 12 && x != 13 && x != 14)) ) {
                System.out.println("У меня в кошельке " + x + " рубля");

        } else {
            System.out.println("У меня в кошельке " + x + " рублей");
        }
    }
}