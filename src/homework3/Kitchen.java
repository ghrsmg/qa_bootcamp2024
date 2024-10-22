package homework3;

import java.util.List;

public class Kitchen extends Room{
    private List<String> appliances;

    public Kitchen(List<String> appliances) {
        super(RoomType.KITCHEN);
        this.appliances = appliances;
    }

    @Override
    public String toString(){
        return type + " with appliances: " + String.join(", ", appliances);
    }
}
