package practice_12_5_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class class2 {
    public static void main(String[] args) {
ArrayList<Boolean>list1=new ArrayList<>();
list1.addAll(Arrays.asList(true,false,false));
      ArrayList<Boolean> k=repeatAL(list1);
        System.out.println(k);
    }








    public static  ArrayList<Integer>appendPosSum(ArrayList<Integer>list1){

        ArrayList<Integer> positive=new ArrayList<>();
        for(int each:list1){
            if(each>0){
                positive.add(each);
            }
            }
            int sum=0;
            for(int each:positive){
                sum+=each;
            }
            positive.add(positive.size(),sum);





        return positive;
    }

public static ArrayList <Boolean>repeatAL(ArrayList<Boolean>list){
      for (int i=0;i<=list.size()-1;i++){
          list.add(i,list.get(i));
      }
      return list;
}

}
