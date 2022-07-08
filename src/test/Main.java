package test;

public class Main {

    public static void printMemory() {
        System.out.println("Max mem: " + Runtime.getRuntime().maxMemory() / 1000);
        System.out.println("Total mem: " + Runtime.getRuntime().totalMemory() / 1000);
        System.out.println("Free mem: " + Runtime.getRuntime().freeMemory() / 1000);
    }

    public static void main(String[] args) {

        System.out.println(Double.longBitsToDouble(0xfff0000000000000L));
    }

}
