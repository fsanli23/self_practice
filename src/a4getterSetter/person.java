package a4getterSetter;

public class person {
    private String name;
    private int age;
    private static double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        person.weight = weight;
    }

    public static void main(String[] args) {
    }
}
