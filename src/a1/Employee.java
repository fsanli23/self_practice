package a1;

public class Employee {
    public String name,Jobtitle,Id;
    public  double salary;
    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,String jobtitle){
        this(name);
        this.Jobtitle=jobtitle;

    }

    public Employee(String name,String jobtitle,String Id){
        this( name,jobtitle);
        this.Id=Id;
    }
    public Employee(String name,String jobtitle,String Id,double salary ){
        this(name,jobtitle,Id);
        this.salary=salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Jobtitle='" + Jobtitle + '\'' +
                ", Id='" + Id + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee empy1=new Employee("fatih","sdet","125hgh",4500);
        System.out.println(empy1);
    }


}
