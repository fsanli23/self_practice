package arrays;

import java.util.Scanner;

public class palindromeTest {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scan.nextLine();
        String reverse="";
        for (int i=word.length()-1;i>=0;i--){
         reverse+=   word.charAt(i);
        }

        if (reverse.equalsIgnoreCase(word)){
            System.out.println("palindrome");
        }

String name="hannah";
String backward="";
for (int j=name.length()-1;j>=0;j--){
    backward+=name.charAt(j);
}
if (backward.equalsIgnoreCase(name)){
    System.out.println("palindrome");
}









    }
}
