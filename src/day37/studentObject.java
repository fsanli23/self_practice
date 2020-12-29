package day37;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class studentObject {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        student student1 = new student();
        String str = new String("batch 21");

        System.out.println(list);
        student1.setInfo("fatih", "sdffg2", 'm', LocalDate.of(1984, 5, 1), 2.3);
        //System.out.println(student1.toString());

        //  System.out.println(str.toString());

        System.out.println(student1);


        System.out.println("======================================");


        student student2 = new student();
        System.out.println(student2);


        student2.setInfo("inanc", "ozgul", 'f', LocalDate.of(1986, 8, 27), 2.3);

        ArrayList<student> studentArrayList = new ArrayList<>(Arrays.asList(student1, student2));

        System.out.println(studentArrayList);

        System.out.println("=============================");

        student[] students = {student1, student2};

       // System.out.println(Arrays.toString(students));



        //find the the student who has the id of sdffg2


        for (student each:students){
            if (each.Id.equalsIgnoreCase("sdffg2")){
                System.out.println(each);
            }
        }
        System.out.println("==================================");

student s1=new student();
student s2=s1;
s1.setInfo("aaron","141as",'m',LocalDate.of(1999,3,6),2.9);
        System.out.println(s1);
        System.out.println(s2);


    }


}
