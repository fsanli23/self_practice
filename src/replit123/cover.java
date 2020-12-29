package replit123;

public class cover {
    public static void main(String[] args) {
        System.out.println(coverString("hello hello", "ello") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
if (main.contains(coverME)){

    main="\""+main.replace(coverME, "["+coverME+"]")+"\"";
}else{
    main="\"["+main+"]\"";
}
return main;
    }

}
