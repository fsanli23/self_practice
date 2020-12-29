package practice_10_20_20;

import java.util.Scanner;

public class divisionwithoutdivider {
    public static void main(String[] args) {
        //write a program that can divide two numbers without using / & % operators and retuns the devision and remainder

        Scanner input = new Scanner(System.in);
        System.out.println("enter a no");
        int a = input.nextInt();
        System.out.println("enter a no");
        int b = input.nextInt();
int count=0;
if (a>=b) {
    while (a >= b) {
        a -= b;
        count++;
    }System.out.println(count+"remainder"+a);
}else{
    System.out.println("try again");}







    }
}
