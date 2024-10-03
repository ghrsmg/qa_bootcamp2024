public class Hello {
    public static void main(String[] args) {
        int myFirstVar = 100;
        int mySecondVar = 0;
        final int MAX_SIZE = 100;
        System.out.println("Hello World!");
        System.out.println("Second var is: " + mySecondVar);
        mySecondVar = MAX_SIZE + 1;
        System.out.println(args[0] + args[1]);
        int oper0 = Integer.parseInt(args[0]);
        int oper1 = Integer.parseInt(args[1]);
        System.out.println(oper0 + oper1);

        String currentDay = "Monday";
        switch (currentDay){
            case "Monday": {
                System.out.println("Fuck");
                break;

            }
            case "Friday": {
                System.out.println("Hell yeah");
                break;
            }
            default:{
                System.out.println("meeh");
            }
        }
    }

}
