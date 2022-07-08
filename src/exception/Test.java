package exception;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    static final Logger log = Logger.getLogger(Test.class.getName());

    public void readFile(String path) throws IOException {
        File f = new File(path);
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }


    public static void main(String[] args)  {
        Test test = new Test();
        try {
            test.readFile("e:\\test.txt");
        } catch (IOException e) {
            log.log(Level.WARNING, "Error in method2", e);

        }
    }
}
