package org.example.entities;

public class Brand {
    private int id;
    private String name;
    private String model;

    public Brand() {
    }

    public Brand(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
