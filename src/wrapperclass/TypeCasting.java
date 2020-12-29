package wrapperclass;

public class TypeCasting {


    public static void main(String[] args) {


double k=5.99;
int m= (int)k;
        System.out.println(m);
       byte b=5;
       short sh1=400;
       sh1=(byte)b;
        System.out.println(b);
        double int1=(5/2.0);
        System.out.println(int1);




        double d=4.2;

        System.out.println(d);
        //System.out.println();

        boolean sweet=true;
        boolean hot=sweet;

        System.out.println(hot);
        System.out.println(sweet);
        int n1=55;
        int n2=65;
        System.out.println();
        System.out.println(n1>n2);
          byte kl=25;
         byte nl=127;
          boolean test=kl<nl;
        System.out.println();

        System.out.println(test);

 char letter1='a';
 char letter2='b';
       boolean b1= letter1>letter2;
       boolean b2=letter2>letter1;
        System.out.println(b1);
        boolean b3=b2==b1;
        System.out.println(b3);

        float fn = 0.2f;
        System.out.println("Initial floating number: " + fn);
        float next_down_fn = Math.nextDown(fn);
        float next_up_fn = Math.nextUp(fn);
        System.out.println("Float " + fn + " next down is " + next_down_fn);
        System.out.println("Float " + fn + " next up is " + next_up_fn);
        double dn = 0.2d;
        System.out.println("\nInitial double number: " + dn);
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);

        


    }
}
