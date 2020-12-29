package a5study;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        list.set(1, 9);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.frequency(list, 1);
        Collections.max(list);

        System.out.println(list.lastIndexOf(3));


       DecimalFormat myformatter=new DecimalFormat("0.00");
        DateTimeFormatter k=DateTimeFormatter.ofPattern("MMMM,yyyy,dd");
        LocalDate today=LocalDate.now();
        System.out.println(today.format(k));

       double a=1.235632;
        System.out.println(myformatter.format(a));

    }
}
