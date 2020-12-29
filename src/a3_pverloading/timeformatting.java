package a3_pverloading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class timeformatting {
    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM dd EE")   ;
        LocalDate today=LocalDate.of(2020,12,19);
        System.out.println(today.format(df));

        LocalDateTime tomm=LocalDateTime.of(2020,12,17,12,22,2,3);
        System.out.println(tomm.format(df));
        // Monday, 12:40 PM,  Nov/23/2020
        DateTimeFormatter frm=DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        System.out.println(tomm.format(frm));

FindSumOfBinaryStrings k=new FindSumOfBinaryStrings();
    }

}
