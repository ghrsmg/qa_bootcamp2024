package homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Office");
        Floor firstFloor = new Floor(1);
        firstFloor.addRoom(new OfficeSpace(20));
        firstFloor.addRoom(new Toilet());
        firstFloor.addRoom(new Toilet());
        firstFloor.addRoom(new Kitchen(Arrays.asList("Coffee Machine", "Water Dispenser", "Fridge")));
        firstFloor.addRoom(new ConferenceRoom(10, true, false, false));
        firstFloor.addRoom(new ConferenceRoom(10, true, false, false));
        firstFloor.addRoom(new ConferenceRoom(10, true, false, false));
        Floor secondFloor = new Floor(2);
        secondFloor.addRoom(new OfficeSpace(10));
        secondFloor.addRoom(new OfficeSpace(10));
        secondFloor.addRoom(new Toilet());
        secondFloor.addRoom(new Toilet());
        secondFloor.addRoom(new Kitchen(Arrays.asList("Coffee Machine", "Water Dispenser", "Fridge")));
        secondFloor.addRoom(new ConferenceRoom(8, true, false, false));
        secondFloor.addRoom(new ConferenceRoom(8, true, false, false));
        secondFloor.addRoom(new ConferenceRoom(8, true, false, false));
        secondFloor.addRoom(new ConferenceRoom(8, true, false, false));

        Floor thirdFloor = new Floor(3);
        thirdFloor.addRoom(new Toilet());
        thirdFloor.addRoom(new Toilet());
        thirdFloor.addRoom(new ConferenceRoom(30, false, true, true));
        thirdFloor.addRoom(new ConferenceRoom(20, true, false, true));
        thirdFloor.addRoom(new ConferenceRoom(10, true, false, true));
        thirdFloor.addRoom(new ConferenceRoom(10, true, false, true));
        thirdFloor.addRoom(new ConferenceRoom(10, true, false, true));
        thirdFloor.addRoom(new ConferenceRoom(10, true, false, true));

        building.addFloor(firstFloor);
        building.addFloor(secondFloor);
        building.addFloor(thirdFloor);

        System.out.println(building);
    }
}
