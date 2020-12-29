package Arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class class1 {
    public static void main(String[] args) {

        ArrayList<Integer> list9=new ArrayList<>(1);
        list9.add(2);
        list9.add(5);
        list9.add(6);
        list9.add(7);
        list9.add(1,8);
        list9.remove(Integer.valueOf(6));
        System.out.println(list9);
        //System.out.println(list.get(4));

        System.out.println("======================================");
        int [] arr={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList());


        System.out.println();
    }
}
