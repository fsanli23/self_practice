package practice_10_20_20;

import java.util.Scanner;

public class sumofnumberentered {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int no=input.nextInt();
        int sum=0;

        for (int i=0;i<=no;i++){
            sum=sum+i;
        }
        System.out.println(sum);


    }
}
