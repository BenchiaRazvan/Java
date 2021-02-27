package com;

public abstract class Source{
    protected String name;
    Source(String text)
    {
        this.name = text;
    }
    public abstract int getSupply();
    public abstract int setSupply(int supply);
}

class Factory extends Source{
    private String name;
    private int supply;

    Factory(String text) {
        super(text);
    }
    public int getSupply() {
        return supply;
    }

    public int setSupply(int supply){
        this.supply = supply;
        return supply;
    }


}
class Warehouse extends Source{

    private int supply;

    Warehouse(String text) {
        super(text);
    }
    public int getSupply() {
        return supply;
    }
    public int setSupply(int supply){
        this.supply = supply;
        return supply;
    }
}


