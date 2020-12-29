package a1;

public class rectangle {

    public static int numberOfSides;

    public double width, length, area, perimeter;

    static {
        numberOfSides = 4;
    }

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = width * length;
        perimeter = (width + length) * 2;

    }


    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

class rectangleObject {


    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(4, 4);
        System.out.println(rectangle1.area);
        System.out.println(rectangle1);

    }


}