package day38_static;

public class salaryCalculator {

    public double hourlyRate, weeklyHour, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public double calculatelSalary() {
        return hourlyRate * weeklyHour * 52;
    }

    public double calculateStateTax() {
        return calculatelSalary() * stateTaxRate;
    }

    public double calculateFederalTax() {
        return salary * federalTaxRate;
    }

    public double calculateTotalTax() {
        return calculateStateTax() + calculateFederalTax();
    }

    public double calculateSalaryAfterTax() {
        return salary - calculateFederalTax();
    }

    public void setInfo(double hourlyRate,double weeklyHour,double stateTaxRate,double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHour=weeklyHour;
        this.stateTaxRate=(stateTaxRate<1)?stateTaxRate/100:stateTaxRate;
        this.federalTaxRate=(federalTaxRate<1)?federalTaxRate/100:federalTaxRate;
        salary=calculatelSalary();
        salaryAfterTax=calculateSalaryAfterTax();
    }

    @Override
    public String toString() {
        return "salaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", salary=$" + salary +
                ", salaryAfterTax=$" + salaryAfterTax +
                '}';
    }

    public boolean equals(salaryCalculator s1){
        return this.salary==s1.salary;
    }
}
