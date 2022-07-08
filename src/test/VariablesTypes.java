package test;

public class VariablesTypes {
    public static void main(String[] args) {

        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;

        System.out.printf("byte value: %x \n", b);
        System.out.printf("short value: %x \n", s);
        System.out.printf("int value: %d \n", i);
        System.out.printf("long value: %x \n", l);
        System.out.printf("char value: %c \n", c);
        System.out.printf("float value: %.2f \n", f);
        System.out.printf("double value: %.8f \n", d);
        System.out.printf("boolean value: %b \n", bool);

    }
}