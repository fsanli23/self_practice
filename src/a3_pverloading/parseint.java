package a3_pverloading;

public class parseint {
    public static void main(String[] args) {

       /* String data1 = "123";

        System.out.println(data1+3); //1233

        int num1 = Integer.parseInt(data1);  //  none
        //            primitive   <===  primitive int

        Integer num2 = Integer.parseInt(data1);  // Autoboxing
        //  wrapper class <=== primitive

        System.out.println(num1+3);

        String s1 = "Hello";

        // int num3 = Integer.parseInt(s1);

        //   System.out.println(num3);



        String s2 = "2.5";
        double d1 = Double.parseDouble(s2);  // none
        // primitive <=== primitive

        Double d2 = Double.parseDouble(s2);  // autoboxing
        // Wrapper class <=== primitive

        System.out.println(d1+1);
*/
        String s3 = "Maybe";
        boolean r1 = Boolean.parseBoolean(s3); // none
        Boolean r2 = Boolean.parseBoolean(s3);  // auto boxing

        System.out.println(r1); // default value of boolean is false

        String s4 = "TruE";

        boolean r3 = Boolean.parseBoolean(s4);

        System.out.println(r3);  // not case sensitive

Integer a=1;
int b=2;
String c ="3";
        System.out.println(a+b+Integer.parseInt(c));




        String data="123";
        int  intd =Integer.valueOf(data);

            if (Character.isLetter('p'))
            System.out.println("is nletter");
         else
            System.out.println("not letter");


String note="123";
        System.out.println(Integer.valueOf(note)+3);
        System.out.println(Integer.parseInt(note)+3);




    }
}
