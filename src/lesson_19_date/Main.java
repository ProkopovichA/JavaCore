package lesson_19_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.of(2015,02,20);
        myDate = myDate.plus(5 , ChronoUnit.DAYS);
        System.out.println(myDate);
        DayOfWeek sunday = myDate.getDayOfWeek();

    }
}
