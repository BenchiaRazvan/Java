package com;

public class Destination {

    private String name;
    private int demand;

    Destination(String newName)
    {
        this.name = newName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDemand()
    {
        return demand;
    }
    public void setDemand(int demand)
    {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", demand=" + demand +
                '}';
    }
}
