import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti anul (mai mare decat 1900 si mai mic decat 2016): ");
        int year = in.nextInt();
        if (year <1900 || year >2016){
            System.out.println("Anul trebuie sa fie intre 1900 si 2016");
        }
        else {
         if((year %4 == 0 && year %100 != 0) || (year % 100 == 0 && year%400 == 0)){
             System.out.println("Luna Februarie a anului " + year + " are 29 de zile");
         }
         else if (year == 2000){
             System.out.println("Luna Februarie a anului " + year + " are 29 de zile");
         }
         else {
             System.out.println("Luna Februarie a anului "+ year + " are 28 de zile");
         }
        }



    }
}
