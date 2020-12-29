package practice11_05_20;

import java.util.Arrays;

public class arrayutility {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(numbers));

        String[] classMates = {"Adil", "Muhammad", "Yasin", "Necdet", "Daniel"};

        System.out.println(classMates);

        System.out.println(Arrays.toString(classMates));
        int[] arr1 = {200000, 1000000, 4000000, 6000, 300000, 12345551, 90000};
Arrays.sort(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length-1]);


      int []  a={1,9,6,5};
      int [] b={9,1,6,5,};
        Arrays.sort(a);
        Arrays.sort(b);
         boolean r1=Arrays.equals(a,b);

        System.out.println(r1);




    }
}
