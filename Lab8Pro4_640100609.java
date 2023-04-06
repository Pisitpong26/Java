public class Lab8Pro4_640100609 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1 = new Octagon(5,"Yellow",true);
        System.out.println("Octagon1 Area :" + o1.getArea());
        System.out.println("Cloning Octagon...");
		Octagon o2 = (Octagon)o1.clone();

        if (o1.compareTo(o2) == 0){
            System.out.println("Octagon is equal to its clone.");
        }
        else if (o1.compareTo(o2) == 1){
            System.out.println("Octagon is more than to its clone.");
        }
        else {System.out.println("Octagon is less than to its clone.");}
    }
}
