package Arraylist;

import java.util.ArrayList;

public class listPractice3 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Katy");  //0
        names.add("Amir");  // 1
        names.add("Nadira"); // 2
        names.add("Erjon");  // 3
        names.add("Amir");  //4
        names.add("Aibek"); // 5
        names.add("Ilgar");  //6
        names.add("Amir"); //7
        names.add("Amir"); //7

        System.out.println(names);

        names.remove(1);
        System.out.println(names);
names.remove("Katy");
        System.out.println(names);





    }
}
