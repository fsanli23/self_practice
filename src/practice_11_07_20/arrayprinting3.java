package practice_11_07_20;

import java.util.Scanner;

public class arrayprinting3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }

for (int i=0,j=1,k=2;i<4;i++,j++,k++){
    System.out.println(arr[i]+","+arr[j]+","+arr[k]);
}

    }
}
