package model;

import java.util.List;

public class Client extends Person{

    private boolean vip;
    private List<Address> addressList;
    private List<Account> accountList;

    public Client() {
    }

    public Client(boolean vip, List<Account> accountList) {
        this.vip = vip;
        this.accountList = accountList;
    }

    public Client(String cpf, String name, String cellphoneNumber, boolean vip, List<Address> addressList, List<Account> accountList) {
        super(cpf, name, cellphoneNumber);
        this.vip = vip;
        this.addressList = addressList;
        this.accountList = accountList;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<Address> listAddresses()
    {
        return this.getAddressList();
    }
}
