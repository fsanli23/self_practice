package recap;

import study1.warehouse;

import java.util.ArrayList;
import java.util.Arrays;

public class prtc {
    public static void main(String[] args) {

       /* 1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1, 2, 3, 4, 5];
        output: [1, 2, 3, 4, 0];
*/

        int [] list={1,2,3,4,5};

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.set(list1.size()-1,0);
        System.out.println(list1);

        System.out.println("=========================================");

       /* 2. write a program that can multiply each odd number by 2
    ex:   list = [1,2,3,4,5];
        output: [2,2,6,4,10]
*/
ArrayList<Integer> list2=new ArrayList<>();

list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);


for (Integer each:list2){
    if (each%2!=0){
       
    }
}

warehouse g=new warehouse();


    }
}
