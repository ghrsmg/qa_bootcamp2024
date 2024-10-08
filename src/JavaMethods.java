public class JavaMethods {

    public static void main(String[] args) {
        System.out.println("Hello 2");
        float myFloat = myFirstMethod(50, 70);
        System.out.println(myFloat);
        printMessage(53);
        drawFullShape(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        drawFullOutline(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        drawFullCorners(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        addNumbers(1,100);
        addNumbers(500f, 600f);
        addNumbers(105.6,88.45);
    }

    private static void addNumbers(int i, int j) {
        System.out.println("ints " + (i+j));
    }
    private static void addNumbers(float i, float j) {
        System.out.println("floats " + (i+j));

    }
    private static void addNumbers(double i, double j) {
        System.out.println("doubles " + (i+j));

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
    public static void printMessage(int number){
        /*if(isOddNumber(number)){
            System.out.println("Number"+ number+" is odd");
        }
        else System.out.println("Number"+ number+" is even");
    */
        String type = isOddNumber(number) ? "odd" : "even";
        System.out.println("Number " + number + " is " + type);
    }

    public static void drawFullShape(int width, int height) {
        for(int i = 0; i< height; i++){
            for(int j = 0;j <width;j++){
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
