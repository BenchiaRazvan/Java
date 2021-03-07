package com;

import java.util.ArrayList;
import java.util.List;

public class TravelPlan {
    private List<Location> locationList = new ArrayList<>();

    public void addLocation(Location node){         // O lista de locatii
        locationList.add(node);
    }
    public List<Location> getNodes() {          // Afisez lista de locatii
        return locationList;
    }

}
