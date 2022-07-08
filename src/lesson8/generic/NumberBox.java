package lesson8.generic;

import java.util.Queue;

class NumberBox<T extends Number> {
    T num;

    NumberBox(T n) {num = n;}

    // Проверить равенство абсолютных значений двух объектов
    boolean absEqual(NumberBox<?> obj) {
        if(Math.abs(num.doubleValue()) ==
                Math.abs(obj.num.doubleValue())) return true;
        return false;
    }

    void printInt(NumberBox<? super Double> value) {
        System.out.println(value);
    }



    public static void main(String[] args) {
        NumberBox<Integer> numberBox1 = new NumberBox(1);
        NumberBox<Double> numberBox2 = new NumberBox(-1);
        System.out.println(numberBox2.absEqual(numberBox1));

    }
}
