package day37;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class cybertekSchool {
    public static void main(String[] args) {

        student[] studentsArray = {new student(), new student(), new student(), new student(), new student(), new student(), new student(), new student(), new student()};

        studentsArray[0].setInfo("fatih", "21lkl", 'm', LocalDate.of(1988, 5, 6), 1.3);
        studentsArray[1].setInfo("resul", "21lkl", 'm', LocalDate.of(1985, 6, 6), 2.3);
        studentsArray[2].setInfo("serap", "21lkl", 'f', LocalDate.of(1984, 2, 6), 3.3);
        studentsArray[3].setInfo("mehtap", "21lkl", 'f', LocalDate.of(1983, 7, 6), 6.3);
        studentsArray[4].setInfo("hasim", "21lkl", 'm', LocalDate.of(1989, 5, 6), 3.3);
        studentsArray[5].setInfo("muhammed", "21lkl", 'm', LocalDate.of(1987, 5, 6), 6.3);
        studentsArray[6].setInfo("nejik", "21kl", 'f', LocalDate.of(1982, 1, 6), 7.3);
        studentsArray[7].setInfo("emre", "21l5l", 'm', LocalDate.of(1984, 2, 6), 5.3);
        studentsArray[8].setInfo("kadir", "21lk4", 'm', LocalDate.of(1985, 5, 6), 5.3);
        // studentsArray[9].setInfo("fatih","21lkl",'m', LocalDate.of(1988,5,6),5.3);
        // System.out.println(studentsArray[8]);

    /*for (student each :studentsArray){
    if (each.gpa>3.0){
        System.out.println(each);
    }*/
        for (student each : studentsArray) {
            if (each.gpa > 2 && each.gpa < 3) {
                System.out.println(each);
            }
        }
        System.out.println("=======================");

        ArrayList<student> female = new ArrayList<>(Arrays.asList(studentsArray));
        female.removeIf(p -> p.gender != 'f');
        System.out.println(female);
        System.out.println("========================================");
        ArrayList<student> male = new ArrayList<>(Arrays.asList(studentsArray));

        male.removeIf(p -> p.gender != 'm');
        System.out.println(male);
        System.out.println("========================================");
        ArrayList<student>CyberTekStudent=new ArrayList<>(Arrays.asList(studentsArray));


        String name="";
        student youngest1=null;

        LocalDate youngest=CyberTekStudent.get(0).dob;
        for (student each:CyberTekStudent){
            if (each.dob.isAfter(youngest)){
                youngest=each.dob;
                  name=each.name;
                  youngest1=each;
            }
        }


        System.out.println(youngest1);
    }

}
