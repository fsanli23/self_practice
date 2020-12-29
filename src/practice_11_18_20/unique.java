package practice_11_18_20;

import java.util.Arrays;

public class unique {
    public static void main(String[] args) {

String name="aaaaaaaaaadfdddddddgggggfssdr";

        System.out.println(unique(name));


    }

public static String unique(String str){
        String unique="";
        for (int i=0;i<=str.length()-1;i++){
            char eachchar=str.charAt(i);
            int count=frequency(str,eachchar);
            if (count==1){
            unique+=eachchar;}
        }return unique;
}



    public static int frequency(String str,char b){
       int count =0;
        char[] c=str.toCharArray();
        for (char each:c) {
             if (each==b){
                 count++;
             }

        }return count;
    }




}
