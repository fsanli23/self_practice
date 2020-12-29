package a3_pverloading;

import a1.one;
import sun.security.util.Password;

import java.util.ArrayList;

public class password {
    public static void main(String[] args) {

       /* Password validation
        1. 8 character at least
        2. there must be a digit            (isUpper   isLowercase)
        3. there must be a letter (at least one upper case & one lower case)
        4. there must be special character*/


        System.out.println(passwordvalification("fatih sab;k646451Qqc"));
    }


    public static boolean passwordvalification(String password) {

        String digits = "";
        String letter = "";
        String specialChar = "";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <= password.length() - 1; i++) {
            list.add(password.charAt(i));
        }

        boolean passwordv;
        for (Character each : list) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letter += each;
            } else {
                specialChar += each;
            }


        }
        if (password.length() > 8 && !digits.isEmpty() && !letter.isEmpty() && !specialChar.isEmpty()) {
            passwordv = true;
        } else {
            passwordv = false;
        }

        return passwordv;
    }
}
