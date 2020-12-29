package a5study;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class study2 {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {   // write your codes here :
        r.removeIf(p -> p == n);

        return r;
    }// end of your code


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));
        System.out.println(Math.random());

        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1.equals(i2));

        Integer i3 = -200;
        Integer i4 = -200;
        System.out.println(i3.equals(i4));
/*Integer a=new Integer(5);
int b=5;
        System.out.println(a==b);*/
        int q = 1;
        int w = 2;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(i1, i2, i3, i4));


    }//end main
}
