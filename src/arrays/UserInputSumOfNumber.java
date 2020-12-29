package arrays;

import java.util.Scanner;

public class UserInputSumOfNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       /* System.out.println("enter a number");
        int no1=scan.nextInt();
        System.out.println("enter a number");
        int no2=scan.nextInt();
        System.out.println("enter a number");
        int no3=scan.nextInt();
        System.out.println("enter a number");
        int no4=scan.nextInt();*/

       /* int times = scan.nextInt();  // how many numbers user wants to enter

        int result = 0; //to contain the sum of user entered numbers
        //+1= 1 + 2 = 3 + 3 = 6 + 4 = 10 + 5 = 15

        for(int i =0; i <= 0 ; ){ // we allowed the user to decide how many number he wants to enter
            System.out.println("Enter a number: ");

        }
        // 1 2 3 4 5

        System.out.println("result = " + result);
*/
//
//        System.out.println("how many no");
//        int times = scan.nextInt();
//        int result = 0;
//
//        for (int i = 1; i <= times; i++) {
//            System.out.println("enter number" + i);
//            result += scan.nextInt();
//            System.out.println("cont?");
//            String answ = scan.next();
//            if (answ.equalsIgnoreCase("yes")) {
//                continue;
//            } else {
//                break;
//            }
//        }
//
//
//        System.out.println(result);
//

        for (int i=1;i<=5;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
                for (int k=5;k<=1;k--){
                    System.out.println("-");
                }
            }
            System.out.println();
        }






    }
}
