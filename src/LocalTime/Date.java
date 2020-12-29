package LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        /*LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalTime todaytime=LocalTime.now();
        System.out.println(todaytime);
        LocalDateTime todayldt=LocalDateTime.now();
        System.out.println(todayldt);*/

       LocalDate dob=LocalDate.of(1984,05,01) ;
        System.out.println(dob);

birtday(11,27,2022);

    }
    public static void birtday(int month,int day,int year){
     LocalDate birthday=LocalDate.of(1,month,day);
        LocalDate today=LocalDate.now();

        int month2=today.getMonthValue();
        int day2=today.getDayOfMonth();
        int year2=today.getYear();
if (year>year2){
    System.out.println("you have not been born yet");
    
}

        if (day2==day&&month2==month&&year2==year){
            System.out.println("it is your birthday");
        }else{
            System.out.println("it is not your birthday yet");
        }





















    }



}
