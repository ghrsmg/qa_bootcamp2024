package homework3;

public class OfficeSpace extends Room{
    private int desks;

    public OfficeSpace(int desks) {
        super(RoomType.OFFICE_SPACE);
        this.desks = desks;
    }
    @Override
    public String toString(){
        return type + " with " + desks + " desks";
    }
}
