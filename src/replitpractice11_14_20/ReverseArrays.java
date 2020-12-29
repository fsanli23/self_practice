package replitpractice11_14_20;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

int [] temp=new int[nums.length];
for (int i=0,j= nums.length-1;i<=nums.length-1;i++,j--){
    temp[i]=nums[j];

}
nums=temp;
        System.out.println(Arrays.toString(nums));



}
}
