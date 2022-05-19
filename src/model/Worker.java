package model;
/*
 * created by: Jorge.Lessa
 */
public class Worker extends Person {

    private Double salary;

    public Worker() {
    }

    public Worker(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
