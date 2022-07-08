package test;

import constructor.House;

public class HouseManager {
    public static void main(String[] args) {

        House house = new House(34);
        int desiredTemp = (int) (Math.random() * 100);
        house.createDesiredTemp(desiredTemp);

    }
}