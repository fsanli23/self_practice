package practice11_29_20;

public class parseMethod {
    public static void main(String[] args) {


        String data1 = "123";

        System.out.println(data1+3); //1233

        int num1 = Integer.parseInt(data1);  //  none
        //            primitive   <===  primitive int

        Integer num2 = Integer.parseInt(data1);  // Autoboxing
        //  wrapper class <=== primitive


        Integer num=Integer.valueOf(data1);
        System.out.println(num+9);

        System.out.println(num1+3);

        String s1 = "Hello";

        // int num3 = Integer.parseInt(s1);

        //   System.out.println(num3);

        System.out.println("=============================");



        String s2 = "2.5";
        double d1 = Double.parseDouble(s2);  // none
        // primitive <=== primitive

        Double d2 = Double.parseDouble(s2);  // autoboxing
        // Wrapper class <=== primitive

        System.out.println(d1+1);

        System.out.println("===============================================");



        String s3 = "Maybe";
        boolean r1 = Boolean.parseBoolean(s3); // none
        Boolean r2 = Boolean.parseBoolean(s3);  // auto boxing

        System.out.println(r1); // default value of boolean is false

        String s4 = "FaLse";

        boolean r3 = Boolean.parseBoolean(s4);

        System.out.println(r3);  // not case sensitive


        System.out.println("===========================================");






        String  s11 = "123";
        int num11 =   Integer.valueOf(s11); // unboxing
        // primitive  <==== wrapper class

        Integer num21 = Integer.valueOf(s11);  // none

        System.out.println(num1+1);

        String s21= "2.5";
        double num31 =    Double.valueOf(s2);
        System.out.println(num31+1);

        String s31 = "False";
        boolean r11 = Boolean.valueOf(s3); // unboxing

        System.out.println(r1);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("====================================================");

       /* 3. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)*/


        String input="a1b2c3";

        int sum=0;
       for (int i=0;i<=input.length()-1;i++){
           if (Character.isDigit(input.charAt(i))){
               sum+=Integer.parseInt(""+input.charAt(i));
           }
       }
        System.out.println(sum);

     String   in= "Today's date is 04/27/2020";
int total=0;
char [] chaar=in.toCharArray();
for (char each:chaar){
    if (Character.isDigit(each)){
        //total+=Integer.valueOf(""+each);
        total+=each;
    }
}
        System.out.println(total);


Integer a=Integer.parseInt("25");
Integer b=25;
        //System.out.println(a);
int k=2;
a.toString();


        System.out.println(3+a+b);
        System.out.println( b.compareTo(3));


        System.out.println(Character.valueOf('u'));
    }
}
