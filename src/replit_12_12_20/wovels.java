package replit_12_12_20;

import java.util.Scanner;

public class wovels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i=0;i<=word.length()-1;i++) {
            if (word.charAt(i) == ('a')) {
                System.out.println(word.charAt(i));
            }


        }
    }
}
