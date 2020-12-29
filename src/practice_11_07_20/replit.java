package practice_11_07_20;

import java.util.Arrays;
import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

/*

        //Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        for(int i=0;i<= words.length-1;i++){
            System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
        }
*/

        int num, digit1, digit2, digit3, digit4, digit5;

       /* Example # 1
                -Display prompt: Enter your number:
        12345
                -Display prompt: 1
                -Display prompt: 2
                -Display prompt: 3
                -Display prompt: 4
                -Display prompt: 5
*/

        System.out.println("enter no");
         num=input.nextInt();

digit1=num/10000;
digit2=num/1000%10;
digit3=num/100%10;
digit4=num/10%10;
digit5=num%10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
    }
}
