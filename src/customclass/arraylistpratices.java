package customclass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylistpratices {
    public static void main(String[] args) {

       /* task01:
        1. create an Array of string called country names
        2. write a program that can remove all the country names that have length of 10 or greater
*/

        String[] countryNames = {"Andorra","United Arab Emirates","Afghanistan","Turkey","United States"," Antigua and Barbuda","Albania", "Colombia", "Venezuela", "Panama","United Kingdom", "Mexico ", "United States"};

        ArrayList<String>list=new ArrayList<>(Arrays.asList(countryNames));


list.removeIf(p->!(p.length()>10));
        System.out.println(list);

        System.out.println("=====================================================================");

       /* task02:
        1. create an Array of LocalDate
        2. write a program that can remove all the dates before August-15-2016
*/


        LocalDate[] arr1 = {
                LocalDate.of(2010, 11, 23),
                LocalDate.of(2012, 11, 23),
                LocalDate.of(2013, 11, 23),
                LocalDate.of(2014, 11, 23),
                LocalDate.of(2015, 11, 23),
                LocalDate.of(2016, 7, 23),
                LocalDate.of(2017, 11, 23),
                LocalDate.of(2018, 11, 23),
                LocalDate.of(2019, 11, 23),
                LocalDate.of(2020, 11, 23),
        };


        ArrayList<LocalDate> list1=new ArrayList<>(Arrays.asList(arr1));

        list1.removeIf(p->p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(list1);








    }
}
