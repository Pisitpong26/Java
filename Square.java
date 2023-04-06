public class Square extends GeometricObject implements Colorable{

    private double side;

    public Square(){
        super();
        side = 1;
    }

    public Square(double side){
        if (side > 0){
            this.side = side;
        }
        else {System.out.println("you must enter side more than 0");}
    }

    public Square(double side,String color,Boolean filled){
        super(color,filled);
        if (side > 0){
            this.side = side;
        }
        else {System.out.println("you must enter side more than 0");}
    }

    public void setSide(double side){
        if (side > 0){
            this.side = side;
        }
        else {System.out.println("you must enter side more than 0");}
    }

    public double getSide(){
        return side;
    }


    public double getArea() {
        double area = side*side;
        return area;
    }

    public double getPerimeter() {
        double perimeter = side*4;
        return perimeter;
    }

    public void howToColor() {
       System.out.println("Color all four sides"); 
    }

    public String toString() {
        return super.toString() + "\nSide : " + getSide() + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
    }
}
