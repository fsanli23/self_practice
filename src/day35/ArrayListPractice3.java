package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,91,100,200,300,400))    ;
        list.removeIf(p->p>100);
        System.out.println(list);

ArrayList<Integer>temp=new ArrayList<>();
for (Integer each:list){
    if (each<=100){
        temp.add(each);
    }
}
temp=list;



    }
}
