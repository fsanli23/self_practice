package arrays;

import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        /*
1. ask used to enter two numbers and then print the sum of those two numbers
2. ask the user, would you like to continue? Yes, No
        if answer is yes -> repeat
        if answer is no -> exit loop
 */Scanner scan = new Scanner(System.in);
    while(true) {

        System.out.println("enter no 1");
        Double no1 = scan.nextDouble();
        System.out.println("enter no 2");
        double no2 = scan.nextDouble();
        double sum = no1 + no2;
        System.out.println(sum);
        System.out.println("continue?");
        String answr = scan.next();
if (answr.equalsIgnoreCase("no")){
    break;
}

    }


    while (true){
    double no3=scan.nextDouble();
    double no4=scan.nextDouble();
    double sum2=no3+no4;
    System.out.println("sum2 = " + sum2);
    System.out.println("conti?");

    String ans=scan.next();
if (ans.equalsIgnoreCase("yes")){
    continue;


}else{
    break;
}



    }




while(true) {
    double no5 = scan.nextDouble();
    double no6 = scan.nextDouble();
    double sum2 = no5 + no6;

    System.out.println("conti?");

    String ans = scan.next();


}







    }
}
