package replit123;

public class longerString {
    public static void main(String[] args) {
        System.out.println(biggerS("apple","oranges"));
    }



    public static String biggerS(String a ,String b)
    {
        if (a.length()>b.length()){
            return a;
        }else{
            return b;
        }

    }
}
