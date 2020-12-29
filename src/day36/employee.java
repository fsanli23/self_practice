package day36;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class employee {

    public String name, jobtitle, Id, companyName;

    public LocalDate hireDate;

    public double salary;

    public char gender;


    public void setInfo(String name, String jobtitle, String companyName, String Id, LocalDate hireDate, double salary, char gender) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.Id = Id;
        this.hireDate = hireDate;
        this.salary = salary;
        this.gender = gender;
        this.companyName = companyName;
    }

    public void getInfo() {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        DecimalFormat decimal=new DecimalFormat("0.00");
        System.out.println("name: "
                + name + ",gender: " + gender + ",Id: " + Id + ",company name: " + companyName + ", job title: " + jobtitle +
                ", salary: $" +decimal.format(salary) +",hired: "+hireDate.format(df));
    }
public void working (){
    System.out.println(name +"is  working");
}

public  void meeting(){
    System.out.println(name+" is in the meeting");
}



}
