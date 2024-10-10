import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Square {
    public double squareSide;


    public void setSide(double squareSide) {
        this.squareSide = squareSide;
    }

    public double getArea() {
        return squareSide*squareSide;
       // return Math.pow(squareSide, 2);
    }
    public void printSquare(){
        System.out.println("Square with side "+squareSide + " has are of " + getArea());

    }
}
