package lambda;

public class Test {

    public static void main(String[] args) {
        Runnable hello_world = () -> System.out.println("Hello World");


        int n = 20;
        int m = 30;
        Operation op = () -> {

            //n=100;- так нельзя сделать
            return m + n;
        };
        //n=200;  //- так тоже нельзя
        System.out.println(op.calculate()); // 100
    }
}
