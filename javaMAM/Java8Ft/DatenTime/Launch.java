package Java8Ft.DatenTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Launch {
    public static void main(String[] args) {
        LocalDate tommorrow = LocalDate.now().plusDays(1);
        System.out.println(tommorrow);
        // Temporal Adjuster
        LocalDate today = LocalDate.now();
        LocalDate LastDay = today.with(TemporalAdjusters.lastDayOfMonth());// Last day of month
        System.out.println(LastDay);
        LocalDate week = LocalDate.now();
        LocalDate next = week.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));// Finding day of week
        System.out.println(next);
    }

}
