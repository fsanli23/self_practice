package a3_pverloading;

import java.time.LocalDate;

public class dataprtc {
    public static void main(String[] args) {

        LocalDate dob=LocalDate.of(1984,0,0);
        System.out.println(dob);
        System.out.println(dob.getYear()+" "+dob.getDayOfMonth());
        LocalDate today=LocalDate.now();
        System.out.println(today);







    }
}
