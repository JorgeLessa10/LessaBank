import model.*;

import java.util.ArrayList;
import java.util.List;

/*
* created by: Jorge.Lessa
*/

public class main {

    public static void main(String[] args) {

        Client client1 = new Client("cpf", "name", "cellPhoneNumber", false, getAddressist(), getAccountList() );
        client1.listAddresses().forEach(a -> System.out.println(a.getCep()));
        final CheckingAccount[] checkingAccount = {null};
        final SavingsAccount[] savingsAccount = {null};
        client1.getAccountList().forEach(a -> {
            if (a instanceof CheckingAccount)
            {
                checkingAccount[0] = (CheckingAccount) a;
            } else
            {
                savingsAccount[0] = (SavingsAccount) a;
            }
        });
        System.out.println("Saldo da Conta Corrente: " + checkingAccount[0].getBalance());
        System.out.println("Saldo da Conta Poupança: " + savingsAccount[0].getBalance());
        checkingAccount[0].deposit(150.0);
        System.out.println("Saldo depois de depositar 150: " + checkingAccount[0].getBalance());
        checkingAccount[0].withdraw(50.0);
        System.out.println("Saldo depois de sacar 50: " + checkingAccount[0].getBalance());
        checkingAccount[0].receive(10.0);
        System.out.println("Saldo depois de receber 10: " + checkingAccount[0].getBalance());
        checkingAccount[0].transfer(savingsAccount[0], 49.90);
        System.out.println("Corrente depois de transferir 49,90: " + checkingAccount[0].getBalance());
        System.out.println("Poupança depois de transferir 49,90: " + savingsAccount[0].getBalance());
        savingsAccount[0].redeem(checkingAccount[0], 14.50);
        System.out.println("Poupança depois de resgatar 14,50: " + savingsAccount[0].getBalance());
        System.out.println("Corrente depois de resgatar 14,50: " + checkingAccount[0].getBalance());



    }

    public static List<Address> getAddressist()
    {
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("cep1", "logradouro", "address", "complement", "city", "state"));
        addressList.add(new Address("cep2", "logradouro", "address", "complement", "city", "state"));
        addressList.add(new Address("cep3", "logradouro", "address", "complement", "city", "state"));
        addressList.add(new Address("cep4", "logradouro", "address", "complement", "city", "state"));
        addressList.add(new Address("cep5", "logradouro", "address", "complement", "city", "state"));
        addressList.add(new Address("cep6", "logradouro", "address", "complement", "city", "state"));
        return addressList;
    }

    public static List<Account> getAccountList()
    {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new CheckingAccount("123", 10.0,100.0));
        accountList.add(new SavingsAccount("123", 100.0, 2.5));
        return accountList;
    }

}
