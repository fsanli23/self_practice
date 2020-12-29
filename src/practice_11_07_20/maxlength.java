package practice_11_07_20;

import java.util.Scanner;

public class maxlength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
String maxlength=words[0];
for (int i=0;i<=words.length-1;i++){
    if (words[i].length()>=maxlength.length()){
        maxlength=words[i];

    }
}

        System.out.println(maxlength);






    }
}
