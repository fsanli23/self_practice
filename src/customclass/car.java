package customclass;

public class car {

public String brand;
public String model;
public String color;
public int year;
public double price;



public void setinfo(String carBrand,String carModel,String carColor,int carYear,double carPrice){
    brand=carBrand;
    model=carModel;
    color=carColor;
    year=carYear;
    price=carPrice;
}
public void getInfo(){
    System.out.println(year+" "+brand+" " +model+" "+color+" $"+price);
}





}
