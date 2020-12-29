package practice01;

public class cybertekSudent {


    public String name;
    public int age;
    public char gender;
    public String nationallty;

    public static String schoolname = "CybertekSchool", dreamJob = "SDET";
    public static boolean hasreplit = true, hasflipgrid = true;

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }


    public String toString() {
        return "cybertekSudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", nationallty='" + nationallty + '\'' +
                ", schoolname=" + schoolname +
                ", dreamjob=" + dreamJob +
                '}';
    }
}
