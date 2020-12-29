package arrays;

import java.util.Scanner;

public class untilnegativecal {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int result1=0;
     while(true){
         System.out.println("enter no");
         int no=scan.nextInt();
         System.out.println("enter no");
                                                                                                                                                                  int no2=scan.nextInt();

         if(no>0){
             result1=no+no2;
         }else{
             break;
         }
     }
        System.out.println(result1);


    }
}
