package homework3;

public class ConferenceRoom extends Room{
    private int seats;
    private boolean hasTV;
    private boolean hasProjector;
    private boolean hasConferenceEquipment;

    public ConferenceRoom(int seats, boolean hasTV, boolean hasProjector, boolean hasConferenceEquipment) {
        super(RoomType.CONFERENCE_ROOM);
        this.seats = seats;
        this.hasTV = hasTV;
        this.hasProjector = hasProjector;
        this.hasConferenceEquipment = hasConferenceEquipment;
    }
    @Override
    public String toString(){
        return type + " with " + seats + " seats, "+
                (hasProjector ? "a video projector" : (hasTV ? "a TV" : "no equipment"))+
                (hasConferenceEquipment ? ", and conference equipment" : "");
    }
}
