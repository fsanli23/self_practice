package a1;

public class circle {
    public static double PI;
    public double r,d,area,perimeter;
    static{
        PI=3.14;
    }

    public circle( double r){
      this.r=r;
      d=r*2;

      area=r*r*PI;
        perimeter=d*PI;
    }

}
class circleobjects{
    public static void main(String[] args) {
circle circle1=new circle(3);

        System.out.println(circle1.area);


    }







}