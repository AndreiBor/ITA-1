package test;

public class ConvertC {

    static double far, kel, cel=9.5654;

    public static double toKelvin() {
        kel = cel + 273.15;
        return kel;
    }

    public static double toFahrenheit() {
        far = (9 / 5) * cel + 32;
        return far;
    }

    public static void main(String[] args){
        System.out.println(cel + " celsiy = " + toKelvin() + " Kelvin ");
        System.out.println(cel + " celsiy = " + toFahrenheit() + " Farengeit ");
    }

}