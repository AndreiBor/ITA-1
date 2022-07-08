package constructor;

public class MoneyManager {
    private int countMoney20;
    private int countMoney50;
    private int countMoney100;

    public MoneyManager(int countMoney20, int countMoney50, int countMoney100) {
        this.countMoney20 = countMoney20;
        this.countMoney50 = countMoney50;
        this.countMoney100 = countMoney100;
    }

    public MoneyManager(int countMoney20, int countMoney50) {
        this.countMoney20 = countMoney20;
        this.countMoney50 = countMoney50;
    }

    public MoneyManager(int countMoney20) {
        this.countMoney20 = countMoney20;
    }

    public MoneyManager() {
    }

    public void setMoney() {
        if (countMoney20 == 0 && countMoney50 == 0 && countMoney100 == 0) {
            MoneyManager moneyManager = new MoneyManager(100, 100, 100);
        } else if (countMoney20 == 0 && countMoney50 == 0) {
            MoneyManager moneyManager = new MoneyManager(100, 100);
        } else if (countMoney20 == 0) {
            MoneyManager moneyManager = new MoneyManager(100);
        }
    }
}
