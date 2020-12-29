package practice_10_20_20;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("pls enter  a word");
        String word=input.nextLine();
        String reverseword="";
        input.close();
        for (int i=word.length()-1;i>=0;i--){
            reverseword+=word.charAt(i);
        }
        if (reverseword.equalsIgnoreCase(word)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }
}
