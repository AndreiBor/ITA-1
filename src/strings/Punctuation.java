package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Виталий
public class Punctuation {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder("");
        String str = in.nextLine();
        Pattern p = Pattern.compile("(?=[\\p{P}])[^-]| - ");
        Matcher match = p.matcher(str);
        while (match.find()) {
            s.append(match.group());
            n++;
        }
        System.out.println(s);
        System.out.println("Кол-во знаков препинания: " + n);
    }
}