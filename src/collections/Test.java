package collections;


import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f = null;
        File[] paths;
        try {
            f = new File("e:/test.txt");
            f.createNewFile(); // создать новый файл



            f.mkdir(); //
            paths = f.listFiles();           // returns pathnames for files and directory
           /* for (File path : paths) {     // for each pathname in pathname array
                System.out.println(path);   // prints file and directory paths
            }*/
        } catch(Exception e){
            e.printStackTrace();
        }
;
    }
}
