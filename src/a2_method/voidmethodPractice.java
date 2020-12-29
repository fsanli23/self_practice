package a2_method;

public class voidmethodPractice {
    //task:
    //	1. create a function that can print out the maximum number from any given integer array
    //	2. create a function that can print out the minimum number from any given integer array
    //	3. create a function that can print the unique elements from the array

    public static void maxnumber(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);
    }

    public static void minNumber(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);
    }

    public static void uniqnumber(int[] arr) {


        for (int each : arr) {
            int count = 0;
            for (int i = 0; i <= arr.length - 1; i++) {

                if (each == arr[i]) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.print(each+" ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 2, 9, 6, 5, 0,};

        maxnumber(arr);
        minNumber(arr);
        uniqnumber(arr);

    }

}
