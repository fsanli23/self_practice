package a2_method;

import java.util.Arrays;

public class addelements {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9};
int a =0;


    }

    public  static  void  addelement(int [] arr,int n){
        int [] arr2=new int[arr.length+1];
        for (int i =0;i<=arr.length-1;i++){
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=n;
        System.out.println(Arrays.toString(arr2));
    }




}
