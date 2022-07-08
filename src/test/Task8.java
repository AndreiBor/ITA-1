package test;

public class Task8 {   //Rouble
    public static void main(String[] args) {
        int x, y, sum, sum1;
        x = 13;
        y = 1;
        sum = x + y;
        sum1 = sum % 10;
        if (sum % 100 > 10 && sum % 100 < 15) {
            System.out.println("Сумма " + sum + " рублей");
        } else {
            switch (sum1) {
                case 1:
                    System.out.println("Сумма " + sum + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Сумма " + sum + " рубля");
                    break;
                default:
                    System.out.println("Сумма " + sum + " рублей");


            }
        }
    }
}