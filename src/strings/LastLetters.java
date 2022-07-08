package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder("");
        String str = in.nextLine();
        Pattern p = Pattern.compile("\\p{L}+-?(\\p{L}+)?");
        Matcher match = p.matcher(str);
        while (match.find()) {
            s.append(match.group().charAt(match.group().length() - 1));
        }
        System.out.println(s);
    }
}