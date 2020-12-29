package day37;

import java.time.LocalDate;

public class student {

    public String name, Id;
    public char gender;
    public int age;
    public LocalDate dob;
    public double gpa;


    public void setInfo(String name, String Id, char gender, LocalDate dob, double gpa) {
        this.name = name;
        this.Id = Id;
        this.gender = gender;
        this.dob = dob;
        this.gpa = gpa;
        age = LocalDate.now().getYear() - dob.getYear();
    }

    @Override
    public String toString() {
        return
                "name= " + name +
                ", Id=" + Id  +
                ", gender=" + gender +
                ", age=" + age +
                ", dob=" + dob +
                ", gpa=" + gpa +
                '}';
    }
}
