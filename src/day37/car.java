package day37;

import java.time.LocalDate;

public class car {

    public String model, brand, color;
    public LocalDate dob;
    public double price, milage;
    public int year;

    public void setInfo(String model, String brand, String color, LocalDate dob, double price, double milage) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.dob = dob;
        this.price = price;
        this.milage = milage;
        year = dob.getYear();
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", dob=" + dob +
                ", price=" + price +
                ", milage=" + milage +
                ", year=" + year +
                '}';

    }

    public void drive(){
        System.out.println("driving "+brand+" "+model);
    }






}
