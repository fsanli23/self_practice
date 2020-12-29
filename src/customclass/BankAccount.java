package customclass;

import java.time.LocalDate;

public class BankAccount {


    public String AccountName, AccountNumber;
    public double availableBlance = 0;

    public void setInfo(String Accname, String Accnumber) {
        AccountName = Accname;
        AccountNumber = Accnumber;
    }


    public void getInfo(){
        System.out.println("=======================================================");

        System.out.println("date:"+ LocalDate.now());
        System.out.println("AccountName"+AccountName);
        System.out.println("AccountNumber"+AccountNumber);
        System.out.println("Available Blalance: $"+availableBlance);

        System.out.println("========================================================");
    }

    public void deposit(double amount){
        availableBlance+=amount;
    }

    public void withdraw(double amount){
        availableBlance-=amount;
    }
    public  void Showbalance(){
        System.out.println("As of today"+LocalDate.now()+" "+ availableBlance);
    }
}
