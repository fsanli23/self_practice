package practice11_16_20;

import java.util.Scanner;

public class simpleCalculater {
    public static void main(String[] args) {



       plus();
    }


    public static void plus() {

        //your code here

        Scanner input = new Scanner(System.in);

        int no1 = input.nextInt();
        int no2 = input.nextInt();

        int total = no1 + no2;
        System.out.println(total);


    }
}