package test;

public class ClimateControl {
    public int startHeating(int temperature, int min) {
        int temp = temperature + min;
        System.out.println("Запустилось отопление, теперь температура = " + temp);
        return temp;
    }

    public int startCooling(int temperature, int min) {
        int temp = temperature - min;
        System.out.println("Запустилось охлождение, теперь температура = " + temp);
        return temp;
    }

}