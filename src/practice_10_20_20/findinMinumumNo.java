package practice_10_20_20;

import java.util.Scanner;

public class findinMinumumNo {
    public static void main(String[] args) {
//find the min and max among 5 user input
        Scanner input=new Scanner(System.in);

int min=2147483647;
int max=-2147483648;


for (int i=1;i <=5;i++){
    System.out.println("pls enter a number");
    int no =input.nextInt();
    if (no<min){
        min=no;
    } else if (no>max){
        max=no;
    }
}
        System.out.println(max+","+min);











    }
}
