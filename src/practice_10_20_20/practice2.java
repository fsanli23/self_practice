package practice_10_20_20;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

       /* 1. ask used to enter two numbers and then print the sum of those two numbers
        2. ask the user, would you like to continue? Yes, No
        if answer is yes -> repeat
        if answer is no -> exit loop
                */

        Scanner input=new Scanner(System.in);
        for (int i=1;i<=1;){
            System.out.println("pls enter two number");
            int n1=input.nextInt();
            int n2=input.nextInt();
            System.out.println("total="+(n1+n2));
            System.out.println("would you like to continue");
            String yesorno=input.next();
           // input.close();
            if (yesorno.equalsIgnoreCase("no")){
                System.out.println("thank you for using calculator");
                System.exit(0);
                input.close();
            }
        }















    }
}
