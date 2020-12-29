package customclass;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistpractices2 {
    public static void main(String[] args) {

       /* task03:
        1. create an Array of String called jobTitles
        2. write a program that only keeps the jobTitles that are: SDET and QA
*/

        String[] jobTitles = {"SDET", "Scrum Master", "QA", "Developer", "PO", "BA", "CEO", "SDET", "QA", "Developer", "SDET"};

        ArrayList<String>list=new ArrayList<>(Arrays.asList(jobTitles));




        list.removeIf(p->!p.equalsIgnoreCase("sdet")&&!p.equalsIgnoreCase("qa"));

        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

    }
}
