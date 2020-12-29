package practice11_06_20;

import java.util.Arrays;

public class maxinthearray {
    public static void main(String[] args) {
        int[] numbers = {-300, -100, -400,  -50,  -500,  -150, -170};

       /* Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-1]);

        System.out.println(numbers[0]);
*/
        int min=numbers[0];
        int max=numbers[0];
      for (int i=0;i<=numbers.length-1;i++){
          if (numbers[i]>max){
              max=numbers[i];
          }
          if (numbers[i]<min){
              min=numbers[i];
          }
      }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("=================================================================");

        int[] nos = {300, 100, 400,  50,  500,  150, 170};
        int mini=nos[0];
        int maxi=nos[0];

        for (int i=0;i<=nos.length-1;i++){
            if (nos[i]>maxi){
                maxi=nos[i];
            }
            if (nos[i]<mini){
                mini=nos[i];
            }
        }
        System.out.println(mini);
        System.out.println(maxi);

        Arrays.sort(nos);

        int po=nos[nos.length-1];
        System.out.println(po);


    }
}
