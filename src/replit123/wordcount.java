package replit123;

public class wordcount {
    public static void main(String[] args) {

        System.out.println(wordCount("hello world today is great day"));



    }
    public static int wordCount(String words) {
         int count =0;
while  (words.contains(" ")){
   words= words.replaceFirst(" ","1");
        count++;
    }
return count+1;
}


    }


