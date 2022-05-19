package model;
/*
 * created by: Jorge.Lessa
 */
public class Address {

    private String cep;
    private String logradouro;
    private String address;
    private String complement;
    private String city;
    private String state;

    public Address() {
    }

    public Address(String cep, String logradouro, String address, String complement, String city, String state) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.address = address;
        this.complement = complement;
        this.city = city;
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
