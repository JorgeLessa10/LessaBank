package model;

public class SavingsAccount extends Account{

    private Double profitability;

    public SavingsAccount() {
    }

    public SavingsAccount(Double profitability) {
        this.profitability = profitability;
    }

    public SavingsAccount(String number, Double balance, Double profitability) {
        super(number, balance);
        this.profitability = profitability;
    }

    public Double getProfitability() {
        return profitability;
    }

    public void setProfitability(Double profitability) {
        this.profitability = profitability;
    }

    public void redeem(Account destinationAccount, Double value)
    {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

}
