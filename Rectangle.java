public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;
    
    public Rectangle(){
        width = 1;
        height = 1;
    }

    public Rectangle(double width,double height){
        if (width > 0 && height > 0){
            this.width = width;
            this.height = height;
        }
        else {System.out.println("you must enter width and height more than 0");}
    }

    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        if (width > 0 && height > 0){
            this.width = width;
            this.height = height;
        }
        else {System.out.println("you must enter width and height more than 0");}
    }

    public void setWidth(double width){
        if (width > 0){
            this.width = width;
        }
        else {System.out.println("you must enter width more than 0");}
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        if (height > 0){
            this.height = height;
        }
        else {System.out.println("you must enter height more than 0");}
    }

    public double getHeight(){
        return height;
    }

    public double getArea() {
        double area = width*height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (width+height)*2;
        return perimeter;
    }

    public int compareTo(Octagon x) {
        return 0;
    }

    public int compareTo(Rectangle r) {
        if (getArea() > r.getArea())
			return 1;
		else if (getArea() < r.getArea())
			return -1;
		else
			return 0;
    }
    
    public boolean equals(Object x) {
        return this.compareTo((Rectangle)x) == 0;
    }

    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }

}
