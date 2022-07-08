package javaio;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("e:/notes3.txt", false)) {
            String text = "Hello Gold!";
            writer.write(text);
            writer.append('\n');
            writer.append('E');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Читаем посимвольно
        try (FileReader reader = new FileReader("e:/notes3.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Читаем массивом символов
        try (FileReader reader = new FileReader("e:/notes3.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Scanner sc = new Scanner(System.in);

        String text = "Hello world!";
        try (FileOutputStream fos = new FileOutputStream("e:/notes3.txt")) {
            byte[] buffer = text.getBytes();   // перевод строки в байты
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        try (FileInputStream fin = new FileInputStream("e:/notes3.txt");
             FileOutputStream fos = new FileOutputStream("e:/notes_new.txt")) {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            System.out.println(Arrays.toString(buffer));
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        House house1 = null;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/house.dat"))) {
            house1 = new House("Sam");
            oos.writeObject(house1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        House house2 = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/house.dat"))) {
            house2 = (House) ois.readObject();
            System.out.printf("Name: %s", house2.getAddress());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(house1.equals(house2));


    }
}
