import model.*;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Client client1 = new Client("cpf", "name", "cellPhoneNumber", false, getAddressist(), null );
        client1.listAddresses().forEach(a -> System.out.println(a.getCep()));
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

}
