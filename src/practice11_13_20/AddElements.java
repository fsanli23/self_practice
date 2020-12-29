package practice11_13_20;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int k=9;
        addelement(arr,k);

    }
    public static void addelement(int [] array,int no){
       int [] result=new int[array.length+1];
               for (int i=0;i<=array.length-1;i++){
                   result[i]=array[i];}
               result[result.length-1]=no;

        System.out.println(Arrays.toString(result));
    }





}
