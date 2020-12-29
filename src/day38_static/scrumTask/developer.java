package day38_static.scrumTask;

public class developer {
    public String name, id, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean haascodingSkill=true;

    public void setInfo(String name, String id, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

      public void coding(){
          System.out.println(jobTitle+" "+name+" is coding");
      }

    public void fixingthebug(){
        System.out.println(jobTitle+" "+name+"is fixing the bug");
    }

    public String toString() {
        return "developer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
