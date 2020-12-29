package replitfrom150_;

import java.util.Scanner;

public class plus_minus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);



    }

    public static void plus_minus(int arr[]){
        int positivecount=0;
        int negativecount=0;
        int zreos=0;


        for (int each:arr){
            if (each>0){
                positivecount++;
            }else if (each<0){
                negativecount++;
            }else{
                zreos++;
            }

        }
        System.out.println("positives:"+positivecount+", negatives:"+negativecount+", zeros:"+zreos);

    }

}
