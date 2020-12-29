package a2_method;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class eligibletobuyalcohol {
    public static void main(String[] args) {
  LocalDate k=LocalDate.now();

eligibletobuyalcohol(2013);

    }
    public static void eligibletobuyalcohol(int dob){
        LocalDate today=LocalDate.now();
        if ((today.getYear())-(dob)>=18){
            System.out.println("you are eligible to buy alcohol");
        }else{
            System.out.println("not enough old to buy alcohol");
        }

    }

}
