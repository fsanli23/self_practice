package practice_11_07_20;

import java.util.Scanner;

public class countofeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
int counteven=0;
        for (int i=0;i<=nums.length-1;i++){
            if (nums[i]%2==0){
                counteven++;
            }
        }


        System.out.println(counteven);







    }
}
