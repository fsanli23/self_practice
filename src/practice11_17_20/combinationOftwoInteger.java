package practice11_17_20;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class combinationOftwoInteger {
    public static void main(String[] args) {

      int [] arr3= {2          ,            8,9,     (5+6) /4           };
       // System.out.println(Arrays.toString(arr3));
int[] arr4={3,9,66,47};



        combination2arry(arr3,arr4);


    }







 public static void combination2arry(int []array1,int []array2) {
        int[] comb=new int[array1.length+array2.length];
int i=0;
     for (int each:array1) {
          comb[i++]=each;

     }
       for (int each:array2){
           comb[i++]=each;
       }
     System.out.println(Arrays.toString(comb));
 }





}
