package replit;

import java.util.Scanner;

public class aaaaa {
    public static void main(String[] args) {

     /* for (int i=0;i<100;i++){
          if (i%5==0){
              continue;
          }
          System.out.println(i);
      }
*/
/*
for (int r =0;r<2;r++){
    for(int k=0;k<3;k++){
        System.out.println("r= "+r+"k="+k);
    }
    System.out.println();
}
*/
      //  System.out.println("how many star would you like to start with");
       // Scanner input = new Scanner(System.in);//
       // int numberofstar = input.nextInt();

/*
        for (int i = 1; i < numberofstar; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("#");
            }
            System.out.println();

        }*/

/*

        for (int i=1;i<6;i++){

            for (int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }


*//*
        int n=5;
        for (int i=1;i<=5;i++){
            for (int j =1;j<=n;j++){
                if (i==n/2+1||j==n/2+1){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/


        Scanner scan=new Scanner(System.in);
       /* System.out.println("Enter seconds:");
        int inputSeconds=input.nextInt();
        int hours=inputSeconds/3600;
        int minutes=(inputSeconds%3600)/60;
        int seconds=inputSeconds-(hours*3600+minutes*60);
       String result=hours +" hours,"+minutes+ " minutes, and "+seconds+" seconds";

        System.out.println(result+"\n" +
                "kjfnbsfnbnkfnkg\n" +
                "cghghmghhmgh\n" +
                "");
*/        
        System.out.println("Welcome to the patient portal!");

        System.out.println("Please enter your personal information");


        System.out.println("Enter your first name");

        String firstName=scan.next();

        System.out.println("Enter your last name");

        String lastName=scan.next();




        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
  String      email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
     String   street = scan.nextLine();
        // continue for city

        System.out.println("Enter your city");

        String city=scan.next();

        System.out.println("Enter your state");

        String state=scan.next();

        System.out.println("Enter your zipcode");

        int zipcode=scan.nextInt();

        System.out.println("Enter your work phone number");

        long workPhoneNumber=scan.nextLong();

        System.out.println("Enter your personal phone number");

        long personalPhoneNumber=scan.nextLong();

        System.out.println("Enter your age");

        int age=scan.nextInt();

        System.out.println("Enter your height");

        double height=scan.nextDouble();

        System.out.println("Enter your weight");

        double weight=scan.nextDouble();

        System.out.println("Are you married?");

        boolean  isMarried=scan.nextBoolean();

        System.out.println("Patient personal information");

        System.out.println("Full name: "+lastName+","+firstName);

        System.out.println("Address: "+street+","+city+","+state+" "+zipcode);

        System.out.println("Contacts: "+"work phone number - "+workPhoneNumber+"personal phone number - "+personalPhoneNumber+"email:"+email);

        System.out.println("Age: "+age);

        System.out.println("Height: "+height);


        System.out.println("Weight: "+weight+" pounds");

        System.out.println("Married?:"+isMarried);













    }


}
