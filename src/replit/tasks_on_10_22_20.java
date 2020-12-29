package replit;

import java.util.Scanner;

public class tasks_on_10_22_20 {
    public static void main(String[] args) {

        /*1. Write a method which prints out the numbers from 1 to 100 butfor numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
        output:
        1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....
*/

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("finra ");
            } else if (i % 3 == 0) {
                System.out.print(" fin ");

            } else if (i % 5 == 0) {
                System.out.print(" ra ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("=====================================================================");

        /* 2.  print the following shape:
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * **/

        for (int i = 1; i <= 6; i++) {
            System.out.println();
            for (int t = 1; t <= 6; t++) {
                System.out.print(" *");
            }
            //System.out.println("         * * * * * * * ");

        }

        System.out.println("================================================================================");

       /* 3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
        Hint: in the loop body , only place the statements that you need to repea
*/


        System.out.println("* * * * * * ");
        for (int t = 1; t <= 10; t++) {
            System.out.println("*         *");
        }
        System.out.println("* * * * * * ");

        System.out.println("=================================================================================");

        //4. write a program that can calculate the sum of all numbers between 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            sum = sum + i;


        }
        System.out.println(sum);


        System.out.println("==========================================================================");
       // 6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
        int sumodd=0;
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                sumodd=sumodd+i;
            }
        }
        System.out.println("sumodd = " + sumodd);

        System.out.println("===========================================================================");

      //  5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
int sumeven=0;
for (int i=1;i<=100;i++){
    if(i%2==0){
        sumeven=sumeven+i;
    }
}
        System.out.println("sumeven = " + sumeven);





        System.out.println("==============================================================================");
        //  write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

        for (int i = 1; i <= 100; i++) {
            if(i%2==0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("===============================================================================");

       /// 3. Write a program that will print out all letters in English alphabet in ascending order

char alphabet;
for (alphabet='a';alphabet<='z';alphabet++){
    System.out.print(alphabet+",");
}

        System.out.println();
        System.out.println("================================================================================");

      //  Write a program that will print out all letters in English alphabet in backwards




        for (alphabet='z';alphabet>='a';alphabet--) {
            System.out.print(alphabet+ ",");
        }

        System.out.println("===============================================================================");
        /*7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275

        input : 200
        output : 20100
*/
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter a number");
        int number=input.nextInt();
        input.close();
        int summ=0;
        for (int i=1;i<=number;i++){
            summ=summ+i;
        }
        System.out.println("summ = " + summ);


        System.out.println("====================================================================================");


//  write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5

        for (int i = 1; i <= 100; i++) {
            if(i%2!=0) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("===============================================================================");






    }
}