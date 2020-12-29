package day37;

public class employee {

    public String companyname, name, jobTitleid, gender;
    public double salary, hourlyRate, totalTax, salaryAfterTax;
    public double hours;

    public double calculatesalary() {
        return hourlyRate * hours * 52;
    }

    public double calculateTax(double stateTaxRate, double federalTaxRate) {
        return calculatesalary() * stateTaxRate + calculatesalary() * federalTaxRate;
    }

    public double calculateSalaryAfterTax() {
        return salary - totalTax;
    }

    public employee(String companyname, String name, String jobTitleid, String gender, double hourlyRate, double hours) {

    }
}
//setinfo
//tostring