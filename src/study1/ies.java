package study1;

import java.util.Scanner;
public class ies {
    public static void main(String[] args) {
       /* For you to do:

        Given a string variable "word", do the following tests

        If the word ends in "y", print "-ies"
        If the word ends in "ey", print "-eys"
        If the word ends in "ife", print "-ives"
        If none of the above is true, print "-s"
        No more than one should be printed.*/


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

if (word.endsWith("y")&&word.charAt(word.length()-2)!='e'){
    System.out.println("-ies");
    System.exit(0);
}else if (word.endsWith("ey")){
    System.out.println("-eys");
    System.exit(0);
}else if (word.endsWith("ife")){
    System.out.println("-ives");
}else{
    System.out.println("-s");
}




    }
}
