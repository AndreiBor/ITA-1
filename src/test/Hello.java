package test;

public class Hello {

    public static void main(String[] args) {

        //System.out.println(new String("test") == "test");

        // Эти строки имеют одно и тоже же значение
        //System.out.println(new String("test").equals("test")); // --> true


        // ...эти строки тоже разные объекты
        //System.out.println(new String("test") == new String("test")); // --> false

        // ...но эти строки указывают на один и тот же объект,
        // потому что компилятор добавляет все литералы в пул.
        //System.out.println("test" == "test"); // --> true

        // Конкатенация литералов тоже происходит на стадии компиляции,
        // поэтому они указывают на один объект
        //System.out.println("test" == "te" + "st"); // --> true

        // но вызов substring() происходит во время выполнения,
        // в результате получаются разные объекты.
        //System.out.println("test" == "!test".substring(1)); // --> false

        // Строки из пула могут быть получены с помощью вызова intern().
        //System.out.println("test" == "!test".substring(1).intern()); // --> true

        //System.out.println("test".equals("!test".substring(1))); // --> true

    }
}