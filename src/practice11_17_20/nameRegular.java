package practice11_17_20;

import java.util.Arrays;

public class nameRegular {
    public static void main(String[] args) {

      String myname= "fatih sanli";

        regularname(myname);

    }





 public static void regularname(String name){
        String [] array=name.split(" ");
    for (int i=0;i<=array.length-1;i++){
        array[i]=array[i].substring(0,1).toUpperCase()+array[i].substring(1).toLowerCase();
    }
     System.out.print(Arrays.toString(array));
    for (int i=0;i<=array.length-1;i++){
        System.out.print(array[i]+" ");
    }
 }




}
