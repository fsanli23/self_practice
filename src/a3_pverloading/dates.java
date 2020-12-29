package a3_pverloading;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dates {
    public static void main(String[] args) {

        LocalDate yest = LocalDate.of(2020, 12, 15);
        System.out.println(yest);

        System.out.println(yest.isLeapYear());

        String[] names = {"jullia", "inna ", "Anna", "Rusian", "livio"};
        LocalDate[] dob = {LocalDate.of(2020, 2, 5),
                LocalDate.of(2020, 2, 6),
                LocalDate.of(2020, 12, 2),
                LocalDate.of(1984, 6, 4),
                LocalDate.of(1982, 2, 8)
        };


        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i] + dob[i]);
            System.out.println(names[i] + "was born in leap year" + dob[i].isLeapYear());
        }

        LocalDate today = LocalDate.now();
        LocalDateTime y = LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/yy/MMMM/- h-m-s-a");
        System.out.println(y.format(df));
        //System.out.println(y);
       // System.out.println(today);
       // System.out.println(today.format(df));
        //System.out.println(today.format(df));

    }
}
