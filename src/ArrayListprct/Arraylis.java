package ArrayListprct;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylis {
    public static void main(String[] args) {


        ArrayList<Integer> scores =  new ArrayList<>();   // size:1

        scores.add(100);  // autoboxing   0
        scores.add(200);    //  1
        scores.add(300);    // 3

        scores.add(2, 400);  // 2
scores.add(4,2);
scores.add(4,5);
scores.add(null);
scores.add(6,8);
scores.add(7,20);
scores.add(9,5);
//scores.add(15,5);
int [] ok=new int[5];
        //System.out.println( scores );


ok [2]=3;
        System.out.println(Arrays.toString(ok));
        System.out.println();
        System.out.println(scores.size());
        System.out.println(scores.get(6));
        System.out.println(scores.size());

    }
}
