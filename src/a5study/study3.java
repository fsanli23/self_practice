package a5study;

import java.util.ArrayList;
import java.util.Arrays;

public class study3 {
    public static void main(String[] args) {


        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,9));
        ArrayList<String>list1=new ArrayList<>();
        list1.addAll(Arrays.asList("fatih","sanli","inanc","ozgul"));
        list1.remove(2);
        System.out.println(list1);


    }
}
