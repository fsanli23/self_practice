package javaprictece_11_09_20;

import java.util.Arrays;

public class firstthreecharacter {
    public static void main(String[] args) {
        String[] names={ "Erjon", "Katrin", "Aamir", "Lola", "Oguzhan", "Aibek", "Elvin", "Ilgar", "Nadira", "Beraat", "Parizat"};


       for (String each:names) {

           System.out.print(each.substring(0, 3));
       }



    }
}
