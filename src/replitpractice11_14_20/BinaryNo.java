package replitpractice11_14_20;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        for (int i = binary.length - 1; i >= 0; i--) {
            if (decimal % 2 == 0) {
                binary[i] = 0;

            } else {
                binary[i] = 1;

            }
            decimal = decimal / 2;
        }
        System.out.println(Arrays.toString(binary));


    }
}
