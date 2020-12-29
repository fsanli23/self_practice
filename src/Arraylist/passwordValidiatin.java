package Arraylist;

import java.util.ArrayList;

public class passwordValidiatin {
    public static void main(String[] args) {

        String password = "passWord 9";

        ArrayList<Character>upperCase=new ArrayList<>();
        ArrayList<Character>lowerCase=new ArrayList<>();
        ArrayList<Character>specialC=new ArrayList<>();
        ArrayList<Character>digit=new ArrayList<>();

        for (int i=0;i<=password.length()-1;i++){
            if (Character.isDigit(password.charAt(i))){
                digit.add((password.charAt(i)));
            }else if (Character.isLowerCase(password.charAt(i))){
                lowerCase.add(password.charAt(i));
            }else if (Character.isUpperCase(password.charAt(i))){
                upperCase.add(password.charAt(i));
            }else{
                specialC.add(password.charAt(i));
            }
        }

        boolean isvalid=digit.size()>0&&upperCase.size()>0&&lowerCase.size()>0&&specialC.size()>0;

        System.out.println(isvalid);


        System.out.println("==================================================");
        String str = "a1b2c3d4";
        int sum=0;
for (int i=0;i<=str.length()-1;i++){
    if (Character.isDigit(str.charAt(i))){
        sum+=Integer.valueOf(""+str.charAt(i));
    }
}

        System.out.println(sum);

    }
}
