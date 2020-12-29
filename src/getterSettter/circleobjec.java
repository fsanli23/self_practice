package getterSettter;

public class circleobjec {
    public static void main(String[] args) {

     circle c1=new circle(2);


        System.out.println(c1);
        System.out.println(c1.toString());
        System.out.println();
        System.out.println(c1.getPi());
        System.out.println(c1.getDiameter());
        System.out.println(c1.getPi());
        System.out.println(c1.getDiameter());
        c1.setRadius(3);
        System.out.println(c1);
    }
}
