package practice11_16_20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

String reversed="";
        String[]arr=sentence.split(" ");
for (int i=arr.length-1;i>=0;i--){

    reversed+=arr[i]+" ";
    if (i==0){
        reversed=reversed.trim();
    }
}


        System.out.println(reversed);





















    }





}
