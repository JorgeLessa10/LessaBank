package model;
/*
 * created by: Jorge.Lessa
 */
public class Account {
    private String number;
    private Double balance;

    public Account() {
    }

    public Account(String number, Double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double value)
    {
        this.setBalance(this.getBalance() + value);
    }

    public void withdraw(Double value)
    {
        if (value > this.getBalance())
        {
            System.out.println("Limit not available");
        }
        else
        {
            this.setBalance(this.getBalance() - value);
        }
    }

}
