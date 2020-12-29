package classobject;

import java.util.ArrayList;

public class class3 {
    public static String search(ArrayList<String> r, String find)
    {
        String k="";
       for (String each:r){
           if (each.contains(find)){
               return k=each;
           }else {
              k="search failed" ;         }
       }





return k;
    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }





}
