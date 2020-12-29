package javaprictece_11_09_20;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class minMax {
    public static void main(String[] args) {


        int[] scores = {10, 2, 3, 25, 5, 100, -5, -2, 1000, 30, 40, 56,21};

        ArrayList secondArray= new ArrayList();

        for (int each:scores) {
            if (each%3==0){
                secondArray.add(each);
            }


        }
        System.out.println(secondArray);
        System.out.println("=======================================================================");

        int min=scores[0];
        int max=scores[0];

        for (int each:scores) {
             if (each<min){
                 min=each;
             }
            if (each>max){
                max=each;
            }
        }

        System.out.println("max =" + max);
        System.out.println("min = " + min);

        System.out.println("==============================================");

        ArrayList DIVIDIBLE=new ArrayList();

for (int i=0;i<=100;i++){
    if (i%5==0&&i%3==0){
        DIVIDIBLE.add(i);
    }
}
        System.out.println(DIVIDIBLE);

Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
    }
}
