import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        //Variables
        Scanner kybd = new Scanner(System.in);
        int miles = 0, gallon = 0, mileage = 0;

        //Getting user input
        System.out.println("Enter Miles Traveled: ");
        miles = kybd.nextInt();

        System.out.println("Enter Gallons: ");
        gallon = kybd.nextInt();

        //Calculation
        mileage = miles / gallon;

        System.out.printf("The result is %d miles/gallon.", mileage);
        System.out.println("Program Done!");


    }
}
