package practice11_16_20;

import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below

int max=arr[0][0];
        for (int []each:arr) {
            for (int i=0;i<=each.length-1;i++){
                if (each[i]>max){
                    max=each[i];
                }
            }


        }
        System.out.println(max);


    }
}
