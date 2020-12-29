package javaprictece_11_09_20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class longestString {
    public static void main(String[] args) {

        String[] names = {"Javid", "Sayyohat", "Maryam", "Awstralopitechkaaa", "CJ", "k"};

// find the longest and shortest string;


        int longest = names[0].length();

        int shortest = names[0].length();

        int count = 0;
        for (int i = 0; i <= names.length - 1; i++) {
            if (names[i].length() > longest) {
                longest = names[i].length();

            }
            if (names[i].length() < shortest) {
                shortest = names[i].length();

            }
        }

       for (int i=0;i<=names.length-1;i++){
           if (names[i].length()==longest){
               System.out.println(names[i]);
           }
           if (names[i].length()==shortest){
               System.out.println(names[i]);
           }
       }


/*

String email="sanlifatih23@gmail.com";

String [] ne=email.split("@");

        System.out.println(Array.getLength(ne));

*/
        String [] team={"feneer","CIMBOM"};
Array.getLong(names,2);

    }
}
