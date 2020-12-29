package day38_static;

public class circleobject {
    public static void main(String[] args) {

        circle circle1 = new circle();
        circle1.setInfo(5);

        System.out.println(circle1);



        circle circle2=new circle();
        circle2.setInfo(5);

        System.out.println(circle1==circle2);

        //circle1.equals();

        System.out.println(circle1.equals(circle2));

    }


}
