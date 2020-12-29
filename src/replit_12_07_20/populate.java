package replit_12_07_20;

import java.util.Arrays;

public class populate {
    public static int[] populate(int[] r)
    {
        //write your codes here
        for(int i=0,j=1;i<=r.length-1;i++){
            r[i]=j++;
        }
        return r;
    }

    public static void main(String[] args)
    {


        int [] i= new int[5];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }




}
