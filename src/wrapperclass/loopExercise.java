package wrapperclass;

import study1.warehouse;

import java.util.Scanner;

public class loopExercise {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in)  ;
        System.out.println("pls enter a number");
        int n=input.nextInt();
      int sum=0;
      for (int i=1;i<=n/2;i++)
          if (n%i==0)
              sum+=i;
        System.out.println(sum==1?"prime":" no prime");


    }
}
