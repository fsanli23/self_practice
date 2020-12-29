package arrays;

import java.util.Scanner;

public class findingmaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 2147483647;
        int max = -2147483648;



for (int i=1;i<=5;i++){
    System.out.println("enter no");
int no=scan.nextInt();
if (no<min){
    min=no;
}
if (no>max){
    max=no;
}
}
        System.out.println(max);
        System.out.println(min);





    }
}
