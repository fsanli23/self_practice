package practice11_05_20;

import java.util.Scanner;

public class avaragenumber {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);

        System.out.println("how many no");
        int no=scan.nextInt();

        int[] numbers=new int[no];
        int sum=0;
    for (int i=0;i<no;i++){
        System.out.println("enter numbers");
         numbers[i]=scan.nextInt();
         sum+=numbers[i];
    }
    double avarage=(double)sum/no;

        System.err.println(sum);
        System.err.println("avarage = " + avarage);











    }
}
