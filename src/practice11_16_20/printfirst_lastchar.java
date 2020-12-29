package practice11_16_20;

import java.util.Arrays;
import java.util.Scanner;

public class printfirst_lastchar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String []firstlastchar=new String[words.length];
        for (int i=0;i<= words.length-1;i++) {
            String each=words[i];
            for (int j=0;j<=firstlastchar.length-1;j++){
                firstlastchar[i]=""+each.charAt(0)+each.charAt(each.length()-1);
            }
        }

        System.out.println(Arrays.toString(firstlastchar));



    }
}
