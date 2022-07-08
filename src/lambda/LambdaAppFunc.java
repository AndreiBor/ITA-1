package lambda;

import java.util.ArrayList;

public class LambdaAppFunc {

    public static void main(String[] args) {
        LambdaAppFunc l = new LambdaAppFunc();
        Expression func = (n) -> n % 2 == 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums, func)); // 20
    }

    private static ArrayList sum(int[] numbers, Expression func) {
        ArrayList res = new ArrayList();
        for (int i : numbers) {
            if (func.isEven(i))
                res.add(i);
        }
        return res;
    }
}

interface Expression {
    boolean isEven(int n);
}
