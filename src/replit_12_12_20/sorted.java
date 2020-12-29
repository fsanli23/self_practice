package replit_12_12_20;

import java.util.Arrays;

public class sorted {
    public static void main(String[] args) {

        int[] a = {9, 2, 6, 4, 5, 0, 7, 8};
        System.out.println(isSort(a));

    }

    public static boolean isSort(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++)
            if (nums[i] > nums[i + 1])
                return false;
            else ;


        return true;
    }

}