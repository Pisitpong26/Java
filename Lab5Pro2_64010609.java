public class Lab5Pro2_64010609 {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6,4);
        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("Perimeter of r1 = "+r1.getPerimeter());
        System.out.println("Area of r1 = "+r1.getArea()+"\n");

        System.out.println("Perimeter of r2 = "+r2.getPerimeter());
        System.out.println("Area of r2 = "+r2.getArea()+"\n");

        System.out.println("Perimeter of r3 = "+r3.getPerimeter());
        System.out.println("Area of r3 = "+r3.getArea()+"\n");
    }
}
