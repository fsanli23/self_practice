package practice11_29_20;

import java.util.ArrayList;

public class password {
    public static void main(String[] args) {

     /*   Password validation
        1. 8 character at least
        2. there must be a digit            (isUpper   isLowercase)
        3. there must be a letter (at least one upper case & one lower case)
        4. there must be special character

*/


    String password= "158@$%$Y#$s@$%$^$%&^3+613345132";
 String uppercase="";
String specialChar="1";
String digit="";
String lowercase="";
for (int i=0;i<=password.length()-1;i++){
    if (Character.isDigit(password.charAt(i))){
        digit+=password.charAt(i);
    }else if (Character.isUpperCase(password.charAt(i))){
        uppercase+=password.charAt(i);
    }else if (Character.isLowerCase(password.charAt(i))){
        lowercase+=password.charAt(i);
    }else{
        specialChar+=password.charAt(i);
    }
}

boolean valid=password.length()>=8&&uppercase.length()>0&&lowercase.length()>0&&digit.length()>0&&specialChar.length()>0;

        System.out.println(valid);

        System.out.println(uppercase);
        System.out.println("lowercase = " + lowercase);
        System.out.println("digit = " + digit);
        System.out.println(specialChar);
int toplam=0;
        for (int i=0;i<=digit.length()-1;i++){
            toplam+=Integer.valueOf(""+digit.charAt(i));
        }
        System.out.println(toplam);

        System.out.println("===================================");
        String one = "1";
        Boolean b1 = Boolean.valueOf(one);  // line n1
        Integer i2 = 1;
        Integer i1 = new Integer(one );


        if (b1) {
            System.out.print(i1 == i2);
        }
        System.out.println(i1);

        Character j=new Character('l');


        ArrayList<Integer> list = new ArrayList<>();

        //autoboxing
        list.add(5);
        list.add(6);

        System.out.println("ArrayList: " + list);

       /* // unboxing
        int a = list.get(0);
        System.out.println("Value at index 0: " + a);
*/
        System.out.println(list.get(0)+ list.get(1));

Integer q=12;
Integer l=2;
        System.out.println(q+l);



    }
}
