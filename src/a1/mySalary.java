package a1;

import java.util.ArrayList;
import java.util.Arrays;

public class mySalary {
    public static void main(String[] args) {
        salaryCalculater salary1 = new salaryCalculater(28, 20, 0.32, 0.2);
        salaryCalculater salary2 = new salaryCalculater(74, 20, 0.32, 0.2);
        salaryCalculater salary3 = new salaryCalculater(25, 20, 0.32, 0.2);
        salaryCalculater salary4 = new salaryCalculater(52, 20, 0.32, 0.2);
        salaryCalculater salary5 = new salaryCalculater(33, 20, 0.32, 0.2);

        ArrayList<salaryCalculater> list = new ArrayList<>(Arrays.asList(salary1, salary2, salary3, salary4, salary5));

        double maxSalaryAfterTax = salary1.salaryAfterTax;


        System.out.println(salary1.salaryAfterTax);
        System.out.println(salary2.salaryAfterTax);
        System.out.println(salary3.salaryAfterTax);
        System.out.println(salary4.salaryAfterTax);
        System.out.println(salary5.salaryAfterTax);


        for (salaryCalculater each : list) {
            if (each.salaryAfterTax > maxSalaryAfterTax) {
                maxSalaryAfterTax = each.salaryAfterTax;
            }
        }
        System.out.println(maxSalaryAfterTax);

    }
}
