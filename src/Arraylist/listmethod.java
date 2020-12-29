package Arraylist;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class listmethod {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Ercan");
        names.add("Ercan");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Tayfun");
        names.add("Suveyda");
        names.add("Egemen");


        System.out.println(names);
names.remove("Mustafa");
       //names.set(0,"fatih");
       // names.set(3,"afrooz");
        System.out.println(names);

        System.out.println("===================================================");





        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);


        System.out.println("============================================");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        //  Character ch = 'C';

        //list2.remove( 'A'  ); // 67
list2.remove(Character.valueOf('E'));
        System.out.println(list2);
        //System.out.println(r1);






    }
}
