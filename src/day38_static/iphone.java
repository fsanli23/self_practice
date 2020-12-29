package day38_static;

public class iphone {

    public static String model, color, sorage;

    public double price;
    public static String brand = "Apple", operatingSystem = "ios", madeIn = "china";


    public void call(long phoneNumber) {
        System.out.println("iphone" + model + "is calling" + phoneNumber);

    }

    public void getiphoneinfo() {
        System.out.println("brand :" + brand);
        System.out.println("operating system: " + operatingSystem);
        System.out.println("made in:" + madeIn);
    }

 public String toString(){
        return "brand: "+brand+", model: "+model+", color: "+color+", price: "+price+"operating system";
 }

}
