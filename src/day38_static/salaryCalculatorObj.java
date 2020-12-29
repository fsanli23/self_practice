package day38_static;

public class salaryCalculatorObj {
    public static void main(String[] args) {



        salaryCalculator obj1=new salaryCalculator();
        obj1.setInfo(55,40,8,22);

        System.out.println(obj1);

salaryCalculator obj2=new salaryCalculator();
obj2.setInfo(55,41,2,3);

        System.out.println(obj1.salary==obj2.salary);


    }

}
