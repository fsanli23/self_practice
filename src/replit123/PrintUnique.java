package replit123;

import java.util.Scanner;

public class PrintUnique {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        String str="";
        for (int each:nums){
            str+=each;
        }
       for (int each:nums){
           int count=0;
           for (int i=0;i<=nums.length-1;i++){
               if (each==nums[i]){
                   count++;}

           }
           if (count==1){
               System.out.println(each);
           }

       }


    }



    }

