package constructor.pavel;

import javax.swing.*;

public class AtmUser {
    public static void main(String[] args) {
        Atm atm = new Atm();

        String desiredSum = JOptionPane.showInputDialog("Введите сумму " +
                "кратную 10");
        int sum = Integer.parseInt(desiredSum);

        atm.add20(2);
        atm.giveMoney(sum);
    }
}