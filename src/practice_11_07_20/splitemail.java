package practice_11_07_20;


import java.util.Scanner;

public class splitemail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

String []splt=email.split("@");

if (splt.length==2){
    System.out.println("Email id: "+splt[0]);
    System.out.println("Email domain: "+splt[1]);
}else{
    System.out.println("invalid email");
}








    }
}
