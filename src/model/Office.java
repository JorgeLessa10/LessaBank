package model;

import java.util.List;

public class Office {

    private String name;
    private List<Worker> workerList;

    public Office() {
    }

    public Office(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
