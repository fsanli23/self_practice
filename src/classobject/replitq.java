package classobject;

import java.util.ArrayList;
import java.util.Arrays;

public class replitq {
    public static void main(String[] args) {

      ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5))  ;


        System.out.println(twoTimes(list));





    }








    /*For example, if the parameter is
            (1,5,3,7)
    The method should return a new ArrayList of Integers with
            (1,1,5,5,3,3,7,7)
*/

public static ArrayList<Integer> twoTimes(ArrayList<Integer>list){

ArrayList<Integer>repeated=new ArrayList<>();
repeated.addAll(list);
for (int i=0;i<=repeated.size();i+=2){
    repeated.add(i, list.get(i));
}




  return repeated;
}







    public static void repeatAL(ArrayList<Boolean>list1){
        list1.addAll(list1);
    }
}
