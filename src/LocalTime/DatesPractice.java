package LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

public class DatesPractice {
    public static void main(String[] args) {

        LocalDateTime friday=LocalDateTime.of(2022,11,23,2,40);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("EEEE,hh:mm a ,MMMM/dd/Y");
        System.out.println(friday.format(f));

        LocalDate tommorow=LocalDate.now().plusDays(1);
                    LocalDate today=LocalDate.now();
        System.out.println(tommorow.isAfter(today));
        System.out.println(today.isBefore(tommorow));

        LocalDateTime chr=LocalDateTime.of(2021,01,01,00,00,00);
        int dayleft=365-LocalDateTime.now().getDayOfYear();
        System.out.println(dayleft);


        LocalTime classstart=LocalTime.of(10,0);
        LocalTime firstbreak=classstart.plusMinutes(45);
        LocalTime secondbreak=firstbreak.plusHours(1);
        System.out.println("firstbreak = " + firstbreak);
        System.out.println("secondbreak = " + secondbreak);
        System.out.println("classstart = " + classstart);
    }
}
