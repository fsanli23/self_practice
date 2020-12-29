package practice_11_07_20;

import java.util.Arrays;
import java.util.Scanner;

public class reversedd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

       String splt[]=sentence.split(" ");
       for (int i =splt.length-1;i>=0;i--){
           if (i>0){
               reversed+=splt[i]+" ";
           }else{
               reversed+=splt[i];
           }
       }



        //End your code here. do not modify below statement
        System.out.println(reversed);











    }
}
