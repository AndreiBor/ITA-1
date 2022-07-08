package test;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                System.out.println("continue!");
                continue;
            }
            System.out.println("i = " + i);
        }

        Task5 task5 = new Task5();
        task5.printFirstFiveElements(10);
    }

    void printFirstFiveElements(int count) {
        for (int j = 1; j <= 2; j++) {
            for (int i = 1; i <= count; i++) {
                System.out.println(i);
                if (i == 5) break;
            }
            System.out.println("ККККККК");
        }

    }

}