package arrays;

import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {

       /* FactorialNumber2.  Write a program that can return the factorial number of any given number
        Ex:
        input: 5
        output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
*/

        Scanner scan =new Scanner(System.in);
        System.out.println("enter no");
        int no=scan.nextInt();
        int sum=1;
        for (int i=1;i<=no;i++){
            sum*=i;
        }
        System.out.println(sum);






    }
}
