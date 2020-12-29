package practice_11_18_20;

import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        String name="fatih sanli";
        System.out.println(Uniqque(name));
    }








    public static int freq(String str,char ch){
        char [] arr= str.toCharArray();
        int count=0;
        for (char each:arr){
            if (each==ch){
                count++;
            }
        }return count;
    }

   public static String Uniqque(String str) {
        String uniq="";
        for (int i=0;i<=str.length()-1;i++){
            char eacchar=str.charAt(i);
           int  count= freq(str,eacchar);
            if (count == 1) {

               uniq+=eacchar;
            }
            }return  uniq;
        }
}
