package wrapperclass;

import java.util.Scanner;

public class loopExercise2 {
    public static void main(String[] args) {
    /*    Scanner input=new Scanner(System.in);
        System.out.println("pls enter a number");

int sum=0;

int num=input.nextInt();

while(num>0){
    sum=sum+(num%10);
    num=num/10;System.out.println(sum);
}
*/
    /*    System.out.println("enter a number");
        Scanner input =new Scanner(System.in);
        int count=input.nextInt();





        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
*/

        /*int i;
        String s = "kabak", rev = "";
        for (i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.contentEquals(rev))
            System.out.println("is a palindrome");
        else
            System.out.println("not a palindrome");
*/

/*int i=10;
while(i>0){
    System.out.println("java");
    i-=2;
}
        System.out.println("dongu bitti "+i);*/

/*Scanner input=new Scanner(System.in);
        System.out.println("enter no");*/

/*
int  number=input.nextInt();
  int fact=1;

while(number>=1){
fact=fact*number;

    number--;
}
        System.out.println(fact);
*/

/*
int p=10;
do {
    System.out.println(p);
    p--;
}
while (p>=9);

*/
      /*  System.out.println("enter no");
Scanner input=new Scanner(System.in);
int number=input.nextInt();
int sum=0;
while(number>0){
    sum=number%10;
    number=number/10;
    System.out.println("number "+number+"sum="+sum);
}

        System.out.println(sum);*/





       /* Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int number=input.nextInt();
int fact=1;
        for (int i=1;i<=number;i++){
            fact*=i;
        }
        System.out.println(fact);

*/

        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 & j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }

        }


    }
}
