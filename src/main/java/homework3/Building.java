package homework3;

import java.util.ArrayList;
import java.util.List;

class Building {
    private String name;
    private List<Floor> floors;

    public Building(String name) {
        this.name = name;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    @Override
    public String toString() {
        StringBuilder buildingInfo = new StringBuilder("Building " + name + " has " + floors.size() + " floors\n");
        for (Floor floor : floors) {
            buildingInfo.append(floor.toString()).append("\n");
        }
        return buildingInfo.toString();
    }
}
