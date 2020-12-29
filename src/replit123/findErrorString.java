package replit123;

public class findErrorString {
    public static void main(String[] args) {
        System.out.println(isError("error bar"));

    }

    public static boolean isError(String line) {
        if (line.startsWith("error")) {
            return true;
        } else {
            return false;
        }
    }
}
