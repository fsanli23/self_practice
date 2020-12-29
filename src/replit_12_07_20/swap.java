package replit_12_07_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swap {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
       // System.out.println(Arrays.toString(do_switch(arr)));

       // System.out.println(doswap(arr));




    }


    public static int[] do_switch(int[] i)
    {
        int temp=i[0];
        i[0]=i[i.length-1];
        i[i.length-1]=temp;
        return i;
    }



    public  static ArrayList<Integer>doswap(int []i){
        ArrayList<Integer>list=new ArrayList<>();
        for (int each:i){
            list.add(each);

        }
        Collections.swap(list,0,list.size()-1);
        return list;
    }








    }





