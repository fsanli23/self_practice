package LocalTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter inanc person birth year, month,and day");
        LocalDate dob1 = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());

        System.out.println("enter fatih person birth year,mont,day");
        LocalDate dob2 = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
        input.close();

        if (dob1.isBefore(dob2)){
            System.out.println("dob1 is older");
        }else if (dob2.isBefore(dob1)){
            System.out.println("dob2 is older");
        }else{
            System.out.println("they are at the same age");
        }

int currentage=LocalDate.now().plusYears(30).getYear()-dob1.getYear();

int currentage2=LocalDate.now().plusYears(30).getYear()-dob2.getYear();

        System.out.println(currentage);
        System.out.println(currentage2);





    }
}
