package day38_static;

public class cybertek {

    public String name;
    public int age, groupno;
    public char gender;

    public static String schoolName="cybertek";
    public static boolean isOnlineStudent = true;


    public void study() {
        System.out.println(name + " is studying java");
    }


    public static void getSchoolInfo() {
        System.out.println(schoolName);

    }

    @Override
    public String toString() {
        return "cybertek{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupno=" + groupno +
                ", gender=" + gender +
                ", is online= " + isOnlineStudent +
                ", school name= " + schoolName +
                '}';
    }

    public  void setInfo(String name, int age, int groupno, char gender) {
        this.name = name;
        this.age = age;
        this.groupno = groupno;
        this.gender = gender;

    }

    public cybertek(String name, int age, int groupno, char gender) {
        this.name = name;
        this.age = age;
        this.groupno = groupno;
        this.gender = gender;
    }
}
