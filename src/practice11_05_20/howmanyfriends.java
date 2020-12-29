package practice11_05_20;

import java.util.Scanner;

public class howmanyfriends {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("how many friends");
        int number=scan.nextInt();
        String [] firstnames=new String[number];
        String [] lastnames=new String [number];
        for (int i =0;i<number;i++){
            System.out.println("first name");
            String f=scan.next();
            f=f.substring(0,1).toUpperCase()+f.substring(1);
           firstnames[i]=f;
            System.out.println("lastname");
           String l=scan.next();
           l=l.substring(0,1).toUpperCase()+l.substring(1);
           lastnames[i]=l;
        }

        System.out.println("=========================================");

        for (int i=0;i<number;i++){
            System.out.println(firstnames[i]+lastnames[i]);
        }



    }
}
