public class ObjectsCourse {
    public static void main(String[] args) {
        Car dacia1300 = new Car("Sedan", "RED", "1300", 1300, 45);
        dacia1300.printCar();

        Car vwPassat = new Car();
//        dacia1300.color = "RED";
//        dacia1300.carType = "Sedan";
//        dacia1300.cylinderCapacity = 1300;
//        dacia1300.model = "dacia 1300";
//        dacia1300.carPosition = 45;
        dacia1300.startCar();
        dacia1300.accelerate(20);
        dacia1300.gearUP();
        dacia1300.steerRight(45);
        dacia1300.increaseMileage(5);
        dacia1300.stopCar();
        dacia1300.printCar();
        Square squareabcd = new Square();
        squareabcd.setSide(4);
        System.out.println("Square with side " + squareabcd.getLength() + " has are of " + squareabcd.getArea());
        for (String value : args) {
            Square cmdSquare = new Square();
            cmdSquare.setLength(Double.parseDouble(value));
            cmdSquare.printSquare();

        }
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("area is: " + rectangle.getArea() + " diagonal is: " + rectangle.getDiagonal() + " perimeter is: " + rectangle.getPerimeter());


    }
}
