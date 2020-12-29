package arrayList2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;

public class collectionUtility {
    public static void main(String[] args) {


        ArrayList<Character> chars =  new ArrayList<>();
        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');

        Collections.sort(chars);
        System.out.println(chars);
        System.out.println("===============================================");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(70);
        scores.add(80);
        scores.add(60);
        scores.add(70);
        scores.add(50);
        scores.add(65);
        scores.add(75);

      //  Collections.sort(scores);

        System.out.println(scores);

//Collections.swap(scores,scores.indexOf());
        Collections.swap(scores,scores.size()-1,0);
        System.out.println(scores);

        System.out.println("=================================================");


        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('A');
        list.add('D');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');


//Collections.replaceAll(list,'A','1');
        System.out.println(list);


 int frq=Collections.frequency(list,'A');

        System.out.println(frq);

        System.out.println("=========================================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1000);
        nums.add(20);
        nums.add(200);
        nums.add(2000);
        nums.add(10);

       int k= Collections.max(nums);
        int l=Collections.min(nums);
        System.out.println("l = " + l);
        System.out.println("k = " + k);



    }
}
