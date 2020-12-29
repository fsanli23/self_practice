package getterSettter;

import practice_12_5_2020.methods;

public class circle {
   /* create a custom class called Circle
    private variables:
    radius, diameter, PI, area, perimeter
    add a constructor to set all fields
    generate getter for all private fields
    private methods:
    calculateArea, calculatePerimeter
    public methods:
    toString
    equals(): accepts a circle object and returns true
    if the given argument circle is equal to the current circle object
*/
    public   void hi(){
        System.out.println("say hi");
    }
    public static  int b=4;
public int a=2;
    private double radius, diameter, area, perimeter;
    private final static  double Pi;

    static {
        Pi = Math.PI;
        //Pi final cant be changed
    }

   public circle(double radius) {
        this.radius = radius;
        diameter = 2 * radius;
        area = calculatearea();
        perimeter = callculatediameter();
    }

    private double calculatearea() {
        return radius * radius * Pi;
    }

    public double callculatediameter() {
        return diameter * Pi;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;

    }

    public double getPerimeter() {
        return perimeter;
    }

    public  void  setRadius(double radius) {
        this.radius = radius;
        diameter = radius * 2;
        area = calculatearea();
        perimeter = callculatediameter();
    }

    public  double  getPi() {
        return Pi;
    }

    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
