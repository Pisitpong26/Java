public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
    private double side;

    public Octagon(){
        side = 1;
    }

    public Octagon(double side){
        if (side > 0){
            this.side = side;
        }
        else {System.out.println("you must enter side more than 0");}
    }

    public Octagon(double side,String color,boolean filled){
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
        double area = (2 + 4/22) * side * side;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 8*side;
        return perimeter;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
    }

    public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

    public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}
}
