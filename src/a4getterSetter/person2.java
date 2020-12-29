package a4getterSetter;

import a2_method.method;

public class person2 {
    public static void main(String[] args) {


        person p1 = new person();

        int a = p1.getAge() + 5;
        p1.setAge(12);


        String pass = "lolo";
        boolean ifuppercase;

        if (!pass.equals(pass.toLowerCase())) {
            ifuppercase = true;
        } else {
            ifuppercase = false;
        }

        System.out.println(ifuppercase);


    }


}
