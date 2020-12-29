package wrapperclass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManupulation {
    public static void main(String[] args) {

/*

    String str="batch 21";
    String str1=new String("batch 21");

String s1="cat";
String s2="cat";

        System.out.println(s1==s2);
        String s3=new String("cat");

String s4=new String("cat");
        System.out.println(s1==s3);
        System.out.println(s2==s3);

        System.out.println(s3==s4);

        System.out.println("-------------------------------------------------------------");
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s3));
        System.out.println(s4.equals(s1));

        System.out.println("---------------------------------------------------------------");

String strl="cyberTEK";

str.toUpperCase();

        System.out.println(strl.toUpperCase());

strl.toLowerCase();
        System.out.println(strl.toLowerCase());

        System.out.println("--------------------------------------");

    String k="cybertek  shool";

      int i=k.length();

        System.out.println(i);

        String name = "CybertekSchool";

        System.out.println(name.length()-1);

String nm="muhtar";

 int lastindex=nm.length()-1;

        System.out.println(lastindex);
   char firstchar= name.charAt(0);
char lastchar=name.charAt(name.length()-1);
        System.out.println(firstchar);
        System.out.println(lastchar);
        System.out.println(name.charAt(name.length()-1));

String b="today is monday and it is a fun day";
char secondchar=b.charAt(1);

char lastsecondchar=b.charAt(b.length()-2);

        System.out.println(secondchar);
        System.out.println(lastsecondchar);


String j="harvard university";

        String city=" boston";

        System.out.println(j.concat(city));

String bank="bank of aMERIca";
        System.out.println(bank.toUpperCase());

        System.out.println(bank.toUpperCase());


String greet="          hell        o           world   ";

        System.out.println(greet.trim());

        */
/*Scanner input=new Scanner(System.in);
        System.out.println("pls enter your first name ");
 String firstname =input.nextLine();
     firstname=firstname.trim();
        System.out.println("pls enter your last name");
String lastname= input.nextLine();
        lastname=lastname.trim();*//*


      */
/*  System.out.println(firstname +" " +lastname);*//*



 String sentence="java is great,java is fun,javais cool";

        System.out.println(sentence.replace("java","phyton"));


String myemail="sanlifatih23@gmail.com";
myemail=myemail.replace("gmail","yahoo");
        System.out.println(myemail);

        String t = "I like to learn Java, because Java is cool, Java is powerful";

// i like to learn java,because phyton is cool, c# powerful
      t=  t.replaceFirst("learn Java","learn phyton").replaceFirst("is","was");
        System.out.println(t);
        String a = "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";
a=a.replaceFirst("as Monday","as sunday").replaceFirst("is Monday","is wrapperclass.tuesday").replaceFirst("be Monday","be saturday");

        System.out.println(a);

String emails="fshanli23@gmail.com";
     int beginingindex=emails.indexOf('@')+1 ;
int endingindex=emails.indexOf(".com");
        System.out.println(emails.substring(beginingindex,endingindex));

        System.out.println(emails.lastIndexOf("i"));

        System.out.println(emails);

        String name2 = "My name is Muhtar cybertek";

        String result = name2.substring( name2.lastIndexOf("M"));

        System.out.println(result);

String laptop="dell computers";
 int no=laptop.lastIndexOf("c");

        System.out.println(laptop.substring(laptop.lastIndexOf("c")));


String y1="hello everyone";

        System.out.println(y1.isEmpty());

        System.out.println(y1.contains("hello"));
*/
/*

String str="today is monday";
 String day=str.substring(9,str.length());
        System.out.println(str.length());
        System.out.println(day);


String s1="i likes movies and books";

        System.out.println(s1.substring(8,s1.length()));

        System.out.println(s1.length());
        System.out.println(s1.charAt(s1.length()-1));


        Scanner input= new Scanner(System.in);
        System.out.println("pls enter your name");
       String name7=input.nextLine();
        String name8=name7.substring(0,1).toUpperCase()+name7.substring(1,name7.length()-1+1).toLowerCase();
        System.out.println("pls enter your last name");
        String name9=input.nextLine();
        String name10=name9.substring(0,1).toUpperCase()+name9.substring(1,name9.length()-1+1).toLowerCase();
        System.out.println(name8+" "+name10);

        */
/*Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
                banana
        Output:
        ppleanana
                *//*


String fruit1="apple";
String fruit2="banana";

String h1=fruit1.substring(1,fruit1.length()-1+1);
String w1=fruit2.substring(1,fruit2.length()-1+1);

        System.out.println(h1+w1);


String webadress="www.noktanokta.com";
        System.out.println(webadress.startsWith("w"));

*/



















    }
}
