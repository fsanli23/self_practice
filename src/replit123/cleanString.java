package replit123;

public class cleanString {
    public static void main(String[] args) {
        System.out.println(clean("foo bar foo ","foo"));
    }



    public static String clean (String text ,String badWord) {
if (text.contains(badWord)){
    text=text.replaceFirst(badWord,"");
}
return text;
    }
}
