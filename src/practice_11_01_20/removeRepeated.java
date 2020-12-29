package practice_11_01_20;

import java.util.Scanner;

public class removeRepeated {
    public static void main(String[] args) {
      /*  write a program that can find the unique characters from a string
        Ex:
        str = "AABCDC";
        output:
        BD
        approach:
        find the frequncy of each character one by one, and if the frequency of the character is equal to 1,
         it means it's unique
        In previous section we leaned how to find the frequency of one character.
        you will need to repeat the same steps

        */

      /*  String str = "ABCCADERFGGE";

        for(int index = 0; index < str.length(); index++) { // index <= str.length() -1
            // purpose of this loop is to iterate through the char one at a time

            int frequency = 0; // resetting the value each iteration of the outer loop (first loop)


            for(int inner = 0; inner < str.length(); inner++) {


                if(str.charAt(index) == str.charAt(inner)) {
                    frequency++;
                }

            }

            if(frequency == 1) {
               // System.out.print(str.charAt(index));
            }


        }
*/
      /*

        for (int index=0;index<=str.length()-1;index++){
            int frequency=0;

            for (int inner=0;inner<=str.length()-1;inner++){
                if (str.charAt(index)==str.charAt(inner)){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.print(str.charAt(index));
            }


        }
*/

     /*   String str="fatih sanli";
for (int index=0;index<=str.length()-1;index++){
    int frequency=0;
    for (int inner=0;inner<=str.length()-1;inner++){
        if (str.charAt(index)==str.charAt(inner)){
            frequency++;
        }
    }if (frequency==1)
        System.out.print(str.charAt(index));
}


*/

       /* 1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
                then it asks the user if he/she wants to continue
        if the answer is yes, repeat the whole process again
        if the answer is no, only return the addition
        but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter
        HINT: nested loop task, outter loop need to be an infinite loop

*/
      /*  Scanner scan = new Scanner(System.in);
        int result = 0;

        while(true){
            System.out.println("Enter a number");
            int n1 = scan.nextInt(); // 9

            System.out.println("Enter a number");
            int n2 = scan.nextInt(); // 10

            result = n1 + n2;
            System.out.println("result = " + result);

            scan.nextLine(); // EnterEnter

            System.out.println("Would you like to continue?");
            String a = scan.nextLine().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){ // while the answer is invalid (yes or no)
               // System.out.println("Invalid Entry, Please Re-Enter");
                //System.out.println("Would you like to continue?");
                a = scan.nextLine().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }*/
        /*
        int sum = 0;
      while(true){
            System.out.println("enter no");
            int no1 = scan.nextInt();
            System.out.println("enter no2");
            int no2 = scan.nextInt();


            sum = no1 + no2;
            System.out.println("total" + sum);
          System.out.println("continue");
          String ansr = scan.next();


        while(!(ansr.equalsIgnoreCase("yes"))||(ansr.equalsIgnoreCase("no"))){
            System.out.println("wrong entry");
            System.out.println("continue");
             ansr = scan.next();
        }
        if (ansr.equalsIgnoreCase("no")){
            break;
        }
    }
*/

       /* int a =10;
        int b =0;

        if(b == 0){
            System.err.println("Invalid Number");
            //System.exit(0);  // forcefully terminating the program

        }

        System.out.println("hello");
        System.out.println(a/b);


*/





       /* int[] test = {0, 1, 2, 3, 4};
        for (int s : test) {
            if (s == 3) {
                System.exit(0);
            }
            System.out.print(s);
            System.out.print("\n");
        }
        System.out.println("break statement execution");

       */
/*
int catcount=0;
int dogcount=0;
        String sentence =  "dog dog Dog Dog cat CAT cAt";
        String temp=sentence.toLowerCase();
        while(temp.contains("dog")){
            temp=temp.replaceFirst("dog","");
            dogcount++;
        }
        while(temp.contains("cat")){
            temp=temp.replaceFirst("cat","");
            catcount++;
        }

        System.out.println(catcount==dogcount);


        System.out.println(catcount);
        System.out.println(dogcount);
*/


         /*   Scanner scan = new Scanner(System.in);

            System.out.println("Enter your username");
            String username = scan.next();

            System.out.println("Enter your password");
            String password = scan.next();


            if(username.equals("cybertek") && password.equals("cybertek12345")) {
                // if the credentials are valid, user will be able to login
                System.out.println("Logged In");
               

            }else{ // condition for invalid username and password

                for(int i =1; i <= 3; i++) {  // i: 1, 2, 3

                    if(i == 3){  // if the attempt is already 3, the account should be locked
                        System.err.println("Your account is locked");
                        System.exit(0);  // terminates the program
                    }

                    System.out.println("Invalid username or password, please re enter");
                    System.out.println("Enter your username");
                    username = scan.next();
                    System.out.println("Enter your password");
                    password = scan.next();

                    if(username.equals("cybertek") && password.equals("cybertek12345")){
                        System.out.println("Logged In");
                        break;
                    }

                }
            }



            System.out.println("Hello World");
*/
/*for (int i=1;i<=5;i++){
    if(i==2){
        System.out.println("come to papa");
    }
    System.out.println("hello world");
}*/
     /*   String username="fatih";
        String password="12345";
Scanner scan=new Scanner(System.in);

        System.out.println("put your password");
 String psswrd=scan.next();
        System.out.println("put your username");
        String usrn=scan.next();

if (username.equalsIgnoreCase(usrn)&&password.equalsIgnoreCase(psswrd)){
    System.out.println("you are logged in");}
break;

    }else
        {
        for (int i =1;i<=3;i++){
            if (i==3){
                System.out.println("too many wong entry");
                System.exit(0);
    }
    System.out.println("retry");
    System.out.println("put your password");
    psswrd=scan.next();
    System.out.println("put your username");
     usrn=scan.next();
*/
/*

         *
         **
         ***
         ****
         *****
         ******
         *******
         ********

*/

/*
for (int i=1;i<=8;i++){
    for (int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
*/

//2.  Write a program that asks user to enter a string.
// If string started with uppercase and ends with lowercase letter then print true,
// otherwise print false
//        Ex:
//           Input: Cybertek
//           output: true
//           Input: CyberteK
//           output: false
// */




/*
Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.nextLine();
        char first=str.charAt(0);
        char last=str.charAt(str.length()-1);
     boolean start=first>=65&&first<=90;
     boolean end=last>=97&&last<=122;

if (start&&end){
    System.out.println("true");
}else {
    System.out.println("false");

}
*/
       /* char k='d';
        System.out.println(100==k);*/

/*for (int i =1;i<=5;i++){
    System.out.println("*");
}*/
/*

        for (int i=1;i<=5;i++){
            System.out.println();
            for (int j=1;j<=5;j++){


                System.out.print("*");
            }

        }
*/

/*
for (int i=1;i<=5;i++){
    for (int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
*/


/*
for (int i =1;i<=5;i++){
    System.out.println();
    for (int inner=5;inner>=i;inner--){
        System.out.print("*");
    }

}
*/


      /*for (int i=1;i<=5;i++){
          for (int inner=1;inner<=i;inner++){
              System.out.print("*");
          }
          System.out.println();
      }

for (int i=1;i<=4;i++){
    for (int inner=4;inner>=i;inner--){
        System.out.print("*");
    }
    System.out.println();
}


*/








    }
}
