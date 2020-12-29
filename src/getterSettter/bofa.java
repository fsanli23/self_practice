package getterSettter;

import practice_12_5_2020.methods;

public class bofa {
    /*create costum class called BankAccount for Bank of America
    public variables:  bankName, firstName, lastName
    private variables: accountHolder, accountNumber, balance
    encapsulate all the private data
            (DO NOT USE SHORTCUT)
    create a constructor that can initialize firstName and lastName
            (DO NOT USE SHORTCUT)
    public methods:
    deposit (apply set Methods)
    withdraw (apply set Methods)
    availableBalance (apply getter)*/

    public String bankname, firstname, lastname;
    private String accountholder;
    private double accountnumber;
    private double balance;

    bofa(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    bofa cust=new bofa("fatih","sanli");

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public double getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(double accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }





}
