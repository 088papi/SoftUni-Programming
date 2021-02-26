package Task4;

import java.time.DayOfWeek;

public enum WeekDay {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(3),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    public int numeric;

    private WeekDay(int numeric){
        this.numeric = numeric;
    }

    public int getNumeric() {
        return numeric;
    }
}
