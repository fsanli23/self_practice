package replitpractice11_14_20;

import java.util.Arrays;
import java.util.Scanner;

public class shiftLeft {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
int [] temp=new int[nums.length];
for (int i=0;i<=nums.length-2;i++){
    temp[i]=nums[i+1];
    temp[nums.length-1]=nums[0];
}
if (nums.length<=1){
    System.out.println(Arrays.toString(nums));
}else{
        System.out.println(Arrays.toString(temp));}








    }
}
