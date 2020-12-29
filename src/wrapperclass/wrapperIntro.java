package wrapperclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class wrapperIntro {
    public static void main(String[] args) {
        byte b = 100;
        Byte b2 = b; // autoboxing




        // Integer b3 = (int)b;

        int i = 10;
        //  Byte b3 = i;  // wrapper class is only dedicated to its own primitive

        Integer I = 20;
        double d = I; // unboxing

        long l = I;


        Integer num = 100;
        //    Long L1 = num;
        long L2 = num;

        System.out.println("==================================");

        Character ch = 'A';
        char ch2 = ch;  // unboxing
        int n = ch;   // unboxing


        long score = 100;
        //   Double d1 =  score;
        Long d2 = score; // unboxing
        Long d3 = d2; // none

        double d4 = score;  //none


        String numberAsstring="2018";
        System.out.println(numberAsstring);

int number= Integer.valueOf(numberAsstring);
        System.out.println(number);




    }
}
