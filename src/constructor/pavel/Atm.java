package constructor.pavel;

public class Atm {
    private static int numberBanknotes20; //количество купюр
    private static int numberBanknotes50;
    private static int numberBanknotes100;
    private static int availableAmount;//вся сумма в атм - номинал * количество
    public static boolean takeMoney;

    // счетчик выданных купюр
    int count20;
    int count50;
    int count100;

    // конструктор атм, банкноты частично загружены
    public Atm() {
        numberBanknotes20 = 0;
        numberBanknotes50 = 2;
        numberBanknotes100 = 3;
    }

    // методы добавления банкнот разных номиналов
    public void add20(int number) {
        numberBanknotes20 += number;
    }

    public void add50(int number) {
        numberBanknotes50 += number;
    }

    public void add100(int number) {
        numberBanknotes100 += number;
    }

    // расчет набора выдаваемых купюр
    public void giveMoney(int sum) {
        int sumOut = sum;
        System.out.println("===========================");

        int nominal_100 = 100;
        int nominal_50 = 50;
        int nominal_20 = 20;
        availableAmount = nominal_20 * numberBanknotes20 +
                nominal_50 * numberBanknotes50 +
                nominal_100 * numberBanknotes100;

        if (checkSum(sum)) {
            while (sum > 0 && numberBanknotes100 > 0) {
                sum -= 100;
                numberBanknotes100--;
                count100++;
            }
            if (sum < 0) {
                sum += 100;
                numberBanknotes100++;
                count100--;
            }

            while (sum > 0 && numberBanknotes50 > 0) {
                sum -= 50;
                numberBanknotes50--;
                count50++;
            }
            if (sum < 0) {
                sum += 50;
                numberBanknotes50++;
                count50--;
            }

            while (sum > 0 && numberBanknotes20 > 0) {
                sum -= 20;
                numberBanknotes20--;
                count20++;
            }
        }
        cheque(sumOut); // вывод чека с количеством и номиналом купюр
        getTransactionStatus(); // статус операции (успешно/нет)
        System.out.println("===========================");
    }

    private void cheque(int sumOut) {
        String str = "";
        if (count100 == 0) {
            str += "";
        } else str += (count100 + "х100 BYN\n");
        if (count50 == 0) {
            str += "";
        } else str += (count50 + "х50 BYN\n");
        if (count20 == 0) {
            str += "";
        } else str += (count20 + "х20 BYN\n");

        System.out.print("Выдано:\n" + str);
        System.out.println("На общую сумму " + sumOut + " BYN");

    }

    private void approve() {
        takeMoney = true;
    }

    private void reject() {
        takeMoney = false;
    }

    public boolean checkSum(int sum) {
        if (sum > availableAmount) {
            System.out.println("В банкомате отсутствует\n необходимая сумма.");
        } else if (sum == 0) {
            System.out.println("Проверьте введенную сумму");
        } else if (sum % 10 != 0) {
            System.out.println("Введенная сумма должна быть кратна 10");
        } else approve();
        return takeMoney;
    }

    private void getTransactionStatus() {
        System.out.println("        ***        ");
        if (takeMoney) System.out.println("Операция завершена успешно");
        else System.out.println("Неудачная операция.\nЖелаете повторить?");
    }

}