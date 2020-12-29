package day38_static;

import java.text.DecimalFormat;

public class circle {


    double radius, diameter, area, perimeter;

    public void setInfo(double radius){
        this.radius=radius;
        diameter=2*radius;
        area=calculatearea();
        perimeter=calculateperimeter();
    }

    public double calculatearea() {
        return radius * radius * Math.PI;
    }

    public double calculateperimeter(){
        return diameter*Math.PI;
    }

    @Override
    public String toString() {

        DecimalFormat df=new DecimalFormat("0.00");
        return "circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }


    public boolean equals(circle Circle){
      return   this.radius== Circle.radius;

    }



}
