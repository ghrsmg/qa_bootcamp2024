package homework3;

abstract class Room {
    RoomType type;
    public Room(RoomType type){
        this.type = type;
    }
    public abstract String toString();
}
