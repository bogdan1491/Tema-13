package ro.sci.servlet;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MyAge {


    public MyAge() {


    }

    public long computeBirthday(String birthday) {

        LocalDate birthdate = LocalDate.parse(birthday);
        LocalDate now = LocalDate.now();
        long totalDays = ChronoUnit.DAYS.between(birthdate, now);
        return totalDays;
    }
}
