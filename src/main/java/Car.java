public class Car {
    String model;
    String color;
    String carType;
    double MAX_SPEED = 180;
    double currentSpeed;
    float cylinderCapacity;
    float currentMileage;
    double carPosition;// compared to magnetic north
    int MAX_GEAR = 6;
    int currentGear;

    public Car() {
    }

    public Car(String model, String color, String carType, float cylinderCapacity, double carPosition) {
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.cylinderCapacity = cylinderCapacity;
        this.carPosition = carPosition;
    }

    public Car(String model, String color, String carType, double MAX_SPEED, double currentSpeed, float cylinderCapacity, float currentMileage, double carPosition, int MAX_GEAR, int currentGear) {
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.MAX_SPEED = MAX_SPEED;
        this.currentSpeed = currentSpeed;
        this.cylinderCapacity = cylinderCapacity;
        this.currentMileage = currentMileage;
        this.carPosition = carPosition;
        this.MAX_GEAR = MAX_GEAR;
        this.currentGear = currentGear;
    }


    public void startCar() {
        currentGear = 1;
        currentSpeed = 5;
    }

    public void steerLeft(float angle) {
        carPosition -= angle;
    }

    public void steerRight(float angle) {
        carPosition += angle;
    }

    public void stopCar() {
        currentSpeed = 0;
        currentGear = 0;
    }

    public void increaseMileage(float mileage) {
        currentMileage += mileage;
    }

    public void accelerate(double speedDelta) {
        if (currentSpeed + speedDelta > MAX_SPEED) {
            currentSpeed = MAX_SPEED;
        } else {
            currentSpeed += speedDelta;
        }
    }

    public void decelerate(double speedDelta) {
        if (currentSpeed - speedDelta < 0) {
            currentSpeed = 0;
        } else {
            currentSpeed -= speedDelta;
        }

    }

    public void gearUP() {
        if (currentGear < MAX_GEAR) {
            currentGear++;
        }

    }

    public void gearDown() {
        if(currentGear >0){
            currentGear--;
        }

    }
    public void printCar(){
        System.out.println("-----------------------");
        System.out.println("main.Car model: "+model);
        System.out.println("main.Car color: "+color);
        System.out.println("main.Car type: "+carType);
        System.out.println("main.Car position: "+carPosition);
        System.out.println("main.Car mileage: "+ currentMileage);
        System.out.println("main.Car gear: "+currentGear);
        System.out.println("main.Car speed: "+ currentSpeed);
    }

}
