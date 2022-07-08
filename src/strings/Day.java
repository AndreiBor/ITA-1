package strings;

import java.util.Arrays;

public enum Day {
    MONDAY(true, 7),
    TUESDAY(true, 8),
    WEDNESDAY(true, 8),
    THURSDAY(true, 8),
    FRIDAY(true, 6),
    SATURDAY(false, 0),
    SUNDAY(false, 0);
    private boolean isWorkingDay;

    Day(boolean isWorkingDay, int workHousers) {
        this.isWorkingDay = isWorkingDay;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Day.values()));
    }
}
