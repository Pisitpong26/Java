import java.util.Scanner;

public class Lab11pro2_64010609 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true or false)? : ");
		boolean filled = input.nextBoolean();

        boolean newInput = true;
        do{
            System.out.print("Enter three sides of the triangle: ");
		    double side1 = input.nextDouble();
		    double side2 = input.nextDouble();
		    double side3 = input.nextDouble();

            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                newInput = false;
                triangle.setColor(color);
                triangle.setFillColor(filled);

                System.out.println(triangle.toString());
                System.out.println("Area : " + triangle.getArea());
                System.out.println("Perimeter : " + triangle.getPerimeter());
                System.out.println("Color :" + triangle.getColor());
                System.out.println("Triangle is " + (triangle.isFillColor() ? "filled":"not filled" ));
            }
            catch (IllegalTriangleException ex){
                System.out.println(ex.getMessage());
            }

        }
        while (newInput);
    }
}
