package day35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        String[] countryNames = {"andorra", "United Arab Emirates", "Afghanistan", "turkey", "United States"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countryNames));
        list.removeIf(p -> p.length() > 10);
        System.out.println(list);

        System.out.println("=================================================");
        LocalDate[] arr = {LocalDate.of(2010, 11, 23),
                LocalDate.of(2010, 11, 23),
                LocalDate.of(2012, 11, 23),
                LocalDate.of(2013, 11, 23),
                LocalDate.of(2014, 11, 23),
                LocalDate.of(2015, 11, 23),
                LocalDate.of(2016, 11, 23),
                LocalDate.of(2017, 11, 23)};


        ArrayList<LocalDate> list1 = new ArrayList<>(Arrays.asList(arr));
        LocalDate d1 = LocalDate.of(2016, 8, 15);
        System.out.println(list1);
        list1.removeIf(p -> p.isBefore(d1));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEEE");
        System.out.println(list1);
        for (LocalDate each : list1) {
            System.out.println(each.format(df));
        }

    }
}
