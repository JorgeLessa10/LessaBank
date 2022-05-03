package model;

public class Person {
    private String cpf;
    private String name;
    private String cellphoneNumber;

    public Person() {
    }

    public Person(String cpf, String name, String cellphoneNumber) {
        this.cpf = cpf;
        this.name = name;
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
}
