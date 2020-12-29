package customclass;

public class bank {
    public static void main(String[] args) {

BankAccount account1=new BankAccount();

account1.setInfo("fatih","125458545jk");

account1.getInfo();

account1.deposit(100);
account1.withdraw(12);
account1.deposit(25);
account1.withdraw(60);
account1.Showbalance();



    }



}
