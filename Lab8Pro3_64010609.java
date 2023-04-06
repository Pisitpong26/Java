public class Lab8Pro3_64010609 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 5, "blue", true);
		Rectangle r2 = new Rectangle(5, 3, "gray", false);
		Rectangle r3 = new Rectangle(3.1, 5, "blue", true);

		System.out.println("Rectangle1 Area :" + r1.getArea());
		System.out.println("Rectangle2 Area :" + r2.getArea());
		System.out.println("Rectangle3 Area :" + r3.getArea());

        if(r1.equals(r2)){
            System.out.println("Rectangle1 is equal to Rectangle2");
        }
        else {System.out.println("Rectangle1 is  not equal to Rectangle2");}
		
        if(r1.equals(r3)){
            System.out.println("Rectangle1 is equal to Rectangle3");
        }
        else {System.out.println("Rectangle1 is  not equal to Rectangle3");}

    }
}
