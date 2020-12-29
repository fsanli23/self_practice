package javaprictece_11_09_20;

import java.util.Arrays;

public class combine2Array {
    public static void main(String[] args) {


        int[] arr1 = {10,20,30,40,50,60,70,80,90,100, 200, 300};
        //{1,2,3,4}
        int[] arr2 = {-1,-2,-3,-4,-5,-6,-7,-8};
        // {5,6,7}

int i =0;

 int [] arr3=new int[arr1.length+arr2.length];


        for (int each:arr1 ) {
            arr3[i++]=each;

        }
for (int each:arr2){
    arr3[i++]=each;
}

        System.out.println(Arrays.toString(arr3));





    }
}
