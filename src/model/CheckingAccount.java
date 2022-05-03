package model;

public class CheckingAccount extends Account {

    private Double limit;

    public CheckingAccount() {
    }

    public CheckingAccount(Double limit) {
        this.limit = limit;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }
}
