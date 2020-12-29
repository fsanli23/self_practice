package day36;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bankofamerica {//relationship bank of america has employee because it uses employee object


    public static void main(String[] args) {
        String companyame = "bofa";
        employee[] employees = {new employee(), new employee(), new employee(), new employee(), new employee()};


        employees[0].setInfo("fatih", "dev", "bofa", "123as", LocalDate.of(2020, 12, 1), 60000.0, 'm');
        employees[1].setInfo("alireis", "sdet", "bofa", "123ad", LocalDate.of(2020, 12, 3), 200_000., 'm');
        employees[2].setInfo("mike", "qa", "bofa", "123fg", LocalDate.of(2020, 12, 4), 200_000.5, 'm');
        employees[3].setInfo("john", "sdet", "bofa", "123hj", LocalDate.of(2020, 12, 5), 53000.0, 'm');
        employees[4].setInfo("sila", "sdet", "bofa", "123jk", LocalDate.of(2020, 12, 6), 77000.0, 'f');


        for (employee each : employees) {
            each.getInfo();
        }







        ArrayList<employee> sdet = new ArrayList<>();

        for (employee each : employees) {
            sdet.add(each);
        }

        sdet.removeIf(p -> !(p.jobtitle.equalsIgnoreCase("sdet") || p.jobtitle.equalsIgnoreCase("dev")));
        // removes the employee if job title of the empleyee is not sdet or dev.

        System.out.println(sdet.size());

        System.out.println("===========================================");


        ArrayList<employee> richie = new ArrayList<>(Arrays.asList(employees));
        richie.removeIf(p-> p.salary < 200000);
        System.out.println(richie);


        System.out.println("========================================");

        double max_salary=employees[0].salary;// assume that first employee salary is max;
double min_salary=employees[0].salary;




String name="";
String min_name="";
        for ( employee each:employees) {
            // max_salary=  Math.max(max_salary, each.salary);
            if (each.salary > max_salary) {
                max_salary = each.salary;
                name = each.name;
            }
            if (each.salary <min_salary) {
                min_salary = each.salary;
               min_name  = each.name;
            }
        }
        System.out.println(max_salary+" "+name);
        System.out.println(min_salary+" "+min_name);








    }
}
