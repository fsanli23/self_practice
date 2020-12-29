package LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeformat {
    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM/dd/yyyy,E   ");
LocalDateTime today=LocalDateTime.of(2020,11,26,5,5);
        System.out.println(today.format(df));

DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now=LocalTime.now();
        System.out.println(now.format(tf));



        DateTimeFormatter j=DateTimeFormatter.ofPattern("MMMM/dd/yyyy,EEEE,\n hh/mm/ss/a");
        LocalDateTime yesterday=LocalDateTime.of(2020,11,26,5,4);
        System.out.println(yesterday.format(j));
    }
}
