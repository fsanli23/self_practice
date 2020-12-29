package Arraylist;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimePractice {
    public static void main(String[] args) {
       /* 1. use the LocalDate & Time get the date and time in the following format:
        Tue, 01:00 pm, November/24/2020
        2. create an array of LocalDate and store the next 10 day's dates,
         use for each loop to print each Date in the following format:
        MonthName/Day, Name
        ex:
        November/25, Wednesday



        LocalDateTime today= LocalDateTime.of(2020,11,24,13,00);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("EEE, hh:mm a MMMM/dd/y");

        System.out.println(today.format(df));

LocalDate tomm=LocalDate.of(2020,11,25);
DateTimeFormatter dft=DateTimeFormatter.ofPattern("MMMM/dd EEEE");
LocalDate [] tendays=new LocalDate[10];
for (int i=0;i<=9;i++){
    tendays[i]=tomm.plusDays(i);
    System.out.println(tendays[i].format(dft));
}

3. create an array of string and store 5 of your friends' names
        create an array of LocalDate and store their DofB
        find out who is youngest and oldest
                */

        System.out.println("=======================================================");

        String[] names = {"fatih", "resul", "serap", "mehtap", "vahap"};
        LocalDate[] dob = {LocalDate.of(1984, 05, 01),
                LocalDate.of(1989, 11, 24),
                LocalDate.of(1979, 04, 05),
                LocalDate.of(1977, 05, 15)};


        String youngestname = names[0];
        LocalDate yongestdate = dob[0];

        String oldestname = names[0];
        LocalDate oldestdate = dob[0];

        for (int i = 0; i <= dob.length - 1; i++) {
            if (dob[i].isAfter(yongestdate)) {
                yongestdate = dob[i];
                youngestname = names[i];
            }
            if (dob[i].isBefore(oldestdate)) {
                oldestdate = dob[i];
                oldestname = names[i];
            }
        }
        System.out.println("oldestname = " + oldestname);
        System.out.println("youngestname = " + youngestname);
    }
}
