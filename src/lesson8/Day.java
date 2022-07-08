package lesson8;

import java.util.Arrays;

public enum Day {
    MONDAY(true, 1), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true),
    SATURDAY(false), SUNDAY(false);
    private boolean isWorkingDay;

    Day(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    Day(boolean isWorkingDay, int workHouers) {
        this.isWorkingDay = isWorkingDay;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Day.values()));
    }
}
