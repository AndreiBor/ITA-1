package test;

public class NameOfMoney {
    public static void main(String[] args) {
        int i = 0;
        do {
            //int number = (int) (Math.random() * 100+1);
            int number = 14;
            int lastNumber = number % 10;
            if (lastNumber == 1) {
                System.out.println(number + " рубль");
            } else if (lastNumber > 1 && lastNumber < 5) {
                System.out.println(number + " рубля");
            } else {
                System.out.println(number + " рублей");
            }
            i++;
        } while (i <= 10);
    }
}