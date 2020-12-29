package replit;

import java.util.Scanner;

public class replTasks {
    public static void main(String[] args) {
       /* 1. When word has odd number of characters and:
        - 3 or more characters, print middle letter
        oak ==> a
        javav ==> v
                - Single character, print that character 3 times
      # ==> ###
        q ==> qqq

        2. When word has even number of characters and:
        - 4 or more characters, print middle 2
        java ==> av
        apples ==> pl
     #$%^&* ==> %^
        - 2 characters, print those 2 characters twice
        @@ ==>@@@@
                $$ ==>$$$$
        hi ==> hihi

*/
        //Scanner input=new Scanner(System.in);
        //   String word=input.next();
/*


if (word.length()%2!=0){
    if (word.length()>=3){
        System.out.println(word.charAt(word.length()/2));
    }else if(word.length()==1){
        System.out.println(word+word+word);
    }
}else{
    if(word.length()%2==0){
        if (word.length()>=4){
            System.out.println((word.substring((word.length()/2) - 1, (word.length()/2) + 1)));
        }
    }else if(word.length()==2){
        System.out.println(word+word);
    }
}

*/

//*/



/*
Scanner input =new Scanner(System.in);
String word1="one";
String word2="two";
        System.out.println(word1.concat(word2)+word2.concat(word1));



        String text = "abcdefghijklmnopqrstuvwxyz";

        for (int i = (text.length() - 1); i >= 0; i--) {
            System.out.print(text.charAt(i));}
*/

/*


        String word="javaja";
        System.out.println(word.substring(0,word.length()/2));

*/

        double salary = 5000;
        int jobhistory = 12;
        int creditscore = 50;


        if (salary > 2000) {
            if (jobhistory > 10) {
                if (creditscore > 700) {
                    System.out.println("you are qualified");
                } else if (creditscore < 700) {
                    System.out.println("minumum 700 required");
                }


            } else {
                System.out.println("minumum 10years required");
            }

        } else {
            System.out.println("minimum 20k salary required");
        }


    }
}
