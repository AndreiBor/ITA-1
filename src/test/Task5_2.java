package test;

public class Task5_2 {
    public static void main(String[] args) {
        int sec = 1250555, min, how, day, week;
        int minL = 60, howL = 60 * minL, dayL = 24 * howL, weekL = dayL * 7;
        week = sec / weekL;
        sec = sec % weekL;
        day = sec / dayL;
        sec = sec % dayL;
        how = sec / howL;
        sec = sec % howL;
        min = sec / minL;
        sec = sec % minL;

        System.out.println(week + " nedel " + day + " dney " + how + " chasov " + min + " minut " + sec + " secund ");

    }
}