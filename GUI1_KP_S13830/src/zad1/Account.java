package zad1;

public class Account {
    static double Interest;
    private double balance;
    public Account(){
        Account.Interest=0;
        this.balance=0;
    }

    public void deposit(double x){
        if(x<0)
            ;
        else
        balance=balance+x;
    }

    public void withdraw(double x){
        if(x<0 || balance-x<0)
            ;
        else
        this.balance=balance-x;
    }
    public void transfer(Account a1, double x) {
        if (balance - x < 0)
            ;
        else {
            this.withdraw(x);
            a1.deposit(x);
        }
    }
    public void addInterest(){
       balance= balance+(balance*(Interest/100));
    }
    static void setInterestRate(double x){
        Interest=x;
    }
    public String getbalance(){
       return Double.toString(balance);
    }

}
