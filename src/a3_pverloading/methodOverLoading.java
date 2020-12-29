package a3_pverloading;

import practice_11_07_20.max;

import java.util.Arrays;

public class methodOverLoading {

    public static void main(String[] args) {
       // System.out.println(maxim(5,9));
        //System.out.println(maxim(3.5,6.2));



        int [] arr={9,2,3,4,5,6,99,45,75};
        Arrays.sort(arr);
        sortfromlarger(arr);


    }
public  static void sortfromlarger(int []arr){
        int arr1[]=new int[arr.length];
        for (int i=arr.length-1,j=0;i>=0;i--){
            arr1[j++]=arr[i];
        }
    System.out.println(Arrays.toString(arr1));

        int [] array={1,2,3,4,5,};
        int []arryy1={6,7,8,9};
    System.out.println(Arrays.toString(adddarr(array,arryy1)));
    System.out.println();
}


    public static double maxim(double a,double b) {
        double max=0;
        if (a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }

    public static int[] adddarr(int []arr1,int arr2[]){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1){
            arr3[i++]=each;
        }
        for (int each:arr2){
            arr3[i++]=each;
        }
        return arr3;
    }



}
