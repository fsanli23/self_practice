package replit123;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeThem {
    public static void main(String[] args) {

mergeStrings("12345677","abcdfbjklklk");
    }

    public static void mergeStrings(String one, String two) {
        String mrgd="";
      int in=  Math.min(one.length(),two.length());

for (int i=0;i<=in-1;i++){
    mrgd+=""+one.charAt(i)+two.charAt(i);
}
        System.out.println(mrgd);




    }
}