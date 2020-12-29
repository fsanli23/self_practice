package replit;

import java.util.Scanner;

public class publicm {
    public static void main(String[] args) {
/*
       int ivar=100;
       double dvar=123;
       float fvar=200;

       fvar=(float)dvar;

       ivar=(int)dvar;


        long a=30l;
        long b=a;

        //System.out.println(a);
        System.out.println(b);


        double k=12121212121d;
        byte l=5;
        k=l;

        System.out.print("jhgsdjhsjd");
        System.out.println("jdhfdfh");
        System.out.print("hdjfygifd");
        System.out.println("iudfjdffdd");

        System.out.println(" odsf\n\t \\ \' '    \" ");

        System.out.println("uyfdhdfdf  \"iujkgk\"   ");


      //  String = "hello";

double km=100.25;

//int ml=123;

     int yol =   25;

        System.out.println(km+yol);


        int c=25;
        System.out.println(c++);
        System.out.println(c--);
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(c);

        int q=1;
        q=-q--+q++/-q--*--q;


        System.out.println(q);




        int r=50;
        r=--r+r+++r--+r++;
        System.out.println(r);

int x=4;
int y=x*4-x++;

        System.out.println(y);*/
/*

        int a = 100; // a=100
        int b = -a++ + ++a - a-- * a-- % 2;
        System.out.println(b);


        int num=9;
        if (num++==9){
            System.out.println("hello world"+num);
        }else{
            System.out.println("hello universe"+num);
        }

boolean result=true;
        if (result) {

            System.out.println("it is true");
        }else{
            System.out.println("its false");}
       */
/* }else (result) {}
            System.out.println("none of above");
        }*//*


int x=10;
int y=x++;
        System.out.println(y+++" "+x+++" "+y);

        System.out.println(x);
        System.out.println(y);

*/

/*

        int z=10;
        switch (z){
            case 6:
                System.out.println("hello world");
                break;
            case 2:
                System.out.println("hello unv");
                break;
            default:
                System.out.println("good");


        }

Scanner input =new Scanner(System.in);
        System.out.println("enter smthng");
        String f=input.next();

        System.out.println(f);
*/


       /* System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();*/

/*
if(a.equals("a")){
    System.out.println("a is wrong");
}else if (a.equals("b")){
    System.out.println("b is correct");
} else if (a.equals("c")){
    System.out.println("c is wrong");
}else{
    System.out.println(a+" is not a valid answer");
}

*/
        /*int house = s.nextInt();
        int player = s.nextInt();*/

/*if (house+player>21){
    System.out.println("bust");
}
if (house>player){
    System.out.println("player loss");
}
if (house==player){
    System.out.println("its a tie");
}
if (player>house){
    System.out.println("player wins");
}*/
       /* System.out.println("enter a text");
String txt=s.next();
*/
        // System.out.print(""+txt.charAt(2)+txt.charAt(4)+txt.charAt(5));

        /*String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean contain=sentence.contains(word);
        System.out.println(contain);
*/
       /* Scanner input=new Scanner(System.in);


        System.out.println("Enter first number:");

        int num1=input.nextInt();


        System.out.println("Enter second number:");
        int num2=input.nextInt();

        System.out.println("Enter third number:");
        int num3=input.nextInt();

        if((num1>num2&&num1<num3)||(num1>num3&&num1<num2)){
            System.out.println("Medium value is:"+num1);
        }else if((num2>num1&&num2<num3)||(num2>num3&&num2<num1)){
            System.out.println("Medium value is:"+num2);
        }else{
            System.out.println("Medium value is:"+num3);
        }*/


        //Scanner scan = new Scanner(System.in);
       // String email = scan.next();

       // String firstname = email.substring(0, email.indexOf("_")).toUpperCase();
        //String lastname = email.substring(email.indexOf("_") + 1, email.indexOf("@")).toUpperCase();
      //  String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
      //  String Topleveldomain = email.substring(email.lastIndexOf(".") + 1);

       // System.out.println("Topleveldomain = " + Topleveldomain + "," + domain + "," + firstname + "," + lastname);

       // String lastname=email.substring(email.indexOf("_"),email.indexOf("_")+1).toUpperCase();
        //String firstname=email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_")).toLowerCase();
    // String   Lastname= email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.lastIndexOf("@")).toLowerCase();

      //  System.out.println();

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

if (word.length()>=5&&word.length()%2!=0){
   word= word.substring(word.length()/2-1,word.length()/2+2);
    System.out.println(word);
}else{
    System.out.println("invalid");
}










    }
}
