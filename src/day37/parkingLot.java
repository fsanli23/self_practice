package day37;

import java.time.LocalDate;
import java.util.ArrayList;

public class parkingLot {//has a relation

    public static void main(String[] args) {
        car[] cars = {new car(), new car(), new car(), new car(), new car()};

        cars[0].setInfo("bmw","i8","black", LocalDate.of(2015,5,15),200000,10000);
        cars[1].setInfo("bmw","m4","black", LocalDate.of(2016,5,15),200000,10000);
        cars[2].setInfo("bmw","i2","black", LocalDate.of(2017,5,15),200000,10000);
        cars[3].setInfo("bmw","i6","black", LocalDate.of(2018,5,15),200000,10000);
        cars[4].setInfo("bmw","x5","black", LocalDate.of(2019,5,15),200000,10000);


        System.out.println(" ==========================================");

//recall all the car that built before 2017;
        ArrayList<car>recall=new ArrayList<>();
        for (car each:cars){
            if (each.year<2017){
                recall.add(each);
            }
        }

        System.out.println(recall);

        System.out.println("======================");

//recall all the bmw i8 that build before 2016
ArrayList<car>recall2=new ArrayList<>();
for (car each:cars){
    if (each.model.equalsIgnoreCase("bmw")&&each.year<2016){
recall2.add(each);
    }
}
        System.out.println(recall);
        System.out.println(recall2);


    }
    // ArrayList<car>cars=new ArrayList<>();

}
