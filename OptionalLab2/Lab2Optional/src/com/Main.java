package com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Source source1 = new Factory("Factory");
        Source source2 = new Warehouse("Warehouse");
        Source source3 = new Factory("Factory");

        Destination destionation1 = new Destination("Destination 1");
        Destination destination2 = new Destination("Destination 2");
        Destination destination3 = new Destination("Destination 3");

        source1.setSupply(10);
        source2.setSupply(35);
        source3.setSupply(25);

        destionation1.setDemand(20);
        destination2.setDemand(25);
        destination3.setDemand(25);

        int[] source = { source1.getSupply(), source2.getSupply(), source3.getSupply()};
        int[] dest = {destionation1.getDemand(), destination2.getDemand(), destination3.getDemand()};

        Solution solution = new Solution();
        solution.solution(source,dest);





    }
}