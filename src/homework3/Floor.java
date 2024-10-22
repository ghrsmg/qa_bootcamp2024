package homework3;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int number;
    private List<Room> rooms;

    public Floor(int number) {
        this.number = number;
        this.rooms = new ArrayList<>();
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    @Override
    public String toString(){
        StringBuilder floorInfo = new StringBuilder("Floor "+ number + ":\n");
        for(Room room : rooms){
            floorInfo.append(room.toString()).append("\n");
        }
        return floorInfo.toString();
    }
}
