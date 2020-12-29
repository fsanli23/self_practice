package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistPractice2 {
    public static void main(String[] args) {

  String [] jobtitles={"SDET","Scrum Master","QA","Developer","PO","BA","CEO","SDET","QA","Dveloper"};

        ArrayList<String>list=new ArrayList<>(Arrays.asList(jobtitles));
       list.removeIf(p->!p.equalsIgnoreCase("sdet")&&!p.equalsIgnoreCase("QA"));
//list.retainAll(Arrays.asList("SDET","QA"));

        System.out.println(list);

        System.out.println("================================");

        ArrayList<Integer>list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,-1,-3));

list2.removeIf(p->p<7);

        System.out.println(list2);

    }
}
