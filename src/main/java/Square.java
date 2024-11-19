import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Square extends Rectangle{
    public Square(double side){
        super(side,side);
    }
    public double getArea() {
        return super.getArea();

       // return Math.pow(squareSide, 2);
    }
    public void printSquare(){
        System.out.println("main.Square with side "+ getLength() + " has are of " + getArea());

    }
    @Override
    public void draw(){
        System.out.println("Drawing a square");
    }
    @Override
    public String toString(){
        return "My square has 4 sides each"+ this.getLength();
    }
    public void setSide(double i){
        super.setLength(i);
        super.setWidth(i);
    }
}
