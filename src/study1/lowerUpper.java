package study1;

import java.util.Scanner;

public class lowerUpper {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String result = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (i % 2 == 0) {
                String k = (s.charAt(i) + "").toLowerCase();
                result += k;
            } else {
                String h = (s.charAt(i) + "").toUpperCase();
                result += h;
            }
        }

        System.out.println(result);
        warehouse j=new warehouse();

    }
}
