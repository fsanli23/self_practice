package replit123;

public class at3rdChaar {
    public static void main(String[] args) {

        System.out.println(at3("longword","foo"));
    }
    public static String at3(String target,String word)
    {
        String result="";

        for (int i=0;i<=2;i++){
            result+=target.charAt(i);
        }
        result+=word;
        for (int i=3;i<=target.length()-1;i++){
            result+=target.charAt(i);
        }

return result;
    }
}
