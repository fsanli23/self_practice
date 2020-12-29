package practice_11_18_20;

public class returnmethods2 {
    public static void main(String[] args) {
String names="racecar";
boolean ispalindrome=names.equals(reverse(names));
        System.out.println(ispalindrome);

    }



public static String reverse(String a){
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        return b;
}





}
