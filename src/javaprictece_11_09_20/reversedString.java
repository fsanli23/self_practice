package javaprictece_11_09_20;

import java.util.Arrays;

public class reversedString {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for (String eachname:names ) {
            String reversedname="";
            for (int i=eachname.length()-1;i>=0;i--){
                reversedname+=eachname.charAt(i);
            }
            System.out.println(reversedname);
        }



    }
}
