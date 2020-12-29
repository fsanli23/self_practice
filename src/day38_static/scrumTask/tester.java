package day38_static.scrumTask;

public class tester {
    public String name, id, jobTitle, companyName;
    public double salary;
    public char gender;

    public  void setInfo(String name, String id, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smoketesting() {
        System.out.println(name + " is performing smokem test");

    }

    public void creatingticket() {
        System.out.println(name + " is creating ticket");
    }


    public String toString() {
        return "tester{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }


    public static void sayhi(){
        System.out.println(" static hi");
    }
    public  void sayHello(){
        System.out.println(" instance hello");
    }
}
