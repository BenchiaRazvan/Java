package com;

public class Source {

    private int supply;
    private String name;
    private SourceType type;

    Source(SourceType newType, String newName) {
        this.name = newName;
        this.type = newType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupply() {
        return supply;
    }

    public void setSupply(int newSupply) {
        this.supply = newSupply;
    }

    @Override
    public String toString() {
        return "Source{" +
                "supply=" + supply +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
