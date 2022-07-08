package arrays;

import java.util.Random;

public class Array {

    public static final void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("initial array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        System.out.println("new array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }

        System.out.println("sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

    }

    private static void swap(int[] array, int i, int j){
        int buf = array[i];
        array[i] = array[j];
        array[j] = buf;
    }
}
