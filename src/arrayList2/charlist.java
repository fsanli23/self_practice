package arrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class charlist {
    public static void main(String[] args) {

        String str = "abcd@!#$etyi123lkjhaqwer%^&879";
Integer[] arr={1,2,3,4,5,6};




ArrayList<Integer>list=new ArrayList<>(Arrays.asList(arr));
ArrayList<String> special=new ArrayList<>(Arrays.asList(str.split("")))  ;

        ArrayList<String>digitlist=new ArrayList<>(Arrays.asList(str.split("")));

        digitlist.removeIf(p->!Character.isDigit(p.charAt(0)));

        System.out.println(digitlist);

special.removeIf(p->Character.isLetterOrDigit(p.charAt(0)));
        System.out.println(special);






    }
}
