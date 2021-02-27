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
    public int setDemand(int demand) {
        this.demand = demand;
        return demand;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", demand=" + demand +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Destination)) {
            return false;
        }
        Destination that = (Destination) obj;
        return getName().equals(that.getName());
    }

}
