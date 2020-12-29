package Static;

public class circle {
    public double radius, diameter, area, perimeter;

    public void setinfo(int radius, double diameter, double area, double perimeter) {
        this.radius = radius;
        this.diameter = diameter;
        this.area = area;
        this.perimeter = perimeter;

    }

    public double calculatearea() {
        return radius * radius * Math.PI;
    }

    public double calculateperimeter() {
        return diameter * Math.PI;
    }

    public boolean equals(circle circle) {
        return this.radius == circle.radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public static void hi() {
        System.out.println("hi");




    }
}

