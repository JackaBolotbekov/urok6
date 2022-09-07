package com.company;

public class Weapon {
    private String tip;
    private String name;

    public Weapon(String tip, String name) {
        this.tip = tip;
        this.name = name;
    }

    public String getTypOf() {
        return tip;
    }

    public void setTypOf(String typOf) {
        this.tip = typOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
