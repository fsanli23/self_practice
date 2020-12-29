package replitfrom150_;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;
import java.util.Scanner;

public class ispos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String arr[]=s.split(":");
        if (arr[2].contains("PM")){
            System.out.println((arr[0]+12)+":"+arr[1]+":"+arr[2].substring(0,2));
        }
        if (arr[2].contains("AM")){
            System.out.println(arr[0]+":"+arr[1]+":"+arr[2].substring(0,2));
        }



    }




}
