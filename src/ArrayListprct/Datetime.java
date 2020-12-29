package ArrayListprct;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Datetime {
    public static void main(String[] args) {

        /*
1. use the LocalDate & Time get the date and time in the following format:
			Tue, 01:00 pm, November/24/2020
	2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following format:
				MonthName/Day, Name
				ex:
					November/25, Wednesday
    3. create an array of string and store 5 of your friends' name
       create an array of LocalDate and store their DofB
       find out who is youngest and oldest
 */

        LocalDateTime day=LocalDateTime.of(2020,11,24,16,00);
        DateTimeFormatter ft=DateTimeFormatter.ofPattern("EEEE, hh:mm  a,MMM/dd/yy");
        System.out.println(day.format(ft));

        System.out.println("==================================================");

        LocalDate today=LocalDate.now();

        LocalDate [] next10days=new LocalDate[10];
        for (int i=1,j=0;i<=10;i++,j++){
            next10days[j]=today.plusDays(i);
        }

        System.out.println(Arrays.toString(next10days));

        System.out.println("============================================================");

        String[] friends = {"Polina", "Serhii", "Aziz", "Halzat", "Abdujilil", "Ayse"};
        LocalDate[] dOfB = {
                LocalDate.of(1991, 9, 25),
                LocalDate.of(1990, 11, 23),
                LocalDate.of(1995, 02, 10),
                LocalDate.of(2000, 03, 15),
                LocalDate.of(2005, 04, 20),
                LocalDate.of(2010, 05, 25)
        };



         LocalDate older=dOfB[0];
LocalDate younger=dOfB[0];



for (LocalDate each:dOfB){
    if (each.isBefore(older)){
        older=each;
    }
    if (each.isAfter(younger)){
        younger=each;

    }
}


        System.out.println("younger = " + younger);
        System.out.println("older = " + older);



    }
}
