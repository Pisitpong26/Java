import javafx.geometry.Side;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        side1 = 1;
        side2 = 2;
        side3 = 3;
    }

    public Triangle(double side1,double side2,double side3,String color, boolean filled){
        if(side1 > 0 && side2 > 0 && side3 > 3){
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
                System.out.println("You must enter side more than 0");
            }
            else 
            {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }
        }
        else {System.out.println("You must enter side more than 0");}
        setColor(color);
        setFillColor(filled);
    }

    public Triangle(double side1,double side2,double side3) throws IllegalTriangleException{
        if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            throw new IllegalTriangleException(side1,side2,side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1){
        if(side1 > 0 ){
            this.side1 = side1;
        }
        else {System.out.println("You must enter side more than 0");}
    }

    public double getSide1(){
        return side1;
    }

    public void setSide2(double side2){
        if(side2 > 0){ 
            this.side2 = side2;
        }
        else {System.out.println("You must enter side more than 0");}
    }

    public double getSide2(){
        return side2;
    }

    public void setSide3(double side3){
        if(side3 > 0){
            this.side3 = side3;
        }
        else {System.out.println("You must enter side more than 0");}
    }

    public double getSide3(){
        return side3;
    }

    public double getArea(){
        double area = 0;
        if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1){
        double s = (side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        }
        return area;
    }

    public double getPerimeter(){
        double perimeter = 0;
        if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1){
        perimeter = side1 + side2 + side3;}
        return perimeter;
    }

    public String toString() {
        return super.toString() + "\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
    }

}
