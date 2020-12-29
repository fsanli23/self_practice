package practice11_05_20;

import java.util.Arrays;

public class Arraysdesesnding {
    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 6, 7, 0};
Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] dessending=new int[arr.length];

        for (int i=arr.length-1, j=0;i>=0;i--,j++ ){
            dessending[j]=arr[i];
        }
        System.out.println(Arrays.toString(dessending));


        System.out.println("===================================");


        int [] score={5,8,4,1,99,34,28};
        Arrays.sort(score);

        int [] decreasing =new int[score.length];

        for (int i=score.length-1,j=0;i>=0;i--,j++){
            decreasing[j]=score[i];
        }
        System.out.println(Arrays.toString(decreasing));


        System.out.println("=========================================");

        int [] result={98,32,58,125,5,66,3};
        Arrays.sort(result);
        int[] backwqard=new int [result.length];
        for (int i =result.length-1,j=0;i>=0;j++,i--){
            backwqard[j]=result[i];
        }

        System.out.println(Arrays.toString(backwqard));




    }
}
