import java.util.Scanner;

public class Lab6Pro1_64010609 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        System.out.print("Enter age : ");
        int age = input.nextInt();
        System.out.print("Enter weight : ");
        double weight = input.nextDouble();
        System.out.print("Enter feet : ");
        double feet = input.nextDouble();
        System.out.print("Enter inches : ");
        double inches = input.nextDouble();
        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.println("BMI = " +bmi.getBMI(weight, inches)); 
        System.out.println("You are " +bmi.getInterpretation(bmi.getBMI(weight, inches))); 
    }
}
