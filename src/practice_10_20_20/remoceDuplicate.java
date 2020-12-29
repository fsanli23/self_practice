package practice_10_20_20;

import java.util.Scanner;

public class remoceDuplicate {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("pls enter a sentence");
        String word=input.nextLine();
        input.close();
String result="";
for (int i=0;i<=word.length()-1;i++){
    String ch=""+word.charAt(i);
    if (result.contains(ch)){
        continue;
    }else {
        result+=ch;
    }
}

        System.out.println(result);


    }
}
