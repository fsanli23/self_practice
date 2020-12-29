package LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        LocalDate yest=LocalDate.of(2020,11,26);
        System.out.println(yest);
        System.out.println(yest.getMonth());
        System.out.println(yest.isLeapYear());
        LocalDate today=LocalDate.now();
        LocalDateTime tn=LocalDateTime.now();

        System.out.println(today);
        System.out.println(tn);
        LocalTime t1=LocalTime.of(00,2,2);
        System.out.println(t1);
        LocalDateTime t2=LocalDateTime.of(1984,05,01,10,10);
        System.out.println(t2.getDayOfWeek());
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your birthday");
       LocalDateTime birthday=LocalDateTime.of(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());

whatDayUBorn(birthday);



    }
    public  static void whatDayUBorn(LocalDateTime birthday){

        System.out.println(birthday.getDayOfWeek());
    }
}
