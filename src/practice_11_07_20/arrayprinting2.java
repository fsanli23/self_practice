package practice_11_07_20;

import java.util.Scanner;

public class arrayprinting2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        for (int i=0, j=1;i<=arr.length-1;i+=2,j++){
            System.out.println(arr[i]+","+arr[j]);
        }




    }
}
