package practice_11_18_20;

import java.util.Arrays;

public class returnMethods3_min_mX {
    public static void main(String[] args) {

      int []  arr={2,8,99,88,-9,-99,3,8,7};




    }


    public static int max1(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int max2(int[] array) {
        int max = array[0];
        for (int each : array) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static int min1(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static int min2(int[] array) {
        int min = array[0];
        for (int each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

}
