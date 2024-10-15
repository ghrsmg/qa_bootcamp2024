public class JavaMethods {

    public static void main(String[] args) {
    /*    System.out.println("Hello 2");
        float myFloat = myFirstMethod(50, 70);
        System.out.println(myFloat);
        printMessage(53);
        drawFullShape(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        drawFullOutline(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        drawFullCorners(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        addNumbers(1,100);
        addNumbers(500f, 600f);
        addNumbers(105.6,88.45);*/
        Shape myShape = new Shape();
        myShape.draw();
        myShape.erase();
        myShape.setColor("green");
        System.out.println("The shape has color: " + myShape.getColor());
        Rectangle myRectangle = new Rectangle(4,5);
        myRectangle.draw();
        Square mySquare = new Square(12);
        mySquare.draw();
        System.out.println("length "+mySquare.getLength());
        System.out.println("diagonal square: "+ mySquare.getDiagonal());
        Shape myShape1 = new Square();
        Shape myShape2 = new Triangle();
        Shape myShape3 = new Rectangle();
        Shape myShape4 = new Circle();
        myShape1.draw();
        myShape2.draw();
        myShape3.draw();
        myShape4.draw();
        Person teacher1 = new Teacher("UPB");
        teacher1.setName("alex");
        teacher1.setSurname("G");
        teacher1.eat();
        ((Teacher)teacher1).teachCourse();
        Person student1 = new Student();
        student1.setName("Andrei");
        //student1.setSurname("Studentila");
        student1.eat();
//        if(student1.getSurname() == null){
//            throw new IllegalArgumentException("No name for the student");
//        }
        try {
            myExceptionMethod();
        }
        catch (Exception ex){
            System.out.println("oooooooops");
        }
       }
    public static void myExceptionMethod() throws IllegalArgumentException{
        Student s1 = new Student();
        if (s1.getName() == null){
            throw new IllegalArgumentException("No name for the student");
        }
    }

    private static void addNumbers(int i, int j) {
        System.out.println("ints " + (i + j));
    }

    private static void addNumbers(float i, float j) {
        System.out.println("floats " + (i + j));

    }

    private static void addNumbers(double i, double j) {
        System.out.println("doubles " + (i + j));

    }

    private static void drawFullCorners(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else System.out.print(" ");

            }
            System.out.println();
        }
    }


    public static float myFirstMethod(float x1, float x2) {
        return x1 + x2;
    }

    public static boolean isOddNumber(int parameter) {
        return parameter % 2 != 0;
    }

    public static void printMessage(int number) {
        /*if(isOddNumber(number)){
            System.out.println("Number"+ number+" is odd");
        }
        else System.out.println("Number"+ number+" is even");
    */
        String type = isOddNumber(number) ? "odd" : "even";
        System.out.println("Number " + number + " is " + type);
    }

    public static void drawFullShape(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawFullOutline(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else System.out.print(" ");

            }
            System.out.println();
        }
    }


}
