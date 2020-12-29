package day39;

public class staticBloks2 {

public  static int a;
    static
    {
       a=25;
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
