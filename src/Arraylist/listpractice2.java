package Arraylist;

import java.util.ArrayList;

public class listpractice2 {
    public static void main(String[] args) {



        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(10);
        list2.add(300);
        list2.add(1000);
        list2.add(400);


int min=list2.get(0);
int max=list2.get(0);


/*for (int i=0;i<=list2.size()-1;i++){
    if (list2.get(i)>max){
        max=list2.get(i);
    }
    if (list2.get(i)<min){
        min= list2.get(i);

    }
}*/

     for (Integer each:list2)  {
          min=Math.min(min,each);
          max=Math.max(max,each);
     }







        System.out.println(min);
        System.out.println(max);










    }
}
