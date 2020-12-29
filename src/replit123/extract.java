package replit123;

public class extract {
    public static void main(String[] args) {

        System.out.println(clean("125vbvf"));

    }



    public static String clean(String s) {

String  cleano="";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                cleano+=s.charAt(i);
            }
        }return cleano;
    }
}