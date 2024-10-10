import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Rectangle {
    public double length;
    public double width;

   public double getArea(){
        return this.length * this.width;
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow(length,2) + Math.pow(width,2));

    }
    public double getPerimeter(){
        return 2*(length + width);
    }
}
