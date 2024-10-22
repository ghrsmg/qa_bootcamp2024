package homework3;

public class Toilet extends Room{
    public Toilet() {
        super(RoomType.TOILET);
    }
    @Override
    public String toString(){
        return type.toString();
    }
}
