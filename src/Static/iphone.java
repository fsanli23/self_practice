package Static;


public class iphone {

    public String model, color, storage;

    public double price;
    public static String brand = "apple", os = "ios", madein = "china";

    public void call(long phoneNumber) {
        System.out.println("iphone" + model + "is calling" + phoneNumber);
    }

    public static void getinfo() {
        System.out.println("brand= " + brand);
        System.out.println("operating system =" + os);
        System.out.println("made in=" + madein);
    }

    @Override
    public String toString() {
        return "iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storage='" + storage + '\'' +
                ", price=" + price +
                '}';
    }
}


