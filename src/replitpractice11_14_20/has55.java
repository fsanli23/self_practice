package replitpractice11_14_20;

import java.util.Scanner;

public class has55 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        String temp = "";
        for (int i = 0; i <= nums.length - 1; i++) {
            temp += nums[i] + "";
        }
        if (temp.contains("55")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}