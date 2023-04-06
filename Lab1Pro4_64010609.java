import java.util.Scanner;

public class Lab1Pro4_64010609 {
    public static void main(String[] args) {
        System.out.print("Enter weight in pouunds : ");
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble(); 
        System.out.print("Enter height in inches : ");
        double inches = input.nextDouble(); 
        if (pounds >=0 && inches >= 0)
        {
        double kilograms = pounds*0.45359237;
        double meter = inches*0.0254;
        double bmi = kilograms/(meter*meter);
        System.out.print("BMI is "+bmi);
        }
        else {System.out.print("Error");};
    }
}
