package model;

public class CheckingAccount extends Account {

    private Double limit;

    public CheckingAccount() {
    }

    public CheckingAccount(Double limit) {
        this.limit = limit;
    }

    public CheckingAccount(String number, Double balance, Double limit) {
        super(number, balance);
        this.limit = limit;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public void transfer(Account destinationAccount, Double value)
    {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    public void receive(Double value)
    {
        this.deposit(value);
    }
}
