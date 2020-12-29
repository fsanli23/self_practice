package customclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class carmax {
    public static void main(String[] args) {
        car car1=new car();

        car1.setinfo("toyota","yaris","red",2012,3500);

        car1.getInfo();
        Integer [] k={1,2,3,54,6,};

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(k));


        System.out.println(list);
list.remove(Integer.valueOf(1));
        System.out.println(list);
        System.out.println(list.containsAll(Arrays.asList(3,6)));

        System.out.println(Collections.max(list));

    }
}
