package Replit12_11_2020;

public class AppearsTwice {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(appearsTwice("java","java java   is fun"));
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        int count=0;
        while (sentence.contains(target)){
         sentence=   sentence.replaceFirst(target,"");
         count++;
        }
        if (count==2)return true;
        else return false;


    }




}
