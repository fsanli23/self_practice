package a1;

public class car {


    public String brand,model,color;
    public  double price;
    public int year;
    public static String madein;
    static {
      madein="japon";
    }

    public car( String brand){
this.brand=brand;
    }

public car(String brand,String model){
        this(brand);
        this.model=model;
}
public car(String brand,String model,String color){
        this(brand, model);
        this.color=color;
}
public car(String brand,String model,String color,double price ){
        this(brand,model,color);
        this.price=price;
}

public car(String brand,String model,String color,double price,int year){
        this(brand, model, color, price);
        this.year=year;

}

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +madein+
                '}';
    }

    public static void main(String[] args) {
        car toyota=new car("toyota");
        System.out.println(toyota);





    }



}
