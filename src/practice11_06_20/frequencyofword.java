package practice11_06_20;

import java.util.Arrays;

public class frequencyofword {
    public static void main(String[] args) {



        String sentence = "I love Java, java is a cool programming language and java is more useful than javascript, python python java";


String [] arr=sentence.split(" ");

   int countjava=0;
   int phaytoncount=0;
   for (int i =0;i<=arr.length-1;i++) {
       if (arr[i].equalsIgnoreCase("java")) {
           countjava++;
       }
       if (arr[i].equalsIgnoreCase("python")) {
           phaytoncount++;
       }
   }
       System.out.println("phaytoncount = " + phaytoncount);

       System.out.println("countjava = " + countjava);

        System.out.println("================================================================================");


String text="i love friday ,after friday i can relax. fridays are cool";
//String [] array=text.split(" ");

       int county=0;
       int countm=0;

while (text.contains("friday")){
   text= text.replaceFirst("friday","*");
    county++;
}
       while (text.contains("i")){
       text=    text.replaceFirst("i","*");
           countm++;
       }
        System.out.println(county);
        System.out.println(countm);
        System.out.println(text);
    }
}
