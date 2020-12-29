package a1;

public class salaryCalculater {

    public static int weekdays, numberOfweeks;


    public double hour, hourlyrate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static {
        weekdays = 5;
        numberOfweeks = 52;

    }

    public salaryCalculater(double hour, double hourlyrate, double stateTaxRate, double federalTaxRate) {
        this.hour = hour;
        this.hourlyrate = hourlyrate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = hour * hourlyrate * numberOfweeks;
        salaryAfterTax = salary - totalTax;

    }


    public String toString() {
        return "salaryCalculater{" +
                "hour=" + hour +
                ", hourlyrate=" + hourlyrate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                ", totalTax=" + totalTax +
                '}';
    }
}
